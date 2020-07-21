/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Connections.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AccessConnection#getAccessCategory <em>Access Category</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAccessConnection()
 * @model
 * @generated
 */
public interface AccessConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Access Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.AccessCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Category</em>' attribute.
	 * @see aadl2.AccessCategory
	 * @see #setAccessCategory(AccessCategory)
	 * @see aadl2.Aadl2Package#getAccessConnection_AccessCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessCategory getAccessCategory();

	/**
	 * Sets the value of the '{@link aadl2.AccessConnection#getAccessCategory <em>Access Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Category</em>' attribute.
	 * @see aadl2.AccessCategory
	 * @see #getAccessCategory()
	 * @generated
	 */
	void setAccessCategory(AccessCategory value);

} // AccessConnection
