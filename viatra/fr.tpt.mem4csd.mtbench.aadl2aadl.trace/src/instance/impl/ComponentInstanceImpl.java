/**
 */
package instance.impl;

import aadl2.ComponentCategory;
import aadl2.ComponentClassifier;
import aadl2.Subcomponent;

import instance.ComponentInstance;
import instance.ConnectionInstance;
import instance.EndToEndFlowInstance;
import instance.FeatureInstance;
import instance.FlowSpecificationInstance;
import instance.InstancePackage;
import instance.ModeInstance;
import instance.ModeTransitionInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getFeatureInstance <em>Feature Instance</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getModeInstance <em>Mode Instance</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getModeTransitionInstance <em>Mode Transition Instance</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getFlowSpecification <em>Flow Specification</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getEndToEndFlow <em>End To End Flow</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getConnectionInstance <em>Connection Instance</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link instance.impl.ComponentInstanceImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends ConnectionInstanceEndImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getFeatureInstance() <em>Feature Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureInstance> featureInstance;

	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstance;

	/**
	 * The cached value of the '{@link #getModeInstance() <em>Mode Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInstance> modeInstance;

	/**
	 * The cached value of the '{@link #getModeTransitionInstance() <em>Mode Transition Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeTransitionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeTransitionInstance> modeTransitionInstance;

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
	 * The cached value of the '{@link #getInMode() <em>In Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMode()
	 * @generated
	 * @ordered
	 */
	protected EList<ModeInstance> inMode;

	/**
	 * The cached value of the '{@link #getFlowSpecification() <em>Flow Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSpecificationInstance> flowSpecification;

	/**
	 * The cached value of the '{@link #getEndToEndFlow() <em>End To End Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<EndToEndFlowInstance> endToEndFlow;

	/**
	 * The cached value of the '{@link #getConnectionInstance() <em>Connection Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionInstance> connectionInstance;

	/**
	 * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected Subcomponent subcomponent;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> index;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ComponentClassifier classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureInstance> getFeatureInstance() {
		if (featureInstance == null) {
			featureInstance = new EObjectContainmentEList<FeatureInstance>(FeatureInstance.class, this, InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE);
		}
		return featureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentInstance> getComponentInstance() {
		if (componentInstance == null) {
			componentInstance = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE);
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getModeInstance() {
		if (modeInstance == null) {
			modeInstance = new EObjectContainmentEList<ModeInstance>(ModeInstance.class, this, InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE);
		}
		return modeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeTransitionInstance> getModeTransitionInstance() {
		if (modeTransitionInstance == null) {
			modeTransitionInstance = new EObjectContainmentEList<ModeTransitionInstance>(ModeTransitionInstance.class, this, InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE);
		}
		return modeTransitionInstance;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModeInstance> getInMode() {
		if (inMode == null) {
			inMode = new EObjectResolvingEList<ModeInstance>(ModeInstance.class, this, InstancePackage.COMPONENT_INSTANCE__IN_MODE);
		}
		return inMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowSpecificationInstance> getFlowSpecification() {
		if (flowSpecification == null) {
			flowSpecification = new EObjectContainmentEList<FlowSpecificationInstance>(FlowSpecificationInstance.class, this, InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION);
		}
		return flowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndToEndFlowInstance> getEndToEndFlow() {
		if (endToEndFlow == null) {
			endToEndFlow = new EObjectContainmentEList<EndToEndFlowInstance>(EndToEndFlowInstance.class, this, InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW);
		}
		return endToEndFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectionInstance> getConnectionInstance() {
		if (connectionInstance == null) {
			connectionInstance = new EObjectContainmentEList<ConnectionInstance>(ConnectionInstance.class, this, InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE);
		}
		return connectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subcomponent getSubcomponent() {
		if (subcomponent != null && subcomponent.eIsProxy()) {
			InternalEObject oldSubcomponent = (InternalEObject)subcomponent;
			subcomponent = (Subcomponent)eResolveProxy(oldSubcomponent);
			if (subcomponent != oldSubcomponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT, oldSubcomponent, subcomponent));
			}
		}
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent basicGetSubcomponent() {
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubcomponent(Subcomponent newSubcomponent) {
		Subcomponent oldSubcomponent = subcomponent;
		subcomponent = newSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT, oldSubcomponent, subcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getIndex() {
		if (index == null) {
			index = new EDataTypeEList<Long>(Long.class, this, InstancePackage.COMPONENT_INSTANCE__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentClassifier getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (ComponentClassifier)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifier(ComponentClassifier newClassifier) {
		ComponentClassifier oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
				return ((InternalEList<?>)getFeatureInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return ((InternalEList<?>)getComponentInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
				return ((InternalEList<?>)getModeInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
				return ((InternalEList<?>)getModeTransitionInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
				return ((InternalEList<?>)getFlowSpecification()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
				return ((InternalEList<?>)getEndToEndFlow()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
				return ((InternalEList<?>)getConnectionInstance()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
				return getFeatureInstance();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
				return getModeInstance();
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
				return getModeTransitionInstance();
			case InstancePackage.COMPONENT_INSTANCE__CATEGORY:
				return getCategory();
			case InstancePackage.COMPONENT_INSTANCE__IN_MODE:
				return getInMode();
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
				return getFlowSpecification();
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
				return getEndToEndFlow();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
				return getConnectionInstance();
			case InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				if (resolve) return getSubcomponent();
				return basicGetSubcomponent();
			case InstancePackage.COMPONENT_INSTANCE__INDEX:
				return getIndex();
			case InstancePackage.COMPONENT_INSTANCE__CLASSIFIER:
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
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
				getFeatureInstance().clear();
				getFeatureInstance().addAll((Collection<? extends FeatureInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				getComponentInstance().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
				getModeInstance().clear();
				getModeInstance().addAll((Collection<? extends ModeInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
				getModeTransitionInstance().clear();
				getModeTransitionInstance().addAll((Collection<? extends ModeTransitionInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__CATEGORY:
				setCategory((ComponentCategory)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__IN_MODE:
				getInMode().clear();
				getInMode().addAll((Collection<? extends ModeInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
				getFlowSpecification().clear();
				getFlowSpecification().addAll((Collection<? extends FlowSpecificationInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
				getEndToEndFlow().clear();
				getEndToEndFlow().addAll((Collection<? extends EndToEndFlowInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
				getConnectionInstance().clear();
				getConnectionInstance().addAll((Collection<? extends ConnectionInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				setSubcomponent((Subcomponent)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Long>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__CLASSIFIER:
				setClassifier((ComponentClassifier)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
				getFeatureInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
				getModeInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
				getModeTransitionInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InstancePackage.COMPONENT_INSTANCE__IN_MODE:
				getInMode().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
				getFlowSpecification().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
				getEndToEndFlow().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
				getConnectionInstance().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				setSubcomponent((Subcomponent)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__INDEX:
				getIndex().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__CLASSIFIER:
				setClassifier((ComponentClassifier)null);
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
			case InstancePackage.COMPONENT_INSTANCE__FEATURE_INSTANCE:
				return featureInstance != null && !featureInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return componentInstance != null && !componentInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__MODE_INSTANCE:
				return modeInstance != null && !modeInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE:
				return modeTransitionInstance != null && !modeTransitionInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case InstancePackage.COMPONENT_INSTANCE__IN_MODE:
				return inMode != null && !inMode.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__FLOW_SPECIFICATION:
				return flowSpecification != null && !flowSpecification.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__END_TO_END_FLOW:
				return endToEndFlow != null && !endToEndFlow.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__CONNECTION_INSTANCE:
				return connectionInstance != null && !connectionInstance.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				return subcomponent != null;
			case InstancePackage.COMPONENT_INSTANCE__INDEX:
				return index != null && !index.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__CLASSIFIER:
				return classifier != null;
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
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
