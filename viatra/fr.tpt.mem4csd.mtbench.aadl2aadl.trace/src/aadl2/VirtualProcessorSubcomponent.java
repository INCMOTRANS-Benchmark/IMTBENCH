/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Processor Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::VirtualProcessor.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.VirtualProcessorSubcomponent#getVirtualProcessorSubcomponentType <em>Virtual Processor Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getVirtualProcessorSubcomponent()
 * @model
 * @generated
 */
public interface VirtualProcessorSubcomponent extends Subcomponent, VirtualProcessor {
	/**
	 * Returns the value of the '<em><b>Virtual Processor Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::VirtualProcessor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Processor Subcomponent Type</em>' reference.
	 * @see #setVirtualProcessorSubcomponentType(VirtualProcessorSubcomponentType)
	 * @see aadl2.Aadl2Package#getVirtualProcessorSubcomponent_VirtualProcessorSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	VirtualProcessorSubcomponentType getVirtualProcessorSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.VirtualProcessorSubcomponent#getVirtualProcessorSubcomponentType <em>Virtual Processor Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Processor Subcomponent Type</em>' reference.
	 * @see #getVirtualProcessorSubcomponentType()
	 * @generated
	 */
	void setVirtualProcessorSubcomponentType(VirtualProcessorSubcomponentType value);

} // VirtualProcessorSubcomponent
