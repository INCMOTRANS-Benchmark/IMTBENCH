/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Group Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::ThreadGroup.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ThreadGroupSubcomponent#getThreadGroupSubcomponentType <em>Thread Group Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getThreadGroupSubcomponent()
 * @model
 * @generated
 */
public interface ThreadGroupSubcomponent extends Subcomponent, aadl2.ThreadGroup {
	/**
	 * Returns the value of the '<em><b>Thread Group Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::ThreadGroup.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Group Subcomponent Type</em>' reference.
	 * @see #setThreadGroupSubcomponentType(ThreadGroupSubcomponentType)
	 * @see aadl2.Aadl2Package#getThreadGroupSubcomponent_ThreadGroupSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ThreadGroupSubcomponentType getThreadGroupSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.ThreadGroupSubcomponent#getThreadGroupSubcomponentType <em>Thread Group Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Group Subcomponent Type</em>' reference.
	 * @see #getThreadGroupSubcomponentType()
	 * @generated
	 */
	void setThreadGroupSubcomponentType(ThreadGroupSubcomponentType value);

} // ThreadGroupSubcomponent
