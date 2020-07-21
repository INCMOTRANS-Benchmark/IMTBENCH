package fr.tpt.mem4csd.mtbench.aadl2aadl.viatra

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage
import fr.tpt.mem4csd.mtbench.aadl2aadl.viatra.MScheduler.MSchedulerFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import org.osate.aadl2.Aadl2Package
import org.osate.aadl2.ComponentCategory
import org.osate.aadl2.DirectionType
import org.osate.aadl2.instance.ConnectionInstanceEnd
import org.osate.aadl2.instance.ConnectionKind
import org.osate.aadl2.instance.ConnectionReference
import org.osate.aadl2.instance.FeatureCategory
import org.osate.aadl2.instance.FeatureInstance
import org.osate.aadl2.instance.InstancePackage

class Aadl2aadlTransformation {

	extension EventDrivenTransformationRuleFactory ruleFactory = new EventDrivenTransformationRuleFactory

	/** VIATRA Query Pattern group **/
	extension Required_queries required_queries = Required_queries.instance

	/** EMF metamodels **/
	extension InstancePackage instPackage = InstancePackage::eINSTANCE
	extension Aadl2Package aadl2Package = Aadl2Package::eINSTANCE
	extension Aadl2aadlPackage trace = Aadl2aadlPackage::eINSTANCE

	extension IModelManipulations manipulation
	EventDrivenTransformation transformation
	ViatraQueryEngine engine
	protected Resource resource
	Aadl2AadlTraceSpec aadl2aadl

	var initialized = false;

	def initialize(
		Aadl2AadlTraceSpec aadl2aadl,
		ViatraQueryEngine engine,
		String rightModelName
	) {
		if (!initialized) {
			this.aadl2aadl = aadl2aadl
			this.engine = engine
			resource = aadl2aadl.rightSystem.eResource
			prepare(engine)
			manipulation = new SimpleModelManipulations(engine)
			createTransformation
			initialized = true
		}
	}

