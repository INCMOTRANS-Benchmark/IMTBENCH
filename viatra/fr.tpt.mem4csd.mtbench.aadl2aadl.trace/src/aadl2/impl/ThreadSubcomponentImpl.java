/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ThreadSubcomponent;
import aadl2.ThreadSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ThreadSubcomponentImpl#getThreadSubcomponentType <em>Thread Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadSubcomponentImpl extends SubcomponentImpl implements ThreadSubcomponent {
	/**
	 * The cached value of the '{@link #getThreadSubcomponentType() <em>Thread Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected ThreadSubcomponentType threadSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getThreadSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadSubcomponentType getThreadSubcomponentType() {
		if (threadSubcomponentType != null && threadSubcomponentType.eIsProxy()) {
			InternalEObject oldThreadSubcomponentType = (InternalEObject)threadSubcomponentType;
			threadSubcomponentType = (ThreadSubcomponentType)eResolveProxy(oldThreadSubcomponentType);
			if (threadSubcomponentType != oldThreadSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE, oldThreadSubcomponentType, threadSubcomponentType));
			}
		}
		return threadSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadSubcomponentType basicGetThreadSubcomponentType() {
		return threadSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThreadSubcomponentType(ThreadSubcomponentType newThreadSubcomponentType) {
		ThreadSubcomponentType oldThreadSubcomponentType = threadSubcomponentType;
		threadSubcomponentType = newThreadSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE, oldThreadSubcomponentType, threadSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE:
				if (resolve) return getThreadSubcomponentType();
				return basicGetThreadSubcomponentType();
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
			case Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE:
				setThreadSubcomponentType((ThreadSubcomponentType)newValue);
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
			case Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE:
				setThreadSubcomponentType((ThreadSubcomponentType)null);
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
			case Aadl2Package.THREAD_SUBCOMPONENT__THREAD_SUBCOMPONENT_TYPE:
				return threadSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreadSubcomponentImpl
