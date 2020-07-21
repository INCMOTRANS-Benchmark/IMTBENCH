/**
 */
package instance.impl;

import aadl2.Connection;

import instance.ComponentInstance;
import instance.ConnectionInstanceEnd;
import instance.ConnectionReference;
import instance.InstancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ConnectionReferenceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link instance.impl.ConnectionReferenceImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link instance.impl.ConnectionReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link instance.impl.ConnectionReferenceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.impl.ConnectionReferenceImpl#isReverse <em>Reverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionReferenceImpl extends InstanceObjectImpl implements ConnectionReference {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance context;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInstanceEnd source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected ConnectionInstanceEnd destination;

	/**
	 * The default value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverse()
	 * @generated
	 * @ordered
	 */
	protected boolean reverse = REVERSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (ComponentInstance)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTION_REFERENCE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(ComponentInstance newContext) {
		ComponentInstance oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_REFERENCE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTION_REFERENCE__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_REFERENCE__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstanceEnd getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ConnectionInstanceEnd)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTION_REFERENCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInstanceEnd basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ConnectionInstanceEnd newSource) {
		ConnectionInstanceEnd oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_REFERENCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstanceEnd getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (ConnectionInstanceEnd)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTION_REFERENCE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionInstanceEnd basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(ConnectionInstanceEnd newDestination) {
		ConnectionInstanceEnd oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_REFERENCE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReverse(boolean newReverse) {
		boolean oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_REFERENCE__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.CONNECTION_REFERENCE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case InstancePackage.CONNECTION_REFERENCE__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case InstancePackage.CONNECTION_REFERENCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.CONNECTION_REFERENCE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case InstancePackage.CONNECTION_REFERENCE__REVERSE:
				return isReverse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancePackage.CONNECTION_REFERENCE__CONTEXT:
				setContext((ComponentInstance)newValue);
				return;
			case InstancePackage.CONNECTION_REFERENCE__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case InstancePackage.CONNECTION_REFERENCE__SOURCE:
				setSource((ConnectionInstanceEnd)newValue);
				return;
			case InstancePackage.CONNECTION_REFERENCE__DESTINATION:
				setDestination((ConnectionInstanceEnd)newValue);
				return;
			case InstancePackage.CONNECTION_REFERENCE__REVERSE:
				setReverse((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstancePackage.CONNECTION_REFERENCE__CONTEXT:
				setContext((ComponentInstance)null);
				return;
			case InstancePackage.CONNECTION_REFERENCE__CONNECTION:
				setConnection((Connection)null);
				return;
			case InstancePackage.CONNECTION_REFERENCE__SOURCE:
				setSource((ConnectionInstanceEnd)null);
				return;
			case InstancePackage.CONNECTION_REFERENCE__DESTINATION:
				setDestination((ConnectionInstanceEnd)null);
				return;
			case InstancePackage.CONNECTION_REFERENCE__REVERSE:
				setReverse(REVERSE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.CONNECTION_REFERENCE__CONTEXT:
				return context != null;
			case InstancePackage.CONNECTION_REFERENCE__CONNECTION:
				return connection != null;
			case InstancePackage.CONNECTION_REFERENCE__SOURCE:
				return source != null;
			case InstancePackage.CONNECTION_REFERENCE__DESTINATION:
				return destination != null;
			case InstancePackage.CONNECTION_REFERENCE__REVERSE:
				return reverse != REVERSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (reverse: ");
		result.append(reverse);
		result.append(')');
		return result.toString();
	}

} //ConnectionReferenceImpl
