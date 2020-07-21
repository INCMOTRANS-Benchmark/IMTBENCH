/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Data.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.DataImplementation#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.DataImplementation#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDataImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface DataImplementation extends ComponentImplementation, DataClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Data Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Data.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getDataImplementation_OwnedDataSubcomponent()
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
	 * <p>From package AADLDetails::Components::Data.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getDataImplementation_OwnedSubprogramSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent();

} // DataImplementation
