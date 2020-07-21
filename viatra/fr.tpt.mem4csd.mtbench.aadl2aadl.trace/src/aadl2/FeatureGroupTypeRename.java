/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Type Rename</b></em>'.
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
 *   <li>{@link aadl2.FeatureGroupTypeRename#getRenamedFeatureGroupType <em>Renamed Feature Group Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroupTypeRename()
 * @model
 * @generated
 */
public interface FeatureGroupTypeRename extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Renamed Feature Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Renamed Feature Group Type</em>' reference.
	 * @see #setRenamedFeatureGroupType(FeatureGroupType)
	 * @see aadl2.Aadl2Package#getFeatureGroupTypeRename_RenamedFeatureGroupType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureGroupType getRenamedFeatureGroupType();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupTypeRename#getRenamedFeatureGroupType <em>Renamed Feature Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renamed Feature Group Type</em>' reference.
	 * @see #getRenamedFeatureGroupType()
	 * @generated
	 */
	void setRenamedFeatureGroupType(FeatureGroupType value);

} // FeatureGroupTypeRename
