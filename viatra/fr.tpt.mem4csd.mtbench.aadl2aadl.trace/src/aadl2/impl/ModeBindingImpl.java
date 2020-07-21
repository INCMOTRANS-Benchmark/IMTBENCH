/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Mode;
import aadl2.ModeBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ModeBindingImpl#getParentMode <em>Parent Mode</em>}</li>
 *   <li>{@link aadl2.impl.ModeBindingImpl#getDerivedMode <em>Derived Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeBindingImpl extends ElementImpl implements ModeBinding {
	/**
	 * The cached value of the '{@link #getParentMode() <em>Parent Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentMode()
	 * @generated
	 * @ordered
	 */
	protected Mode parentMode;

	/**
	 * The cached value of the '{@link #getDerivedMode() <em>Derived Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedMode()
	 * @generated
	 * @ordered
	 */
	protected Mode derivedMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getModeBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getParentMode() {
		if (parentMode != null && parentMode.eIsProxy()) {
			InternalEObject oldParentMode = (InternalEObject)parentMode;
			parentMode = (Mode)eResolveProxy(oldParentMode);
			if (parentMode != oldParentMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_BINDING__PARENT_MODE, oldParentMode, parentMode));
			}
		}
		return parentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetParentMode() {
		return parentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentMode(Mode newParentMode) {
		Mode oldParentMode = parentMode;
		parentMode = newParentMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_BINDING__PARENT_MODE, oldParentMode, parentMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getDerivedMode() {
		if (derivedMode != null && derivedMode.eIsProxy()) {
			InternalEObject oldDerivedMode = (InternalEObject)derivedMode;
			derivedMode = (Mode)eResolveProxy(oldDerivedMode);
			if (derivedMode != oldDerivedMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.MODE_BINDING__DERIVED_MODE, oldDerivedMode, derivedMode));
			}
		}
		return derivedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetDerivedMode() {
		return derivedMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivedMode(Mode newDerivedMode) {
		Mode oldDerivedMode = derivedMode;
		derivedMode = newDerivedMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.MODE_BINDING__DERIVED_MODE, oldDerivedMode, derivedMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.MODE_BINDING__PARENT_MODE:
				if (resolve) return getParentMode();
				return basicGetParentMode();
			case Aadl2Package.MODE_BINDING__DERIVED_MODE:
				if (resolve) return getDerivedMode();
				return basicGetDerivedMode();
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
			case Aadl2Package.MODE_BINDING__PARENT_MODE:
				setParentMode((Mode)newValue);
				return;
			case Aadl2Package.MODE_BINDING__DERIVED_MODE:
				setDerivedMode((Mode)newValue);
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
			case Aadl2Package.MODE_BINDING__PARENT_MODE:
				setParentMode((Mode)null);
				return;
			case Aadl2Package.MODE_BINDING__DERIVED_MODE:
				setDerivedMode((Mode)null);
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
			case Aadl2Package.MODE_BINDING__PARENT_MODE:
				return parentMode != null;
			case Aadl2Package.MODE_BINDING__DERIVED_MODE:
				return derivedMode != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeBindingImpl
