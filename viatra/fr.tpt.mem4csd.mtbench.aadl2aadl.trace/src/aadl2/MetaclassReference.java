/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metaclass Reference</b></em>'.
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
 *   <li>{@link aadl2.MetaclassReference#getAnnexName <em>Annex Name</em>}</li>
 *   <li>{@link aadl2.MetaclassReference#getMetaclassName <em>Metaclass Name</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getMetaclassReference()
 * @model
 * @generated
 */
public interface MetaclassReference extends PropertyOwner {
	/**
	 * Returns the value of the '<em><b>Annex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annex Name</em>' attribute.
	 * @see #setAnnexName(String)
	 * @see aadl2.Aadl2Package#getMetaclassReference_AnnexName()
	 * @model dataType="aadl2.String" ordered="false"
	 * @generated
	 */
	String getAnnexName();

	/**
	 * Sets the value of the '{@link aadl2.MetaclassReference#getAnnexName <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annex Name</em>' attribute.
	 * @see #getAnnexName()
	 * @generated
	 */
	void setAnnexName(String value);

	/**
	 * Returns the value of the '<em><b>Metaclass Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Types.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass Name</em>' attribute list.
	 * @see aadl2.Aadl2Package#getMetaclassReference_MetaclassName()
	 * @model unique="false" dataType="aadl2.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getMetaclassName();

} // MetaclassReference
