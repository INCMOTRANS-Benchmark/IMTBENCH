/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Thread.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ThreadSubcomponent#getThreadSubcomponentType <em>Thread Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getThreadSubcomponent()
 * @model
 * @generated
 */
public interface ThreadSubcomponent extends Subcomponent, aadl2.Thread {
	/**
	 * Returns the value of the '<em><b>Thread Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Thread.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Subcomponent Type</em>' reference.
	 * @see #setThreadSubcomponentType(ThreadSubcomponentType)
	 * @see aadl2.Aadl2Package#getThreadSubcomponent_ThreadSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ThreadSubcomponentType getThreadSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.ThreadSubcomponent#getThreadSubcomponentType <em>Thread Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Subcomponent Type</em>' reference.
	 * @see #getThreadSubcomponentType()
	 * @generated
	 */
	void setThreadSubcomponentType(ThreadSubcomponentType value);

} // ThreadSubcomponent
