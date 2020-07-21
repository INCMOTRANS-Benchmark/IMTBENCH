/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractFeature;
import aadl2.BusAccess;
import aadl2.DataAccess;
import aadl2.DataPort;
import aadl2.EventDataPort;
import aadl2.EventPort;
import aadl2.Feature;
import aadl2.FeatureGroup;
import aadl2.FeatureGroupType;
import aadl2.GroupExtension;
import aadl2.Parameter;
import aadl2.SubprogramAccess;
import aadl2.SubprogramGroupAccess;

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
 * An implementation of the model object '<em><b>Feature Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedDataPort <em>Owned Data Port</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedEventDataPort <em>Owned Event Data Port</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedEventPort <em>Owned Event Port</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedFeatureGroup <em>Owned Feature Group</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedSubprogramGroupAccess <em>Owned Subprogram Group Access</em>}</li>
 *   <li>{@link aadl2.impl.FeatureGroupTypeImpl#getOwnedAbstractFeature <em>Owned Abstract Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureGroupTypeImpl extends ClassifierImpl implements FeatureGroupType {
	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroupType inverse;

	/**
	 * The cached value of the '{@link #getOwnedExtension() <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtension()
	 * @generated
	 * @ordered
	 */
	protected GroupExtension ownedExtension;

	/**
	 * The cached value of the '{@link #getOwnedBusAccess() <em>Owned Bus Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBusAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<BusAccess> ownedBusAccess;

	/**
	 * The cached value of the '{@link #getOwnedDataAccess() <em>Owned Data Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAccess> ownedDataAccess;

	/**
	 * The cached value of the '{@link #getOwnedDataPort() <em>Owned Data Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPort()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> ownedDataPort;

	/**
	 * The cached value of the '{@link #getOwnedEventDataPort() <em>Owned Event Data Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventDataPort()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDataPort> ownedEventDataPort;

	/**
	 * The cached value of the '{@link #getOwnedEventPort() <em>Owned Event Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventPort()
	 * @generated
	 * @ordered
	 */
	protected EList<EventPort> ownedEventPort;

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
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramAccess() <em>Owned Subprogram Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramAccess> ownedSubprogramAccess;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramGroupAccess() <em>Owned Subprogram Group Access</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramGroupAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramGroupAccess> ownedSubprogramGroupAccess;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeatureGroupType();
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
	public FeatureGroupType getExtended() {
		FeatureGroupType extended = basicGetExtended();
		return extended != null && extended.eIsProxy() ? (FeatureGroupType)eResolveProxy((InternalEObject)extended) : extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetExtended() {
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
	public void setExtended(FeatureGroupType newExtended) {
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
	public FeatureGroupType getInverse() {
		if (inverse != null && inverse.eIsProxy()) {
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (FeatureGroupType)eResolveProxy(oldInverse);
			if (inverse != oldInverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_GROUP_TYPE__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupType basicGetInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInverse(FeatureGroupType newInverse) {
		FeatureGroupType oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_TYPE__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupExtension getOwnedExtension() {
		return ownedExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExtension(GroupExtension newOwnedExtension, NotificationChain msgs) {
		GroupExtension oldOwnedExtension = ownedExtension;
		ownedExtension = newOwnedExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION, oldOwnedExtension, newOwnedExtension);
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
	public void setOwnedExtension(GroupExtension newOwnedExtension) {
		if (newOwnedExtension != ownedExtension) {
			NotificationChain msgs = null;
			if (ownedExtension != null)
				msgs = ((InternalEObject)ownedExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION, null, msgs);
			if (newOwnedExtension != null)
				msgs = ((InternalEObject)newOwnedExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION, null, msgs);
			msgs = basicSetOwnedExtension(newOwnedExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION, newOwnedExtension, newOwnedExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BusAccess> getOwnedBusAccess() {
		if (ownedBusAccess == null) {
			ownedBusAccess = new EObjectContainmentEList<BusAccess>(BusAccess.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS);
		}
		return ownedBusAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataAccess> getOwnedDataAccess() {
		if (ownedDataAccess == null) {
			ownedDataAccess = new EObjectContainmentEList<DataAccess>(DataAccess.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS);
		}
		return ownedDataAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataPort> getOwnedDataPort() {
		if (ownedDataPort == null) {
			ownedDataPort = new EObjectContainmentEList<DataPort>(DataPort.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT);
		}
		return ownedDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDataPort> getOwnedEventDataPort() {
		if (ownedEventDataPort == null) {
			ownedEventDataPort = new EObjectContainmentEList<EventDataPort>(EventDataPort.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT);
		}
		return ownedEventDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventPort> getOwnedEventPort() {
		if (ownedEventPort == null) {
			ownedEventPort = new EObjectContainmentEList<EventPort>(EventPort.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT);
		}
		return ownedEventPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureGroup> getOwnedFeatureGroup() {
		if (ownedFeatureGroup == null) {
			ownedFeatureGroup = new EObjectContainmentEList<FeatureGroup>(FeatureGroup.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP);
		}
		return ownedFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramAccess> getOwnedSubprogramAccess() {
		if (ownedSubprogramAccess == null) {
			ownedSubprogramAccess = new EObjectContainmentEList<SubprogramAccess>(SubprogramAccess.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS);
		}
		return ownedSubprogramAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramGroupAccess> getOwnedSubprogramGroupAccess() {
		if (ownedSubprogramGroupAccess == null) {
			ownedSubprogramGroupAccess = new EObjectContainmentEList<SubprogramGroupAccess>(SubprogramGroupAccess.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS);
		}
		return ownedSubprogramGroupAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeature> getOwnedAbstractFeature() {
		if (ownedAbstractFeature == null) {
			ownedAbstractFeature = new EObjectContainmentEList<AbstractFeature>(AbstractFeature.class, this, Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE);
		}
		return ownedAbstractFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
				return basicSetOwnedExtension(null, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
				return ((InternalEList<?>)getOwnedBusAccess()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
				return ((InternalEList<?>)getOwnedDataAccess()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
				return ((InternalEList<?>)getOwnedDataPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
				return ((InternalEList<?>)getOwnedEventDataPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
				return ((InternalEList<?>)getOwnedEventPort()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
				return ((InternalEList<?>)getOwnedFeatureGroup()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return ((InternalEList<?>)getOwnedSubprogramAccess()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return ((InternalEList<?>)getOwnedSubprogramGroupAccess()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
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
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE:
				return getOwnedFeature();
			case Aadl2Package.FEATURE_GROUP_TYPE__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
			case Aadl2Package.FEATURE_GROUP_TYPE__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
				return getOwnedExtension();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
				return getOwnedBusAccess();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
				return getOwnedDataAccess();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
				return getOwnedDataPort();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
				return getOwnedEventDataPort();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
				return getOwnedEventPort();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
				return getOwnedFeatureGroup();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
				return getOwnedParameter();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return getOwnedSubprogramAccess();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return getOwnedSubprogramGroupAccess();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
				return getOwnedAbstractFeature();
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
			case Aadl2Package.FEATURE_GROUP_TYPE__EXTENDED:
				setExtended((FeatureGroupType)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__INVERSE:
				setInverse((FeatureGroupType)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
				setOwnedExtension((GroupExtension)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
				getOwnedBusAccess().addAll((Collection<? extends BusAccess>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				getOwnedDataAccess().addAll((Collection<? extends DataAccess>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
				getOwnedDataPort().clear();
				getOwnedDataPort().addAll((Collection<? extends DataPort>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
				getOwnedEventDataPort().clear();
				getOwnedEventDataPort().addAll((Collection<? extends EventDataPort>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
				getOwnedEventPort().clear();
				getOwnedEventPort().addAll((Collection<? extends EventPort>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
				getOwnedFeatureGroup().clear();
				getOwnedFeatureGroup().addAll((Collection<? extends FeatureGroup>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				getOwnedSubprogramAccess().addAll((Collection<? extends SubprogramAccess>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				getOwnedSubprogramGroupAccess().clear();
				getOwnedSubprogramGroupAccess().addAll((Collection<? extends SubprogramGroupAccess>)newValue);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
				getOwnedAbstractFeature().clear();
				getOwnedAbstractFeature().addAll((Collection<? extends AbstractFeature>)newValue);
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
			case Aadl2Package.FEATURE_GROUP_TYPE__EXTENDED:
				setExtended((FeatureGroupType)null);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__INVERSE:
				setInverse((FeatureGroupType)null);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
				setOwnedExtension((GroupExtension)null);
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
				getOwnedBusAccess().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
				getOwnedDataAccess().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
				getOwnedDataPort().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
				getOwnedEventDataPort().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
				getOwnedEventPort().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
				getOwnedFeatureGroup().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				getOwnedSubprogramAccess().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				getOwnedSubprogramGroupAccess().clear();
				return;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
				getOwnedAbstractFeature().clear();
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
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__EXTENDED:
				return basicGetExtended() != null;
			case Aadl2Package.FEATURE_GROUP_TYPE__INVERSE:
				return inverse != null;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EXTENSION:
				return ownedExtension != null;
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_BUS_ACCESS:
				return ownedBusAccess != null && !ownedBusAccess.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_ACCESS:
				return ownedDataAccess != null && !ownedDataAccess.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_DATA_PORT:
				return ownedDataPort != null && !ownedDataPort.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_DATA_PORT:
				return ownedEventDataPort != null && !ownedEventDataPort.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_EVENT_PORT:
				return ownedEventPort != null && !ownedEventPort.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_FEATURE_GROUP:
				return ownedFeatureGroup != null && !ownedFeatureGroup.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_ACCESS:
				return ownedSubprogramAccess != null && !ownedSubprogramAccess.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
				return ownedSubprogramGroupAccess != null && !ownedSubprogramGroupAccess.isEmpty();
			case Aadl2Package.FEATURE_GROUP_TYPE__OWNED_ABSTRACT_FEATURE:
				return ownedAbstractFeature != null && !ownedAbstractFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureGroupTypeImpl
