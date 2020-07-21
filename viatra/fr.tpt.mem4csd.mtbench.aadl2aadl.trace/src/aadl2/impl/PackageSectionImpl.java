/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AnnexLibrary;
import aadl2.Classifier;
import aadl2.ComponentTypeRename;
import aadl2.FeatureGroupTypeRename;
import aadl2.ModelUnit;
import aadl2.PackageRename;
import aadl2.PackageSection;

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
 * An implementation of the model object '<em><b>Package Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getOwnedPackageRename <em>Owned Package Rename</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getOwnedComponentTypeRename <em>Owned Component Type Rename</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getOwnedClassifier <em>Owned Classifier</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getOwnedFeatureGroupTypeRename <em>Owned Feature Group Type Rename</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getOwnedAnnexLibrary <em>Owned Annex Library</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#isNoAnnexes <em>No Annexes</em>}</li>
 *   <li>{@link aadl2.impl.PackageSectionImpl#isNoProperties <em>No Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PackageSectionImpl extends NamespaceImpl implements PackageSection {
	/**
	 * The cached value of the '{@link #getOwnedPackageRename() <em>Owned Package Rename</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackageRename()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRename> ownedPackageRename;

	/**
	 * The cached value of the '{@link #getOwnedComponentTypeRename() <em>Owned Component Type Rename</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentTypeRename()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentTypeRename> ownedComponentTypeRename;

	/**
	 * The cached value of the '{@link #getOwnedClassifier() <em>Owned Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> ownedClassifier;

	/**
	 * The cached value of the '{@link #getOwnedFeatureGroupTypeRename() <em>Owned Feature Group Type Rename</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureGroupTypeRename()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroupTypeRename> ownedFeatureGroupTypeRename;

	/**
	 * The cached value of the '{@link #getOwnedAnnexLibrary() <em>Owned Annex Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnexLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnexLibrary> ownedAnnexLibrary;

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
	 * The default value of the '{@link #isNoAnnexes() <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAnnexes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_ANNEXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoAnnexes() <em>No Annexes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoAnnexes()
	 * @generated
	 * @ordered
	 */
	protected boolean noAnnexes = NO_ANNEXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoProperties() <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoProperties() <em>No Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean noProperties = NO_PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getPackageSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageRename> getOwnedPackageRename() {
		if (ownedPackageRename == null) {
			ownedPackageRename = new EObjectContainmentEList<PackageRename>(PackageRename.class, this, Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME);
		}
		return ownedPackageRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentTypeRename> getOwnedComponentTypeRename() {
		if (ownedComponentTypeRename == null) {
			ownedComponentTypeRename = new EObjectContainmentEList<ComponentTypeRename>(ComponentTypeRename.class, this, Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME);
		}
		return ownedComponentTypeRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getOwnedClassifier() {
		if (ownedClassifier == null) {
			ownedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER);
		}
		return ownedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureGroupTypeRename> getOwnedFeatureGroupTypeRename() {
		if (ownedFeatureGroupTypeRename == null) {
			ownedFeatureGroupTypeRename = new EObjectContainmentEList<FeatureGroupTypeRename>(FeatureGroupTypeRename.class, this, Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME);
		}
		return ownedFeatureGroupTypeRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnexLibrary> getOwnedAnnexLibrary() {
		if (ownedAnnexLibrary == null) {
			ownedAnnexLibrary = new EObjectContainmentEList<AnnexLibrary>(AnnexLibrary.class, this, Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY);
		}
		return ownedAnnexLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelUnit> getImportedUnit() {
		if (importedUnit == null) {
			importedUnit = new EObjectResolvingEList<ModelUnit>(ModelUnit.class, this, Aadl2Package.PACKAGE_SECTION__IMPORTED_UNIT);
		}
		return importedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoAnnexes() {
		return noAnnexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoAnnexes(boolean newNoAnnexes) {
		boolean oldNoAnnexes = noAnnexes;
		noAnnexes = newNoAnnexes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PACKAGE_SECTION__NO_ANNEXES, oldNoAnnexes, noAnnexes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoProperties() {
		return noProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoProperties(boolean newNoProperties) {
		boolean oldNoProperties = noProperties;
		noProperties = newNoProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES, oldNoProperties, noProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
				return ((InternalEList<?>)getOwnedPackageRename()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
				return ((InternalEList<?>)getOwnedComponentTypeRename()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
				return ((InternalEList<?>)getOwnedClassifier()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
				return ((InternalEList<?>)getOwnedFeatureGroupTypeRename()).basicRemove(otherEnd, msgs);
			case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
				return ((InternalEList<?>)getOwnedAnnexLibrary()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
				return getOwnedPackageRename();
			case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
				return getOwnedComponentTypeRename();
			case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
				return getOwnedClassifier();
			case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
				return getOwnedFeatureGroupTypeRename();
			case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
				return getOwnedAnnexLibrary();
			case Aadl2Package.PACKAGE_SECTION__IMPORTED_UNIT:
				return getImportedUnit();
			case Aadl2Package.PACKAGE_SECTION__NO_ANNEXES:
				return isNoAnnexes();
			case Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES:
				return isNoProperties();
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
			case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
				getOwnedPackageRename().clear();
				getOwnedPackageRename().addAll((Collection<? extends PackageRename>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
				getOwnedComponentTypeRename().clear();
				getOwnedComponentTypeRename().addAll((Collection<? extends ComponentTypeRename>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
				getOwnedClassifier().clear();
				getOwnedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
				getOwnedFeatureGroupTypeRename().clear();
				getOwnedFeatureGroupTypeRename().addAll((Collection<? extends FeatureGroupTypeRename>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
				getOwnedAnnexLibrary().clear();
				getOwnedAnnexLibrary().addAll((Collection<? extends AnnexLibrary>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__IMPORTED_UNIT:
				getImportedUnit().clear();
				getImportedUnit().addAll((Collection<? extends ModelUnit>)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__NO_ANNEXES:
				setNoAnnexes((Boolean)newValue);
				return;
			case Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES:
				setNoProperties((Boolean)newValue);
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
			case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
				getOwnedPackageRename().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
				getOwnedComponentTypeRename().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
				getOwnedClassifier().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
				getOwnedFeatureGroupTypeRename().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
				getOwnedAnnexLibrary().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__IMPORTED_UNIT:
				getImportedUnit().clear();
				return;
			case Aadl2Package.PACKAGE_SECTION__NO_ANNEXES:
				setNoAnnexes(NO_ANNEXES_EDEFAULT);
				return;
			case Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES:
				setNoProperties(NO_PROPERTIES_EDEFAULT);
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
			case Aadl2Package.PACKAGE_SECTION__OWNED_PACKAGE_RENAME:
				return ownedPackageRename != null && !ownedPackageRename.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__OWNED_COMPONENT_TYPE_RENAME:
				return ownedComponentTypeRename != null && !ownedComponentTypeRename.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__OWNED_CLASSIFIER:
				return ownedClassifier != null && !ownedClassifier.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__OWNED_FEATURE_GROUP_TYPE_RENAME:
				return ownedFeatureGroupTypeRename != null && !ownedFeatureGroupTypeRename.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__OWNED_ANNEX_LIBRARY:
				return ownedAnnexLibrary != null && !ownedAnnexLibrary.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__IMPORTED_UNIT:
				return importedUnit != null && !importedUnit.isEmpty();
			case Aadl2Package.PACKAGE_SECTION__NO_ANNEXES:
				return noAnnexes != NO_ANNEXES_EDEFAULT;
			case Aadl2Package.PACKAGE_SECTION__NO_PROPERTIES:
				return noProperties != NO_PROPERTIES_EDEFAULT;
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
		result.append(" (noAnnexes: ");
		result.append(noAnnexes);
		result.append(", noProperties: ");
		result.append(noProperties);
		result.append(')');
		return result.toString();
	}

} //PackageSectionImpl
