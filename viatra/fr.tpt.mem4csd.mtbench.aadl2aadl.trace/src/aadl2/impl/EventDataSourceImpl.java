/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DataClassifier;
import aadl2.EventDataSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.EventDataSourceImpl#getDataClassifier <em>Data Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventDataSourceImpl extends InternalFeatureImpl implements EventDataSource {
	/**
	 * The cached value of the '{@link #getDataClassifier() <em>Data Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataClassifier()
	 * @generated
	 * @ordered
	 */
	protected DataClassifier dataClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getEventDataSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataClassifier getDataClassifier() {
		if (dataClassifier != null && dataClassifier.eIsProxy()) {
			InternalEObject oldDataClassifier = (InternalEObject)dataClassifier;
			dataClassifier = (DataClassifier)eResolveProxy(oldDataClassifier);
			if (dataClassifier != oldDataClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER, oldDataClassifier, dataClassifier));
			}
		}
		return dataClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClassifier basicGetDataClassifier() {
		return dataClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataClassifier(DataClassifier newDataClassifier) {
		DataClassifier oldDataClassifier = dataClassifier;
		dataClassifier = newDataClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER, oldDataClassifier, dataClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER:
				if (resolve) return getDataClassifier();
				return basicGetDataClassifier();
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
			case Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER:
				setDataClassifier((DataClassifier)newValue);
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
			case Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER:
				setDataClassifier((DataClassifier)null);
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
			case Aadl2Package.EVENT_DATA_SOURCE__DATA_CLASSIFIER:
				return dataClassifier != null;
		}
		return super.eIsSet(featureID);
	}

} //EventDataSourceImpl
