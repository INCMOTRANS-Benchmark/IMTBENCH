/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Context;
import aadl2.ModeTransitionTrigger;
import aadl2.TriggerPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ModeTransitionTriggerImpl#getContext <em>Context</em>}</li>
 *   <li>{@link aadl2.impl.ModeTransitionTriggerImpl#getTriggerPort <em>Trigger Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeTransitionTriggerImpl extends ElementImpl implements ModeTransitionTrigger {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getTriggerPort() <em>Trigger Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPort()
	 * @generated
	 * @ordered
	 */
	protected TriggerPort triggerPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getModeTransitionTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerPort getTriggerPort() {
		if (triggerPort != null && triggerPort.eIsProxy()) {
			InternalEObject oldTriggerPort = (InternalEObject)triggerPort;
			triggerPort = (TriggerPort)eResolveProxy(oldTriggerPort);
			if (triggerPort != oldTriggerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT, oldTriggerPort, triggerPort));
			}
		}
		return triggerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPort basicGetTriggerPort() {
		return triggerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerPort(TriggerPort newTriggerPort) {
		TriggerPort oldTriggerPort = triggerPort;
		triggerPort = newTriggerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT, oldTriggerPort, triggerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT:
				if (resolve) return getTriggerPort();
				return basicGetTriggerPort();
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
			case Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT:
				setContext((Context)newValue);
				return;
			case Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT:
				setTriggerPort((TriggerPort)newValue);
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
			case Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT:
				setContext((Context)null);
				return;
			case Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT:
				setTriggerPort((TriggerPort)null);
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
			case Aadl2Package.MODE_TRANSITION_TRIGGER__CONTEXT:
				return context != null;
			case Aadl2Package.MODE_TRANSITION_TRIGGER__TRIGGER_PORT:
				return triggerPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeTransitionTriggerImpl
