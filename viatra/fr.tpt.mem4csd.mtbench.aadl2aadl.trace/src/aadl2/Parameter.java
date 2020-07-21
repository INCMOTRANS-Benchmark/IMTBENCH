/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <p>From package AADLDetails::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Parameter#getDataFeatureClassifier <em>Data Feature Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends DirectedFeature, Context, ParameterConnectionEnd {
	/**
	 * Returns the value of the '<em><b>Data Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Feature Classifier</em>' reference.
	 * @see #setDataFeatureClassifier(DataSubcomponentType)
	 * @see aadl2.Aadl2Package#getParameter_DataFeatureClassifier()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	DataSubcomponentType getDataFeatureClassifier();

	/**
	 * Sets the value of the '{@link aadl2.Parameter#getDataFeatureClassifier <em>Data Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Feature Classifier</em>' reference.
	 * @see #getDataFeatureClassifier()
	 * @generated
	 */
	void setDataFeatureClassifier(DataSubcomponentType value);

} // Parameter
