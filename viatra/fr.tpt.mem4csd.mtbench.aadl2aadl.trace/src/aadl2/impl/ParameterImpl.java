/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataSubcomponentType;
import aadl2.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ParameterImpl#getDataFeatureClassifier <em>Data Feature Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends DirectedFeatureImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getDataFeatureClassifier() <em>Data Feature Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFeatureClassifier()
	 * @generated
	 * @ordered
	 */
	protected DataSubcomponentType dataFeatureClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSubcomponentType getDataFeatureClassifier() {
		if (dataFeatureClassifier != null && dataFeatureClassifier.eIsProxy()) {
			InternalEObject oldDataFeatureClassifier = (InternalEObject)dataFeatureClassifier;
			dataFeatureClassifier = (DataSubcomponentType)eResolveProxy(oldDataFeatureClassifier);
			if (dataFeatureClassifier != oldDataFeatureClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER, oldDataFeatureClassifier, dataFeatureClassifier));
			}
		}
		return dataFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSubcomponentType basicGetDataFeatureClassifier() {
		return dataFeatureClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFeatureClassifier(DataSubcomponentType newDataFeatureClassifier) {
		DataSubcomponentType oldDataFeatureClassifier = dataFeatureClassifier;
		dataFeatureClassifier = newDataFeatureClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER, oldDataFeatureClassifier, dataFeatureClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER:
				if (resolve) return getDataFeatureClassifier();
				return basicGetDataFeatureClassifier();
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
			case Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER:
				setDataFeatureClassifier((DataSubcomponentType)newValue);
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
			case Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER:
				setDataFeatureClassifier((DataSubcomponentType)null);
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
			case Aadl2Package.PARAMETER__DATA_FEATURE_CLASSIFIER:
				return dataFeatureClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
