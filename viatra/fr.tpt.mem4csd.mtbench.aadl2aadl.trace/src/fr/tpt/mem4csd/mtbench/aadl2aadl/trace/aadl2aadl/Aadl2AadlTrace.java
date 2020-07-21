/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.instance.InstanceObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aadl2 Aadl Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getLeftInstance <em>Left Instance</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getRightInstance <em>Right Instance</em>}</li>
 * </ul>
 *
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTrace()
 * @model
 * @generated
 */
public interface Aadl2AadlTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Instance</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadl2.instance.InstanceObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Instance</em>' reference list.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTrace_LeftInstance()
	 * @model
	 * @generated
	 */
	EList<InstanceObject> getLeftInstance();

	/**
	 * Returns the value of the '<em><b>Right Instance</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadl2.instance.InstanceObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Instance</em>' reference list.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#getAadl2AadlTrace_RightInstance()
	 * @model
	 * @generated
	 */
	EList<InstanceObject> getRightInstance();

} // Aadl2AadlTrace
