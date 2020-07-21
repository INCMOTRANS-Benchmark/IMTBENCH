/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aadl Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Packaging.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AadlPackage#getOwnedPublicSection <em>Owned Public Section</em>}</li>
 *   <li>{@link aadl2.AadlPackage#getOwnedPrivateSection <em>Owned Private Section</em>}</li>
 *   <li>{@link aadl2.AadlPackage#getPublicSection <em>Public Section</em>}</li>
 *   <li>{@link aadl2.AadlPackage#getPrivateSection <em>Private Section</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAadlPackage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Package'"
 *        extendedMetaData="name='Package'"
 * @generated
 */
public interface AadlPackage extends ModelUnit {
	/**
	 * Returns the value of the '<em><b>Owned Public Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Public Section</em>' containment reference.
	 * @see #setOwnedPublicSection(PublicPackageSection)
	 * @see aadl2.Aadl2Package#getAadlPackage_OwnedPublicSection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PublicPackageSection getOwnedPublicSection();

	/**
	 * Sets the value of the '{@link aadl2.AadlPackage#getOwnedPublicSection <em>Owned Public Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Public Section</em>' containment reference.
	 * @see #getOwnedPublicSection()
	 * @generated
	 */
	void setOwnedPublicSection(PublicPackageSection value);

	/**
	 * Returns the value of the '<em><b>Owned Private Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Private Section</em>' containment reference.
	 * @see #setOwnedPrivateSection(PrivatePackageSection)
	 * @see aadl2.Aadl2Package#getAadlPackage_OwnedPrivateSection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	PrivatePackageSection getOwnedPrivateSection();

	/**
	 * Sets the value of the '{@link aadl2.AadlPackage#getOwnedPrivateSection <em>Owned Private Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Private Section</em>' containment reference.
	 * @see #getOwnedPrivateSection()
	 * @generated
	 */
	void setOwnedPrivateSection(PrivatePackageSection value);

	/**
	 * Returns the value of the '<em><b>Public Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Section</em>' reference.
	 * @see #setPublicSection(PublicPackageSection)
	 * @see aadl2.Aadl2Package#getAadlPackage_PublicSection()
	 * @model ordered="false"
	 * @generated
	 */
	PublicPackageSection getPublicSection();

	/**
	 * Sets the value of the '{@link aadl2.AadlPackage#getPublicSection <em>Public Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Section</em>' reference.
	 * @see #getPublicSection()
	 * @generated
	 */
	void setPublicSection(PublicPackageSection value);

	/**
	 * Returns the value of the '<em><b>Private Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Section</em>' reference.
	 * @see #setPrivateSection(PrivatePackageSection)
	 * @see aadl2.Aadl2Package#getAadlPackage_PrivateSection()
	 * @model ordered="false"
	 * @generated
	 */
	PrivatePackageSection getPrivateSection();

	/**
	 * Sets the value of the '{@link aadl2.AadlPackage#getPrivateSection <em>Private Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Section</em>' reference.
	 * @see #getPrivateSection()
	 * @generated
	 */
	void setPrivateSection(PrivatePackageSection value);

} // AadlPackage
