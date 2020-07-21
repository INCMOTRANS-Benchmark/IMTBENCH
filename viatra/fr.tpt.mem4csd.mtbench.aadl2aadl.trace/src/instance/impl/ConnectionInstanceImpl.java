/**
 */
package instance.impl;

import instance.ConnectionInstance;
import instance.ConnectionInstanceEnd;
import instance.ConnectionKind;
import instance.ConnectionReference;
import instance.InstancePackage;
import instance.ModeTransitionInstance;
import instance.SystemOperationMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getInSystemOperationMode <em>In System Operation Mode</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getInModeTransition <em>In Mode Transition</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getConnectionReference <em>Connection Reference</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link instance.impl.ConnectionInstanceImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionInstanceImpl extends FlowElementInstanceImpl implements ConnectionInstance {
	/**
	 * The cached value of the '{@link #getInSystemOperationMode() <em>In System Operation Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSystemOperationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemOperationMode> inSystemOperationMode;

	/**
	 * The cached value of the '{@link #getInModeTransition() <em>In Mode Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModeTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionInstance> inModeTransition;

	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean complete = COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionKind KIND_EDEFAULT = ConnectionKind.FEATURE_CONNECTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectionKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getConnectionReference() <em>Connection Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionReference> connectionReference;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemOperationMode> getInSystemOperationMode() {
		if (inSystemOperationMode == null) {
			inSystemOperationMode = new EObjectResolvingEList<SystemOperationMode>(SystemOperationMode.class, this, InstancePackage.CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE);
		}
		return inSystemOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionInstance> getInModeTransition() {
		if (inModeTransition == null) {
			inModeTransition = new EObjectResolvingEList<ModeTransitionInstance>(ModeTransitionInstance.class, this, InstancePackage.CONNECTION_INSTANCE__IN_MODE_TRANSITION);
		}
		return inModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplete(boolean newComplete) {
		boolean oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ConnectionKind newKind) {
		ConnectionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstanceEnd getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(ConnectionInstanceEnd newDestination, NotificationChain msgs) {
		ConnectionInstanceEnd oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(ConnectionInstanceEnd newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionReference> getConnectionReference() {
		if (connectionReference == null) {
			connectionReference = new EObjectContainmentEList<ConnectionReference>(ConnectionReference.class, this, InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE);
		}
		return connectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstanceEnd getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ConnectionInstanceEnd newSource, NotificationChain msgs) {
		ConnectionInstanceEnd oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ConnectionInstanceEnd newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTION_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
				return basicSetDestination((ConnectionInstanceEnd)otherEnd, msgs);
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE, ConnectionInstanceEnd.class, msgs);
				return basicSetSource((ConnectionInstanceEnd)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				return basicSetDestination(null, msgs);
			case InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE:
				return ((InternalEList<?>)getConnectionReference()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				return getInSystemOperationMode();
			case InstancePackage.CONNECTION_INSTANCE__IN_MODE_TRANSITION:
				return getInModeTransition();
			case InstancePackage.CONNECTION_INSTANCE__COMPLETE:
				return isComplete();
			case InstancePackage.CONNECTION_INSTANCE__KIND:
				return getKind();
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				return getDestination();
			case InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE:
				return getConnectionReference();
			case InstancePackage.CONNECTION_INSTANCE__BIDIRECTIONAL:
				return isBidirectional();
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstancePackage.CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				getInSystemOperationMode().clear();
				getInSystemOperationMode().addAll((Collection<? extends SystemOperationMode>)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__IN_MODE_TRANSITION:
				getInModeTransition().clear();
				getInModeTransition().addAll((Collection<? extends ModeTransitionInstance>)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__KIND:
				setKind((ConnectionKind)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				setDestination((ConnectionInstanceEnd)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE:
				getConnectionReference().clear();
				getConnectionReference().addAll((Collection<? extends ConnectionReference>)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				setSource((ConnectionInstanceEnd)newValue);
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
			case InstancePackage.CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				getInSystemOperationMode().clear();
				return;
			case InstancePackage.CONNECTION_INSTANCE__IN_MODE_TRANSITION:
				getInModeTransition().clear();
				return;
			case InstancePackage.CONNECTION_INSTANCE__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case InstancePackage.CONNECTION_INSTANCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				setDestination((ConnectionInstanceEnd)null);
				return;
			case InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE:
				getConnectionReference().clear();
				return;
			case InstancePackage.CONNECTION_INSTANCE__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				setSource((ConnectionInstanceEnd)null);
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
			case InstancePackage.CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE:
				return inSystemOperationMode != null && !inSystemOperationMode.isEmpty();
			case InstancePackage.CONNECTION_INSTANCE__IN_MODE_TRANSITION:
				return inModeTransition != null && !inModeTransition.isEmpty();
			case InstancePackage.CONNECTION_INSTANCE__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case InstancePackage.CONNECTION_INSTANCE__KIND:
				return kind != KIND_EDEFAULT;
			case InstancePackage.CONNECTION_INSTANCE__DESTINATION:
				return destination != null;
			case InstancePackage.CONNECTION_INSTANCE__CONNECTION_REFERENCE:
				return connectionReference != null && !connectionReference.isEmpty();
			case InstancePackage.CONNECTION_INSTANCE__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case InstancePackage.CONNECTION_INSTANCE__SOURCE:
				return source != null;
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
		result.append(" (complete: ");
		result.append(complete);
		result.append(", kind: ");
		result.append(kind);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(')');
		return result.toString();
	}

} //ConnectionInstanceImpl
