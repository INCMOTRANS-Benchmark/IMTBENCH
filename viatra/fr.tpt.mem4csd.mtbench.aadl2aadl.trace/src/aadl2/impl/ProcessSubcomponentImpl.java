/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ProcessSubcomponent;
import aadl2.ProcessSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ProcessSubcomponentImpl#getProcessSubcomponentType <em>Process Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessSubcomponentImpl extends SubcomponentImpl implements ProcessSubcomponent {
	/**
	 * The cached value of the '{@link #getProcessSubcomponentType() <em>Process Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected ProcessSubcomponentType processSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getProcessSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessSubcomponentType getProcessSubcomponentType() {
		if (processSubcomponentType != null && processSubcomponentType.eIsProxy()) {
			InternalEObject oldProcessSubcomponentType = (InternalEObject)processSubcomponentType;
			processSubcomponentType = (ProcessSubcomponentType)eResolveProxy(oldProcessSubcomponentType);
			if (processSubcomponentType != oldProcessSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE, oldProcessSubcomponentType, processSubcomponentType));
			}
		}
		return processSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSubcomponentType basicGetProcessSubcomponentType() {
		return processSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessSubcomponentType(ProcessSubcomponentType newProcessSubcomponentType) {
		ProcessSubcomponentType oldProcessSubcomponentType = processSubcomponentType;
		processSubcomponentType = newProcessSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE, oldProcessSubcomponentType, processSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE:
				if (resolve) return getProcessSubcomponentType();
				return basicGetProcessSubcomponentType();
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
			case Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE:
				setProcessSubcomponentType((ProcessSubcomponentType)newValue);
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
			case Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE:
				setProcessSubcomponentType((ProcessSubcomponentType)null);
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
			case Aadl2Package.PROCESS_SUBCOMPONENT__PROCESS_SUBCOMPONENT_TYPE:
				return processSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessSubcomponentImpl
