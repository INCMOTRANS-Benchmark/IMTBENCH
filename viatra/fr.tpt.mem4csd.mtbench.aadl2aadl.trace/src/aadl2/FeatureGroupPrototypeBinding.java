/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Prototype Binding</b></em>'.
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
 *   <li>{@link aadl2.FeatureGroupPrototypeBinding#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroupPrototypeBinding()
 * @model annotation="duplicates"
 * @generated
 */
public interface FeatureGroupPrototypeBinding extends PrototypeBinding {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(FeatureGroupPrototypeActual)
	 * @see aadl2.Aadl2Package#getFeatureGroupPrototypeBinding_Actual()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FeatureGroupPrototypeActual getActual();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupPrototypeBinding#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(FeatureGroupPrototypeActual value);

} // FeatureGroupPrototypeBinding
