/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.SubprogramClassifier;
import aadl2.SubprogramProxy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramProxyImpl#getSubprogramClassifier <em>Subprogram Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramProxyImpl extends ProcessorFeatureImpl implements SubprogramProxy {
	/**
	 * The cached value of the '{@link #getSubprogramClassifier() <em>Subprogram Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprogramClassifier()
	 * @generated
	 * @ordered
	 */
	protected SubprogramClassifier subprogramClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubprogramClassifier getSubprogramClassifier() {
		if (subprogramClassifier != null && subprogramClassifier.eIsProxy()) {
			InternalEObject oldSubprogramClassifier = (InternalEObject)subprogramClassifier;
			subprogramClassifier = (SubprogramClassifier)eResolveProxy(oldSubprogramClassifier);
			if (subprogramClassifier != oldSubprogramClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER, oldSubprogramClassifier, subprogramClassifier));
			}
		}
		return subprogramClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramClassifier basicGetSubprogramClassifier() {
		return subprogramClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubprogramClassifier(SubprogramClassifier newSubprogramClassifier) {
		SubprogramClassifier oldSubprogramClassifier = subprogramClassifier;
		subprogramClassifier = newSubprogramClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER, oldSubprogramClassifier, subprogramClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER:
				if (resolve) return getSubprogramClassifier();
				return basicGetSubprogramClassifier();
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
			case Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER:
				setSubprogramClassifier((SubprogramClassifier)newValue);
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
			case Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER:
				setSubprogramClassifier((SubprogramClassifier)null);
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
			case Aadl2Package.SUBPROGRAM_PROXY__SUBPROGRAM_CLASSIFIER:
				return subprogramClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramProxyImpl
