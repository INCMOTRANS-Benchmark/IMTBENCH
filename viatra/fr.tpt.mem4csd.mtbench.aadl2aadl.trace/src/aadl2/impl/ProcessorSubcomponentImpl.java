/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ProcessorSubcomponent;
import aadl2.ProcessorSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ProcessorSubcomponentImpl#getProcessorSubcomponentType <em>Processor Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorSubcomponentImpl extends SubcomponentImpl implements ProcessorSubcomponent {
	/**
	 * The cached value of the '{@link #getProcessorSubcomponentType() <em>Processor Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected ProcessorSubcomponentType processorSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getProcessorSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessorSubcomponentType getProcessorSubcomponentType() {
		if (processorSubcomponentType != null && processorSubcomponentType.eIsProxy()) {
			InternalEObject oldProcessorSubcomponentType = (InternalEObject)processorSubcomponentType;
			processorSubcomponentType = (ProcessorSubcomponentType)eResolveProxy(oldProcessorSubcomponentType);
			if (processorSubcomponentType != oldProcessorSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE, oldProcessorSubcomponentType, processorSubcomponentType));
			}
		}
		return processorSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorSubcomponentType basicGetProcessorSubcomponentType() {
		return processorSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorSubcomponentType(ProcessorSubcomponentType newProcessorSubcomponentType) {
		ProcessorSubcomponentType oldProcessorSubcomponentType = processorSubcomponentType;
		processorSubcomponentType = newProcessorSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE, oldProcessorSubcomponentType, processorSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE:
				if (resolve) return getProcessorSubcomponentType();
				return basicGetProcessorSubcomponentType();
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
			case Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE:
				setProcessorSubcomponentType((ProcessorSubcomponentType)newValue);
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
			case Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE:
				setProcessorSubcomponentType((ProcessorSubcomponentType)null);
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
			case Aadl2Package.PROCESSOR_SUBCOMPONENT__PROCESSOR_SUBCOMPONENT_TYPE:
				return processorSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessorSubcomponentImpl
