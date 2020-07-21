/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AadlPackage;
import aadl2.PackageRename;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PackageRenameImpl#getRenamedPackage <em>Renamed Package</em>}</li>
 *   <li>{@link aadl2.impl.PackageRenameImpl#isRenameAll <em>Rename All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageRenameImpl extends NamedElementImpl implements PackageRename {
	/**
	 * The cached value of the '{@link #getRenamedPackage() <em>Renamed Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenamedPackage()
	 * @generated
	 * @ordered
	 */
	protected AadlPackage renamedPackage;

	/**
	 * The default value of the '{@link #isRenameAll() <em>Rename All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRenameAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RENAME_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRenameAll() <em>Rename All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRenameAll()
	 * @generated
	 * @ordered
	 */
	protected boolean renameAll = RENAME_ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageRenameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPackageRename();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AadlPackage getRenamedPackage() {
		if (renamedPackage != null && renamedPackage.eIsProxy()) {
			InternalEObject oldRenamedPackage = (InternalEObject)renamedPackage;
			renamedPackage = (AadlPackage)eResolveProxy(oldRenamedPackage);
			if (renamedPackage != oldRenamedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE, oldRenamedPackage, renamedPackage));
			}
		}
		return renamedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AadlPackage basicGetRenamedPackage() {
		return renamedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenamedPackage(AadlPackage newRenamedPackage) {
		AadlPackage oldRenamedPackage = renamedPackage;
		renamedPackage = newRenamedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE, oldRenamedPackage, renamedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRenameAll() {
		return renameAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameAll(boolean newRenameAll) {
		boolean oldRenameAll = renameAll;
		renameAll = newRenameAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PACKAGE_RENAME__RENAME_ALL, oldRenameAll, renameAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE:
				if (resolve) return getRenamedPackage();
				return basicGetRenamedPackage();
			case Aadl2Package.PACKAGE_RENAME__RENAME_ALL:
				return isRenameAll();
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
			case Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE:
				setRenamedPackage((AadlPackage)newValue);
				return;
			case Aadl2Package.PACKAGE_RENAME__RENAME_ALL:
				setRenameAll((Boolean)newValue);
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
			case Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE:
				setRenamedPackage((AadlPackage)null);
				return;
			case Aadl2Package.PACKAGE_RENAME__RENAME_ALL:
				setRenameAll(RENAME_ALL_EDEFAULT);
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
			case Aadl2Package.PACKAGE_RENAME__RENAMED_PACKAGE:
				return renamedPackage != null;
			case Aadl2Package.PACKAGE_RENAME__RENAME_ALL:
				return renameAll != RENAME_ALL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (renameAll: ");
		result.append(renameAll);
		result.append(')');
		return result.toString();
	}

} //PackageRenameImpl
