/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AnnexLibrary;
import aadl2.DefaultAnnexLibrary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Annex Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DefaultAnnexLibraryImpl#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link aadl2.impl.DefaultAnnexLibraryImpl#getParsedAnnexLibrary <em>Parsed Annex Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultAnnexLibraryImpl extends AnnexLibraryImpl implements DefaultAnnexLibrary {
	/**
	 * The default value of the '{@link #getSourceText() <em>Source Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceText()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceText() <em>Source Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceText()
	 * @generated
	 * @ordered
	 */
	protected String sourceText = SOURCE_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParsedAnnexLibrary() <em>Parsed Annex Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedAnnexLibrary()
	 * @generated
	 * @ordered
	 */
	protected AnnexLibrary parsedAnnexLibrary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultAnnexLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDefaultAnnexLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceText() {
		return sourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceText(String newSourceText) {
		String oldSourceText = sourceText;
		sourceText = newSourceText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT, oldSourceText, sourceText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexLibrary getParsedAnnexLibrary() {
		return parsedAnnexLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsedAnnexLibrary(AnnexLibrary newParsedAnnexLibrary, NotificationChain msgs) {
		AnnexLibrary oldParsedAnnexLibrary = parsedAnnexLibrary;
		parsedAnnexLibrary = newParsedAnnexLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY, oldParsedAnnexLibrary, newParsedAnnexLibrary);
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
	public void setParsedAnnexLibrary(AnnexLibrary newParsedAnnexLibrary) {
		if (newParsedAnnexLibrary != parsedAnnexLibrary) {
			NotificationChain msgs = null;
			if (parsedAnnexLibrary != null)
				msgs = ((InternalEObject)parsedAnnexLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY, null, msgs);
			if (newParsedAnnexLibrary != null)
				msgs = ((InternalEObject)newParsedAnnexLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY, null, msgs);
			msgs = basicSetParsedAnnexLibrary(newParsedAnnexLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY, newParsedAnnexLibrary, newParsedAnnexLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY:
				return basicSetParsedAnnexLibrary(null, msgs);
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
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT:
				return getSourceText();
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY:
				return getParsedAnnexLibrary();
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
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT:
				setSourceText((String)newValue);
				return;
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY:
				setParsedAnnexLibrary((AnnexLibrary)newValue);
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
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT:
				setSourceText(SOURCE_TEXT_EDEFAULT);
				return;
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY:
				setParsedAnnexLibrary((AnnexLibrary)null);
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
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__SOURCE_TEXT:
				return SOURCE_TEXT_EDEFAULT == null ? sourceText != null : !SOURCE_TEXT_EDEFAULT.equals(sourceText);
			case Aadl2Package.DEFAULT_ANNEX_LIBRARY__PARSED_ANNEX_LIBRARY:
				return parsedAnnexLibrary != null;
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
		result.append(" (sourceText: ");
		result.append(sourceText);
		result.append(')');
		return result.toString();
	}

} //DefaultAnnexLibraryImpl
