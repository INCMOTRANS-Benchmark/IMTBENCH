/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.ComponentClassifier;
import aadl2.DirectionType;
import aadl2.FeaturePrototype;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeaturePrototypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeImpl#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeImpl#isIn <em>In</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeImpl#isOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePrototypeImpl extends PrototypeImpl implements FeaturePrototype {
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
	 * The cached value of the '{@link #getConstrainingClassifier() <em>Constraining Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingClassifier()
	 * @generated
	 * @ordered
	 */
	protected ComponentClassifier constrainingClassifier;

	/**
	 * The default value of the '{@link #isIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIn()
	 * @generated
	 * @ordered
	 */
	protected boolean in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOut()
	 * @generated
	 * @ordered
	 */
	protected boolean out = OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeaturePrototype();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType getDirection() {
		// TODO: implement this method to return the 'Direction' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentClassifier getConstrainingClassifier() {
		if (constrainingClassifier != null && constrainingClassifier.eIsProxy()) {
			InternalEObject oldConstrainingClassifier = (InternalEObject)constrainingClassifier;
			constrainingClassifier = (ComponentClassifier)eResolveProxy(oldConstrainingClassifier);
			if (constrainingClassifier != oldConstrainingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER, oldConstrainingClassifier, constrainingClassifier));
			}
		}
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentClassifier basicGetConstrainingClassifier() {
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstrainingClassifier(ComponentClassifier newConstrainingClassifier) {
		ComponentClassifier oldConstrainingClassifier = constrainingClassifier;
		constrainingClassifier = newConstrainingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER, oldConstrainingClassifier, constrainingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIn(boolean newIn) {
		boolean oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOut(boolean newOut) {
		boolean oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.FEATURE_PROTOTYPE__DIRECTION:
				return getDirection();
			case Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				if (resolve) return getConstrainingClassifier();
				return basicGetConstrainingClassifier();
			case Aadl2Package.FEATURE_PROTOTYPE__IN:
				return isIn();
			case Aadl2Package.FEATURE_PROTOTYPE__OUT:
				return isOut();
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
			case Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				setConstrainingClassifier((ComponentClassifier)newValue);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE__IN:
				setIn((Boolean)newValue);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE__OUT:
				setOut((Boolean)newValue);
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
			case Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				setConstrainingClassifier((ComponentClassifier)null);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE__IN:
				setIn(IN_EDEFAULT);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE__OUT:
				setOut(OUT_EDEFAULT);
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
			case Aadl2Package.FEATURE_PROTOTYPE__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
			case Aadl2Package.FEATURE_PROTOTYPE__CONSTRAINING_CLASSIFIER:
				return constrainingClassifier != null;
			case Aadl2Package.FEATURE_PROTOTYPE__IN:
				return in != IN_EDEFAULT;
			case Aadl2Package.FEATURE_PROTOTYPE__OUT:
				return out != OUT_EDEFAULT;
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
		result.append(" (in: ");
		result.append(in);
		result.append(", out: ");
		result.append(out);
		result.append(')');
		return result.toString();
	}

} //FeaturePrototypeImpl
