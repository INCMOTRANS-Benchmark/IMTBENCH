/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.DirectionType;
import aadl2.FeaturePrototype;
import aadl2.FeaturePrototypeReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Prototype Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FeaturePrototypeReferenceImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeReferenceImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeReferenceImpl#isIn <em>In</em>}</li>
 *   <li>{@link aadl2.impl.FeaturePrototypeReferenceImpl#isOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturePrototypeReferenceImpl extends FeaturePrototypeActualImpl implements FeaturePrototypeReference {
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
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected FeaturePrototype prototype;

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
	protected FeaturePrototypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFeaturePrototypeReference();
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
	public FeaturePrototype getPrototype() {
		if (prototype != null && prototype.eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (FeaturePrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrototype(FeaturePrototype newPrototype) {
		FeaturePrototype oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE, oldPrototype, prototype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__IN, oldIn, in));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__DIRECTION:
				return getDirection();
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__IN:
				return isIn();
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__OUT:
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
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE:
				setPrototype((FeaturePrototype)newValue);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__IN:
				setIn((Boolean)newValue);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__OUT:
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
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE:
				setPrototype((FeaturePrototype)null);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__IN:
				setIn(IN_EDEFAULT);
				return;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__OUT:
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
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__PROTOTYPE:
				return prototype != null;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__IN:
				return in != IN_EDEFAULT;
			case Aadl2Package.FEATURE_PROTOTYPE_REFERENCE__OUT:
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

} //FeaturePrototypeReferenceImpl
