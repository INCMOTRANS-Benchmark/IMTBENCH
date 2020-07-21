/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Implementation Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Arrays.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ComponentImplementationReference#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link aadl2.ComponentImplementationReference#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentImplementationReference()
 * @model
 * @generated
 */
public interface ComponentImplementationReference extends Element {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(ComponentImplementation)
	 * @see aadl2.Aadl2Package#getComponentImplementationReference_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentImplementation getImplementation();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementationReference#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Owned Prototype Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PrototypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Prototype Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementationReference_OwnedPrototypeBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PrototypeBinding> getOwnedPrototypeBinding();

} // ComponentImplementationReference
