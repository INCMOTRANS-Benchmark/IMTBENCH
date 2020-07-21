/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Modes.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ModalPath#getInModeOrTransition <em>In Mode Or Transition</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModalPath()
 * @model abstract="true"
 *        annotation="duplicates"
 * @generated
 */
public interface ModalPath extends ModalElement {
	/**
	 * Returns the value of the '<em><b>In Mode Or Transition</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ModeFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Mode Or Transition</em>' reference list.
	 * @see aadl2.Aadl2Package#getModalPath_InModeOrTransition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeFeature> getInModeOrTransition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Mode> getInModes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ModeTransition> getInModeTransitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<ModeTransition> getAllInModeTransitions();

} // ModalPath
