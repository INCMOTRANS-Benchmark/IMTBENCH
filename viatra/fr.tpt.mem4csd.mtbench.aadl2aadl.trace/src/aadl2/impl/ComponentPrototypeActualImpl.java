/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentCategory;
import aadl2.ComponentPrototypeActual;
import aadl2.PrototypeBinding;
import aadl2.SubcomponentType;

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
 * An implementation of the model object '<em><b>Component Prototype Actual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentPrototypeActualImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link aadl2.impl.ComponentPrototypeActualImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link aadl2.impl.ComponentPrototypeActualImpl#getSubcomponentType <em>Subcomponent Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPrototypeActualImpl extends ArrayableElementImpl implements ComponentPrototypeActual {
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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PrototypeBinding> binding;

	/**
	 * The cached value of the '{@link #getSubcomponentType() <em>Subcomponent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponentType()
	 * @generated
	 * @ordered
	 */
	protected SubcomponentType subcomponentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPrototypeActualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentPrototypeActual();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrototypeBinding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<PrototypeBinding>(PrototypeBinding.class, this, Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentType getSubcomponentType() {
		if (subcomponentType != null && subcomponentType.eIsProxy()) {
			InternalEObject oldSubcomponentType = (InternalEObject)subcomponentType;
			subcomponentType = (SubcomponentType)eResolveProxy(oldSubcomponentType);
			if (subcomponentType != oldSubcomponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE, oldSubcomponentType, subcomponentType));
			}
		}
		return subcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentType basicGetSubcomponentType() {
		return subcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubcomponentType(SubcomponentType newSubcomponentType) {
		SubcomponentType oldSubcomponentType = subcomponentType;
		subcomponentType = newSubcomponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE, oldSubcomponentType, subcomponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__CATEGORY:
				return getCategory();
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING:
				return getBinding();
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE:
				if (resolve) return getSubcomponentType();
				return basicGetSubcomponentType();
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
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__CATEGORY:
				setCategory((ComponentCategory)newValue);
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends PrototypeBinding>)newValue);
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE:
				setSubcomponentType((SubcomponentType)newValue);
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
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING:
				getBinding().clear();
				return;
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE:
				setSubcomponentType((SubcomponentType)null);
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
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__BINDING:
				return binding != null && !binding.isEmpty();
			case Aadl2Package.COMPONENT_PROTOTYPE_ACTUAL__SUBCOMPONENT_TYPE:
				return subcomponentType != null;
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

} //ComponentPrototypeActualImpl
