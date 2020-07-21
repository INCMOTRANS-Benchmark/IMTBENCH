/**
 */
package aadl2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Device.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.DeviceSubcomponent#getDeviceSubcomponentType <em>Device Subcomponent Type</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getDeviceSubcomponent()
 * @model
 * @generated
 */
public interface DeviceSubcomponent extends Subcomponent, Device {
	/**
	 * Returns the value of the '<em><b>Device Subcomponent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Device.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Subcomponent Type</em>' reference.
	 * @see #setDeviceSubcomponentType(DeviceSubcomponentType)
	 * @see aadl2.Aadl2Package#getDeviceSubcomponent_DeviceSubcomponentType()
	 * @model ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	DeviceSubcomponentType getDeviceSubcomponentType();

	/**
	 * Sets the value of the '{@link aadl2.DeviceSubcomponent#getDeviceSubcomponentType <em>Device Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Subcomponent Type</em>' reference.
	 * @see #getDeviceSubcomponentType()
	 * @generated
	 */
	void setDeviceSubcomponentType(DeviceSubcomponentType value);

} // DeviceSubcomponent
