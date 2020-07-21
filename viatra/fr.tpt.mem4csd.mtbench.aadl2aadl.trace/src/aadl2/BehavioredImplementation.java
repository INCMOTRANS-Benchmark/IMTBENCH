/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Implementation</b></em>'.
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
 *   <li>{@link aadl2.BehavioredImplementation#getSubprogramCall <em>Subprogram Call</em>}</li>
 *   <li>{@link aadl2.BehavioredImplementation#getOwnedSubprogramCallSequence <em>Owned Subprogram Call Sequence</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBehavioredImplementation()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredImplementation extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>Subprogram Call</b></em>' reference list.
	 * The list contents are of type {@link aadl2.SubprogramCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Call</em>' reference list.
	 * @see aadl2.Aadl2Package#getBehavioredImplementation_SubprogramCall()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramCall> getSubprogramCall();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Call Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramCallSequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Call Sequence</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getBehavioredImplementation_OwnedSubprogramCallSequence()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramCallSequence> getOwnedSubprogramCallSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get all calls owned by owned call sequences.
	 * <p>From package AADLDetails::Calls.</p>
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<SubprogramCall> subprogramCalls();

} // BehavioredImplementation
