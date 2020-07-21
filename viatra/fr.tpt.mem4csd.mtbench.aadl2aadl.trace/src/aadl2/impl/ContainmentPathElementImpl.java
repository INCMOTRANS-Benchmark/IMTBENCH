/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ArrayRange;
import aadl2.ContainmentPathElement;
import aadl2.NamedElement;

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
 * An implementation of the model object '<em><b>Containment Path Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ContainmentPathElementImpl#getArrayRange <em>Array Range</em>}</li>
 *   <li>{@link aadl2.impl.ContainmentPathElementImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link aadl2.impl.ContainmentPathElementImpl#getAnnexName <em>Annex Name</em>}</li>
 *   <li>{@link aadl2.impl.ContainmentPathElementImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainmentPathElementImpl extends ElementImpl implements ContainmentPathElement {
	/**
	 * The cached value of the '{@link #getArrayRange() <em>Array Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayRange()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayRange> arrayRange;

	/**
	 * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement namedElement;

	/**
	 * The default value of the '{@link #getAnnexName() <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnexName() <em>Annex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnexName()
	 * @generated
	 * @ordered
	 */
	protected String annexName = ANNEX_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected ContainmentPathElement path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentPathElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getContainmentPathElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayRange> getArrayRange() {
		if (arrayRange == null) {
			arrayRange = new EObjectContainmentEList<ArrayRange>(ArrayRange.class, this, Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE);
		}
		return arrayRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getNamedElement() {
		if (namedElement != null && namedElement.eIsProxy()) {
			InternalEObject oldNamedElement = (InternalEObject)namedElement;
			namedElement = (NamedElement)eResolveProxy(oldNamedElement);
			if (namedElement != oldNamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT, oldNamedElement, namedElement));
			}
		}
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetNamedElement() {
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamedElement(NamedElement newNamedElement) {
		NamedElement oldNamedElement = namedElement;
		namedElement = newNamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT, oldNamedElement, namedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnnexName() {
		return annexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnexName(String newAnnexName) {
		String oldAnnexName = annexName;
		annexName = newAnnexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CONTAINMENT_PATH_ELEMENT__ANNEX_NAME, oldAnnexName, annexName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainmentPathElement getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(ContainmentPathElement newPath, NotificationChain msgs) {
		ContainmentPathElement oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH, oldPath, newPath);
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
	public void setPath(ContainmentPathElement newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
				return ((InternalEList<?>)getArrayRange()).basicRemove(otherEnd, msgs);
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH:
				return basicSetPath(null, msgs);
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
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
				return getArrayRange();
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
				if (resolve) return getNamedElement();
				return basicGetNamedElement();
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ANNEX_NAME:
				return getAnnexName();
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH:
				return getPath();
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
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
				getArrayRange().clear();
				getArrayRange().addAll((Collection<? extends ArrayRange>)newValue);
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
				setNamedElement((NamedElement)newValue);
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ANNEX_NAME:
				setAnnexName((String)newValue);
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH:
				setPath((ContainmentPathElement)newValue);
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
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
				getArrayRange().clear();
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
				setNamedElement((NamedElement)null);
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ANNEX_NAME:
				setAnnexName(ANNEX_NAME_EDEFAULT);
				return;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH:
				setPath((ContainmentPathElement)null);
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
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ARRAY_RANGE:
				return arrayRange != null && !arrayRange.isEmpty();
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__NAMED_ELEMENT:
				return namedElement != null;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__ANNEX_NAME:
				return ANNEX_NAME_EDEFAULT == null ? annexName != null : !ANNEX_NAME_EDEFAULT.equals(annexName);
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT__PATH:
				return path != null;
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
		result.append(" (annexName: ");
		result.append(annexName);
		result.append(')');
		return result.toString();
	}

} //ContainmentPathElementImpl
