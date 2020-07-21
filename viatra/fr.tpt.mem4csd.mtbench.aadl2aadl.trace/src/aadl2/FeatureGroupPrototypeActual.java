/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Prototype Actual</b></em>'.
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
 *   <li>{@link aadl2.FeatureGroupPrototypeActual#getBinding <em>Binding</em>}</li>
 *   <li>{@link aadl2.FeatureGroupPrototypeActual#getFeatureType <em>Feature Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroupPrototypeActual()
 * @model
 * @generated
 */
public interface FeatureGroupPrototypeActual extends FeaturePrototypeActual {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PrototypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupPrototypeActual_Binding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PrototypeBinding> getBinding();

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type</em>' reference.
	 * @see #setFeatureType(FeatureType)
	 * @see aadl2.Aadl2Package#getFeatureGroupPrototypeActual_FeatureType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureType getFeatureType();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupPrototypeActual#getFeatureType <em>Feature Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' reference.
	 * @see #getFeatureType()
	 * @generated
	 */
	void setFeatureType(FeatureType value);

} // FeatureGroupPrototypeActual
