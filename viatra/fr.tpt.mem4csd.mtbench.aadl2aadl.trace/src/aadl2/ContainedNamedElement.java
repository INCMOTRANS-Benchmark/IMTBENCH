/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Associations.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ContainedNamedElement#getPath <em>Path</em>}</li>
 *   <li>{@link aadl2.ContainedNamedElement#getContainmentPathElement <em>Containment Path Element</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getContainedNamedElement()
 * @model
 * @generated
 */
public interface ContainedNamedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(ContainmentPathElement)
	 * @see aadl2.Aadl2Package#getContainedNamedElement_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContainmentPathElement getPath();

	/**
	 * Sets the value of the '{@link aadl2.ContainedNamedElement#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(ContainmentPathElement value);

	/**
	 * Returns the value of the '<em><b>Containment Path Element</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ContainmentPathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::Associations.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containment Path Element</em>' reference list.
	 * @see aadl2.Aadl2Package#getContainedNamedElement_ContainmentPathElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ContainmentPathElement> getContainmentPathElement();

} // ContainedNamedElement
