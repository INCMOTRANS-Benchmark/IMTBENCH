/**
 */
package instance.impl;

import aadl2.ComponentImplementation;

import instance.InstancePackage;
import instance.SystemInstance;
import instance.SystemOperationMode;

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
 * An implementation of the model object '<em><b>System Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.SystemInstanceImpl#getSystemOperationMode <em>System Operation Mode</em>}</li>
 *   <li>{@link instance.impl.SystemInstanceImpl#getComponentImplementation <em>Component Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInstanceImpl extends ComponentInstanceImpl implements SystemInstance {
	/**
	 * The cached value of the '{@link #getSystemOperationMode() <em>System Operation Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemOperationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemOperationMode> systemOperationMode;

	/**
	 * The cached value of the '{@link #getComponentImplementation() <em>Component Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentImplementation()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation componentImplementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.SYSTEM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemOperationMode> getSystemOperationMode() {
		if (systemOperationMode == null) {
			systemOperationMode = new EObjectContainmentEList<SystemOperationMode>(SystemOperationMode.class, this, InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE);
		}
		return systemOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation getComponentImplementation() {
		if (componentImplementation != null && componentImplementation.eIsProxy()) {
			InternalEObject oldComponentImplementation = (InternalEObject)componentImplementation;
			componentImplementation = (ComponentImplementation)eResolveProxy(oldComponentImplementation);
			if (componentImplementation != oldComponentImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION, oldComponentImplementation, componentImplementation));
			}
		}
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation basicGetComponentImplementation() {
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentImplementation(ComponentImplementation newComponentImplementation) {
		ComponentImplementation oldComponentImplementation = componentImplementation;
		componentImplementation = newComponentImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION, oldComponentImplementation, componentImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE:
				return ((InternalEList<?>)getSystemOperationMode()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE:
				return getSystemOperationMode();
			case InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION:
				if (resolve) return getComponentImplementation();
				return basicGetComponentImplementation();
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
			case InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE:
				getSystemOperationMode().clear();
				getSystemOperationMode().addAll((Collection<? extends SystemOperationMode>)newValue);
				return;
			case InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION:
				setComponentImplementation((ComponentImplementation)newValue);
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
			case InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE:
				getSystemOperationMode().clear();
				return;
			case InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION:
				setComponentImplementation((ComponentImplementation)null);
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
			case InstancePackage.SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE:
				return systemOperationMode != null && !systemOperationMode.isEmpty();
			case InstancePackage.SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION:
				return componentImplementation != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemInstanceImpl
