/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Constants.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PropertyConstant#getReferencedPropertyType <em>Referenced Property Type</em>}</li>
 *   <li>{@link aadl2.PropertyConstant#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 *   <li>{@link aadl2.PropertyConstant#getConstantValue <em>Constant Value</em>}</li>
 *   <li>{@link aadl2.PropertyConstant#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPropertyConstant()
 * @model
 * @generated
 */
public interface PropertyConstant extends TypedElement, AbstractNamedValue, ArraySizeProperty {
	/**
	 * Returns the value of the '<em><b>Referenced Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Constants.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Property Type</em>' reference.
	 * @see #setReferencedPropertyType(PropertyType)
	 * @see aadl2.Aadl2Package#getPropertyConstant_ReferencedPropertyType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PropertyType getReferencedPropertyType();

	/**
	 * Sets the value of the '{@link aadl2.PropertyConstant#getReferencedPropertyType <em>Referenced Property Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property Type</em>' reference.
	 * @see #getReferencedPropertyType()
	 * @generated
	 */
	void setReferencedPropertyType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Owned Property Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Constants.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Type</em>' containment reference.
	 * @see #setOwnedPropertyType(PropertyType)
	 * @see aadl2.Aadl2Package#getPropertyConstant_OwnedPropertyType()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PropertyType getOwnedPropertyType();

	/**
	 * Sets the value of the '{@link aadl2.PropertyConstant#getOwnedPropertyType <em>Owned Property Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Property Type</em>' containment reference.
	 * @see #getOwnedPropertyType()
	 * @generated
	 */
	void setOwnedPropertyType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Constants.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant Value</em>' containment reference.
	 * @see #setConstantValue(PropertyExpression)
	 * @see aadl2.Aadl2Package#getPropertyConstant_ConstantValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getConstantValue();

	/**
	 * Sets the value of the '{@link aadl2.PropertyConstant#getConstantValue <em>Constant Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Value</em>' containment reference.
	 * @see #getConstantValue()
	 * @generated
	 */
	void setConstantValue(PropertyExpression value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Constants.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Type</em>' reference.
	 * @see aadl2.Aadl2Package#getPropertyConstant_PropertyType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	PropertyType getPropertyType();

} // PropertyConstant
