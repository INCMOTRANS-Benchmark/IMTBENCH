/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Types.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.RecordType#getOwnedField <em>Owned Field</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends Namespace, NonListType {
	/**
	 * Returns the value of the '<em><b>Owned Field</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BasicProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Field</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getRecordType_OwnedField()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BasicProperty> getOwnedField();

} // RecordType
