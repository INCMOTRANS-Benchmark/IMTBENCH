/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
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
 *   <li>{@link aadl2.IntegerLiteral#getBase <em>Base</em>}</li>
 *   <li>{@link aadl2.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends NumberValue {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(long)
	 * @see aadl2.Aadl2Package#getIntegerLiteral_Base()
	 * @model dataType="aadl2.Integer" ordered="false"
	 * @generated
	 */
	long getBase();

	/**
	 * Sets the value of the '{@link aadl2.IntegerLiteral#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(long value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see aadl2.Aadl2Package#getIntegerLiteral_Value()
	 * @model dataType="aadl2.Integer" required="true" ordered="false"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link aadl2.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // IntegerLiteral
