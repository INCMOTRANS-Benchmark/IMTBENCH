/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ThreadGroupSubcomponent;
import aadl2.ThreadGroupSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Group Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ThreadGroupSubcomponentImpl#getThreadGroupSubcomponentType <em>Thread Group Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadGroupSubcomponentImpl extends SubcomponentImpl implements ThreadGroupSubcomponent {
	/**
	 * The cached value of the '{@link #getThreadGroupSubcomponentType() <em>Thread Group Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadGroupSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected ThreadGroupSubcomponentType threadGroupSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadGroupSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getThreadGroupSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadGroupSubcomponentType getThreadGroupSubcomponentType() {
		if (threadGroupSubcomponentType != null && threadGroupSubcomponentType.eIsProxy()) {
			InternalEObject oldThreadGroupSubcomponentType = (InternalEObject)threadGroupSubcomponentType;
			threadGroupSubcomponentType = (ThreadGroupSubcomponentType)eResolveProxy(oldThreadGroupSubcomponentType);
			if (threadGroupSubcomponentType != oldThreadGroupSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE, oldThreadGroupSubcomponentType, threadGroupSubcomponentType));
			}
		}
		return threadGroupSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadGroupSubcomponentType basicGetThreadGroupSubcomponentType() {
		return threadGroupSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadGroupSubcomponentType(ThreadGroupSubcomponentType newThreadGroupSubcomponentType) {
		ThreadGroupSubcomponentType oldThreadGroupSubcomponentType = threadGroupSubcomponentType;
		threadGroupSubcomponentType = newThreadGroupSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE, oldThreadGroupSubcomponentType, threadGroupSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE:
				if (resolve) return getThreadGroupSubcomponentType();
				return basicGetThreadGroupSubcomponentType();
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
			case Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE:
				setThreadGroupSubcomponentType((ThreadGroupSubcomponentType)newValue);
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
			case Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE:
				setThreadGroupSubcomponentType((ThreadGroupSubcomponentType)null);
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
			case Aadl2Package.THREAD_GROUP_SUBCOMPONENT__THREAD_GROUP_SUBCOMPONENT_TYPE:
				return threadGroupSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreadGroupSubcomponentImpl
