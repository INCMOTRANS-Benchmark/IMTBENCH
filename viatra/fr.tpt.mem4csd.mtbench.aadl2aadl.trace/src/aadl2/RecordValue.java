/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Expressions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.RecordValue#getOwnedFieldValue <em>Owned Field Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRecordValue()
 * @model
 * @generated
 */
public interface RecordValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Owned Field Value</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BasicPropertyAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Field Value</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getRecordValue_OwnedFieldValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BasicPropertyAssociation> getOwnedFieldValue();

} // RecordValue
