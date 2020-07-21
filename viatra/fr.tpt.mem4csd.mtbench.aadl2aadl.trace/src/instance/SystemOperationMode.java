/**
 */
package instance;

import aadl2.Mode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Operation Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.SystemOperationMode#getCurrentMode <em>Current Mode</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getSystemOperationMode()
 * @model
 * @generated
 */
public interface SystemOperationMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Current Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Mode</em>' reference list.
	 * @see instance.InstancePackage#getSystemOperationMode_CurrentMode()
	 * @model
	 * @generated
	 */
	EList<ModeInstance> getCurrentMode();

} // SystemOperationMode
