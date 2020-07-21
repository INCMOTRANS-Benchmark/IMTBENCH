/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::Associations.</p>
 * <p>From package AADLConstructs::Modes.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ModalElement#getInMode <em>In Mode</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModalElement()
 * @model
 * @generated
 */
public interface ModalElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>In Mode</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Mode</em>' reference list.
	 * @see aadl2.Aadl2Package#getModalElement_InMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mode> getInMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Mode> getAllInModes();

} // ModalElement
