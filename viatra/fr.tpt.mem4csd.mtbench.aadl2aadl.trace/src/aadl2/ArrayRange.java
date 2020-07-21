/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Range</b></em>'.
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
 *   <li>{@link aadl2.ArrayRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link aadl2.ArrayRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getArrayRange()
 * @model
 * @generated
 */
public interface ArrayRange extends Element {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(long)
	 * @see aadl2.Aadl2Package#getArrayRange_LowerBound()
	 * @model dataType="aadl2.Integer" required="true" ordered="false"
	 * @generated
	 */
	long getLowerBound();

	/**
	 * Sets the value of the '{@link aadl2.ArrayRange#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(long value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(long)
	 * @see aadl2.Aadl2Package#getArrayRange_UpperBound()
	 * @model dataType="aadl2.Integer" required="true" ordered="false"
	 * @generated
	 */
	long getUpperBound();

	/**
	 * Sets the value of the '{@link aadl2.ArrayRange#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(long value);

} // ArrayRange
