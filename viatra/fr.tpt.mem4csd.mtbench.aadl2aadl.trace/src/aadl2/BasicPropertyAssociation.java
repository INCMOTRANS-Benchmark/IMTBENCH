/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Property Association</b></em>'.
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
 *   <li>{@link aadl2.BasicPropertyAssociation#getProperty <em>Property</em>}</li>
 *   <li>{@link aadl2.BasicPropertyAssociation#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBasicPropertyAssociation()
 * @model
 * @generated
 */
public interface BasicPropertyAssociation extends Element {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(BasicProperty)
	 * @see aadl2.Aadl2Package#getBasicPropertyAssociation_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BasicProperty getProperty();

	/**
	 * Sets the value of the '{@link aadl2.BasicPropertyAssociation#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(BasicProperty value);

	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference.
	 * @see #setOwnedValue(PropertyExpression)
	 * @see aadl2.Aadl2Package#getBasicPropertyAssociation_OwnedValue()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PropertyExpression getOwnedValue();

	/**
	 * Sets the value of the '{@link aadl2.BasicPropertyAssociation#getOwnedValue <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value</em>' containment reference.
	 * @see #getOwnedValue()
	 * @generated
	 */
	void setOwnedValue(PropertyExpression value);

} // BasicPropertyAssociation
