/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Process.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ProcessSubcomponent#getProcessSubcomponentType <em>Process Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getProcessSubcomponent()
 * @model
 * @generated
 */
public interface ProcessSubcomponent extends Subcomponent, aadl2.Process {
	/**
	 * Returns the value of the '<em><b>Process Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Process.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Subcomponent Type</em>' reference.
	 * @see #setProcessSubcomponentType(ProcessSubcomponentType)
	 * @see aadl2.Aadl2Package#getProcessSubcomponent_ProcessSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessSubcomponentType getProcessSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.ProcessSubcomponent#getProcessSubcomponentType <em>Process Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Subcomponent Type</em>' reference.
	 * @see #getProcessSubcomponentType()
	 * @generated
	 */
	void setProcessSubcomponentType(ProcessSubcomponentType value);

} // ProcessSubcomponent
