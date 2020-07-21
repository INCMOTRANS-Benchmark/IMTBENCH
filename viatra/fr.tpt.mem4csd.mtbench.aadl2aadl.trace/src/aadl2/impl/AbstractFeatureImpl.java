/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractFeature;
import aadl2.FeatureClassifier;
import aadl2.FeaturePrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.AbstractFeatureImpl#getFeaturePrototype <em>Feature Prototype</em>}</li>
 *   <li>{@link aadl2.impl.AbstractFeatureImpl#getAbstractFeatureClassifier <em>Abstract Feature Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractFeatureImpl extends DirectedFeatureImpl implements AbstractFeature {
	/**
	 * The cached value of the '{@link #getFeaturePrototype() <em>Feature Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePrototype()
	 * @generated
	 * @ordered
	 */
	protected FeaturePrototype featurePrototype;

	/**
	 * The cached value of the '{@link #getAbstractFeatureClassifier() <em>Abstract Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected FeatureClassifier abstractFeatureClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getAbstractFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePrototype getFeaturePrototype() {
		if (featurePrototype != null && featurePrototype.eIsProxy()) {
			InternalEObject oldFeaturePrototype = (InternalEObject)featurePrototype;
			featurePrototype = (FeaturePrototype)eResolveProxy(oldFeaturePrototype);
			if (featurePrototype != oldFeaturePrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE, oldFeaturePrototype, featurePrototype));
			}
		}
		return featurePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototype basicGetFeaturePrototype() {
		return featurePrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePrototype(FeaturePrototype newFeaturePrototype) {
		FeaturePrototype oldFeaturePrototype = featurePrototype;
		featurePrototype = newFeaturePrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE, oldFeaturePrototype, featurePrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureClassifier getAbstractFeatureClassifier() {
		if (abstractFeatureClassifier != null && abstractFeatureClassifier.eIsProxy()) {
			InternalEObject oldAbstractFeatureClassifier = (InternalEObject)abstractFeatureClassifier;
			abstractFeatureClassifier = (FeatureClassifier)eResolveProxy(oldAbstractFeatureClassifier);
			if (abstractFeatureClassifier != oldAbstractFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER, oldAbstractFeatureClassifier, abstractFeatureClassifier));
			}
		}
		return abstractFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureClassifier basicGetAbstractFeatureClassifier() {
		return abstractFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractFeatureClassifier(FeatureClassifier newAbstractFeatureClassifier) {
		FeatureClassifier oldAbstractFeatureClassifier = abstractFeatureClassifier;
		abstractFeatureClassifier = newAbstractFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER, oldAbstractFeatureClassifier, abstractFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				if (resolve) return getFeaturePrototype();
				return basicGetFeaturePrototype();
			case Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER:
				if (resolve) return getAbstractFeatureClassifier();
				return basicGetAbstractFeatureClassifier();
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				setFeaturePrototype((FeaturePrototype)newValue);
				return;
			case Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER:
				setAbstractFeatureClassifier((FeatureClassifier)newValue);
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				setFeaturePrototype((FeaturePrototype)null);
				return;
			case Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER:
				setAbstractFeatureClassifier((FeatureClassifier)null);
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
			case Aadl2Package.ABSTRACT_FEATURE__FEATURE_PROTOTYPE:
				return featurePrototype != null;
			case Aadl2Package.ABSTRACT_FEATURE__ABSTRACT_FEATURE_CLASSIFIER:
				return abstractFeatureClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureImpl
