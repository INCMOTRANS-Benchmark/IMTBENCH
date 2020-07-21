/**
 */
package instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ConnectionInstance#getInSystemOperationMode <em>In System Operation Mode</em>}</li>
 *   <li>{@link instance.ConnectionInstance#getInModeTransition <em>In Mode Transition</em>}</li>
 *   <li>{@link instance.ConnectionInstance#isComplete <em>Complete</em>}</li>
 *   <li>{@link instance.ConnectionInstance#getKind <em>Kind</em>}</li>
 *   <li>{@link instance.ConnectionInstance#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.ConnectionInstance#getConnectionReference <em>Connection Reference</em>}</li>
 *   <li>{@link instance.ConnectionInstance#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link instance.ConnectionInstance#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getConnectionInstance()
 * @model
 * @generated
 */
public interface ConnectionInstance extends FlowElementInstance {
	/**
	 * Returns the value of the '<em><b>In System Operation Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.SystemOperationMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In System Operation Mode</em>' reference list.
	 * @see instance.InstancePackage#getConnectionInstance_InSystemOperationMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SystemOperationMode> getInSystemOperationMode();

	/**
	 * Returns the value of the '<em><b>In Mode Transition</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeTransitionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Mode Transition</em>' reference list.
	 * @see instance.InstancePackage#getConnectionInstance_InModeTransition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeTransitionInstance> getInModeTransition();

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(boolean)
	 * @see instance.InstancePackage#getConnectionInstance_Complete()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link instance.ConnectionInstance#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link instance.ConnectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see instance.ConnectionKind
	 * @see #setKind(ConnectionKind)
	 * @see instance.InstancePackage#getConnectionInstance_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectionKind getKind();

	/**
	 * Sets the value of the '{@link instance.ConnectionInstance#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see instance.ConnectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConnectionKind value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.ConnectionInstanceEnd#getDstConnectionInstance <em>Dst Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ConnectionInstanceEnd)
	 * @see instance.InstancePackage#getConnectionInstance_Destination()
	 * @see instance.ConnectionInstanceEnd#getDstConnectionInstance
	 * @model opposite="dstConnectionInstance" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ConnectionInstanceEnd getDestination();

	/**
	 * Sets the value of the '{@link instance.ConnectionInstance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ConnectionInstanceEnd value);

	/**
	 * Returns the value of the '<em><b>Connection Reference</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ConnectionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Reference</em>' containment reference list.
	 * @see instance.InstancePackage#getConnectionInstance_ConnectionReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConnectionReference> getConnectionReference();

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see instance.InstancePackage#getConnectionInstance_Bidirectional()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link instance.ConnectionInstance#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.ConnectionInstanceEnd#getSrcConnectionInstance <em>Src Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectionInstanceEnd)
	 * @see instance.InstancePackage#getConnectionInstance_Source()
	 * @see instance.ConnectionInstanceEnd#getSrcConnectionInstance
	 * @model opposite="srcConnectionInstance" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	ConnectionInstanceEnd getSource();

	/**
	 * Sets the value of the '{@link instance.ConnectionInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectionInstanceEnd value);

} // ConnectionInstance
