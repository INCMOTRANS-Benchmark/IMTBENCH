/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.instance.SystemInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aadl2 Aadl Trace Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getLeftSystem <em>Left System</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getRightSystem <em>Right System</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTraceSpec()
 * @model
 * @generated
 */
public interface Aadl2AadlTraceSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Left System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left System</em>' reference.
	 * @see #setLeftSystem(SystemInstance)
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTraceSpec_LeftSystem()
	 * @model
	 * @generated
	 */
	SystemInstance getLeftSystem();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getLeftSystem <em>Left System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left System</em>' reference.
	 * @see #getLeftSystem()
	 * @generated
	 */
	void setLeftSystem(SystemInstance value);

	/**
	 * Returns the value of the '<em><b>Right System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right System</em>' reference.
	 * @see #setRightSystem(SystemInstance)
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTraceSpec_RightSystem()
	 * @model
	 * @generated
	 */
	SystemInstance getRightSystem();

	/**
	 * Sets the value of the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getRightSystem <em>Right System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right System</em>' reference.
	 * @see #getRightSystem()
	 * @generated
	 */
	void setRightSystem(SystemInstance value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTraceSpec_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aadl2AadlTrace> getTraces();

} // Aadl2AadlTraceSpec
