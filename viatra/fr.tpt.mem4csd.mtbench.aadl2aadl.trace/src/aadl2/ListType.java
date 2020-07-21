/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
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
 *   <li>{@link aadl2.ListType#getOwnedElementType <em>Owned Element Type</em>}</li>
 *   <li>{@link aadl2.ListType#getReferencedElementType <em>Referenced Element Type</em>}</li>
 *   <li>{@link aadl2.ListType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getListType()
 * @model
 * @generated
 */
public interface ListType extends PropertyType {
	/**
	 * Returns the value of the '<em><b>Owned Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element Type</em>' containment reference.
	 * @see #setOwnedElementType(PropertyType)
	 * @see aadl2.Aadl2Package#getListType_OwnedElementType()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PropertyType getOwnedElementType();

	/**
	 * Sets the value of the '{@link aadl2.ListType#getOwnedElementType <em>Owned Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element Type</em>' containment reference.
	 * @see #getOwnedElementType()
	 * @generated
	 */
	void setOwnedElementType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Referenced Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Element Type</em>' reference.
	 * @see #setReferencedElementType(PropertyType)
	 * @see aadl2.Aadl2Package#getListType_ReferencedElementType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PropertyType getReferencedElementType();

	/**
	 * Sets the value of the '{@link aadl2.ListType#getReferencedElementType <em>Referenced Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element Type</em>' reference.
	 * @see #getReferencedElementType()
	 * @generated
	 */
	void setReferencedElementType(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see aadl2.Aadl2Package#getListType_ElementType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PropertyType getElementType();

} // ListType
