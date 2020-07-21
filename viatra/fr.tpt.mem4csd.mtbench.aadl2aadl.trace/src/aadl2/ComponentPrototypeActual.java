/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Prototype Actual</b></em>'.
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
 *   <li>{@link aadl2.ComponentPrototypeActual#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.ComponentPrototypeActual#getBinding <em>Binding</em>}</li>
 *   <li>{@link aadl2.ComponentPrototypeActual#getSubcomponentType <em>Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentPrototypeActual()
 * @model
 * @generated
 */
public interface ComponentPrototypeActual extends ArrayableElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see aadl2.Aadl2Package#getComponentPrototypeActual_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link aadl2.ComponentPrototypeActual#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PrototypeBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentPrototypeActual_Binding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PrototypeBinding> getBinding();

	/**
	 * Returns the value of the '<em><b>Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subcomponent Type</em>' reference.
	 * @see #setSubcomponentType(SubcomponentType)
	 * @see aadl2.Aadl2Package#getComponentPrototypeActual_SubcomponentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SubcomponentType getSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.ComponentPrototypeActual#getSubcomponentType <em>Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent Type</em>' reference.
	 * @see #getSubcomponentType()
	 * @generated
	 */
	void setSubcomponentType(SubcomponentType value);

} // ComponentPrototypeActual
