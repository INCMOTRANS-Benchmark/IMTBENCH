/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Processor.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ProcessorSubcomponent#getProcessorSubcomponentType <em>Processor Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getProcessorSubcomponent()
 * @model
 * @generated
 */
public interface ProcessorSubcomponent extends Subcomponent, Processor {
	/**
	 * Returns the value of the '<em><b>Processor Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Processor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Subcomponent Type</em>' reference.
	 * @see #setProcessorSubcomponentType(ProcessorSubcomponentType)
	 * @see aadl2.Aadl2Package#getProcessorSubcomponent_ProcessorSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessorSubcomponentType getProcessorSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.ProcessorSubcomponent#getProcessorSubcomponentType <em>Processor Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Subcomponent Type</em>' reference.
	 * @see #getProcessorSubcomponentType()
	 * @generated
	 */
	void setProcessorSubcomponentType(ProcessorSubcomponentType value);

} // ProcessorSubcomponent
