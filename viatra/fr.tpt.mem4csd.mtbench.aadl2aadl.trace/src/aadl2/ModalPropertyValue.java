/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Associations.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ModalPropertyValue#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModalPropertyValue()
 * @model
 * @generated
 */
public interface ModalPropertyValue extends ModalElement {
	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference.
	 * @see #setOwnedValue(PropertyExpression)
	 * @see aadl2.Aadl2Package#getModalPropertyValue_OwnedValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getOwnedValue();

	/**
	 * Sets the value of the '{@link aadl2.ModalPropertyValue#getOwnedValue <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value</em>' containment reference.
	 * @see #getOwnedValue()
	 * @generated
	 */
	void setOwnedValue(PropertyExpression value);

} // ModalPropertyValue
