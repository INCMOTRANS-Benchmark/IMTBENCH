/**
 */
package instance.impl;

import aadl2.ModeTransition;

import instance.FeatureInstance;
import instance.InstancePackage;
import instance.ModeInstance;
import instance.ModeTransitionInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ModeTransitionInstanceImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.impl.ModeTransitionInstanceImpl#getModeTransition <em>Mode Transition</em>}</li>
 *   <li>{@link instance.impl.ModeTransitionInstanceImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link instance.impl.ModeTransitionInstanceImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeTransitionInstanceImpl extends ConnectionInstanceEndImpl implements ModeTransitionInstance {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected ModeInstance destination;

	/**
	 * The cached value of the '{@link #getModeTransition() <em>Mode Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransition()
	 * @generated
	 * @ordered
	 */
	protected ModeTransition modeTransition;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInstance> trigger;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ModeInstance source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.MODE_TRANSITION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeInstance getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(ModeInstance newDestination, NotificationChain msgs) {
		ModeInstance oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(ModeInstance newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION, ModeInstance.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION, ModeInstance.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeTransition getModeTransition() {
		if (modeTransition != null && modeTransition.eIsProxy()) {
			InternalEObject oldModeTransition = (InternalEObject)modeTransition;
			modeTransition = (ModeTransition)eResolveProxy(oldModeTransition);
			if (modeTransition != oldModeTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION, oldModeTransition, modeTransition));
			}
		}
		return modeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransition basicGetModeTransition() {
		return modeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModeTransition(ModeTransition newModeTransition) {
		ModeTransition oldModeTransition = modeTransition;
		modeTransition = newModeTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION, oldModeTransition, modeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureInstance> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectResolvingEList<FeatureInstance>(FeatureInstance.class, this, InstancePackage.MODE_TRANSITION_INSTANCE__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeInstance getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ModeInstance newSource, NotificationChain msgs) {
		ModeInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE, oldSource, newSource);
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
	public void setSource(ModeInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION, ModeInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION, ModeInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, InstancePackage.MODE_INSTANCE__DST_MODE_TRANSITION, ModeInstance.class, msgs);
				return basicSetDestination((ModeInstance)otherEnd, msgs);
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.MODE_INSTANCE__SRC_MODE_TRANSITION, ModeInstance.class, msgs);
				return basicSetSource((ModeInstance)otherEnd, msgs);
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
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				return basicSetDestination(null, msgs);
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
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
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				return getDestination();
			case InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION:
				if (resolve) return getModeTransition();
				return basicGetModeTransition();
			case InstancePackage.MODE_TRANSITION_INSTANCE__TRIGGER:
				return getTrigger();
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
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
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				setDestination((ModeInstance)newValue);
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION:
				setModeTransition((ModeTransition)newValue);
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends FeatureInstance>)newValue);
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
				setSource((ModeInstance)newValue);
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
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				setDestination((ModeInstance)null);
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION:
				setModeTransition((ModeTransition)null);
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__TRIGGER:
				getTrigger().clear();
				return;
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
				setSource((ModeInstance)null);
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
			case InstancePackage.MODE_TRANSITION_INSTANCE__DESTINATION:
				return destination != null;
			case InstancePackage.MODE_TRANSITION_INSTANCE__MODE_TRANSITION:
				return modeTransition != null;
			case InstancePackage.MODE_TRANSITION_INSTANCE__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case InstancePackage.MODE_TRANSITION_INSTANCE__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeTransitionInstanceImpl
