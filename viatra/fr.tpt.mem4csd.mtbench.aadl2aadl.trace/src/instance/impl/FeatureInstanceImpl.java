/**
 */
package instance.impl;

import aadl2.DirectionType;
import aadl2.Feature;

import instance.FeatureCategory;
import instance.FeatureInstance;
import instance.FlowSpecificationInstance;
import instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getSrcFlowSpec <em>Src Flow Spec</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getDstFlowSpec <em>Dst Flow Spec</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getFeatureInstance <em>Feature Instance</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link instance.impl.FeatureInstanceImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureInstanceImpl extends ConnectionInstanceEndImpl implements FeatureInstance {
	/**
	 * The cached value of the '{@link #getSrcFlowSpec() <em>Src Flow Spec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcFlowSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSpecificationInstance> srcFlowSpec;

	/**
	 * The cached value of the '{@link #getDstFlowSpec() <em>Dst Flow Spec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstFlowSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSpecificationInstance> dstFlowSpec;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final FeatureCategory CATEGORY_EDEFAULT = FeatureCategory.DATA_PORT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected FeatureCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long INDEX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected long index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.FEATURE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowSpecificationInstance> getSrcFlowSpec() {
		if (srcFlowSpec == null) {
			srcFlowSpec = new EObjectWithInverseEList<FlowSpecificationInstance>(FlowSpecificationInstance.class, this, InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC, InstancePackage.FLOW_SPECIFICATION_INSTANCE__SOURCE);
		}
		return srcFlowSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowSpecificationInstance> getDstFlowSpec() {
		if (dstFlowSpec == null) {
			dstFlowSpec = new EObjectWithInverseEList<FlowSpecificationInstance>(FlowSpecificationInstance.class, this, InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC, InstancePackage.FLOW_SPECIFICATION_INSTANCE__DESTINATION);
		}
		return dstFlowSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureInstance> getFeatureInstance() {
		if (featureInstance == null) {
			featureInstance = new EObjectContainmentEList<FeatureInstance>(FeatureInstance.class, this, InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE);
		}
		return featureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(FeatureCategory newCategory) {
		FeatureCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FEATURE_INSTANCE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(DirectionType newDirection) {
		DirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FEATURE_INSTANCE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.FEATURE_INSTANCE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FEATURE_INSTANCE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(long newIndex) {
		long oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FEATURE_INSTANCE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSrcFlowSpec()).basicAdd(otherEnd, msgs);
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDstFlowSpec()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				return ((InternalEList<?>)getSrcFlowSpec()).basicRemove(otherEnd, msgs);
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				return ((InternalEList<?>)getDstFlowSpec()).basicRemove(otherEnd, msgs);
			case InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE:
				return ((InternalEList<?>)getFeatureInstance()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				return getSrcFlowSpec();
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				return getDstFlowSpec();
			case InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE:
				return getFeatureInstance();
			case InstancePackage.FEATURE_INSTANCE__CATEGORY:
				return getCategory();
			case InstancePackage.FEATURE_INSTANCE__DIRECTION:
				return getDirection();
			case InstancePackage.FEATURE_INSTANCE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case InstancePackage.FEATURE_INSTANCE__INDEX:
				return getIndex();
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
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				getSrcFlowSpec().clear();
				getSrcFlowSpec().addAll((Collection<? extends FlowSpecificationInstance>)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				getDstFlowSpec().clear();
				getDstFlowSpec().addAll((Collection<? extends FlowSpecificationInstance>)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE:
				getFeatureInstance().clear();
				getFeatureInstance().addAll((Collection<? extends FeatureInstance>)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__CATEGORY:
				setCategory((FeatureCategory)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__DIRECTION:
				setDirection((DirectionType)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__FEATURE:
				setFeature((Feature)newValue);
				return;
			case InstancePackage.FEATURE_INSTANCE__INDEX:
				setIndex((Long)newValue);
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
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				getSrcFlowSpec().clear();
				return;
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				getDstFlowSpec().clear();
				return;
			case InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE:
				getFeatureInstance().clear();
				return;
			case InstancePackage.FEATURE_INSTANCE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case InstancePackage.FEATURE_INSTANCE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case InstancePackage.FEATURE_INSTANCE__FEATURE:
				setFeature((Feature)null);
				return;
			case InstancePackage.FEATURE_INSTANCE__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case InstancePackage.FEATURE_INSTANCE__SRC_FLOW_SPEC:
				return srcFlowSpec != null && !srcFlowSpec.isEmpty();
			case InstancePackage.FEATURE_INSTANCE__DST_FLOW_SPEC:
				return dstFlowSpec != null && !dstFlowSpec.isEmpty();
			case InstancePackage.FEATURE_INSTANCE__FEATURE_INSTANCE:
				return featureInstance != null && !featureInstance.isEmpty();
			case InstancePackage.FEATURE_INSTANCE__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case InstancePackage.FEATURE_INSTANCE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case InstancePackage.FEATURE_INSTANCE__FEATURE:
				return feature != null;
			case InstancePackage.FEATURE_INSTANCE__INDEX:
				return index != INDEX_EDEFAULT;
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
		result.append(", direction: ");
		result.append(direction);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //FeatureInstanceImpl
