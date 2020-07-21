/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Templates.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.FeatureGroupPrototype#getConstrainingFeatureGroupType <em>Constraining Feature Group Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroupPrototype()
 * @model
 * @generated
 */
public interface FeatureGroupPrototype extends Prototype, FeatureType {
	/**
	 * Returns the value of the '<em><b>Constraining Feature Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Feature Group Type</em>' reference.
	 * @see #setConstrainingFeatureGroupType(FeatureGroupType)
	 * @see aadl2.Aadl2Package#getFeatureGroupPrototype_ConstrainingFeatureGroupType()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureGroupType getConstrainingFeatureGroupType();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupPrototype#getConstrainingFeatureGroupType <em>Constraining Feature Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Feature Group Type</em>' reference.
	 * @see #getConstrainingFeatureGroupType()
	 * @generated
	 */
	void setConstrainingFeatureGroupType(FeatureGroupType value);

} // FeatureGroupPrototype
