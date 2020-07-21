/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Implementation</b></em>'.
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
 *   <li>{@link aadl2.ProcessorImplementation#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessorImplementation#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessorImplementation#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.ProcessorImplementation#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getProcessorImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface ProcessorImplementation extends ComponentImplementation, ProcessorClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Processor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessorImplementation_OwnedBusSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BusSubcomponent> getOwnedBusSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Memory Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.MemorySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Processor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Memory Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessorImplementation_OwnedMemorySubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<MemorySubcomponent> getOwnedMemorySubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Virtual Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualBusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Processor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessorImplementation_OwnedVirtualBusSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Virtual Processor Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualProcessorSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Processor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getProcessorImplementation_OwnedVirtualProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualProcessorSubcomponent> getOwnedVirtualProcessorSubcomponent();

} // ProcessorImplementation
