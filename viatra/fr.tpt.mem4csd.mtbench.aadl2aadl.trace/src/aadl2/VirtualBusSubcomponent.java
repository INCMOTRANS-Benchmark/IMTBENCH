/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Bus Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::VirtualBus.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.VirtualBusSubcomponent#getVirtualBusSubcomponentType <em>Virtual Bus Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getVirtualBusSubcomponent()
 * @model
 * @generated
 */
public interface VirtualBusSubcomponent extends Subcomponent, AccessConnectionEnd, VirtualBus {
	/**
	 * Returns the value of the '<em><b>Virtual Bus Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::VirtualBus.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Bus Subcomponent Type</em>' reference.
	 * @see #setVirtualBusSubcomponentType(VirtualBusSubcomponentType)
	 * @see aadl2.Aadl2Package#getVirtualBusSubcomponent_VirtualBusSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	VirtualBusSubcomponentType getVirtualBusSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.VirtualBusSubcomponent#getVirtualBusSubcomponentType <em>Virtual Bus Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Bus Subcomponent Type</em>' reference.
	 * @see #getVirtualBusSubcomponentType()
	 * @generated
	 */
	void setVirtualBusSubcomponentType(VirtualBusSubcomponentType value);

} // VirtualBusSubcomponent
