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
 * An implementation of the model object '<em><b>Private Package Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PrivatePackageSectionImpl#getPublicSection <em>Public Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivatePackageSectionImpl extends PackageSectionImpl implements PrivatePackageSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivatePackageSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPrivatePackageSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicPackageSection getPublicSection() {
		PublicPackageSection publicSection = basicGetPublicSection();
		return publicSection != null && publicSection.eIsProxy() ? (PublicPackageSection)eResolveProxy((InternalEObject)publicSection) : publicSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPackageSection basicGetPublicSection() {
		// TODO: implement this method to return the 'Public Section' reference
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
			case Aadl2Package.PRIVATE_PACKAGE_SECTION__PUBLIC_SECTION:
				if (resolve) return getPublicSection();
				return basicGetPublicSection();
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
			case Aadl2Package.PRIVATE_PACKAGE_SECTION__PUBLIC_SECTION:
				return basicGetPublicSection() != null;
		}
		return super.eIsSet(featureID);
	}

} //PrivatePackageSectionImpl
