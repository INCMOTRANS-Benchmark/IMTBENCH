/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Bus.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.BusImplementation#getOwnedVirtualBusSubcomponent <em>Owned Virtual Bus Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBusImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface BusImplementation extends ComponentImplementation, BusClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Virtual Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.VirtualBusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Bus.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Virtual Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getBusImplementation_OwnedVirtualBusSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VirtualBusSubcomponent> getOwnedVirtualBusSubcomponent();

} // BusImplementation
