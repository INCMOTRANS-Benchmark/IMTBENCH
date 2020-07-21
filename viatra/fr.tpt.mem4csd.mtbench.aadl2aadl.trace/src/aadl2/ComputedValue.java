/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Value</b></em>'.
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
 *   <li>{@link aadl2.ComputedValue#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComputedValue()
 * @model
 * @generated
 */
public interface ComputedValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see aadl2.Aadl2Package#getComputedValue_Function()
	 * @model dataType="aadl2.String" required="true" ordered="false"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link aadl2.ComputedValue#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

} // ComputedValue
