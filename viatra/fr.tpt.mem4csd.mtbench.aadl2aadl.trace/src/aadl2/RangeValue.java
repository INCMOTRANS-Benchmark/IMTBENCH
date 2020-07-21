/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Value</b></em>'.
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
 *   <li>{@link aadl2.RangeValue#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link aadl2.RangeValue#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link aadl2.RangeValue#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getRangeValue()
 * @model
 * @generated
 */
public interface RangeValue extends PropertyValue {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum</em>' containment reference.
	 * @see #setMinimum(PropertyExpression)
	 * @see aadl2.Aadl2Package#getRangeValue_Minimum()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getMinimum();

	/**
	 * Sets the value of the '{@link aadl2.RangeValue#getMinimum <em>Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' containment reference.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(PropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum</em>' containment reference.
	 * @see #setMaximum(PropertyExpression)
	 * @see aadl2.Aadl2Package#getRangeValue_Maximum()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getMaximum();

	/**
	 * Sets the value of the '{@link aadl2.RangeValue#getMaximum <em>Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' containment reference.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(PropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Delta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Expressions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta</em>' containment reference.
	 * @see #setDelta(PropertyExpression)
	 * @see aadl2.Aadl2Package#getRangeValue_Delta()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getDelta();

	/**
	 * Sets the value of the '{@link aadl2.RangeValue#getDelta <em>Delta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta</em>' containment reference.
	 * @see #getDelta()
	 * @generated
	 */
	void setDelta(PropertyExpression value);

} // RangeValue
