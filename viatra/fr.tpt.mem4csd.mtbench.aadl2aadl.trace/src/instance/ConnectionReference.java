/**
 */
package instance;

import aadl2.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ConnectionReference#getContext <em>Context</em>}</li>
 *   <li>{@link instance.ConnectionReference#getConnection <em>Connection</em>}</li>
 *   <li>{@link instance.ConnectionReference#getSource <em>Source</em>}</li>
 *   <li>{@link instance.ConnectionReference#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.ConnectionReference#isReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getConnectionReference()
 * @model
 * @generated
 */
public interface ConnectionReference extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(ComponentInstance)
	 * @see instance.InstancePackage#getConnectionReference_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentInstance getContext();

	/**
	 * Sets the value of the '{@link instance.ConnectionReference#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see instance.InstancePackage#getConnectionReference_Connection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link instance.ConnectionReference#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectionInstanceEnd)
	 * @see instance.InstancePackage#getConnectionReference_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectionInstanceEnd getSource();

	/**
	 * Sets the value of the '{@link instance.ConnectionReference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectionInstanceEnd value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ConnectionInstanceEnd)
	 * @see instance.InstancePackage#getConnectionReference_Destination()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectionInstanceEnd getDestination();

	/**
	 * Sets the value of the '{@link instance.ConnectionReference#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ConnectionInstanceEnd value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(boolean)
	 * @see instance.InstancePackage#getConnectionReference_Reverse()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReverse();

	/**
	 * Sets the value of the '{@link instance.ConnectionReference#isReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #isReverse()
	 * @generated
	 */
	void setReverse(boolean value);

} // ConnectionReference
