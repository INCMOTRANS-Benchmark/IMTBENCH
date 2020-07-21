/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AadlPackage;
import aadl2.PrivatePackageSection;
import aadl2.PublicPackageSection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aadl Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.AadlPackageImpl#getOwnedPublicSection <em>Owned Public Section</em>}</li>
 *   <li>{@link aadl2.impl.AadlPackageImpl#getOwnedPrivateSection <em>Owned Private Section</em>}</li>
 *   <li>{@link aadl2.impl.AadlPackageImpl#getPublicSection <em>Public Section</em>}</li>
 *   <li>{@link aadl2.impl.AadlPackageImpl#getPrivateSection <em>Private Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AadlPackageImpl extends ModelUnitImpl implements AadlPackage {
	/**
	 * The cached value of the '{@link #getOwnedPublicSection() <em>Owned Public Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPublicSection()
	 * @generated
	 * @ordered
	 */
	protected PublicPackageSection ownedPublicSection;

	/**
	 * The cached value of the '{@link #getOwnedPrivateSection() <em>Owned Private Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPrivateSection()
	 * @generated
	 * @ordered
	 */
	protected PrivatePackageSection ownedPrivateSection;

	/**
	 * The cached value of the '{@link #getPublicSection() <em>Public Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicSection()
	 * @generated
	 * @ordered
	 */
	protected PublicPackageSection publicSection;

	/**
	 * The cached value of the '{@link #getPrivateSection() <em>Private Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateSection()
	 * @generated
	 * @ordered
	 */
	protected PrivatePackageSection privateSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AadlPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getAadlPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicPackageSection getOwnedPublicSection() {
		return ownedPublicSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPublicSection(PublicPackageSection newOwnedPublicSection, NotificationChain msgs) {
		PublicPackageSection oldOwnedPublicSection = ownedPublicSection;
		ownedPublicSection = newOwnedPublicSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION, oldOwnedPublicSection, newOwnedPublicSection);
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
	public void setOwnedPublicSection(PublicPackageSection newOwnedPublicSection) {
		if (newOwnedPublicSection != ownedPublicSection) {
			NotificationChain msgs = null;
			if (ownedPublicSection != null)
				msgs = ((InternalEObject)ownedPublicSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION, null, msgs);
			if (newOwnedPublicSection != null)
				msgs = ((InternalEObject)newOwnedPublicSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION, null, msgs);
			msgs = basicSetOwnedPublicSection(newOwnedPublicSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION, newOwnedPublicSection, newOwnedPublicSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePackageSection getOwnedPrivateSection() {
		return ownedPrivateSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPrivateSection(PrivatePackageSection newOwnedPrivateSection, NotificationChain msgs) {
		PrivatePackageSection oldOwnedPrivateSection = ownedPrivateSection;
		ownedPrivateSection = newOwnedPrivateSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION, oldOwnedPrivateSection, newOwnedPrivateSection);
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
	public void setOwnedPrivateSection(PrivatePackageSection newOwnedPrivateSection) {
		if (newOwnedPrivateSection != ownedPrivateSection) {
			NotificationChain msgs = null;
			if (ownedPrivateSection != null)
				msgs = ((InternalEObject)ownedPrivateSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION, null, msgs);
			if (newOwnedPrivateSection != null)
				msgs = ((InternalEObject)newOwnedPrivateSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION, null, msgs);
			msgs = basicSetOwnedPrivateSection(newOwnedPrivateSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION, newOwnedPrivateSection, newOwnedPrivateSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicPackageSection getPublicSection() {
		if (publicSection != null && publicSection.eIsProxy()) {
			InternalEObject oldPublicSection = (InternalEObject)publicSection;
			publicSection = (PublicPackageSection)eResolveProxy(oldPublicSection);
			if (publicSection != oldPublicSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION, oldPublicSection, publicSection));
			}
		}
		return publicSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPackageSection basicGetPublicSection() {
		return publicSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicSection(PublicPackageSection newPublicSection) {
		PublicPackageSection oldPublicSection = publicSection;
		publicSection = newPublicSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION, oldPublicSection, publicSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePackageSection getPrivateSection() {
		if (privateSection != null && privateSection.eIsProxy()) {
			InternalEObject oldPrivateSection = (InternalEObject)privateSection;
			privateSection = (PrivatePackageSection)eResolveProxy(oldPrivateSection);
			if (privateSection != oldPrivateSection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION, oldPrivateSection, privateSection));
			}
		}
		return privateSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePackageSection basicGetPrivateSection() {
		return privateSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivateSection(PrivatePackageSection newPrivateSection) {
		PrivatePackageSection oldPrivateSection = privateSection;
		privateSection = newPrivateSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION, oldPrivateSection, privateSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION:
				return basicSetOwnedPublicSection(null, msgs);
			case Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION:
				return basicSetOwnedPrivateSection(null, msgs);
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
			case Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION:
				return getOwnedPublicSection();
			case Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION:
				return getOwnedPrivateSection();
			case Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION:
				if (resolve) return getPublicSection();
				return basicGetPublicSection();
			case Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION:
				if (resolve) return getPrivateSection();
				return basicGetPrivateSection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION:
				setOwnedPublicSection((PublicPackageSection)newValue);
				return;
			case Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION:
				setOwnedPrivateSection((PrivatePackageSection)newValue);
				return;
			case Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION:
				setPublicSection((PublicPackageSection)newValue);
				return;
			case Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION:
				setPrivateSection((PrivatePackageSection)newValue);
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
			case Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION:
				setOwnedPublicSection((PublicPackageSection)null);
				return;
			case Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION:
				setOwnedPrivateSection((PrivatePackageSection)null);
				return;
			case Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION:
				setPublicSection((PublicPackageSection)null);
				return;
			case Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION:
				setPrivateSection((PrivatePackageSection)null);
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
			case Aadl2Package.AADL_PACKAGE__OWNED_PUBLIC_SECTION:
				return ownedPublicSection != null;
			case Aadl2Package.AADL_PACKAGE__OWNED_PRIVATE_SECTION:
				return ownedPrivateSection != null;
			case Aadl2Package.AADL_PACKAGE__PUBLIC_SECTION:
				return publicSection != null;
			case Aadl2Package.AADL_PACKAGE__PRIVATE_SECTION:
				return privateSection != null;
		}
		return super.eIsSet(featureID);
	}

} //AadlPackageImpl
