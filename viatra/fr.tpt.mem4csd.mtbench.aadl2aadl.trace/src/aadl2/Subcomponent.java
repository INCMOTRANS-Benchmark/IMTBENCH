/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Components.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.Subcomponent#getSubcomponentType <em>Subcomponent Type</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getOwnedModeBinding <em>Owned Mode Binding</em>}</li>
 *   <li>{@link aadl2.Subcomponent#isAllModes <em>All Modes</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getImplementationReference <em>Implementation Reference</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.Subcomponent#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSubcomponent()
 * @model abstract="true"
 *        annotation="duplicates"
 * @generated
 */
public interface Subcomponent extends StructuralFeature, ModalElement, Context, FlowElement, ArrayableElement {
	/**
	 * Returns the value of the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subcomponent Type</em>' reference.
	 * @see aadl2.Aadl2Package#getSubcomponent_SubcomponentType()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	SubcomponentType getSubcomponentType();

	/**
	 * Returns the value of the '<em><b>Owned Prototype Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PrototypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Prototype Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSubcomponent_OwnedPrototypeBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PrototypeBinding> getOwnedPrototypeBinding();

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see aadl2.Aadl2Package#getSubcomponent_Prototype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentPrototype getPrototype();

	/**
	 * Returns the value of the '<em><b>Owned Mode Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ModeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Mode Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSubcomponent_OwnedModeBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModeBinding> getOwnedModeBinding();

	/**
	 * Returns the value of the '<em><b>All Modes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Modes</em>' attribute.
	 * @see #setAllModes(boolean)
	 * @see aadl2.Aadl2Package#getSubcomponent_AllModes()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllModes();

	/**
	 * Sets the value of the '{@link aadl2.Subcomponent#isAllModes <em>All Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Modes</em>' attribute.
	 * @see #isAllModes()
	 * @generated
	 */
	void setAllModes(boolean value);

	/**
	 * Returns the value of the '<em><b>Implementation Reference</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ComponentImplementationReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Reference</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSubcomponent_ImplementationReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentImplementationReference> getImplementationReference();

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refined</em>' reference.
	 * @see #setRefined(Subcomponent)
	 * @see aadl2.Aadl2Package#getSubcomponent_Refined()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Subcomponent getRefined();

	/**
	 * Sets the value of the '{@link aadl2.Subcomponent#getRefined <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' reference.
	 * @see #getRefined()
	 * @generated
	 */
	void setRefined(Subcomponent value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see aadl2.Aadl2Package#getSubcomponent_Classifier()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentClassifier getClassifier();

} // Subcomponent
