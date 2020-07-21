/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Access#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.Access#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAccess()
 * @model abstract="true"
 * @generated
 */
public interface Access extends Feature, AccessConnectionEnd {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.AccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see aadl2.AccessType
	 * @see #setKind(AccessType)
	 * @see aadl2.Aadl2Package#getAccess_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessType getKind();

	/**
	 * Sets the value of the '{@link aadl2.Access#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see aadl2.AccessType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AccessType value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.AccessCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.AccessCategory
	 * @see aadl2.Aadl2Package#getAccess_Category()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	AccessCategory getCategory();

} // Access
