/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
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
 *   <li>{@link aadl2.NumberValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNumberValue()
 * @model abstract="true"
 * @generated
 */
public interface NumberValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(UnitLiteral)
	 * @see aadl2.Aadl2Package#getNumberValue_Unit()
	 * @model ordered="false"
	 * @generated
	 */
	UnitLiteral getUnit();

	/**
	 * Sets the value of the '{@link aadl2.NumberValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Real" required="true" ordered="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	double getScaledValue(UnitLiteral target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="aadl2.Real" required="true" ordered="false"
	 * @generated
	 */
	double getScaledValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="aadl2.Real" required="true" ordered="false" targetDataType="aadl2.String" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	double getScaledValue(String target);

} // NumberValue
