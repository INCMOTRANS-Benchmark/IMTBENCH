/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Prototype Binding</b></em>'.
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
 *   <li>{@link aadl2.ComponentPrototypeBinding#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentPrototypeBinding()
 * @model annotation="duplicates"
 * @generated
 */
public interface ComponentPrototypeBinding extends PrototypeBinding {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ComponentPrototypeActual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Templates.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentPrototypeBinding_Actual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComponentPrototypeActual> getActual();

} // ComponentPrototypeBinding
