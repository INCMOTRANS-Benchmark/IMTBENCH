/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Associations.</p>
 * <p>From package AADLDetails::NoneSupport.</p>
 * <p>From package AADLConstructs::Packaging.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PackageSection#getOwnedPackageRename <em>Owned Package Rename</em>}</li>
 *   <li>{@link aadl2.PackageSection#getOwnedComponentTypeRename <em>Owned Component Type Rename</em>}</li>
 *   <li>{@link aadl2.PackageSection#getOwnedClassifier <em>Owned Classifier</em>}</li>
 *   <li>{@link aadl2.PackageSection#getOwnedFeatureGroupTypeRename <em>Owned Feature Group Type Rename</em>}</li>
 *   <li>{@link aadl2.PackageSection#getOwnedAnnexLibrary <em>Owned Annex Library</em>}</li>
 *   <li>{@link aadl2.PackageSection#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link aadl2.PackageSection#isNoAnnexes <em>No Annexes</em>}</li>
 *   <li>{@link aadl2.PackageSection#isNoProperties <em>No Properties</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPackageSection()
 * @model abstract="true"
 *        annotation="duplicates"
 * @generated
 */
public interface PackageSection extends Namespace {
	/**
	 * Returns the value of the '<em><b>Owned Package Rename</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PackageRename}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Package Rename</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_OwnedPackageRename()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PackageRename> getOwnedPackageRename();

	/**
	 * Returns the value of the '<em><b>Owned Component Type Rename</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ComponentTypeRename}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Component Type Rename</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_OwnedComponentTypeRename()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ComponentTypeRename> getOwnedComponentTypeRename();

	/**
	 * Returns the value of the '<em><b>Owned Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Classifier</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_OwnedClassifier()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Classifier> getOwnedClassifier();

	/**
	 * Returns the value of the '<em><b>Owned Feature Group Type Rename</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FeatureGroupTypeRename}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Group Type Rename</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_OwnedFeatureGroupTypeRename()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureGroupTypeRename> getOwnedFeatureGroupTypeRename();

	/**
	 * Returns the value of the '<em><b>Owned Annex Library</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AnnexLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annex Library</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_OwnedAnnexLibrary()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AnnexLibrary> getOwnedAnnexLibrary();

	/**
	 * Returns the value of the '<em><b>Imported Unit</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ModelUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Unit</em>' reference list.
	 * @see aadl2.Aadl2Package#getPackageSection_ImportedUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelUnit> getImportedUnit();

	/**
	 * Returns the value of the '<em><b>No Annexes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Annexes</em>' attribute.
	 * @see #setNoAnnexes(boolean)
	 * @see aadl2.Aadl2Package#getPackageSection_NoAnnexes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoAnnexes();

	/**
	 * Sets the value of the '{@link aadl2.PackageSection#isNoAnnexes <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Annexes</em>' attribute.
	 * @see #isNoAnnexes()
	 * @generated
	 */
	void setNoAnnexes(boolean value);

	/**
	 * Returns the value of the '<em><b>No Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Properties</em>' attribute.
	 * @see #setNoProperties(boolean)
	 * @see aadl2.Aadl2Package#getPackageSection_NoProperties()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoProperties();

	/**
	 * Sets the value of the '{@link aadl2.PackageSection#isNoProperties <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Properties</em>' attribute.
	 * @see #isNoProperties()
	 * @generated
	 */
	void setNoProperties(boolean value);

} // PackageSection
