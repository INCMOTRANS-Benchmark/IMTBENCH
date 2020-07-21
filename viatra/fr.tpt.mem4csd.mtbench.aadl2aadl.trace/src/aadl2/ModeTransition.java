/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Transition</b></em>'.
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
 *   <li>{@link aadl2.ModeTransition#getSource <em>Source</em>}</li>
 *   <li>{@link aadl2.ModeTransition#getDestination <em>Destination</em>}</li>
 *   <li>{@link aadl2.ModeTransition#getOwnedTrigger <em>Owned Trigger</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModeTransition()
 * @model
 * @generated
 */
public interface ModeTransition extends ModeFeature {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Mode)
	 * @see aadl2.Aadl2Package#getModeTransition_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Mode getSource();

	/**
	 * Sets the value of the '{@link aadl2.ModeTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Mode value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Mode)
	 * @see aadl2.Aadl2Package#getModeTransition_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Mode getDestination();

	/**
	 * Sets the value of the '{@link aadl2.ModeTransition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Mode value);

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ModeTransitionTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getModeTransition_OwnedTrigger()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ModeTransitionTrigger> getOwnedTrigger();

} // ModeTransition
