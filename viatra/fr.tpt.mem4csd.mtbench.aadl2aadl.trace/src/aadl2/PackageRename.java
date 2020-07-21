/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Rename</b></em>'.
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
 *   <li>{@link aadl2.PackageRename#getRenamedPackage <em>Renamed Package</em>}</li>
 *   <li>{@link aadl2.PackageRename#isRenameAll <em>Rename All</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPackageRename()
 * @model
 * @generated
 */
public interface PackageRename extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Renamed Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Renamed Package</em>' reference.
	 * @see #setRenamedPackage(AadlPackage)
	 * @see aadl2.Aadl2Package#getPackageRename_RenamedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AadlPackage getRenamedPackage();

	/**
	 * Sets the value of the '{@link aadl2.PackageRename#getRenamedPackage <em>Renamed Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renamed Package</em>' reference.
	 * @see #getRenamedPackage()
	 * @generated
	 */
	void setRenamedPackage(AadlPackage value);

	/**
	 * Returns the value of the '<em><b>Rename All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rename All</em>' attribute.
	 * @see #setRenameAll(boolean)
	 * @see aadl2.Aadl2Package#getPackageRename_RenameAll()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRenameAll();

	/**
	 * Sets the value of the '{@link aadl2.PackageRename#isRenameAll <em>Rename All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename All</em>' attribute.
	 * @see #isRenameAll()
	 * @generated
	 */
	void setRenameAll(boolean value);

} // PackageRename
