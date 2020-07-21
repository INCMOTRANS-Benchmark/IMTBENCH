/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Package Section</b></em>'.
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
 *   <li>{@link aadl2.PrivatePackageSection#getPublicSection <em>Public Section</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPrivatePackageSection()
 * @model
 * @generated
 */
public interface PrivatePackageSection extends PackageSection {
	/**
	 * Returns the value of the '<em><b>Public Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aadl2.PublicPackageSection#getPrivateSection <em>Private Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Section</em>' reference.
	 * @see aadl2.Aadl2Package#getPrivatePackageSection_PublicSection()
	 * @see aadl2.PublicPackageSection#getPrivateSection
	 * @model opposite="privateSection" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PublicPackageSection getPublicSection();

} // PrivatePackageSection
