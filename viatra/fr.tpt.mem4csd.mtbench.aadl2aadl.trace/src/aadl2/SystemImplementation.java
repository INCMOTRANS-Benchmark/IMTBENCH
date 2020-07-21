/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Implementation</b></em>'.
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
 *   <li>{@link aadl2.SystemImplementation#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedProcessSubcomponent <em>Owned Process Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedProcessorSubcomponent <em>Owned Processor Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedSystemSubcomponent <em>Owned System Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.SystemImplementation#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getSystemImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface SystemImplementation extends ComponentImplementation, SystemClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedBusSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BusSubcomponent> getOwnedBusSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Data Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedDataSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataSubcomponent> getOwnedDataSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Device Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DeviceSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Device Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedDeviceSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DeviceSubcomponent> getOwnedDeviceSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Memory Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.MemorySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Memory Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedMemorySubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<MemorySubcomponent> getOwnedMemorySubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Process Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ProcessSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Process Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedProcessSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ProcessSubcomponent> getOwnedProcessSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Processor Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ProcessorSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ProcessorSubcomponent> getOwnedProcessorSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedSubprogramSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramSubcomponent> getOwnedSubprogramSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Group Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramGroupSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedSubprogramGroupSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupSubcomponent> getOwnedSubprogramGroupSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned System Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SystemSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned System Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedSystemSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SystemSubcomponent> getOwnedSystemSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Virtual Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualBusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedVirtualBusSubcomponent()
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
	 * <p>From package AADLDetails::Components::System.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getSystemImplementation_OwnedVirtualProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualProcessorSubcomponent> getOwnedVirtualProcessorSubcomponent();

} // SystemImplementation
