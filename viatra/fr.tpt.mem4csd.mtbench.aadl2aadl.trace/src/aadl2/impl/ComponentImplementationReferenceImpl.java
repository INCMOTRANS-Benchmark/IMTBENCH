/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentImplementation;
import aadl2.ComponentImplementationReference;
import aadl2.PrototypeBinding;

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
 * An implementation of the model object '<em><b>Component Implementation Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentImplementationReferenceImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationReferenceImpl#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplementationReferenceImpl extends ElementImpl implements ComponentImplementationReference {
	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected ComponentImplementation implementation;

	/**
	 * The cached value of the '{@link #getOwnedPrototypeBinding() <em>Owned Prototype Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPrototypeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PrototypeBinding> ownedPrototypeBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentImplementationReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation getImplementation() {
		if (implementation != null && implementation.eIsProxy()) {
			InternalEObject oldImplementation = (InternalEObject)implementation;
			implementation = (ComponentImplementation)eResolveProxy(oldImplementation);
			if (implementation != oldImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION, oldImplementation, implementation));
			}
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation basicGetImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(ComponentImplementation newImplementation) {
		ComponentImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrototypeBinding> getOwnedPrototypeBinding() {
		if (ownedPrototypeBinding == null) {
			ownedPrototypeBinding = new EObjectContainmentEList<PrototypeBinding>(PrototypeBinding.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING);
		}
		return ownedPrototypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING:
				return ((InternalEList<?>)getOwnedPrototypeBinding()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION:
				if (resolve) return getImplementation();
				return basicGetImplementation();
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING:
				return getOwnedPrototypeBinding();
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
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION:
				setImplementation((ComponentImplementation)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
				getOwnedPrototypeBinding().addAll((Collection<? extends PrototypeBinding>)newValue);
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
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION:
				setImplementation((ComponentImplementation)null);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
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
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__IMPLEMENTATION:
				return implementation != null;
			case Aadl2Package.COMPONENT_IMPLEMENTATION_REFERENCE__OWNED_PROTOTYPE_BINDING:
				return ownedPrototypeBinding != null && !ownedPrototypeBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImplementationReferenceImpl
