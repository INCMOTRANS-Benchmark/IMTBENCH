/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractFeature;
import aadl2.ComponentType;
import aadl2.Feature;
import aadl2.FeatureGroup;
import aadl2.FlowSpecification;
import aadl2.TypeExtension;

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
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getOwnedFlowSpecification <em>Owned Flow Specification</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getOwnedFeatureGroup <em>Owned Feature Group</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#getOwnedAbstractFeature <em>Owned Abstract Feature</em>}</li>
 *   <li>{@link aadl2.impl.ComponentTypeImpl#isNoFeatures <em>No Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentTypeImpl extends ComponentClassifierImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getOwnedFlowSpecification() <em>Owned Flow Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlowSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSpecification> ownedFlowSpecification;

	/**
	 * The cached value of the '{@link #getOwnedExtension() <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtension()
	 * @generated
	 * @ordered
	 */
	protected TypeExtension ownedExtension;

	/**
	 * The cached value of the '{@link #getOwnedFeatureGroup() <em>Owned Feature Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroup> ownedFeatureGroup;

	/**
	 * The cached value of the '{@link #getOwnedAbstractFeature() <em>Owned Abstract Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFeature> ownedAbstractFeature;

	/**
	 * The default value of the '{@link #isNoFeatures() <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_FEATURES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoFeatures() <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoFeatures()
	 * @generated
	 * @ordered
	 */
	protected boolean noFeatures = NO_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getOwnedFeature() {
		// TODO: implement this method to return the 'Owned Feature' reference list
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
	public ComponentType getExtended() {
		ComponentType extended = basicGetExtended();
		return extended != null && extended.eIsProxy() ? (ComponentType)eResolveProxy((InternalEObject)extended) : extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetExtended() {
		// TODO: implement this method to return the 'Extended' reference
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
	public void setExtended(ComponentType newExtended) {
		// TODO: implement this method to set the 'Extended' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowSpecification> getOwnedFlowSpecification() {
		if (ownedFlowSpecification == null) {
			ownedFlowSpecification = new EObjectContainmentEList<FlowSpecification>(FlowSpecification.class, this, Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION);
		}
		return ownedFlowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeExtension getOwnedExtension() {
		return ownedExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExtension(TypeExtension newOwnedExtension, NotificationChain msgs) {
		TypeExtension oldOwnedExtension = ownedExtension;
		ownedExtension = newOwnedExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION, oldOwnedExtension, newOwnedExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedExtension(TypeExtension newOwnedExtension) {
		if (newOwnedExtension != ownedExtension) {
			NotificationChain msgs = null;
			if (ownedExtension != null)
				msgs = ((InternalEObject)ownedExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION, null, msgs);
			if (newOwnedExtension != null)
				msgs = ((InternalEObject)newOwnedExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION, null, msgs);
			msgs = basicSetOwnedExtension(newOwnedExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION, newOwnedExtension, newOwnedExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureGroup> getOwnedFeatureGroup() {
		if (ownedFeatureGroup == null) {
			ownedFeatureGroup = new EObjectContainmentEList<FeatureGroup>(FeatureGroup.class, this, Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP);
		}
		return ownedFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeature> getOwnedAbstractFeature() {
		if (ownedAbstractFeature == null) {
			ownedAbstractFeature = new EObjectContainmentEList<AbstractFeature>(AbstractFeature.class, this, Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE);
		}
		return ownedAbstractFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoFeatures() {
		return noFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoFeatures(boolean newNoFeatures) {
		boolean oldNoFeatures = noFeatures;
		noFeatures = newNoFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_TYPE__NO_FEATURES, oldNoFeatures, noFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION:
				return ((InternalEList<?>)getOwnedFlowSpecification()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION:
				return basicSetOwnedExtension(null, msgs);
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP:
				return ((InternalEList<?>)getOwnedFeatureGroup()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE:
				return ((InternalEList<?>)getOwnedAbstractFeature()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE:
				return getOwnedFeature();
			case Aadl2Package.COMPONENT_TYPE__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
			case Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION:
				return getOwnedFlowSpecification();
			case Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION:
				return getOwnedExtension();
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP:
				return getOwnedFeatureGroup();
			case Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE:
				return getOwnedAbstractFeature();
			case Aadl2Package.COMPONENT_TYPE__NO_FEATURES:
				return isNoFeatures();
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
			case Aadl2Package.COMPONENT_TYPE__EXTENDED:
				setExtended((ComponentType)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION:
				getOwnedFlowSpecification().clear();
				getOwnedFlowSpecification().addAll((Collection<? extends FlowSpecification>)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION:
				setOwnedExtension((TypeExtension)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP:
				getOwnedFeatureGroup().clear();
				getOwnedFeatureGroup().addAll((Collection<? extends FeatureGroup>)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE:
				getOwnedAbstractFeature().clear();
				getOwnedAbstractFeature().addAll((Collection<? extends AbstractFeature>)newValue);
				return;
			case Aadl2Package.COMPONENT_TYPE__NO_FEATURES:
				setNoFeatures((Boolean)newValue);
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
			case Aadl2Package.COMPONENT_TYPE__EXTENDED:
				setExtended((ComponentType)null);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION:
				getOwnedFlowSpecification().clear();
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION:
				setOwnedExtension((TypeExtension)null);
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP:
				getOwnedFeatureGroup().clear();
				return;
			case Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE:
				getOwnedAbstractFeature().clear();
				return;
			case Aadl2Package.COMPONENT_TYPE__NO_FEATURES:
				setNoFeatures(NO_FEATURES_EDEFAULT);
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
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case Aadl2Package.COMPONENT_TYPE__EXTENDED:
				return basicGetExtended() != null;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FLOW_SPECIFICATION:
				return ownedFlowSpecification != null && !ownedFlowSpecification.isEmpty();
			case Aadl2Package.COMPONENT_TYPE__OWNED_EXTENSION:
				return ownedExtension != null;
			case Aadl2Package.COMPONENT_TYPE__OWNED_FEATURE_GROUP:
				return ownedFeatureGroup != null && !ownedFeatureGroup.isEmpty();
			case Aadl2Package.COMPONENT_TYPE__OWNED_ABSTRACT_FEATURE:
				return ownedAbstractFeature != null && !ownedAbstractFeature.isEmpty();
			case Aadl2Package.COMPONENT_TYPE__NO_FEATURES:
				return noFeatures != NO_FEATURES_EDEFAULT;
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
		result.append(" (noFeatures: ");
		result.append(noFeatures);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
