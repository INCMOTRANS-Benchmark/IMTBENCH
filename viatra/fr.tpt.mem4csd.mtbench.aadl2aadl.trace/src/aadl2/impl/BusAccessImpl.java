/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.BusAccess;
import aadl2.BusFeatureClassifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.BusAccessImpl#getBusFeatureClassifier <em>Bus Feature Classifier</em>}</li>
 *   <li>{@link aadl2.impl.BusAccessImpl#isVirtual <em>Virtual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusAccessImpl extends AccessImpl implements BusAccess {
	/**
	 * The cached value of the '{@link #getBusFeatureClassifier() <em>Bus Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected BusFeatureClassifier busFeatureClassifier;

	/**
	 * The default value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean virtual = VIRTUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getBusAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusFeatureClassifier getBusFeatureClassifier() {
		if (busFeatureClassifier != null && busFeatureClassifier.eIsProxy()) {
			InternalEObject oldBusFeatureClassifier = (InternalEObject)busFeatureClassifier;
			busFeatureClassifier = (BusFeatureClassifier)eResolveProxy(oldBusFeatureClassifier);
			if (busFeatureClassifier != oldBusFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER, oldBusFeatureClassifier, busFeatureClassifier));
			}
		}
		return busFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusFeatureClassifier basicGetBusFeatureClassifier() {
		return busFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusFeatureClassifier(BusFeatureClassifier newBusFeatureClassifier) {
		BusFeatureClassifier oldBusFeatureClassifier = busFeatureClassifier;
		busFeatureClassifier = newBusFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER, oldBusFeatureClassifier, busFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVirtual() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtual(boolean newVirtual) {
		boolean oldVirtual = virtual;
		virtual = newVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.BUS_ACCESS__VIRTUAL, oldVirtual, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				if (resolve) return getBusFeatureClassifier();
				return basicGetBusFeatureClassifier();
			case Aadl2Package.BUS_ACCESS__VIRTUAL:
				return isVirtual();
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				setBusFeatureClassifier((BusFeatureClassifier)newValue);
				return;
			case Aadl2Package.BUS_ACCESS__VIRTUAL:
				setVirtual((Boolean)newValue);
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				setBusFeatureClassifier((BusFeatureClassifier)null);
				return;
			case Aadl2Package.BUS_ACCESS__VIRTUAL:
				setVirtual(VIRTUAL_EDEFAULT);
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
			case Aadl2Package.BUS_ACCESS__BUS_FEATURE_CLASSIFIER:
				return busFeatureClassifier != null;
			case Aadl2Package.BUS_ACCESS__VIRTUAL:
				return virtual != VIRTUAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (virtual: ");
		result.append(virtual);
		result.append(')');
		return result.toString();
	}

} //BusAccessImpl