	private def createTransformation() {
		val fixedPriorityResolver = new InvertedDisappearancePriorityConflictResolver
		fixedPriorityResolver.setPriority(system2system.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(component2component.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(subcomponent2subcomponent.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(portconnection2dataaccessAtsystemForGrp.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(portconnection2dataaccessAtsystem.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(portconnection2dataaccessAtprocess.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(connection2connectionAtsystem.ruleSpecification, 1)
		fixedPriorityResolver.setPriority(connection2connection.ruleSpecification, 1)

		val builder = EventDrivenTransformation.forEngine(engine).setConflictResolver(fixedPriorityResolver).addRule(
			system2system).addRule(component2component).addRule(subcomponent2subcomponent).addRule(feature2feature).
			addRule(portconnection2dataaccessAtprocess).addRule(portconnection2dataaccessAtsystem).addRule(
				connection2connectionAtsystem).addRule(portconnection2dataaccessAtsystemForGrp).addRule(
				connection2connection)
		builder.schedulerFactory = new MSchedulerFactory()

		transformation = builder.build

	}

	def execute() {
		transformation.executionSchema.startUnscheduledExecution
	}

	def dispose() {
		if (transformation !== null) {
			transformation.executionSchema.dispose
			transformation = null
		}

		return
	}

	val system2system = createRule(Find_system.instance).action(CRUDActivationStateEnum.CREATED) [
		systemRef.set(namedElement_Name, system.name)
		systemRef.set(componentInstance_Category, system.category)
		val source_system = system
		val target_system = systemRef

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, source_system)
			addTo(aadl2AadlTrace_RightInstance, target_system)
		]

	].action(CRUDActivationStateEnum.UPDATED)[].action(CRUDActivationStateEnum.DELETED)[].addLifeCycle(
		Lifecycles.getDefault(true, true)).build

	val component2component = createRule(Find_component.instance).action(CRUDActivationStateEnum.CREATED) [
		val source_component = component
		val target_component = systemref.createChild(componentInstance_ComponentInstance, componentInstance)
		target_component.set(namedElement_Name, source_component.name)
		target_component.set(componentInstance_Category, source_component.category)
		// create traces
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, source_component)
			addTo(aadl2AadlTrace_RightInstance, target_component)
		]

	].action(CRUDActivationStateEnum.UPDATED) [
		// attribute name
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, component, null).get
		// new name in the source_component from the source model
		val new_name = traceMatch.aadlElement.name
		if (traceMatch.aadlrefElement.name != new_name) {
			traceMatch.aadlrefElement.set(namedElement_Name, new_name)
		}
	// ... update the other attributes 
	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, component, null).get
		// deleting target_component
		traceMatch.aadlrefElement.remove
		// deleting the trace of target_component
		aadl2aadl.remove(aadl2AadlTraceSpec_Traces, traceMatch.trace)

	].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val subcomponent2subcomponent = createRule(Find_subcomponent.instance).action(CRUDActivationStateEnum.CREATED) [
		val leftsubcomponent = subcomponent

		val rightsubcomponent = componentref.createChild(componentInstance_ComponentInstance, componentInstance)
		rightsubcomponent.set(namedElement_Name, leftsubcomponent.name)
		rightsubcomponent.set(componentInstance_Category, leftsubcomponent.category)

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, leftsubcomponent)
			addTo(aadl2AadlTrace_RightInstance, rightsubcomponent)
		]
	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, subcomponent, null).get

		val new_name = traceMatch.aadlElement.name
		if (traceMatch.aadlrefElement.name != new_name) {
			traceMatch.aadlrefElement.set(namedElement_Name, new_name)
		}

	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, subcomponent, null).get
		traceMatch.aadlrefElement.remove
		aadl2aadl.remove(aadl2AadlTraceSpec_Traces, traceMatch.trace)

	].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val feature2feature = createRule(Find_feature.instance).action(CRUDActivationStateEnum.CREATED) [
		val leftfeature = feature
		val rightfeature = componentref.createChild(componentInstance_FeatureInstance, featureInstance)
		rightfeature.set(namedElement_Name, leftfeature.name)
		rightfeature.set(featureInstance_Category, leftfeature.category)
		rightfeature.set(featureInstance_Direction, leftfeature.direction)

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, leftfeature)
			addTo(aadl2AadlTrace_RightInstance, rightfeature)
		]
	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, feature, null).get

		val new_name = traceMatch.aadlElement.name
		if (traceMatch.aadlrefElement.name != new_name) {
			traceMatch.aadlrefElement.set(namedElement_Name, new_name)
		}

	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, feature, null).get
		traceMatch.aadlrefElement.remove
		aadl2aadl.remove(aadl2AadlTraceSpec_Traces, traceMatch.trace)

	].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val portconnection2dataaccessAtprocess = createRule(Find_portconnection_process.instance).action(
		CRUDActivationStateEnum.CREATED) [

		val dataInstance = processref.createChild(componentInstance_ComponentInstance, componentInstance)
		dataInstance.set(componentInstance_Category, ComponentCategory.DATA)
		dataInstance.set(namedElement_Name, portconnection.name)
		val connection_out = processref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_out.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)
		val connection_in = processref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_in.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)

		val feature_out_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuresource, null)
		var FeatureInstance feature_out

		val feature_in_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuredestination, null)
		var FeatureInstance feature_in
		val featuresource = featuresource
		val featuredestination = featuredestination
		val portconnection = portconnection

		for (ConnectionReference ref : portconnection.connectionReferences) {

			connection_out.set(namedElement_Name, "1_" + ref.name)
			connection_in.set(namedElement_Name, "2_" + ref.name)

			if (feature_out_match.isPresent) {
				feature_out = feature_out_match.get.aadlrefElement as FeatureInstance

			} else {
				feature_out = threadsourceref.createChild(componentInstance_FeatureInstance,
					featureInstance) as FeatureInstance
				feature_out.set(namedElement_Name, featuresource.name)
				feature_out.set(featureInstance_Direction, DirectionType.OUT)
				feature_out.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
			}

			if (feature_in_match.isPresent) {
				feature_in = feature_in_match.get.aadlrefElement as FeatureInstance
			} else {
				feature_in = threaddestinationref.createChild(componentInstance_FeatureInstance,
					featureInstance) as FeatureInstance
				feature_in.set(namedElement_Name, featuredestination.name)
				feature_in.set(featureInstance_Direction, DirectionType.IN)
				feature_in.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
			}

			val connref_in = connection_in.createChild(connectionInstance_ConnectionReference, connectionReference)
			connref_in.set(connectionReference_Context, ref.context)
			connref_in.set(connectionReference_Source, dataInstance)
			connref_in.set(connectionReference_Destination, feature_in)
			connection_in.set(connectionInstance_Source, dataInstance)
			connection_in.set(connectionInstance_Destination, feature_in)

			val connref_out = connection_out.createChild(connectionInstance_ConnectionReference, connectionReference)
			connref_out.set(connectionReference_Context, ref.context)
			connref_out.set(connectionReference_Source, feature_out)
			connref_out.set(connectionReference_Destination, dataInstance)
			connection_out.set(connectionInstance_Source, feature_out)
			connection_out.set(connectionInstance_Destination, dataInstance)
		}

		val featuresourceleft = feature_out
		val featuredestinationleft = feature_in

		// Traces
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, dataInstance)
		]

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_in)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_out)
		]

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuresource)
			addTo(aadl2AadlTrace_RightInstance, featuresourceleft)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuredestination)
			addTo(aadl2AadlTrace_RightInstance, featuredestinationleft)
		]

	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)

		for (var i = 0; i < 3; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.leftInstance.head
			val new_name = element.name
			if (trace.rightInstance.head.name != new_name) {
				trace.rightInstance.head.set(namedElement_Name, new_name)
			}
		}

	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)
		for (var i = 0; i < 3; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.rightInstance.head
			element.remove
			trace.remove
		}

	].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val portconnection2dataaccessAtsystemForGrp = createRule(Find_portconnection_system_Grp.instance).action(
		CRUDActivationStateEnum.CREATED) [
		val dataInstance1 = processsourceref.createChild(componentInstance_ComponentInstance, componentInstance)
		dataInstance1.set(componentInstance_Category, ComponentCategory.DATA)
		dataInstance1.set(namedElement_Name, portconnection.name)

		val dataInstance2 = processdestinationref.createChild(componentInstance_ComponentInstance, componentInstance)
		dataInstance2.set(componentInstance_Category, ComponentCategory.DATA)
		dataInstance2.set(namedElement_Name, portconnection.name)

		val portconnection = portconnection
		val featuresource = featuresource
		val featuredestination = featuredestination

		val connection_out = processsourceref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_out.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)

		val connection_in = processdestinationref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_in.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)

		connection_out.set(namedElement_Name, portconnectionrefsource.name)
		connection_in.set(namedElement_Name, portconnectionrefdestination.name)

		val feature_out_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuresource, null)
		var FeatureInstance feature_out

		val feature_in_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuredestination, null)
		var FeatureInstance feature_in

		if (feature_out_match.isPresent) {
			feature_out = feature_out_match.get.aadlrefElement as FeatureInstance

		} else {
			feature_out = threadsourceref.createChild(componentInstance_FeatureInstance,
				featureInstance) as FeatureInstance
			feature_out.set(namedElement_Name, featuresource.name)
			feature_out.set(featureInstance_Direction, DirectionType.OUT)
			feature_out.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
		}

		if (feature_in_match.isPresent) {
			feature_in = feature_in_match.get.aadlrefElement as FeatureInstance
		} else {
			feature_in = threaddestinationref.createChild(componentInstance_FeatureInstance,
				featureInstance) as FeatureInstance
			feature_in.set(namedElement_Name, featuredestination.name)
			feature_in.set(featureInstance_Direction, DirectionType.IN)
			feature_in.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
		}

		val connref_in = connection_in.createChild(connectionInstance_ConnectionReference, connectionReference)
		connref_in.set(connectionReference_Context, portconnectionrefdestination.context)
		connref_in.set(connectionReference_Source, dataInstance2)
		connref_in.set(connectionReference_Destination, feature_in)
		connection_in.set(connectionInstance_Source, dataInstance2)
		connection_in.set(connectionInstance_Destination, feature_in)

		val connref_out = connection_out.createChild(connectionInstance_ConnectionReference, connectionReference)
		connref_out.set(connectionReference_Context, portconnectionrefsource.context)
		connref_out.set(connectionReference_Source, feature_out)
		connref_out.set(connectionReference_Destination, dataInstance1)
		connection_out.set(connectionInstance_Source, feature_out)
		connection_out.set(connectionInstance_Destination, dataInstance1)

		val featuresourceleft = feature_out
		val featuredestinationleft = feature_in

		// Traces
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, dataInstance1)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, dataInstance2)
		]

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_in)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_out)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuresource)
			// it causes problem in the case of many inputs or outputs N-N
			addTo(aadl2AadlTrace_RightInstance, featuresourceleft)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuredestination)
			addTo(aadl2AadlTrace_RightInstance, featuredestinationleft)

		]

	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)
		for (var i = 0; i < 4; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.leftInstance.head
			val new_name = element.name
			if (trace.rightInstance.head.name != new_name) {
				trace.rightInstance.head.set(namedElement_Name, new_name)
			}
		}

	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)

		for (var i = 0; i < 4; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.rightInstance.head
			element.remove
			trace.remove
		}
	].addLifeCycle(Lifecycles.getDefault(true, true)).build
