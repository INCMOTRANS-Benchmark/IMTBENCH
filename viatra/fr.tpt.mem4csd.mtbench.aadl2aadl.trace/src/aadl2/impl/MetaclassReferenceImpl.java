/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.MetaclassReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metaclass Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.MetaclassReferenceImpl#getAnnexName <em>Annex Name</em>}</li>
 *   <li>{@link aadl2.impl.MetaclassReferenceImpl#getMetaclassName <em>Metaclass Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaclassReferenceImpl extends PropertyOwnerImpl implements MetaclassReference {
	/**
	 * The default value of the '{@link #getAnnexName() <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnexName() <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexName()
	 * @generated
	 * @ordered
	 */
	protected String annexName = ANNEX_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metaclassName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaclassReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getMetaclassReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnexName() {
		return annexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnexName(String newAnnexName) {
		String oldAnnexName = annexName;
		annexName = newAnnexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.METACLASS_REFERENCE__ANNEX_NAME, oldAnnexName, annexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMetaclassName() {
		if (metaclassName == null) {
			metaclassName = new EDataTypeEList<String>(String.class, this, Aadl2Package.METACLASS_REFERENCE__METACLASS_NAME);
		}
		return metaclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.METACLASS_REFERENCE__ANNEX_NAME:
				return getAnnexName();
			case Aadl2Package.METACLASS_REFERENCE__METACLASS_NAME:
				return getMetaclassName();
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
			case Aadl2Package.METACLASS_REFERENCE__ANNEX_NAME:
				setAnnexName((String)newValue);
				return;
			case Aadl2Package.METACLASS_REFERENCE__METACLASS_NAME:
				getMetaclassName().clear();
				getMetaclassName().addAll((Collection<? extends String>)newValue);
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
			case Aadl2Package.METACLASS_REFERENCE__ANNEX_NAME:
				setAnnexName(ANNEX_NAME_EDEFAULT);
				return;
			case Aadl2Package.METACLASS_REFERENCE__METACLASS_NAME:
				getMetaclassName().clear();
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
			case Aadl2Package.METACLASS_REFERENCE__ANNEX_NAME:
				return ANNEX_NAME_EDEFAULT == null ? annexName != null : !ANNEX_NAME_EDEFAULT.equals(annexName);
			case Aadl2Package.METACLASS_REFERENCE__METACLASS_NAME:
				return metaclassName != null && !metaclassName.isEmpty();
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
		result.append(" (annexName: ");
		result.append(annexName);
		result.append(", metaclassName: ");
		result.append(metaclassName);
		result.append(')');
		return result.toString();
	}

} //MetaclassReferenceImpl
