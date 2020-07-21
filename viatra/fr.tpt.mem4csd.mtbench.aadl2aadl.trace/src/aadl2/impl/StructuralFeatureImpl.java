/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Classifier;
import aadl2.ClassifierFeature;
import aadl2.StructuralFeature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.StructuralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl extends RefinableElementImpl implements StructuralFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getStructuralFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getFeaturingClassifier() {
		// TODO: implement this method to return the 'Featuring Classifier' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Aadl2Package.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER:
				return !getFeaturingClassifier().isEmpty();
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
		if (baseClass == ClassifierFeature.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER: return Aadl2Package.CLASSIFIER_FEATURE__FEATURING_CLASSIFIER;
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
		if (baseClass == ClassifierFeature.class) {
			switch (baseFeatureID) {
				case Aadl2Package.CLASSIFIER_FEATURE__FEATURING_CLASSIFIER: return Aadl2Package.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StructuralFeatureImpl
