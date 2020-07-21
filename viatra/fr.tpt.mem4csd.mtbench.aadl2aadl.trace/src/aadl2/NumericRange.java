/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Range</b></em>'.
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
 *   <li>{@link aadl2.NumericRange#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link aadl2.NumericRange#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getNumericRange()
 * @model
 * @generated
 */
public interface NumericRange extends Element {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(PropertyExpression)
	 * @see aadl2.Aadl2Package#getNumericRange_UpperBound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getUpperBound();

	/**
	 * Sets the value of the '{@link aadl2.NumericRange#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(PropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(PropertyExpression)
	 * @see aadl2.Aadl2Package#getNumericRange_LowerBound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getLowerBound();

	/**
	 * Sets the value of the '{@link aadl2.NumericRange#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(PropertyExpression value);

} // NumericRange
