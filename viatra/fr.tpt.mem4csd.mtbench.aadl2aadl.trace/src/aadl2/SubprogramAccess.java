/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Access</b></em>'.
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
 *   <li>{@link aadl2.SubprogramAccess#getSubprogramFeatureClassifier <em>Subprogram Feature Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubprogramAccess()
 * @model
 * @generated
 */
public interface SubprogramAccess extends Access, Context, CalledSubprogram {
	/**
	 * Returns the value of the '<em><b>Subprogram Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subprogram Feature Classifier</em>' reference.
	 * @see #setSubprogramFeatureClassifier(SubprogramSubcomponentType)
	 * @see aadl2.Aadl2Package#getSubprogramAccess_SubprogramFeatureClassifier()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	SubprogramSubcomponentType getSubprogramFeatureClassifier();

	/**
	 * Sets the value of the '{@link aadl2.SubprogramAccess#getSubprogramFeatureClassifier <em>Subprogram Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprogram Feature Classifier</em>' reference.
	 * @see #getSubprogramFeatureClassifier()
	 * @generated
	 */
	void setSubprogramFeatureClassifier(SubprogramSubcomponentType value);

} // SubprogramAccess
