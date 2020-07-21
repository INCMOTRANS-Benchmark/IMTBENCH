/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Package Section</b></em>'.
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
 *   <li>{@link aadl2.PublicPackageSection#getPrivateSection <em>Private Section</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPublicPackageSection()
 * @model
 * @generated
 */
public interface PublicPackageSection extends PackageSection {
	/**
	 * Returns the value of the '<em><b>Private Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aadl2.PrivatePackageSection#getPublicSection <em>Public Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Section</em>' reference.
	 * @see aadl2.Aadl2Package#getPublicPackageSection_PrivateSection()
	 * @see aadl2.PrivatePackageSection#getPublicSection
	 * @model opposite="publicSection" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PrivatePackageSection getPrivateSection();

} // PublicPackageSection
