/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Abstract.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedDataSubcomponent <em>Owned Data Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedDeviceSubcomponent <em>Owned Device Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedProcessSubcomponent <em>Owned Process Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedProcessorSubcomponent <em>Owned Processor Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedSystemSubcomponent <em>Owned System Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedSubprogramSubcomponent <em>Owned Subprogram Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedSubprogramGroupSubcomponent <em>Owned Subprogram Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedThreadSubcomponent <em>Owned Thread Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedThreadGroupSubcomponent <em>Owned Thread Group Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.AbstractImplementation#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAbstractImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface AbstractImplementation extends BehavioredImplementation, AbstractClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedBusSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedDataSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Device Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedDeviceSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Memory Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedMemorySubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Process Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedProcessSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ProcessorSubcomponent> getOwnedProcessorSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned System Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SystemSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned System Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedSystemSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SystemSubcomponent> getOwnedSystemSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedSubprogramSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedSubprogramGroupSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupSubcomponent> getOwnedSubprogramGroupSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Thread Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ThreadSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Thread Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedThreadSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ThreadSubcomponent> getOwnedThreadSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Thread Group Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ThreadGroupSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Thread Group Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedThreadGroupSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ThreadGroupSubcomponent> getOwnedThreadGroupSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Virtual Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualBusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedVirtualBusSubcomponent()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractImplementation_OwnedVirtualProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualProcessorSubcomponent> getOwnedVirtualProcessorSubcomponent();

} // AbstractImplementation
