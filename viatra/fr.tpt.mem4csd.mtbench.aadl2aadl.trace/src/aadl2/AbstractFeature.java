/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AbstractFeature#getFeaturePrototype <em>Feature Prototype</em>}</li>
 *   <li>{@link aadl2.AbstractFeature#getAbstractFeatureClassifier <em>Abstract Feature Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAbstractFeature()
 * @model
 * @generated
 */
public interface AbstractFeature extends DirectedFeature, TriggerPort {
	/**
	 * Returns the value of the '<em><b>Feature Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Prototype</em>' reference.
	 * @see #setFeaturePrototype(FeaturePrototype)
	 * @see aadl2.Aadl2Package#getAbstractFeature_FeaturePrototype()
	 * @model ordered="false"
	 * @generated
	 */
	FeaturePrototype getFeaturePrototype();

	/**
	 * Sets the value of the '{@link aadl2.AbstractFeature#getFeaturePrototype <em>Feature Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Prototype</em>' reference.
	 * @see #getFeaturePrototype()
	 * @generated
	 */
	void setFeaturePrototype(FeaturePrototype value);

	/**
	 * Returns the value of the '<em><b>Abstract Feature Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Feature Classifier</em>' reference.
	 * @see #setAbstractFeatureClassifier(FeatureClassifier)
	 * @see aadl2.Aadl2Package#getAbstractFeature_AbstractFeatureClassifier()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FeatureClassifier getAbstractFeatureClassifier();

	/**
	 * Sets the value of the '{@link aadl2.AbstractFeature#getAbstractFeatureClassifier <em>Abstract Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Feature Classifier</em>' reference.
	 * @see #getAbstractFeatureClassifier()
	 * @generated
	 */
	void setAbstractFeatureClassifier(FeatureClassifier value);

} // AbstractFeature
