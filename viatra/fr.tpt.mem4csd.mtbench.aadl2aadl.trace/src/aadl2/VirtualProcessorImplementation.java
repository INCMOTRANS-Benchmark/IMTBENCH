/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Processor Implementation</b></em>'.
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
 *   <li>{@link aadl2.VirtualProcessorImplementation#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.VirtualProcessorImplementation#getOwnedVirtualProcessorSubcomponent <em>Owned Virtual Processor Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getVirtualProcessorImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface VirtualProcessorImplementation extends ComponentImplementation, VirtualProcessorClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Virtual Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualBusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::VirtualProcessor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getVirtualProcessorImplementation_OwnedVirtualBusSubcomponent()
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
	 * <p>From package AADLDetails::Components::VirtualProcessor.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Processor Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getVirtualProcessorImplementation_OwnedVirtualProcessorSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualProcessorSubcomponent> getOwnedVirtualProcessorSubcomponent();

} // VirtualProcessorImplementation
