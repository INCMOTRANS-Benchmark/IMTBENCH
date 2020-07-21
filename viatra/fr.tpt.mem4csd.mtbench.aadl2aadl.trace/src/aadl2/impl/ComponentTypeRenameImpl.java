/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentCategory;
import aadl2.ComponentType;
import aadl2.ComponentTypeRename;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentTypeRenameImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeRenameImpl#getRenamedComponentType <em>Renamed Component Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeRenameImpl extends NamedElementImpl implements ComponentTypeRename {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentCategory CATEGORY_EDEFAULT = ComponentCategory.ABSTRACT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ComponentCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRenamedComponentType() <em>Renamed Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenamedComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType renamedComponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeRenameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentTypeRename();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(ComponentCategory newCategory) {
		ComponentCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_TYPE_RENAME__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getRenamedComponentType() {
		if (renamedComponentType != null && renamedComponentType.eIsProxy()) {
			InternalEObject oldRenamedComponentType = (InternalEObject)renamedComponentType;
			renamedComponentType = (ComponentType)eResolveProxy(oldRenamedComponentType);
			if (renamedComponentType != oldRenamedComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE, oldRenamedComponentType, renamedComponentType));
			}
		}
		return renamedComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetRenamedComponentType() {
		return renamedComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenamedComponentType(ComponentType newRenamedComponentType) {
		ComponentType oldRenamedComponentType = renamedComponentType;
		renamedComponentType = newRenamedComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE, oldRenamedComponentType, renamedComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_TYPE_RENAME__CATEGORY:
				return getCategory();
			case Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE:
				if (resolve) return getRenamedComponentType();
				return basicGetRenamedComponentType();
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
			case Aadl2Package.COMPONENT_TYPE_RENAME__CATEGORY:
				setCategory((ComponentCategory)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE:
				setRenamedComponentType((ComponentType)newValue);
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
			case Aadl2Package.COMPONENT_TYPE_RENAME__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE:
				setRenamedComponentType((ComponentType)null);
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
			case Aadl2Package.COMPONENT_TYPE_RENAME__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case Aadl2Package.COMPONENT_TYPE_RENAME__RENAMED_COMPONENT_TYPE:
				return renamedComponentType != null;
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
		result.append(" (category: ");
		result.append(category);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeRenameImpl
