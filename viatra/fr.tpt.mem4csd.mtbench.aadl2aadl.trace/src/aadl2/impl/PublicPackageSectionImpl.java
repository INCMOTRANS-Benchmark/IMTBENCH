/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.PrivatePackageSection;
import aadl2.PublicPackageSection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Package Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PublicPackageSectionImpl#getPrivateSection <em>Private Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicPackageSectionImpl extends PackageSectionImpl implements PublicPackageSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicPackageSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPublicPackageSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePackageSection getPrivateSection() {
		PrivatePackageSection privateSection = basicGetPrivateSection();
		return privateSection != null && privateSection.eIsProxy() ? (PrivatePackageSection)eResolveProxy((InternalEObject)privateSection) : privateSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePackageSection basicGetPrivateSection() {
		// TODO: implement this method to return the 'Private Section' reference
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PUBLIC_PACKAGE_SECTION__PRIVATE_SECTION:
				if (resolve) return getPrivateSection();
				return basicGetPrivateSection();
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
			case Aadl2Package.PUBLIC_PACKAGE_SECTION__PRIVATE_SECTION:
				return basicGetPrivateSection() != null;
		}
		return super.eIsSet(featureID);
	}

} //PublicPackageSectionImpl
