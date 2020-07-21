/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrayable Element</b></em>'.
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
 *   <li>{@link aadl2.ArrayableElement#getArrayDimension <em>Array Dimension</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getArrayableElement()
 * @model abstract="true"
 * @generated
 */
public interface ArrayableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Array Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ArrayDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Arrays.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Dimension</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getArrayableElement_ArrayDimension()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayDimension> getArrayDimension();

} // ArrayableElement
