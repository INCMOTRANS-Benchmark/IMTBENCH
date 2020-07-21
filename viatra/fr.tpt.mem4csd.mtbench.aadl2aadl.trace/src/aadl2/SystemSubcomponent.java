/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::System.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.SystemSubcomponent#getSystemSubcomponentType <em>System Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSystemSubcomponent()
 * @model
 * @generated
 */
public interface SystemSubcomponent extends Subcomponent, aadl2.System {
	/**
	 * Returns the value of the '<em><b>System Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Subcomponent Type</em>' reference.
	 * @see #setSystemSubcomponentType(SystemSubcomponentType)
	 * @see aadl2.Aadl2Package#getSystemSubcomponent_SystemSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	SystemSubcomponentType getSystemSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.SystemSubcomponent#getSystemSubcomponentType <em>System Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Subcomponent Type</em>' reference.
	 * @see #getSystemSubcomponentType()
	 * @generated
	 */
	void setSystemSubcomponentType(SystemSubcomponentType value);

} // SystemSubcomponent
