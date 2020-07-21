/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AnnexSubclause;
import aadl2.DefaultAnnexSubclause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Annex Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.DefaultAnnexSubclauseImpl#getSourceText <em>Source Text</em>}</li>
 *   <li>{@link aadl2.impl.DefaultAnnexSubclauseImpl#getParsedAnnexSubclause <em>Parsed Annex Subclause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultAnnexSubclauseImpl extends AnnexSubclauseImpl implements DefaultAnnexSubclause {
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
	 * The cached value of the '{@link #getParsedAnnexSubclause() <em>Parsed Annex Subclause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedAnnexSubclause()
	 * @generated
	 * @ordered
	 */
	protected AnnexSubclause parsedAnnexSubclause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultAnnexSubclauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getDefaultAnnexSubclause();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT, oldSourceText, sourceText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnexSubclause getParsedAnnexSubclause() {
		return parsedAnnexSubclause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParsedAnnexSubclause(AnnexSubclause newParsedAnnexSubclause, NotificationChain msgs) {
		AnnexSubclause oldParsedAnnexSubclause = parsedAnnexSubclause;
		parsedAnnexSubclause = newParsedAnnexSubclause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE, oldParsedAnnexSubclause, newParsedAnnexSubclause);
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
	public void setParsedAnnexSubclause(AnnexSubclause newParsedAnnexSubclause) {
		if (newParsedAnnexSubclause != parsedAnnexSubclause) {
			NotificationChain msgs = null;
			if (parsedAnnexSubclause != null)
				msgs = ((InternalEObject)parsedAnnexSubclause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE, null, msgs);
			if (newParsedAnnexSubclause != null)
				msgs = ((InternalEObject)newParsedAnnexSubclause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE, null, msgs);
			msgs = basicSetParsedAnnexSubclause(newParsedAnnexSubclause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE, newParsedAnnexSubclause, newParsedAnnexSubclause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE:
				return basicSetParsedAnnexSubclause(null, msgs);
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
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT:
				return getSourceText();
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE:
				return getParsedAnnexSubclause();
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
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT:
				setSourceText((String)newValue);
				return;
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE:
				setParsedAnnexSubclause((AnnexSubclause)newValue);
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
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT:
				setSourceText(SOURCE_TEXT_EDEFAULT);
				return;
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE:
				setParsedAnnexSubclause((AnnexSubclause)null);
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
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__SOURCE_TEXT:
				return SOURCE_TEXT_EDEFAULT == null ? sourceText != null : !SOURCE_TEXT_EDEFAULT.equals(sourceText);
			case Aadl2Package.DEFAULT_ANNEX_SUBCLAUSE__PARSED_ANNEX_SUBCLAUSE:
				return parsedAnnexSubclause != null;
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

} //DefaultAnnexSubclauseImpl
