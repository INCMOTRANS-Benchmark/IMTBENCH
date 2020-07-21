/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.FeatureGroupPrototypeActual;
import aadl2.FeatureType;
import aadl2.PrototypeBinding;

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
 * An implementation of the model object '<em><b>Feature Group Prototype Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureGroupPrototypeActualImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupPrototypeActualImpl#getFeatureType <em>Feature Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupPrototypeActualImpl extends FeaturePrototypeActualImpl implements FeatureGroupPrototypeActual {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PrototypeBinding> binding;

	/**
	 * The cached value of the '{@link #getFeatureType() <em>Feature Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected FeatureType featureType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupPrototypeActualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroupPrototypeActual();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrototypeBinding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<PrototypeBinding>(PrototypeBinding.class, this, Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureType getFeatureType() {
		if (featureType != null && featureType.eIsProxy()) {
			InternalEObject oldFeatureType = (InternalEObject)featureType;
			featureType = (FeatureType)eResolveProxy(oldFeatureType);
			if (featureType != oldFeatureType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE, oldFeatureType, featureType));
			}
		}
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType basicGetFeatureType() {
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureType(FeatureType newFeatureType) {
		FeatureType oldFeatureType = featureType;
		featureType = newFeatureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE, oldFeatureType, featureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING:
				return getBinding();
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE:
				if (resolve) return getFeatureType();
				return basicGetFeatureType();
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends PrototypeBinding>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE:
				setFeatureType((FeatureType)newValue);
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING:
				getBinding().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE:
				setFeatureType((FeatureType)null);
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
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__BINDING:
				return binding != null && !binding.isEmpty();
			case Aadl2Package.FEATURE_GROUP_PROTOTYPE_ACTUAL__FEATURE_TYPE:
				return featureType != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureGroupPrototypeActualImpl
