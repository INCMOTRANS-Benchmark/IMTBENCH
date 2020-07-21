/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.util;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.GeneratedPackage
 * @generated
 */
public class GeneratedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratedSwitch<Adapter> modelSwitch = new GeneratedSwitch<Adapter>() {
		@Override
		public Adapter casemoteOperationalTGG(moteOperationalTGG object) {
			return createmoteOperationalTGGAdapter();
		}

		@Override
		public Adapter casemoteAxiom(moteAxiom object) {
			return createmoteAxiomAdapter();
		}

		@Override
		public Adapter caseconnection2connection(connection2connection object) {
			return createconnection2connectionAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00_ForFeatGroup_copy(
				PortConnection2DataAccessSys00_ForFeatGroup_copy object) {
			return createPortConnection2DataAccessSys00_ForFeatGroup_copyAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00(PortConnection2DataAccessSys00 object) {
			return createPortConnection2DataAccessSys00Adapter();
		}

		@Override
		public Adapter casecomponent2component(component2component object) {
			return createcomponent2componentAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys10(PortConnection2DataAccessSys10 object) {
			return createPortConnection2DataAccessSys10Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys01(PortConnection2DataAccessSys01 object) {
			return createPortConnection2DataAccessSys01Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00_ForFeatGroup(
				PortConnection2DataAccessSys00_ForFeatGroup object) {
			return createPortConnection2DataAccessSys00_ForFeatGroupAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccess(PortConnection2DataAccess object) {
			return createPortConnection2DataAccessAdapter();
		}

		@Override
		public Adapter casesubcomponent2subcomponent(subcomponent2subcomponent object) {
			return createsubcomponent2subcomponentAdapter();
		}

		@Override
		public Adapter caseconnection2connectionSys(connection2connectionSys object) {
			return createconnection2connectionSysAdapter();
		}

		@Override
		public Adapter casesubfeature2subfeature(subfeature2subfeature object) {
			return createsubfeature2subfeatureAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys11(PortConnection2DataAccessSys11 object) {
			return createPortConnection2DataAccessSys11Adapter();
		}

		@Override
		public Adapter caseconnection2connectionSysDevice(connection2connectionSysDevice object) {
			return createconnection2connectionSysDeviceAdapter();
		}

		@Override
		public Adapter casefeature2feature(feature2feature object) {
			return createfeature2featureAdapter();
		}

		@Override
		public Adapter caseconnectionref2connectionref(connectionref2connectionref object) {
			return createconnectionref2connectionrefAdapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys11Plus(PortConnection2DataAccessSys11Plus object) {
			return createPortConnection2DataAccessSys11PlusAdapter();
		}

		@Override
		public Adapter casemoteAxiom_r0(moteAxiom_r0 object) {
			return createmoteAxiom_r0Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00_ForFeatGroup_r11(
				PortConnection2DataAccessSys00_ForFeatGroup_r11 object) {
			return createPortConnection2DataAccessSys00_ForFeatGroup_r11Adapter();
		}

		@Override
		public Adapter casecomponent2component_r1(component2component_r1 object) {
			return createcomponent2component_r1Adapter();
		}

		@Override
		public Adapter caseconnection2connectionSys_r9(connection2connectionSys_r9 object) {
			return createconnection2connectionSys_r9Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccess_r4(PortConnection2DataAccess_r4 object) {
			return createPortConnection2DataAccess_r4Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00_ForFeatGroup_copy_r12(
				PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 object) {
			return createPortConnection2DataAccessSys00_ForFeatGroup_copy_r12Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys01_r801(PortConnection2DataAccessSys01_r801 object) {
			return createPortConnection2DataAccessSys01_r801Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys00_r800(PortConnection2DataAccessSys00_r800 object) {
			return createPortConnection2DataAccessSys00_r800Adapter();
		}

		@Override
		public Adapter casesubcomponent2subcomponent_r2(subcomponent2subcomponent_r2 object) {
			return createsubcomponent2subcomponent_r2Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys11Plus_r811p(PortConnection2DataAccessSys11Plus_r811p object) {
			return createPortConnection2DataAccessSys11Plus_r811pAdapter();
		}

		@Override
		public Adapter casefeature2feature_r3(feature2feature_r3 object) {
			return createfeature2feature_r3Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys10_r810(PortConnection2DataAccessSys10_r810 object) {
			return createPortConnection2DataAccessSys10_r810Adapter();
		}

		@Override
		public Adapter caseconnection2connectionSysDevice_r7(connection2connectionSysDevice_r7 object) {
			return createconnection2connectionSysDevice_r7Adapter();
		}

		@Override
		public Adapter casesubfeature2subfeature_r10(subfeature2subfeature_r10 object) {
			return createsubfeature2subfeature_r10Adapter();
		}

		@Override
		public Adapter casePortConnection2DataAccessSys11_r811(PortConnection2DataAccessSys11_r811 object) {
			return createPortConnection2DataAccessSys11_r811Adapter();
		}

		@Override
		public Adapter caseconnectionref2connectionref_r6(connectionref2connectionref_r6 object) {
			return createconnectionref2connectionref_r6Adapter();
		}

		@Override
		public Adapter caseconnection2connection_r5(connection2connection_r5 object) {
			return createconnection2connection_r5Adapter();
		}

		@Override
		public Adapter caseOperationalTGG(OperationalTGG object) {
			return createOperationalTGGAdapter();
		}

		@Override
		public Adapter caseSdmOperationalTGG(SdmOperationalTGG object) {
			return createSdmOperationalTGGAdapter();
		}

		@Override
		public Adapter caseOperationalMappingGroup(OperationalMappingGroup object) {
			return createOperationalMappingGroupAdapter();
		}

		@Override
		public Adapter caseOperationalAxiomGroup(OperationalAxiomGroup object) {
			return createOperationalAxiomGroupAdapter();
		}

		@Override
		public Adapter caseOperationalRuleGroup(OperationalRuleGroup object) {
			return createOperationalRuleGroupAdapter();
		}

		@Override
		public Adapter caseOperationalMapping(OperationalMapping object) {
			return createOperationalMappingAdapter();
		}

		@Override
		public Adapter caseOperationalAxiom(OperationalAxiom object) {
			return createOperationalAxiomAdapter();
		}

		@Override
		public Adapter caseOperationalRule(OperationalRule object) {
			return createOperationalRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteOperationalTGG <em>mote Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteOperationalTGG
	 * @generated
	 */
	public Adapter createmoteOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom <em>mote Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom
	 * @generated
	 */
	public Adapter createmoteAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection <em>connection2connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection
	 * @generated
	 */
	public Adapter createconnection2connectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy <em>Port Connection2 Data Access Sys00 For Feat Group copy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00_ForFeatGroup_copyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00 <em>Port Connection2 Data Access Sys00</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component <em>component2component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component
	 * @generated
	 */
	public Adapter createcomponent2componentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10 <em>Port Connection2 Data Access Sys10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01 <em>Port Connection2 Data Access Sys01</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys01Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup <em>Port Connection2 Data Access Sys00 For Feat Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00_ForFeatGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess <em>Port Connection2 Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent <em>subcomponent2subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent
	 * @generated
	 */
	public Adapter createsubcomponent2subcomponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys <em>connection2connection Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys
	 * @generated
	 */
	public Adapter createconnection2connectionSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature <em>subfeature2subfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature
	 * @generated
	 */
	public Adapter createsubfeature2subfeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11 <em>Port Connection2 Data Access Sys11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice <em>connection2connection Sys Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice
	 * @generated
	 */
	public Adapter createconnection2connectionSysDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature <em>feature2feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature
	 * @generated
	 */
	public Adapter createfeature2featureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref <em>connectionref2connectionref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref
	 * @generated
	 */
	public Adapter createconnectionref2connectionrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus <em>Port Connection2 Data Access Sys11 Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys11PlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0 <em>mote Axiom r0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0
	 * @generated
	 */
	public Adapter createmoteAxiom_r0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11 <em>Port Connection2 Data Access Sys00 For Feat Group r11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00_ForFeatGroup_r11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1 <em>component2component r1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1
	 * @generated
	 */
	public Adapter createcomponent2component_r1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9 <em>connection2connection Sys r9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9
	 * @generated
	 */
	public Adapter createconnection2connectionSys_r9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4 <em>Port Connection2 Data Access r4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4
	 * @generated
	 */
	public Adapter createPortConnection2DataAccess_r4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 <em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00_ForFeatGroup_copy_r12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801 <em>Port Connection2 Data Access Sys01 r801</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys01_r801Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800 <em>Port Connection2 Data Access Sys00 r800</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys00_r800Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2 <em>subcomponent2subcomponent r2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2
	 * @generated
	 */
	public Adapter createsubcomponent2subcomponent_r2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p <em>Port Connection2 Data Access Sys11 Plus r811p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys11Plus_r811pAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3 <em>feature2feature r3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3
	 * @generated
	 */
	public Adapter createfeature2feature_r3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810 <em>Port Connection2 Data Access Sys10 r810</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys10_r810Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7 <em>connection2connection Sys Device r7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7
	 * @generated
	 */
	public Adapter createconnection2connectionSysDevice_r7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10 <em>subfeature2subfeature r10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10
	 * @generated
	 */
	public Adapter createsubfeature2subfeature_r10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811 <em>Port Connection2 Data Access Sys11 r811</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811
	 * @generated
	 */
	public Adapter createPortConnection2DataAccessSys11_r811Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6 <em>connectionref2connectionref r6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6
	 * @generated
	 */
	public Adapter createconnectionref2connectionref_r6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5 <em>connection2connection r5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5
	 * @generated
	 */
	public Adapter createconnection2connection_r5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG
	 * @generated
	 */
	public Adapter createOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG <em>Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG
	 * @generated
	 */
	public Adapter createSdmOperationalTGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup <em>Operational Mapping Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup
	 * @generated
	 */
	public Adapter createOperationalMappingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup <em>Operational Axiom Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup
	 * @generated
	 */
	public Adapter createOperationalAxiomGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup <em>Operational Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup
	 * @generated
	 */
	public Adapter createOperationalRuleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping <em>Operational Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping
	 * @generated
	 */
	public Adapter createOperationalMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom <em>Operational Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom
	 * @generated
	 */
	public Adapter createOperationalAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.operationalTGG.OperationalRule <em>Operational Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.operationalTGG.OperationalRule
	 * @generated
	 */
	public Adapter createOperationalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratedAdapterFactory
