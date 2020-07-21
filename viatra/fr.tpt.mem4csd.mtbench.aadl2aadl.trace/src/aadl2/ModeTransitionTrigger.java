/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Transition Trigger</b></em>'.
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
 *   <li>{@link aadl2.ModeTransitionTrigger#getContext <em>Context</em>}</li>
 *   <li>{@link aadl2.ModeTransitionTrigger#getTriggerPort <em>Trigger Port</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getModeTransitionTrigger()
 * @model
 * @generated
 */
public interface ModeTransitionTrigger extends Element {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see aadl2.Aadl2Package#getModeTransitionTrigger_Context()
	 * @model ordered="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link aadl2.ModeTransitionTrigger#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Trigger Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Modes.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Port</em>' reference.
	 * @see #setTriggerPort(TriggerPort)
	 * @see aadl2.Aadl2Package#getModeTransitionTrigger_TriggerPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TriggerPort getTriggerPort();

	/**
	 * Sets the value of the '{@link aadl2.ModeTransitionTrigger#getTriggerPort <em>Trigger Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Port</em>' reference.
	 * @see #getTriggerPort()
	 * @generated
	 */
	void setTriggerPort(TriggerPort value);

} // ModeTransitionTrigger
