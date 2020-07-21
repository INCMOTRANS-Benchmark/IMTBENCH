/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Connections.</p>
 * <p>From package AADLConstructs::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Feature#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link aadl2.Feature#getFeatureClassifier <em>Feature Classifier</em>}</li>
 *   <li>{@link aadl2.Feature#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.Feature#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends StructuralFeature, FeatureConnectionEnd, ArrayableElement {
	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see aadl2.Aadl2Package#getFeature_Prototype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentPrototype getPrototype();

	/**
	 * Returns the value of the '<em><b>Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Classifier</em>' reference.
	 * @see aadl2.Aadl2Package#getFeature_FeatureClassifier()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	FeatureClassifier getFeatureClassifier();

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(Feature)
	 * @see aadl2.Aadl2Package#getFeature_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getRefined();

	/**
	 * Sets the value of the '{@link aadl2.Feature#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Feature value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see aadl2.Aadl2Package#getFeature_Classifier()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Classifier getClassifier();

} // Feature
