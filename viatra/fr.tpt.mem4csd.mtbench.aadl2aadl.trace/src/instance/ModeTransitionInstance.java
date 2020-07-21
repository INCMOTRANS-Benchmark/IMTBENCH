/**
 */
package instance;

import aadl2.ModeTransition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Transition Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ModeTransitionInstance#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.ModeTransitionInstance#getModeTransition <em>Mode Transition</em>}</li>
 *   <li>{@link instance.ModeTransitionInstance#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link instance.ModeTransitionInstance#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getModeTransitionInstance()
 * @model
 * @generated
 */
public interface ModeTransitionInstance extends ConnectionInstanceEnd, InstanceObject {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.ModeInstance#getDstModeTransition <em>Dst Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ModeInstance)
	 * @see instance.InstancePackage#getModeTransitionInstance_Destination()
	 * @see instance.ModeInstance#getDstModeTransition
	 * @model opposite="dstModeTransition" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ModeInstance getDestination();

	/**
	 * Sets the value of the '{@link instance.ModeTransitionInstance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ModeInstance value);

	/**
	 * Returns the value of the '<em><b>Mode Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Transition</em>' reference.
	 * @see #setModeTransition(ModeTransition)
	 * @see instance.InstancePackage#getModeTransitionInstance_ModeTransition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ModeTransition getModeTransition();

	/**
	 * Sets the value of the '{@link instance.ModeTransitionInstance#getModeTransition <em>Mode Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Transition</em>' reference.
	 * @see #getModeTransition()
	 * @generated
	 */
	void setModeTransition(ModeTransition value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference list.
	 * The list contents are of type {@link instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference list.
	 * @see instance.InstancePackage#getModeTransitionInstance_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FeatureInstance> getTrigger();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.ModeInstance#getSrcModeTransition <em>Src Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModeInstance)
	 * @see instance.InstancePackage#getModeTransitionInstance_Source()
	 * @see instance.ModeInstance#getSrcModeTransition
	 * @model opposite="srcModeTransition" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ModeInstance getSource();

	/**
	 * Sets the value of the '{@link instance.ModeTransitionInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModeInstance value);

} // ModeTransitionInstance
