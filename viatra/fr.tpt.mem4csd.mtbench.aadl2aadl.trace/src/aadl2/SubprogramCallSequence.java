/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Calls.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SubprogramCallSequence#getOwnedSubprogramCall <em>Owned Subprogram Call</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramCallSequence()
 * @model
 * @generated
 */
public interface SubprogramCallSequence extends BehavioralFeature, ModalElement {
	/**
	 * Returns the value of the '<em><b>Owned Subprogram Call</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Call</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSubprogramCallSequence_OwnedSubprogramCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubprogramCall> getOwnedSubprogramCall();

} // SubprogramCallSequence
