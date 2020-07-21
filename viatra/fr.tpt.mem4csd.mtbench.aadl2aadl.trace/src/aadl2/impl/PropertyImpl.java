/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Classifier;
import aadl2.MetaclassReference;
import aadl2.Property;
import aadl2.PropertyExpression;
import aadl2.PropertyOwner;

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
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PropertyImpl#isInherit <em>Inherit</em>}</li>
 *   <li>{@link aadl2.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link aadl2.impl.PropertyImpl#getAppliesToMetaclass <em>Applies To Metaclass</em>}</li>
 *   <li>{@link aadl2.impl.PropertyImpl#getAppliesToClassifier <em>Applies To Classifier</em>}</li>
 *   <li>{@link aadl2.impl.PropertyImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link aadl2.impl.PropertyImpl#isEmptyListDefault <em>Empty List Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends BasicPropertyImpl implements Property {
	/**
	 * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected boolean inherit = INHERIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyExpression defaultValue;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyOwner> appliesTo;

	/**
	 * The default value of the '{@link #isEmptyListDefault() <em>Empty List Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmptyListDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPTY_LIST_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmptyListDefault() <em>Empty List Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmptyListDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean emptyListDefault = EMPTY_LIST_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInherit() {
		return inherit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherit(boolean newInherit) {
		boolean oldInherit = inherit;
		inherit = newInherit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY__INHERIT, oldInherit, inherit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyExpression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(PropertyExpression newDefaultValue, NotificationChain msgs) {
		PropertyExpression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
	public void setDefaultValue(PropertyExpression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.PROPERTY__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaclassReference> getAppliesToMetaclass() {
		// TODO: implement this method to return the 'Applies To Metaclass' reference list
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
	public EList<Classifier> getAppliesToClassifier() {
		// TODO: implement this method to return the 'Applies To Classifier' reference list
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
	public EList<PropertyOwner> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectContainmentEList<PropertyOwner>(PropertyOwner.class, this, Aadl2Package.PROPERTY__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmptyListDefault() {
		return emptyListDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyListDefault(boolean newEmptyListDefault) {
		boolean oldEmptyListDefault = emptyListDefault;
		emptyListDefault = newEmptyListDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PROPERTY__EMPTY_LIST_DEFAULT, oldEmptyListDefault, emptyListDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.PROPERTY__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case Aadl2Package.PROPERTY__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTo()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.PROPERTY__INHERIT:
				return isInherit();
			case Aadl2Package.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case Aadl2Package.PROPERTY__APPLIES_TO_METACLASS:
				return getAppliesToMetaclass();
			case Aadl2Package.PROPERTY__APPLIES_TO_CLASSIFIER:
				return getAppliesToClassifier();
			case Aadl2Package.PROPERTY__APPLIES_TO:
				return getAppliesTo();
			case Aadl2Package.PROPERTY__EMPTY_LIST_DEFAULT:
				return isEmptyListDefault();
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
			case Aadl2Package.PROPERTY__INHERIT:
				setInherit((Boolean)newValue);
				return;
			case Aadl2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((PropertyExpression)newValue);
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO_METACLASS:
				getAppliesToMetaclass().clear();
				getAppliesToMetaclass().addAll((Collection<? extends MetaclassReference>)newValue);
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO_CLASSIFIER:
				getAppliesToClassifier().clear();
				getAppliesToClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends PropertyOwner>)newValue);
				return;
			case Aadl2Package.PROPERTY__EMPTY_LIST_DEFAULT:
				setEmptyListDefault((Boolean)newValue);
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
			case Aadl2Package.PROPERTY__INHERIT:
				setInherit(INHERIT_EDEFAULT);
				return;
			case Aadl2Package.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((PropertyExpression)null);
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO_METACLASS:
				getAppliesToMetaclass().clear();
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO_CLASSIFIER:
				getAppliesToClassifier().clear();
				return;
			case Aadl2Package.PROPERTY__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case Aadl2Package.PROPERTY__EMPTY_LIST_DEFAULT:
				setEmptyListDefault(EMPTY_LIST_DEFAULT_EDEFAULT);
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
			case Aadl2Package.PROPERTY__INHERIT:
				return inherit != INHERIT_EDEFAULT;
			case Aadl2Package.PROPERTY__DEFAULT_VALUE:
				return defaultValue != null;
			case Aadl2Package.PROPERTY__APPLIES_TO_METACLASS:
				return !getAppliesToMetaclass().isEmpty();
			case Aadl2Package.PROPERTY__APPLIES_TO_CLASSIFIER:
				return !getAppliesToClassifier().isEmpty();
			case Aadl2Package.PROPERTY__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case Aadl2Package.PROPERTY__EMPTY_LIST_DEFAULT:
				return emptyListDefault != EMPTY_LIST_DEFAULT_EDEFAULT;
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
		result.append(" (inherit: ");
		result.append(inherit);
		result.append(", emptyListDefault: ");
		result.append(emptyListDefault);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
