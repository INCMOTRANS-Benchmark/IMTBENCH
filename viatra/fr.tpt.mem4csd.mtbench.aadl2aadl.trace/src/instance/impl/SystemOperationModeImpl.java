/**
 */
package instance.impl;

import aadl2.impl.ModeImpl;

import instance.InstancePackage;
import instance.ModeInstance;
import instance.SystemOperationMode;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Operation Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.SystemOperationModeImpl#getCurrentMode <em>Current Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemOperationModeImpl extends ModeImpl implements SystemOperationMode {
	/**
	 * The cached value of the '{@link #getCurrentMode() <em>Current Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInstance> currentMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemOperationModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.SYSTEM_OPERATION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getCurrentMode() {
		if (currentMode == null) {
			currentMode = new EObjectResolvingEList<ModeInstance>(ModeInstance.class, this, InstancePackage.SYSTEM_OPERATION_MODE__CURRENT_MODE);
		}
		return currentMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.SYSTEM_OPERATION_MODE__CURRENT_MODE:
				return getCurrentMode();
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
			case InstancePackage.SYSTEM_OPERATION_MODE__CURRENT_MODE:
				getCurrentMode().clear();
				getCurrentMode().addAll((Collection<? extends ModeInstance>)newValue);
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
			case InstancePackage.SYSTEM_OPERATION_MODE__CURRENT_MODE:
				getCurrentMode().clear();
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
			case InstancePackage.SYSTEM_OPERATION_MODE__CURRENT_MODE:
				return currentMode != null && !currentMode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemOperationModeImpl
