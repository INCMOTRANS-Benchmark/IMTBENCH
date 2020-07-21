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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.GeneratedPackage
 * @generated
 */
public class GeneratedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GeneratedPackage.MOTE_OPERATIONAL_TGG: {
			moteOperationalTGG moteOperationalTGG = (moteOperationalTGG) theEObject;
			T result = casemoteOperationalTGG(moteOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(moteOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(moteOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.MOTE_AXIOM: {
			moteAxiom moteAxiom = (moteAxiom) theEObject;
			T result = casemoteAxiom(moteAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(moteAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(moteAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION: {
			connection2connection connection2connection = (connection2connection) theEObject;
			T result = caseconnection2connection(connection2connection);
			if (result == null)
				result = caseOperationalRuleGroup(connection2connection);
			if (result == null)
				result = caseOperationalMappingGroup(connection2connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY: {
			PortConnection2DataAccessSys00_ForFeatGroup_copy portConnection2DataAccessSys00_ForFeatGroup_copy = (PortConnection2DataAccessSys00_ForFeatGroup_copy) theEObject;
			T result = casePortConnection2DataAccessSys00_ForFeatGroup_copy(
					portConnection2DataAccessSys00_ForFeatGroup_copy);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys00_ForFeatGroup_copy);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys00_ForFeatGroup_copy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00: {
			PortConnection2DataAccessSys00 portConnection2DataAccessSys00 = (PortConnection2DataAccessSys00) theEObject;
			T result = casePortConnection2DataAccessSys00(portConnection2DataAccessSys00);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys00);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys00);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.COMPONENT2COMPONENT: {
			component2component component2component = (component2component) theEObject;
			T result = casecomponent2component(component2component);
			if (result == null)
				result = caseOperationalRuleGroup(component2component);
			if (result == null)
				result = caseOperationalMappingGroup(component2component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS10: {
			PortConnection2DataAccessSys10 portConnection2DataAccessSys10 = (PortConnection2DataAccessSys10) theEObject;
			T result = casePortConnection2DataAccessSys10(portConnection2DataAccessSys10);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys10);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys10);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS01: {
			PortConnection2DataAccessSys01 portConnection2DataAccessSys01 = (PortConnection2DataAccessSys01) theEObject;
			T result = casePortConnection2DataAccessSys01(portConnection2DataAccessSys01);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys01);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys01);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP: {
			PortConnection2DataAccessSys00_ForFeatGroup portConnection2DataAccessSys00_ForFeatGroup = (PortConnection2DataAccessSys00_ForFeatGroup) theEObject;
			T result = casePortConnection2DataAccessSys00_ForFeatGroup(portConnection2DataAccessSys00_ForFeatGroup);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys00_ForFeatGroup);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys00_ForFeatGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS: {
			PortConnection2DataAccess portConnection2DataAccess = (PortConnection2DataAccess) theEObject;
			T result = casePortConnection2DataAccess(portConnection2DataAccess);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccess);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SUBCOMPONENT2SUBCOMPONENT: {
			subcomponent2subcomponent subcomponent2subcomponent = (subcomponent2subcomponent) theEObject;
			T result = casesubcomponent2subcomponent(subcomponent2subcomponent);
			if (result == null)
				result = caseOperationalRuleGroup(subcomponent2subcomponent);
			if (result == null)
				result = caseOperationalMappingGroup(subcomponent2subcomponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION_SYS: {
			connection2connectionSys connection2connectionSys = (connection2connectionSys) theEObject;
			T result = caseconnection2connectionSys(connection2connectionSys);
			if (result == null)
				result = caseOperationalRuleGroup(connection2connectionSys);
			if (result == null)
				result = caseOperationalMappingGroup(connection2connectionSys);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SUBFEATURE2SUBFEATURE: {
			subfeature2subfeature subfeature2subfeature = (subfeature2subfeature) theEObject;
			T result = casesubfeature2subfeature(subfeature2subfeature);
			if (result == null)
				result = caseOperationalRuleGroup(subfeature2subfeature);
			if (result == null)
				result = caseOperationalMappingGroup(subfeature2subfeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11: {
			PortConnection2DataAccessSys11 portConnection2DataAccessSys11 = (PortConnection2DataAccessSys11) theEObject;
			T result = casePortConnection2DataAccessSys11(portConnection2DataAccessSys11);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys11);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys11);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_DEVICE: {
			connection2connectionSysDevice connection2connectionSysDevice = (connection2connectionSysDevice) theEObject;
			T result = caseconnection2connectionSysDevice(connection2connectionSysDevice);
			if (result == null)
				result = caseOperationalRuleGroup(connection2connectionSysDevice);
			if (result == null)
				result = caseOperationalMappingGroup(connection2connectionSysDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.FEATURE2FEATURE: {
			feature2feature feature2feature = (feature2feature) theEObject;
			T result = casefeature2feature(feature2feature);
			if (result == null)
				result = caseOperationalRuleGroup(feature2feature);
			if (result == null)
				result = caseOperationalMappingGroup(feature2feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTIONREF2CONNECTIONREF: {
			connectionref2connectionref connectionref2connectionref = (connectionref2connectionref) theEObject;
			T result = caseconnectionref2connectionref(connectionref2connectionref);
			if (result == null)
				result = caseOperationalRuleGroup(connectionref2connectionref);
			if (result == null)
				result = caseOperationalMappingGroup(connectionref2connectionref);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS: {
			PortConnection2DataAccessSys11Plus portConnection2DataAccessSys11Plus = (PortConnection2DataAccessSys11Plus) theEObject;
			T result = casePortConnection2DataAccessSys11Plus(portConnection2DataAccessSys11Plus);
			if (result == null)
				result = caseOperationalRuleGroup(portConnection2DataAccessSys11Plus);
			if (result == null)
				result = caseOperationalMappingGroup(portConnection2DataAccessSys11Plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.MOTE_AXIOM_R0: {
			moteAxiom_r0 moteAxiom_r0 = (moteAxiom_r0) theEObject;
			T result = casemoteAxiom_r0(moteAxiom_r0);
			if (result == null)
				result = caseOperationalAxiom(moteAxiom_r0);
			if (result == null)
				result = caseOperationalMapping(moteAxiom_r0);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11: {
			PortConnection2DataAccessSys00_ForFeatGroup_r11 portConnection2DataAccessSys00_ForFeatGroup_r11 = (PortConnection2DataAccessSys00_ForFeatGroup_r11) theEObject;
			T result = casePortConnection2DataAccessSys00_ForFeatGroup_r11(
					portConnection2DataAccessSys00_ForFeatGroup_r11);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys00_ForFeatGroup_r11);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys00_ForFeatGroup_r11);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.COMPONENT2COMPONENT_R1: {
			component2component_r1 component2component_r1 = (component2component_r1) theEObject;
			T result = casecomponent2component_r1(component2component_r1);
			if (result == null)
				result = caseOperationalRule(component2component_r1);
			if (result == null)
				result = caseOperationalMapping(component2component_r1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_R9: {
			connection2connectionSys_r9 connection2connectionSys_r9 = (connection2connectionSys_r9) theEObject;
			T result = caseconnection2connectionSys_r9(connection2connectionSys_r9);
			if (result == null)
				result = caseOperationalRule(connection2connectionSys_r9);
			if (result == null)
				result = caseOperationalMapping(connection2connectionSys_r9);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_R4: {
			PortConnection2DataAccess_r4 portConnection2DataAccess_r4 = (PortConnection2DataAccess_r4) theEObject;
			T result = casePortConnection2DataAccess_r4(portConnection2DataAccess_r4);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccess_r4);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccess_r4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12: {
			PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 portConnection2DataAccessSys00_ForFeatGroup_copy_r12 = (PortConnection2DataAccessSys00_ForFeatGroup_copy_r12) theEObject;
			T result = casePortConnection2DataAccessSys00_ForFeatGroup_copy_r12(
					portConnection2DataAccessSys00_ForFeatGroup_copy_r12);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys00_ForFeatGroup_copy_r12);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys00_ForFeatGroup_copy_r12);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS01_R801: {
			PortConnection2DataAccessSys01_r801 portConnection2DataAccessSys01_r801 = (PortConnection2DataAccessSys01_r801) theEObject;
			T result = casePortConnection2DataAccessSys01_r801(portConnection2DataAccessSys01_r801);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys01_r801);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys01_r801);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_R800: {
			PortConnection2DataAccessSys00_r800 portConnection2DataAccessSys00_r800 = (PortConnection2DataAccessSys00_r800) theEObject;
			T result = casePortConnection2DataAccessSys00_r800(portConnection2DataAccessSys00_r800);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys00_r800);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys00_r800);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SUBCOMPONENT2SUBCOMPONENT_R2: {
			subcomponent2subcomponent_r2 subcomponent2subcomponent_r2 = (subcomponent2subcomponent_r2) theEObject;
			T result = casesubcomponent2subcomponent_r2(subcomponent2subcomponent_r2);
			if (result == null)
				result = caseOperationalRule(subcomponent2subcomponent_r2);
			if (result == null)
				result = caseOperationalMapping(subcomponent2subcomponent_r2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P: {
			PortConnection2DataAccessSys11Plus_r811p portConnection2DataAccessSys11Plus_r811p = (PortConnection2DataAccessSys11Plus_r811p) theEObject;
			T result = casePortConnection2DataAccessSys11Plus_r811p(portConnection2DataAccessSys11Plus_r811p);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys11Plus_r811p);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys11Plus_r811p);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.FEATURE2FEATURE_R3: {
			feature2feature_r3 feature2feature_r3 = (feature2feature_r3) theEObject;
			T result = casefeature2feature_r3(feature2feature_r3);
			if (result == null)
				result = caseOperationalRule(feature2feature_r3);
			if (result == null)
				result = caseOperationalMapping(feature2feature_r3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS10_R810: {
			PortConnection2DataAccessSys10_r810 portConnection2DataAccessSys10_r810 = (PortConnection2DataAccessSys10_r810) theEObject;
			T result = casePortConnection2DataAccessSys10_r810(portConnection2DataAccessSys10_r810);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys10_r810);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys10_r810);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_DEVICE_R7: {
			connection2connectionSysDevice_r7 connection2connectionSysDevice_r7 = (connection2connectionSysDevice_r7) theEObject;
			T result = caseconnection2connectionSysDevice_r7(connection2connectionSysDevice_r7);
			if (result == null)
				result = caseOperationalRule(connection2connectionSysDevice_r7);
			if (result == null)
				result = caseOperationalMapping(connection2connectionSysDevice_r7);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.SUBFEATURE2SUBFEATURE_R10: {
			subfeature2subfeature_r10 subfeature2subfeature_r10 = (subfeature2subfeature_r10) theEObject;
			T result = casesubfeature2subfeature_r10(subfeature2subfeature_r10);
			if (result == null)
				result = caseOperationalRule(subfeature2subfeature_r10);
			if (result == null)
				result = caseOperationalMapping(subfeature2subfeature_r10);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_R811: {
			PortConnection2DataAccessSys11_r811 portConnection2DataAccessSys11_r811 = (PortConnection2DataAccessSys11_r811) theEObject;
			T result = casePortConnection2DataAccessSys11_r811(portConnection2DataAccessSys11_r811);
			if (result == null)
				result = caseOperationalRule(portConnection2DataAccessSys11_r811);
			if (result == null)
				result = caseOperationalMapping(portConnection2DataAccessSys11_r811);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTIONREF2CONNECTIONREF_R6: {
			connectionref2connectionref_r6 connectionref2connectionref_r6 = (connectionref2connectionref_r6) theEObject;
			T result = caseconnectionref2connectionref_r6(connectionref2connectionref_r6);
			if (result == null)
				result = caseOperationalRule(connectionref2connectionref_r6);
			if (result == null)
				result = caseOperationalMapping(connectionref2connectionref_r6);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.CONNECTION2CONNECTION_R5: {
			connection2connection_r5 connection2connection_r5 = (connection2connection_r5) theEObject;
			T result = caseconnection2connection_r5(connection2connection_r5);
			if (result == null)
				result = caseOperationalRule(connection2connection_r5);
			if (result == null)
				result = caseOperationalMapping(connection2connection_r5);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mote Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mote Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoteOperationalTGG(moteOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mote Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mote Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoteAxiom(moteAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connection(connection2connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group copy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group copy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00_ForFeatGroup_copy(
			PortConnection2DataAccessSys00_ForFeatGroup_copy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00(PortConnection2DataAccessSys00 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>component2component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>component2component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomponent2component(component2component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys10(PortConnection2DataAccessSys10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys01</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys01</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys01(PortConnection2DataAccessSys01 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00_ForFeatGroup(PortConnection2DataAccessSys00_ForFeatGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccess(PortConnection2DataAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subcomponent2subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subcomponent2subcomponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubcomponent2subcomponent(subcomponent2subcomponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connectionSys(connection2connectionSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subfeature2subfeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subfeature2subfeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubfeature2subfeature(subfeature2subfeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys11(PortConnection2DataAccessSys11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection Sys Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection Sys Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connectionSysDevice(connection2connectionSysDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>feature2feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>feature2feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefeature2feature(feature2feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connectionref2connectionref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connectionref2connectionref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnectionref2connectionref(connectionref2connectionref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys11Plus(PortConnection2DataAccessSys11Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mote Axiom r0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mote Axiom r0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemoteAxiom_r0(moteAxiom_r0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group r11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group r11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00_ForFeatGroup_r11(
			PortConnection2DataAccessSys00_ForFeatGroup_r11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>component2component r1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>component2component r1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomponent2component_r1(component2component_r1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection Sys r9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection Sys r9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connectionSys_r9(connection2connectionSys_r9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access r4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access r4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccess_r4(PortConnection2DataAccess_r4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00_ForFeatGroup_copy_r12(
			PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys01 r801</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys01 r801</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys01_r801(PortConnection2DataAccessSys01_r801 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 r800</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys00 r800</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys00_r800(PortConnection2DataAccessSys00_r800 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subcomponent2subcomponent r2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subcomponent2subcomponent r2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubcomponent2subcomponent_r2(subcomponent2subcomponent_r2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 Plus r811p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 Plus r811p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys11Plus_r811p(PortConnection2DataAccessSys11Plus_r811p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>feature2feature r3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>feature2feature r3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefeature2feature_r3(feature2feature_r3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys10 r810</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys10 r810</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys10_r810(PortConnection2DataAccessSys10_r810 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection Sys Device r7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection Sys Device r7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connectionSysDevice_r7(connection2connectionSysDevice_r7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subfeature2subfeature r10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subfeature2subfeature r10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubfeature2subfeature_r10(subfeature2subfeature_r10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 r811</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Connection2 Data Access Sys11 r811</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConnection2DataAccessSys11_r811(PortConnection2DataAccessSys11_r811 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connectionref2connectionref r6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connectionref2connectionref r6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnectionref2connectionref_r6(connectionref2connectionref_r6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connection2connection r5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connection2connection r5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnection2connection_r5(connection2connection_r5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTGG(OperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdmOperationalTGG(SdmOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMappingGroup(OperationalMappingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiomGroup(OperationalAxiomGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRuleGroup(OperationalRuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMapping(OperationalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiom(OperationalAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRule(OperationalRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GeneratedSwitch
