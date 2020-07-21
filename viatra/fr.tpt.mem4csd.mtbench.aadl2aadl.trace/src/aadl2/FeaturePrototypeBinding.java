/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Prototype Binding</b></em>'.
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
 *   <li>{@link aadl2.FeaturePrototypeBinding#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeaturePrototypeBinding()
 * @model annotation="duplicates"
 * @generated
 */
public interface FeaturePrototypeBinding extends PrototypeBinding {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(FeaturePrototypeActual)
	 * @see aadl2.Aadl2Package#getFeaturePrototypeBinding_Actual()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FeaturePrototypeActual getActual();

	/**
	 * Sets the value of the '{@link aadl2.FeaturePrototypeBinding#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(FeaturePrototypeActual value);

} // FeaturePrototypeBinding
