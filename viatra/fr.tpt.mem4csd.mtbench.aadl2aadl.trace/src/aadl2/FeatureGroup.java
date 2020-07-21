/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
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
 *   <li>{@link aadl2.FeatureGroup#isInverse <em>Inverse</em>}</li>
 *   <li>{@link aadl2.FeatureGroup#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link aadl2.FeatureGroup#getFeatureGroupType <em>Feature Group Type</em>}</li>
 *   <li>{@link aadl2.FeatureGroup#getFeatureGroupPrototype <em>Feature Group Prototype</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends DirectedFeature, Context, FeatureGroupConnectionEnd, CallContext {
	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse</em>' attribute.
	 * @see #setInverse(boolean)
	 * @see aadl2.Aadl2Package#getFeatureGroup_Inverse()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInverse();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroup#isInverse <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' attribute.
	 * @see #isInverse()
	 * @generated
	 */
	void setInverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type</em>' reference.
	 * @see #setFeatureType(FeatureType)
	 * @see aadl2.Aadl2Package#getFeatureGroup_FeatureType()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureType getFeatureType();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroup#getFeatureType <em>Feature Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' reference.
	 * @see #getFeatureType()
	 * @generated
	 */
	void setFeatureType(FeatureType value);

	/**
	 * Returns the value of the '<em><b>Feature Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Group Type</em>' reference.
	 * @see aadl2.Aadl2Package#getFeatureGroup_FeatureGroupType()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FeatureGroupType getFeatureGroupType();

	/**
	 * Returns the value of the '<em><b>Feature Group Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Group Prototype</em>' reference.
	 * @see aadl2.Aadl2Package#getFeatureGroup_FeatureGroupPrototype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FeatureGroupPrototype getFeatureGroupPrototype();

} // FeatureGroup
