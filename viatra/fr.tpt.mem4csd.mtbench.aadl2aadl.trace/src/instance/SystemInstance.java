/**
 */
package instance;

import aadl2.ComponentImplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.SystemInstance#getSystemOperationMode <em>System Operation Mode</em>}</li>
 *   <li>{@link instance.SystemInstance#getComponentImplementation <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getSystemInstance()
 * @model
 * @generated
 */
public interface SystemInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>System Operation Mode</b></em>' containment reference list.
	 * The list contents are of type {@link instance.SystemOperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Operation Mode</em>' containment reference list.
	 * @see instance.InstancePackage#getSystemInstance_SystemOperationMode()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemOperationMode> getSystemOperationMode();

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementation</em>' reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see instance.InstancePackage#getSystemInstance_ComponentImplementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the '{@link instance.SystemInstance#getComponentImplementation <em>Component Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation</em>' reference.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(ComponentImplementation value);

} // SystemInstance
