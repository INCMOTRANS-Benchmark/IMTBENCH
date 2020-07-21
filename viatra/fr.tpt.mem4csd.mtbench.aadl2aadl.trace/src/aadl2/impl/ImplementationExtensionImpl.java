/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentImplementation;
import aadl2.ImplementationExtension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ImplementationExtensionImpl#getExtended <em>Extended</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationExtensionImpl extends GeneralizationImpl implements ImplementationExtension {
	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation extended;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getImplementationExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation getExtended() {
		if (extended != null && extended.eIsProxy()) {
			InternalEObject oldExtended = (InternalEObject)extended;
			extended = (ComponentImplementation)eResolveProxy(oldExtended);
			if (extended != oldExtended) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED, oldExtended, extended));
			}
		}
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation basicGetExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtended(ComponentImplementation newExtended) {
		ComponentImplementation oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
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
			case Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED:
				setExtended((ComponentImplementation)newValue);
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
			case Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED:
				setExtended((ComponentImplementation)null);
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
			case Aadl2Package.IMPLEMENTATION_EXTENSION__EXTENDED:
				return extended != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplementationExtensionImpl
