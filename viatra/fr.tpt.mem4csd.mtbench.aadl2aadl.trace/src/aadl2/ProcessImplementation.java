/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Process.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ProcessImplementation#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessImplementation#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessImplementation#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessImplementation#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessImplementation#getOwnedThreadGroupSubcomponent <em>Owned Thread Group Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getProcessImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface ProcessImplementation extends ComponentImplementation, ProcessClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Data Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessImplementation_OwnedDataSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataSubcomponent> getOwnedDataSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessImplementation_OwnedSubprogramSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Group Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramGroupSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessImplementation_OwnedSubprogramGroupSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupSubcomponent> getOwnedSubprogramGroupSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Thread Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ThreadSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Thread Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessImplementation_OwnedThreadSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ThreadSubcomponent> getOwnedThreadSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Thread Group Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ThreadGroupSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Thread Group Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessImplementation_OwnedThreadGroupSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ThreadGroupSubcomponent> getOwnedThreadGroupSubcomponent();

} // ProcessImplementation
