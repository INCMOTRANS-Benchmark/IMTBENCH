/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Value</b></em>'.
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
 *   <li>{@link aadl2.NamedValue#getNamedValue <em>Named Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNamedValue()
 * @model
 * @generated
 */
public interface NamedValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Named Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Named Value</em>' reference.
	 * @see #setNamedValue(AbstractNamedValue)
	 * @see aadl2.Aadl2Package#getNamedValue_NamedValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AbstractNamedValue getNamedValue();

	/**
	 * Sets the value of the '{@link aadl2.NamedValue#getNamedValue <em>Named Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Named Value</em>' reference.
	 * @see #getNamedValue()
	 * @generated
	 */
	void setNamedValue(AbstractNamedValue value);

} // NamedValue
