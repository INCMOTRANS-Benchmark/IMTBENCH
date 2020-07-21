/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ArrayDimension;
import aadl2.ArrayableElement;
import aadl2.Classifier;
import aadl2.ComponentPrototype;
import aadl2.ConnectionEnd;
import aadl2.Feature;
import aadl2.FeatureClassifier;
import aadl2.FeatureConnectionEnd;

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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureImpl#getArrayDimension <em>Array Dimension</em>}</li>
 *   <li>{@link aadl2.impl.FeatureImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link aadl2.impl.FeatureImpl#getFeatureClassifier <em>Feature Classifier</em>}</li>
 *   <li>{@link aadl2.impl.FeatureImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.impl.FeatureImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends StructuralFeatureImpl implements Feature {
	/**
	 * The cached value of the '{@link #getArrayDimension() <em>Array Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimension;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected Feature refined;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayDimension> getArrayDimension() {
		if (arrayDimension == null) {
			arrayDimension = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, Aadl2Package.FEATURE__ARRAY_DIMENSION);
		}
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPrototype getPrototype() {
		ComponentPrototype prototype = basicGetPrototype();
		return prototype != null && prototype.eIsProxy() ? (ComponentPrototype)eResolveProxy((InternalEObject)prototype) : prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrototype basicGetPrototype() {
		// TODO: implement this method to return the 'Prototype' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureClassifier getFeatureClassifier() {
		FeatureClassifier featureClassifier = basicGetFeatureClassifier();
		return featureClassifier != null && featureClassifier.eIsProxy() ? (FeatureClassifier)eResolveProxy((InternalEObject)featureClassifier) : featureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureClassifier basicGetFeatureClassifier() {
		// TODO: implement this method to return the 'Feature Classifier' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getRefined() {
		if (refined != null && refined.eIsProxy()) {
			InternalEObject oldRefined = (InternalEObject)refined;
			refined = (Feature)eResolveProxy(oldRefined);
			if (refined != oldRefined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE__REFINED, oldRefined, refined));
			}
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefined(Feature newRefined) {
		Feature oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getClassifier() {
		Classifier classifier = basicGetClassifier();
		return classifier != null && classifier.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)classifier) : classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		// TODO: implement this method to return the 'Classifier' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.FEATURE__ARRAY_DIMENSION:
				return ((InternalEList<?>)getArrayDimension()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.FEATURE__ARRAY_DIMENSION:
				return getArrayDimension();
			case Aadl2Package.FEATURE__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case Aadl2Package.FEATURE__FEATURE_CLASSIFIER:
				if (resolve) return getFeatureClassifier();
				return basicGetFeatureClassifier();
			case Aadl2Package.FEATURE__REFINED:
				if (resolve) return getRefined();
				return basicGetRefined();
			case Aadl2Package.FEATURE__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
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
			case Aadl2Package.FEATURE__ARRAY_DIMENSION:
				getArrayDimension().clear();
				getArrayDimension().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case Aadl2Package.FEATURE__REFINED:
				setRefined((Feature)newValue);
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
			case Aadl2Package.FEATURE__ARRAY_DIMENSION:
				getArrayDimension().clear();
				return;
			case Aadl2Package.FEATURE__REFINED:
				setRefined((Feature)null);
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
			case Aadl2Package.FEATURE__ARRAY_DIMENSION:
				return arrayDimension != null && !arrayDimension.isEmpty();
			case Aadl2Package.FEATURE__PROTOTYPE:
				return basicGetPrototype() != null;
			case Aadl2Package.FEATURE__FEATURE_CLASSIFIER:
				return basicGetFeatureClassifier() != null;
			case Aadl2Package.FEATURE__REFINED:
				return refined != null;
			case Aadl2Package.FEATURE__CLASSIFIER:
				return basicGetClassifier() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionEnd.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureConnectionEnd.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayableElement.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.FEATURE__ARRAY_DIMENSION: return Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConnectionEnd.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FeatureConnectionEnd.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayableElement.class) {
			switch (baseFeatureID) {
				case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION: return Aadl2Package.FEATURE__ARRAY_DIMENSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeatureImpl
