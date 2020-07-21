/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AnnexSubclause;
import aadl2.ModelUnit;
import aadl2.Property;
import aadl2.PropertyConstant;
import aadl2.PropertySet;
import aadl2.PropertyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PropertySetImpl#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 *   <li>{@link aadl2.impl.PropertySetImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link aadl2.impl.PropertySetImpl#getOwnedPropertyConstant <em>Owned Property Constant</em>}</li>
 *   <li>{@link aadl2.impl.PropertySetImpl#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link aadl2.impl.PropertySetImpl#getOwnedAnnexSubclause <em>Owned Annex Subclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertySetImpl extends NamespaceImpl implements PropertySet {
	/**
	 * The cached value of the '{@link #getOwnedPropertyType() <em>Owned Property Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyType()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType> ownedPropertyType;

	/**
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedProperty;

	/**
	 * The cached value of the '{@link #getOwnedPropertyConstant() <em>Owned Property Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyConstant> ownedPropertyConstant;

	/**
	 * The cached value of the '{@link #getImportedUnit() <em>Imported Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelUnit> importedUnit;

	/**
	 * The cached value of the '{@link #getOwnedAnnexSubclause() <em>Owned Annex Subclause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnexSubclause()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexSubclause> ownedAnnexSubclause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPropertySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyType> getOwnedPropertyType() {
		if (ownedPropertyType == null) {
			ownedPropertyType = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE);
		}
		return ownedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectContainmentEList<Property>(Property.class, this, Aadl2Package.PROPERTY_SET__OWNED_PROPERTY);
		}
		return ownedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyConstant> getOwnedPropertyConstant() {
		if (ownedPropertyConstant == null) {
			ownedPropertyConstant = new EObjectContainmentEList<PropertyConstant>(PropertyConstant.class, this, Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT);
		}
		return ownedPropertyConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelUnit> getImportedUnit() {
		if (importedUnit == null) {
			importedUnit = new EObjectResolvingEList<ModelUnit>(ModelUnit.class, this, Aadl2Package.PROPERTY_SET__IMPORTED_UNIT);
		}
		return importedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnexSubclause> getOwnedAnnexSubclause() {
		if (ownedAnnexSubclause == null) {
			ownedAnnexSubclause = new EObjectContainmentEList<AnnexSubclause>(AnnexSubclause.class, this, Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE);
		}
		return ownedAnnexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE:
				return ((InternalEList<?>)getOwnedPropertyType()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY:
				return ((InternalEList<?>)getOwnedProperty()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT:
				return ((InternalEList<?>)getOwnedPropertyConstant()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE:
				return ((InternalEList<?>)getOwnedAnnexSubclause()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE:
				return getOwnedPropertyType();
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY:
				return getOwnedProperty();
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT:
				return getOwnedPropertyConstant();
			case Aadl2Package.PROPERTY_SET__IMPORTED_UNIT:
				return getImportedUnit();
			case Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE:
				return getOwnedAnnexSubclause();
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
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE:
				getOwnedPropertyType().clear();
				getOwnedPropertyType().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT:
				getOwnedPropertyConstant().clear();
				getOwnedPropertyConstant().addAll((Collection<? extends PropertyConstant>)newValue);
				return;
			case Aadl2Package.PROPERTY_SET__IMPORTED_UNIT:
				getImportedUnit().clear();
				getImportedUnit().addAll((Collection<? extends ModelUnit>)newValue);
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE:
				getOwnedAnnexSubclause().clear();
				getOwnedAnnexSubclause().addAll((Collection<? extends AnnexSubclause>)newValue);
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
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE:
				getOwnedPropertyType().clear();
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT:
				getOwnedPropertyConstant().clear();
				return;
			case Aadl2Package.PROPERTY_SET__IMPORTED_UNIT:
				getImportedUnit().clear();
				return;
			case Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE:
				getOwnedAnnexSubclause().clear();
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
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_TYPE:
				return ownedPropertyType != null && !ownedPropertyType.isEmpty();
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY:
				return ownedProperty != null && !ownedProperty.isEmpty();
			case Aadl2Package.PROPERTY_SET__OWNED_PROPERTY_CONSTANT:
				return ownedPropertyConstant != null && !ownedPropertyConstant.isEmpty();
			case Aadl2Package.PROPERTY_SET__IMPORTED_UNIT:
				return importedUnit != null && !importedUnit.isEmpty();
			case Aadl2Package.PROPERTY_SET__OWNED_ANNEX_SUBCLAUSE:
				return ownedAnnexSubclause != null && !ownedAnnexSubclause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertySetImpl
