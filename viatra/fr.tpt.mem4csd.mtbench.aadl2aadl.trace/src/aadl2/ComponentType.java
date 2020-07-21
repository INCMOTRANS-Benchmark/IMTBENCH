/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::NoneSupport.</p>
 * <p>From package AADLConstructs::Components.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ComponentType#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link aadl2.ComponentType#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.ComponentType#getOwnedFlowSpecification <em>Owned Flow Specification</em>}</li>
 *   <li>{@link aadl2.ComponentType#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.ComponentType#getOwnedFeatureGroup <em>Owned Feature Group</em>}</li>
 *   <li>{@link aadl2.ComponentType#getOwnedAbstractFeature <em>Owned Abstract Feature</em>}</li>
 *   <li>{@link aadl2.ComponentType#isNoFeatures <em>No Features</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature</em>' reference list.
	 * @see aadl2.Aadl2Package#getComponentType_OwnedFeature()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(ComponentType)
	 * @see aadl2.Aadl2Package#getComponentType_Extended()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentType getExtended();

	/**
	 * Sets the value of the '{@link aadl2.ComponentType#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Owned Flow Specification</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FlowSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Flow Specification</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentType_OwnedFlowSpecification()
	 * @model containment="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FlowSpecification> getOwnedFlowSpecification();

	/**
	 * Returns the value of the '<em><b>Owned Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Extension</em>' containment reference.
	 * @see #setOwnedExtension(TypeExtension)
	 * @see aadl2.Aadl2Package#getComponentType_OwnedExtension()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	TypeExtension getOwnedExtension();

	/**
	 * Sets the value of the '{@link aadl2.ComponentType#getOwnedExtension <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Extension</em>' containment reference.
	 * @see #getOwnedExtension()
	 * @generated
	 */
	void setOwnedExtension(TypeExtension value);

	/**
	 * Returns the value of the '<em><b>Owned Feature Group</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FeatureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Group</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentType_OwnedFeatureGroup()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureGroup> getOwnedFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Feature</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AbstractFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Abstract Feature</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentType_OwnedAbstractFeature()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AbstractFeature> getOwnedAbstractFeature();

	/**
	 * Returns the value of the '<em><b>No Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Features</em>' attribute.
	 * @see #setNoFeatures(boolean)
	 * @see aadl2.Aadl2Package#getComponentType_NoFeatures()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoFeatures();

	/**
	 * Sets the value of the '{@link aadl2.ComponentType#isNoFeatures <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Features</em>' attribute.
	 * @see #isNoFeatures()
	 * @generated
	 */
	void setNoFeatures(boolean value);

} // ComponentType
