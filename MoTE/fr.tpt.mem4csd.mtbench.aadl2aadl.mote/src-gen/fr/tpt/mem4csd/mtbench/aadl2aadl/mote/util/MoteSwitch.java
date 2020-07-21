/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.*;

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
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage
 * @generated
 */
public class MoteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MotePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoteSwitch() {
		if (modelPackage == null) {
			modelPackage = MotePackage.eINSTANCE;
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
		case MotePackage.CORR_AXIOM: {
			CorrAxiom corrAxiom = (CorrAxiom) theEObject;
			T result = caseCorrAxiom(corrAxiom);
			if (result == null)
				result = caseTGGNode(corrAxiom);
			if (result == null)
				result = caseMLAnnotatedElement(corrAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_COMPONENT2_COMPONENT: {
			CorrComponent2Component corrComponent2Component = (CorrComponent2Component) theEObject;
			T result = caseCorrComponent2Component(corrComponent2Component);
			if (result == null)
				result = caseTGGNode(corrComponent2Component);
			if (result == null)
				result = caseMLAnnotatedElement(corrComponent2Component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_CONNECTION2_DATA_ACCESS: {
			CorrConnection2DataAccess corrConnection2DataAccess = (CorrConnection2DataAccess) theEObject;
			T result = caseCorrConnection2DataAccess(corrConnection2DataAccess);
			if (result == null)
				result = caseTGGNode(corrConnection2DataAccess);
			if (result == null)
				result = caseMLAnnotatedElement(corrConnection2DataAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_REF2_REF: {
			CorrRef2Ref corrRef2Ref = (CorrRef2Ref) theEObject;
			T result = caseCorrRef2Ref(corrRef2Ref);
			if (result == null)
				result = caseTGGNode(corrRef2Ref);
			if (result == null)
				result = caseMLAnnotatedElement(corrRef2Ref);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_CONN2_CONN: {
			CorrConn2Conn corrConn2Conn = (CorrConn2Conn) theEObject;
			T result = caseCorrConn2Conn(corrConn2Conn);
			if (result == null)
				result = caseTGGNode(corrConn2Conn);
			if (result == null)
				result = caseMLAnnotatedElement(corrConn2Conn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_CONNECTION2_DATA_ACCESS_SYS: {
			CorrConnection2DataAccessSys corrConnection2DataAccessSys = (CorrConnection2DataAccessSys) theEObject;
			T result = caseCorrConnection2DataAccessSys(corrConnection2DataAccessSys);
			if (result == null)
				result = caseTGGNode(corrConnection2DataAccessSys);
			if (result == null)
				result = caseMLAnnotatedElement(corrConnection2DataAccessSys);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_FEATURE2_FEATURE: {
			CorrFeature2Feature corrFeature2Feature = (CorrFeature2Feature) theEObject;
			T result = caseCorrFeature2Feature(corrFeature2Feature);
			if (result == null)
				result = caseTGGNode(corrFeature2Feature);
			if (result == null)
				result = caseMLAnnotatedElement(corrFeature2Feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MotePackage.CORR_REF2_REF_OTHER: {
			CorrRef2RefOther corrRef2RefOther = (CorrRef2RefOther) theEObject;
			T result = caseCorrRef2RefOther(corrRef2RefOther);
			if (result == null)
				result = caseTGGNode(corrRef2RefOther);
			if (result == null)
				result = caseMLAnnotatedElement(corrRef2RefOther);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAxiom(CorrAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Component2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Component2 Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrComponent2Component(CorrComponent2Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Connection2 Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Connection2 Data Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConnection2DataAccess(CorrConnection2DataAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Ref2 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Ref2 Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrRef2Ref(CorrRef2Ref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Conn2 Conn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Conn2 Conn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConn2Conn(CorrConn2Conn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Connection2 Data Access Sys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Connection2 Data Access Sys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrConnection2DataAccessSys(CorrConnection2DataAccessSys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Feature2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Feature2 Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrFeature2Feature(CorrFeature2Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Ref2 Ref Other</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Ref2 Ref Other</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrRef2RefOther(CorrRef2RefOther object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAnnotatedElement(MLAnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGNode(TGGNode object) {
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

} //MoteSwitch
