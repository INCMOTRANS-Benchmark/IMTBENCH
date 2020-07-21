/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractSubcomponent;
import aadl2.AbstractSubcomponentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.AbstractSubcomponentImpl#getAbstractSubcomponentType <em>Abstract Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSubcomponentImpl extends SubcomponentImpl implements AbstractSubcomponent {
	/**
	 * The cached value of the '{@link #getAbstractSubcomponentType() <em>Abstract Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected AbstractSubcomponentType abstractSubcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getAbstractSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSubcomponentType getAbstractSubcomponentType() {
		if (abstractSubcomponentType != null && abstractSubcomponentType.eIsProxy()) {
			InternalEObject oldAbstractSubcomponentType = (InternalEObject)abstractSubcomponentType;
			abstractSubcomponentType = (AbstractSubcomponentType)eResolveProxy(oldAbstractSubcomponentType);
			if (abstractSubcomponentType != oldAbstractSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE, oldAbstractSubcomponentType, abstractSubcomponentType));
			}
		}
		return abstractSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSubcomponentType basicGetAbstractSubcomponentType() {
		return abstractSubcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractSubcomponentType(AbstractSubcomponentType newAbstractSubcomponentType) {
		AbstractSubcomponentType oldAbstractSubcomponentType = abstractSubcomponentType;
		abstractSubcomponentType = newAbstractSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE, oldAbstractSubcomponentType, abstractSubcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE:
				if (resolve) return getAbstractSubcomponentType();
				return basicGetAbstractSubcomponentType();
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
			case Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE:
				setAbstractSubcomponentType((AbstractSubcomponentType)newValue);
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
			case Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE:
				setAbstractSubcomponentType((AbstractSubcomponentType)null);
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
			case Aadl2Package.ABSTRACT_SUBCOMPONENT__ABSTRACT_SUBCOMPONENT_TYPE:
				return abstractSubcomponentType != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractSubcomponentImpl
