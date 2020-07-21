/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.GlobalNamespace;
import aadl2.PropertySet;
import aadl2.PublicPackageSection;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.GlobalNamespaceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link aadl2.impl.GlobalNamespaceImpl#getPropertySet <em>Property Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalNamespaceImpl extends NamespaceImpl implements GlobalNamespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getGlobalNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PublicPackageSection> getPackage() {
		// TODO: implement this method to return the 'Package' reference list
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
	public EList<PropertySet> getPropertySet() {
		// TODO: implement this method to return the 'Property Set' reference list
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
			case Aadl2Package.GLOBAL_NAMESPACE__PACKAGE:
				return getPackage();
			case Aadl2Package.GLOBAL_NAMESPACE__PROPERTY_SET:
				return getPropertySet();
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
			case Aadl2Package.GLOBAL_NAMESPACE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PublicPackageSection>)newValue);
				return;
			case Aadl2Package.GLOBAL_NAMESPACE__PROPERTY_SET:
				getPropertySet().clear();
				getPropertySet().addAll((Collection<? extends PropertySet>)newValue);
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
			case Aadl2Package.GLOBAL_NAMESPACE__PACKAGE:
				getPackage().clear();
				return;
			case Aadl2Package.GLOBAL_NAMESPACE__PROPERTY_SET:
				getPropertySet().clear();
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
			case Aadl2Package.GLOBAL_NAMESPACE__PACKAGE:
				return !getPackage().isEmpty();
			case Aadl2Package.GLOBAL_NAMESPACE__PROPERTY_SET:
				return !getPropertySet().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalNamespaceImpl
