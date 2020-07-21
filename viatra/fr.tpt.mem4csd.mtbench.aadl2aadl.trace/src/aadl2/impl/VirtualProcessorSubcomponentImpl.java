/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.VirtualProcessorSubcomponent;
import aadl2.VirtualProcessorSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Processor Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.VirtualProcessorSubcomponentImpl#getVirtualProcessorSubcomponentType <em>Virtual Processor Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualProcessorSubcomponentImpl extends SubcomponentImpl implements VirtualProcessorSubcomponent {
	/**
	 * The cached value of the '{@link #getVirtualProcessorSubcomponentType() <em>Virtual Processor Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualProcessorSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected VirtualProcessorSubcomponentType virtualProcessorSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualProcessorSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getVirtualProcessorSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualProcessorSubcomponentType getVirtualProcessorSubcomponentType() {
		if (virtualProcessorSubcomponentType != null && virtualProcessorSubcomponentType.eIsProxy()) {
			InternalEObject oldVirtualProcessorSubcomponentType = (InternalEObject)virtualProcessorSubcomponentType;
			virtualProcessorSubcomponentType = (VirtualProcessorSubcomponentType)eResolveProxy(oldVirtualProcessorSubcomponentType);
			if (virtualProcessorSubcomponentType != oldVirtualProcessorSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE, oldVirtualProcessorSubcomponentType, virtualProcessorSubcomponentType));
			}
		}
		return virtualProcessorSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualProcessorSubcomponentType basicGetVirtualProcessorSubcomponentType() {
		return virtualProcessorSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualProcessorSubcomponentType(VirtualProcessorSubcomponentType newVirtualProcessorSubcomponentType) {
		VirtualProcessorSubcomponentType oldVirtualProcessorSubcomponentType = virtualProcessorSubcomponentType;
		virtualProcessorSubcomponentType = newVirtualProcessorSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE, oldVirtualProcessorSubcomponentType, virtualProcessorSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE:
				if (resolve) return getVirtualProcessorSubcomponentType();
				return basicGetVirtualProcessorSubcomponentType();
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
			case Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE:
				setVirtualProcessorSubcomponentType((VirtualProcessorSubcomponentType)newValue);
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
			case Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE:
				setVirtualProcessorSubcomponentType((VirtualProcessorSubcomponentType)null);
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
			case Aadl2Package.VIRTUAL_PROCESSOR_SUBCOMPONENT__VIRTUAL_PROCESSOR_SUBCOMPONENT_TYPE:
				return virtualProcessorSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualProcessorSubcomponentImpl
