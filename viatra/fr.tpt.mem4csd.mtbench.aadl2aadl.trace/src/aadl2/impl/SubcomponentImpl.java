/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ArrayDimension;
import aadl2.ArrayableElement;
import aadl2.ComponentClassifier;
import aadl2.ComponentImplementationReference;
import aadl2.ComponentPrototype;
import aadl2.Context;
import aadl2.EndToEndFlowElement;
import aadl2.FlowElement;
import aadl2.ModalElement;
import aadl2.Mode;
import aadl2.ModeBinding;
import aadl2.PrototypeBinding;
import aadl2.Subcomponent;
import aadl2.SubcomponentType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getArrayDimension <em>Array Dimension</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getSubcomponentType <em>Subcomponent Type</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getOwnedPrototypeBinding <em>Owned Prototype Binding</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getOwnedModeBinding <em>Owned Mode Binding</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#isAllModes <em>All Modes</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getImplementationReference <em>Implementation Reference</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getRefined <em>Refined</em>}</li>
 *   <li>{@link aadl2.impl.SubcomponentImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubcomponentImpl extends StructuralFeatureImpl implements Subcomponent {
	/**
	 * The cached value of the '{@link #getInMode() <em>In Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> inMode;

	/**
	 * The cached value of the '{@link #getArrayDimension() <em>Array Dimension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayDimension> arrayDimension;

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
	 * The cached value of the '{@link #getOwnedModeBinding() <em>Owned Mode Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModeBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeBinding> ownedModeBinding;

	/**
	 * The default value of the '{@link #isAllModes() <em>All Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllModes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_MODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllModes() <em>All Modes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllModes()
	 * @generated
	 * @ordered
	 */
	protected boolean allModes = ALL_MODES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementationReference() <em>Implementation Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementationReference> implementationReference;

	/**
	 * The cached value of the '{@link #getRefined() <em>Refined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefined()
	 * @generated
	 * @ordered
	 */
	protected Subcomponent refined;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubcomponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<Mode>(Mode.class, this, Aadl2Package.SUBCOMPONENT__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayDimension> getArrayDimension() {
		if (arrayDimension == null) {
			arrayDimension = new EObjectContainmentEList<ArrayDimension>(ArrayDimension.class, this, Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION);
		}
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubcomponentType getSubcomponentType() {
		SubcomponentType subcomponentType = basicGetSubcomponentType();
		return subcomponentType != null && subcomponentType.eIsProxy() ? (SubcomponentType)eResolveProxy((InternalEObject)subcomponentType) : subcomponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentType basicGetSubcomponentType() {
		// TODO: implement this method to return the 'Subcomponent Type' reference
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
	public EList<PrototypeBinding> getOwnedPrototypeBinding() {
		if (ownedPrototypeBinding == null) {
			ownedPrototypeBinding = new EObjectContainmentEList<PrototypeBinding>(PrototypeBinding.class, this, Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING);
		}
		return ownedPrototypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentPrototype getPrototype() {
		ComponentPrototype prototype = basicGetPrototype();
		return prototype != null && prototype.eIsProxy() ? (ComponentPrototype)eResolveProxy((InternalEObject)prototype) : prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPrototype basicGetPrototype() {
		// TODO: implement this method to return the 'Prototype' reference
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
	public EList<ModeBinding> getOwnedModeBinding() {
		if (ownedModeBinding == null) {
			ownedModeBinding = new EObjectContainmentEList<ModeBinding>(ModeBinding.class, this, Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING);
		}
		return ownedModeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllModes() {
		return allModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllModes(boolean newAllModes) {
		boolean oldAllModes = allModes;
		allModes = newAllModes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBCOMPONENT__ALL_MODES, oldAllModes, allModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentImplementationReference> getImplementationReference() {
		if (implementationReference == null) {
			implementationReference = new EObjectContainmentEList<ComponentImplementationReference>(ComponentImplementationReference.class, this, Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE);
		}
		return implementationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subcomponent getRefined() {
		if (refined != null && refined.eIsProxy()) {
			InternalEObject oldRefined = (InternalEObject)refined;
			refined = (Subcomponent)eResolveProxy(oldRefined);
			if (refined != oldRefined) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBCOMPONENT__REFINED, oldRefined, refined));
			}
		}
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent basicGetRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefined(Subcomponent newRefined) {
		Subcomponent oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBCOMPONENT__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentClassifier getClassifier() {
		ComponentClassifier classifier = basicGetClassifier();
		return classifier != null && classifier.eIsProxy() ? (ComponentClassifier)eResolveProxy((InternalEObject)classifier) : classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier basicGetClassifier() {
		// TODO: implement this method to return the 'Classifier' reference
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
	public EList<Mode> getAllInModes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
				return ((InternalEList<?>)getArrayDimension()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
				return ((InternalEList<?>)getOwnedPrototypeBinding()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
				return ((InternalEList<?>)getOwnedModeBinding()).basicRemove(otherEnd, msgs);
			case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
				return ((InternalEList<?>)getImplementationReference()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.SUBCOMPONENT__IN_MODE:
				return getInMode();
			case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
				return getArrayDimension();
			case Aadl2Package.SUBCOMPONENT__SUBCOMPONENT_TYPE:
				if (resolve) return getSubcomponentType();
				return basicGetSubcomponentType();
			case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
				return getOwnedPrototypeBinding();
			case Aadl2Package.SUBCOMPONENT__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
				return getOwnedModeBinding();
			case Aadl2Package.SUBCOMPONENT__ALL_MODES:
				return isAllModes();
			case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
				return getImplementationReference();
			case Aadl2Package.SUBCOMPONENT__REFINED:
				if (resolve) return getRefined();
				return basicGetRefined();
			case Aadl2Package.SUBCOMPONENT__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
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
			case Aadl2Package.SUBCOMPONENT__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends Mode>)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
				getArrayDimension().clear();
				getArrayDimension().addAll((Collection<? extends ArrayDimension>)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
				getOwnedPrototypeBinding().addAll((Collection<? extends PrototypeBinding>)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
				getOwnedModeBinding().clear();
				getOwnedModeBinding().addAll((Collection<? extends ModeBinding>)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__ALL_MODES:
				setAllModes((Boolean)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
				getImplementationReference().clear();
				getImplementationReference().addAll((Collection<? extends ComponentImplementationReference>)newValue);
				return;
			case Aadl2Package.SUBCOMPONENT__REFINED:
				setRefined((Subcomponent)newValue);
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
			case Aadl2Package.SUBCOMPONENT__IN_MODE:
				getInMode().clear();
				return;
			case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
				getArrayDimension().clear();
				return;
			case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
				getOwnedPrototypeBinding().clear();
				return;
			case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
				getOwnedModeBinding().clear();
				return;
			case Aadl2Package.SUBCOMPONENT__ALL_MODES:
				setAllModes(ALL_MODES_EDEFAULT);
				return;
			case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
				getImplementationReference().clear();
				return;
			case Aadl2Package.SUBCOMPONENT__REFINED:
				setRefined((Subcomponent)null);
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
			case Aadl2Package.SUBCOMPONENT__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION:
				return arrayDimension != null && !arrayDimension.isEmpty();
			case Aadl2Package.SUBCOMPONENT__SUBCOMPONENT_TYPE:
				return basicGetSubcomponentType() != null;
			case Aadl2Package.SUBCOMPONENT__OWNED_PROTOTYPE_BINDING:
				return ownedPrototypeBinding != null && !ownedPrototypeBinding.isEmpty();
			case Aadl2Package.SUBCOMPONENT__PROTOTYPE:
				return basicGetPrototype() != null;
			case Aadl2Package.SUBCOMPONENT__OWNED_MODE_BINDING:
				return ownedModeBinding != null && !ownedModeBinding.isEmpty();
			case Aadl2Package.SUBCOMPONENT__ALL_MODES:
				return allModes != ALL_MODES_EDEFAULT;
			case Aadl2Package.SUBCOMPONENT__IMPLEMENTATION_REFERENCE:
				return implementationReference != null && !implementationReference.isEmpty();
			case Aadl2Package.SUBCOMPONENT__REFINED:
				return refined != null;
			case Aadl2Package.SUBCOMPONENT__CLASSIFIER:
				return basicGetClassifier() != null;
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
		if (baseClass == ModalElement.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.SUBCOMPONENT__IN_MODE: return Aadl2Package.MODAL_ELEMENT__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == Context.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayableElement.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION: return Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION;
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
		if (baseClass == ModalElement.class) {
			switch (baseFeatureID) {
				case Aadl2Package.MODAL_ELEMENT__IN_MODE: return Aadl2Package.SUBCOMPONENT__IN_MODE;
				default: return -1;
			}
		}
		if (baseClass == Context.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayableElement.class) {
			switch (baseFeatureID) {
				case Aadl2Package.ARRAYABLE_ELEMENT__ARRAY_DIMENSION: return Aadl2Package.SUBCOMPONENT__ARRAY_DIMENSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModalElement.class) {
			switch (baseOperationID) {
				case Aadl2Package.MODAL_ELEMENT___GET_ALL_IN_MODES: return Aadl2Package.SUBCOMPONENT___GET_ALL_IN_MODES;
				default: return -1;
			}
		}
		if (baseClass == Context.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == EndToEndFlowElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ArrayableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.SUBCOMPONENT___GET_ALL_IN_MODES:
				return getAllInModes();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (allModes: ");
		result.append(allModes);
		result.append(')');
		return result.toString();
	}

} //SubcomponentImpl
