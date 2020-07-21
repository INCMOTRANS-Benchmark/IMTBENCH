/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Subcomponent</b></em>'.
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
 *   <li>{@link aadl2.BusSubcomponent#getBusSubcomponentType <em>Bus Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getBusSubcomponent()
 * @model
 * @generated
 */
public interface BusSubcomponent extends Subcomponent, AccessConnectionEnd, Bus {
	/**
	 * Returns the value of the '<em><b>Bus Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Bus.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Subcomponent Type</em>' reference.
	 * @see #setBusSubcomponentType(BusSubcomponentType)
	 * @see aadl2.Aadl2Package#getBusSubcomponent_BusSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	BusSubcomponentType getBusSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.BusSubcomponent#getBusSubcomponentType <em>Bus Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Subcomponent Type</em>' reference.
	 * @see #getBusSubcomponentType()
	 * @generated
	 */
	void setBusSubcomponentType(BusSubcomponentType value);

} // BusSubcomponent