//	
//	
	val portconnection2dataaccessAtsystem = createRule(Find_portconnection_system.instance).action(
		CRUDActivationStateEnum.CREATED) [
		val dataInstance1 = processsourceref.createChild(componentInstance_ComponentInstance, componentInstance)
		dataInstance1.set(componentInstance_Category, ComponentCategory.DATA)
		dataInstance1.set(namedElement_Name, portconnection.name)

		val dataInstance2 = processdestinationref.createChild(componentInstance_ComponentInstance, componentInstance)
		dataInstance2.set(componentInstance_Category, ComponentCategory.DATA)
		dataInstance2.set(namedElement_Name, portconnection.name)

		val portconnection = portconnection
		val featuresource = featuresource
		val featuredestination = featuredestination

		val connection_out = processsourceref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_out.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)

		val connection_in = processdestinationref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connection_in.set(connectionInstance_Kind, ConnectionKind.ACCESS_CONNECTION)

		connection_out.set(namedElement_Name, portconnectionrefsource.name)
		connection_in.set(namedElement_Name, portconnectionrefdestination.name)

		val feature_out_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuresource, null)
		var FeatureInstance feature_out

		val feature_in_match = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, featuredestination, null)
		var FeatureInstance feature_in

		if (feature_out_match.isPresent) {
			feature_out = feature_out_match.get.aadlrefElement as FeatureInstance

		} else {
			feature_out = threadsourceref.createChild(componentInstance_FeatureInstance,
				featureInstance) as FeatureInstance
			feature_out.set(namedElement_Name, featuresource.name)
			feature_out.set(featureInstance_Direction, DirectionType.OUT)
			feature_out.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
		}

		if (feature_in_match.isPresent) {
			feature_in = feature_in_match.get.aadlrefElement as FeatureInstance
		} else {
			feature_in = threaddestinationref.createChild(componentInstance_FeatureInstance,
				featureInstance) as FeatureInstance
			feature_in.set(namedElement_Name, featuredestination.name)
			feature_in.set(featureInstance_Direction, DirectionType.IN)
			feature_in.set(featureInstance_Category, FeatureCategory.DATA_ACCESS)
		}

		val connref_in = connection_in.createChild(connectionInstance_ConnectionReference, connectionReference)
		connref_in.set(connectionReference_Context, portconnectionrefdestination.context)
		connref_in.set(connectionReference_Source, dataInstance2)
		connref_in.set(connectionReference_Destination, feature_in)
		connection_in.set(connectionInstance_Source, dataInstance2)
		connection_in.set(connectionInstance_Destination, feature_in)

		val connref_out = connection_out.createChild(connectionInstance_ConnectionReference, connectionReference)
		connref_out.set(connectionReference_Context, portconnectionrefsource.context)
		connref_out.set(connectionReference_Source, feature_out)
		connref_out.set(connectionReference_Destination, dataInstance1)
		connection_out.set(connectionInstance_Source, feature_out)
		connection_out.set(connectionInstance_Destination, dataInstance1)

		val featuresourceleft = feature_out
		val featuredestinationleft = feature_in

		// Traces
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, dataInstance1)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, dataInstance2)
		]

		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_in)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, portconnection)
			addTo(aadl2AadlTrace_RightInstance, connection_out)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuresource)
			// it causes problem in the case of many inputs or outputs N-N
			addTo(aadl2AadlTrace_RightInstance, featuresourceleft)
		]
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, featuredestination)
			addTo(aadl2AadlTrace_RightInstance, featuredestinationleft)

		]

	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)
		for (var i = 0; i < 4; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.leftInstance.head
			val new_name = element.name
			if (trace.rightInstance.head.name != new_name) {
				trace.rightInstance.head.set(namedElement_Name, new_name)
			}
		}

	].action(CRUDActivationStateEnum.DELETED) [
		val traceMatch = engine.is_in_trace.getAllValuesOftrace(null, portconnection, null)

		for (var i = 0; i < 4; i++) {
			val trace = traceMatch.get(i) as Aadl2AadlTrace
			val element = trace.rightInstance.head
			element.remove
			trace.remove
		}
	].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val connection2connectionAtsystem = createRule(Find_otherconnection_system.instance).action(
		CRUDActivationStateEnum.CREATED) [
		val connectionright = systemref.createChild(componentInstance_ConnectionInstance, connectionInstance)
		connectionright.set(namedElement_Name, connection.name)
		connectionright.set(connectionInstance_Kind, connection.kind)
		connectionright.set(connectionInstance_Source, sourceref)
		connectionright.set(connectionInstance_Destination, destinationref)

		val connectionleft = connection
		for (ConnectionReference ref : connection.connectionReferences) {

			val source = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, ref.source, null).get.
				aadlrefElement as ConnectionInstanceEnd

			val destination = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, ref.destination, null).get.
				aadlrefElement as ConnectionInstanceEnd

			val connref = connectionright.createChild(connectionInstance_ConnectionReference, connectionReference)
			// connref.set(connectionReference_Context, )
			connref.set(connectionReference_Source, source)
			connref.set(connectionReference_Destination, destination)

			aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
				addTo(aadl2AadlTrace_LeftInstance, ref)
				addTo(aadl2AadlTrace_RightInstance, connref)
			]
		}
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, connectionleft)
			addTo(aadl2AadlTrace_RightInstance, connectionright)
		]

	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, connection, null).get

		val new_name = traceMatch.aadlElement.name
		if (traceMatch.aadlrefElement.name != new_name) {
			traceMatch.aadlrefElement.set(namedElement_Name, new_name)
		}

	].action(CRUDActivationStateEnum.DELETED)[].addLifeCycle(Lifecycles.getDefault(true, true)).build

	val connection2connection = createRule(Find_otherconnection.instance).action(CRUDActivationStateEnum.CREATED) [
		val connectionright = componentref.createChild(
			componentInstance_ConnectionInstance,
			connectionInstance
		)
		connectionright.set(namedElement_Name, connection.name)
		connectionright.set(connectionInstance_Kind, connection.kind)

		connectionright.set(connectionInstance_Source, sourceref)
		connectionright.set(connectionInstance_Destination, destinationref)

		val connectionleft = connection
		for (ConnectionReference ref : connection.connectionReferences) {

			val source = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, ref.source, null).get.
				aadlrefElement as ConnectionInstanceEnd

			val destination = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, ref.destination, null).get.
				aadlrefElement as ConnectionInstanceEnd

			val connref = connectionright.createChild(connectionInstance_ConnectionReference, connectionReference)
			connref.set(connectionReference_Source, source)
			connref.set(connectionReference_Destination, destination)

			aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
				addTo(aadl2AadlTrace_LeftInstance, ref)
				addTo(aadl2AadlTrace_RightInstance, connref)
			]
		}
		aadl2aadl.createChild(aadl2AadlTraceSpec_Traces, aadl2AadlTrace) => [
			addTo(aadl2AadlTrace_LeftInstance, connectionleft)
			addTo(aadl2AadlTrace_RightInstance, connectionright)
		]

	].action(CRUDActivationStateEnum.UPDATED) [
		val traceMatch = engine.is_in_trace.getOneArbitraryMatch(aadl2aadl, null, connection, null).get
		val new_name = traceMatch.aadlElement.name
		if (traceMatch.aadlrefElement.name != new_name) {
			traceMatch.aadlrefElement.set(namedElement_Name, new_name)
		}

	].action(CRUDActivationStateEnum.DELETED)[].addLifeCycle(Lifecycles.getDefault(true, true)).build
}
