/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Group Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SubprogramGroupAccess#getSubprogramGroupFeatureClassifier <em>Subprogram Group Feature Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramGroupAccess()
 * @model
 * @generated
 */
public interface SubprogramGroupAccess extends Access, CallContext {
	/**
	 * Returns the value of the '<em><b>Subprogram Group Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Group Feature Classifier</em>' reference.
	 * @see #setSubprogramGroupFeatureClassifier(SubprogramGroupSubcomponentType)
	 * @see aadl2.Aadl2Package#getSubprogramGroupAccess_SubprogramGroupFeatureClassifier()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	SubprogramGroupSubcomponentType getSubprogramGroupFeatureClassifier();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramGroupAccess#getSubprogramGroupFeatureClassifier <em>Subprogram Group Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Group Feature Classifier</em>' reference.
	 * @see #getSubprogramGroupFeatureClassifier()
	 * @generated
	 */
	void setSubprogramGroupFeatureClassifier(SubprogramGroupSubcomponentType value);

} // SubprogramGroupAccess
