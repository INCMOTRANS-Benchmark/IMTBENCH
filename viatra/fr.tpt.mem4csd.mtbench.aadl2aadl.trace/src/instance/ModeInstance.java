/**
 */
package instance;

import aadl2.Mode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ModeInstance#getSrcModeTransition <em>Src Mode Transition</em>}</li>
 *   <li>{@link instance.ModeInstance#getDstModeTransition <em>Dst Mode Transition</em>}</li>
 *   <li>{@link instance.ModeInstance#isInitial <em>Initial</em>}</li>
 *   <li>{@link instance.ModeInstance#getMode <em>Mode</em>}</li>
 *   <li>{@link instance.ModeInstance#isDerived <em>Derived</em>}</li>
 *   <li>{@link instance.ModeInstance#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getModeInstance()
 * @model
 * @generated
 */
public interface ModeInstance extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Src Mode Transition</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeTransitionInstance}.
	 * It is bidirectional and its opposite is '{@link instance.ModeTransitionInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Mode Transition</em>' reference list.
	 * @see instance.InstancePackage#getModeInstance_SrcModeTransition()
	 * @see instance.ModeTransitionInstance#getSource
	 * @model opposite="source" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<ModeTransitionInstance> getSrcModeTransition();

	/**
	 * Returns the value of the '<em><b>Dst Mode Transition</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeTransitionInstance}.
	 * It is bidirectional and its opposite is '{@link instance.ModeTransitionInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Mode Transition</em>' reference list.
	 * @see instance.InstancePackage#getModeInstance_DstModeTransition()
	 * @see instance.ModeTransitionInstance#getDestination
	 * @model opposite="destination" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<ModeTransitionInstance> getDstModeTransition();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see instance.InstancePackage#getModeInstance_Initial()
	 * @model default="false" dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link instance.ModeInstance#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(Mode)
	 * @see instance.InstancePackage#getModeInstance_Mode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link instance.ModeInstance#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see instance.InstancePackage#getModeInstance_Derived()
	 * @model default="false" dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link instance.ModeInstance#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference list.
	 * @see instance.InstancePackage#getModeInstance_Parent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeInstance> getParent();

} // ModeInstance
