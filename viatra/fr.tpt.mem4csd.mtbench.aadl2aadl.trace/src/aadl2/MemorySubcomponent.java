/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Memory.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.MemorySubcomponent#getMemorySubcomponentType <em>Memory Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getMemorySubcomponent()
 * @model
 * @generated
 */
public interface MemorySubcomponent extends Subcomponent, Memory {
	/**
	 * Returns the value of the '<em><b>Memory Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Memory.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Subcomponent Type</em>' reference.
	 * @see #setMemorySubcomponentType(MemorySubcomponentType)
	 * @see aadl2.Aadl2Package#getMemorySubcomponent_MemorySubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	MemorySubcomponentType getMemorySubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.MemorySubcomponent#getMemorySubcomponentType <em>Memory Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Subcomponent Type</em>' reference.
	 * @see #getMemorySubcomponentType()
	 * @generated
	 */
	void setMemorySubcomponentType(MemorySubcomponentType value);

} // MemorySubcomponent
