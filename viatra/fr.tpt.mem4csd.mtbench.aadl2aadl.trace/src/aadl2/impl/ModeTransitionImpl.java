/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Mode;
import aadl2.ModeTransition;
import aadl2.ModeTransitionTrigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ModeTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link aadl2.impl.ModeTransitionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link aadl2.impl.ModeTransitionImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeTransitionImpl extends ModeFeatureImpl implements ModeTransition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Mode source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Mode destination;

	/**
	 * The cached value of the '{@link #getOwnedTrigger() <em>Owned Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionTrigger> ownedTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getModeTransition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Mode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Mode newSource) {
		Mode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Mode)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_TRANSITION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(Mode newDestination) {
		Mode oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_TRANSITION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionTrigger> getOwnedTrigger() {
		if (ownedTrigger == null) {
			ownedTrigger = new EObjectContainmentEList<ModeTransitionTrigger>(ModeTransitionTrigger.class, this, Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER);
		}
		return ownedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER:
				return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.MODE_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Aadl2Package.MODE_TRANSITION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER:
				return getOwnedTrigger();
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
			case Aadl2Package.MODE_TRANSITION__SOURCE:
				setSource((Mode)newValue);
				return;
			case Aadl2Package.MODE_TRANSITION__DESTINATION:
				setDestination((Mode)newValue);
				return;
			case Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER:
				getOwnedTrigger().clear();
				getOwnedTrigger().addAll((Collection<? extends ModeTransitionTrigger>)newValue);
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
			case Aadl2Package.MODE_TRANSITION__SOURCE:
				setSource((Mode)null);
				return;
			case Aadl2Package.MODE_TRANSITION__DESTINATION:
				setDestination((Mode)null);
				return;
			case Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER:
				getOwnedTrigger().clear();
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
			case Aadl2Package.MODE_TRANSITION__SOURCE:
				return source != null;
			case Aadl2Package.MODE_TRANSITION__DESTINATION:
				return destination != null;
			case Aadl2Package.MODE_TRANSITION__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeTransitionImpl
