/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Classifier;
import aadl2.ClassifierFeature;
import aadl2.Flow;
import aadl2.FlowEnd;
import aadl2.FlowImplementation;
import aadl2.FlowKind;
import aadl2.FlowSegment;
import aadl2.FlowSpecification;

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
 * An implementation of the model object '<em><b>Flow Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getOwnedFlowSegment <em>Owned Flow Segment</em>}</li>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getInEnd <em>In End</em>}</li>
 *   <li>{@link aadl2.impl.FlowImplementationImpl#getOutEnd <em>Out End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImplementationImpl extends ModalPathImpl implements FlowImplementation {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FlowKind KIND_EDEFAULT = FlowKind.SOURCE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FlowKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected FlowSpecification specification;

	/**
	 * The cached value of the '{@link #getOwnedFlowSegment() <em>Owned Flow Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlowSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSegment> ownedFlowSegment;

	/**
	 * The cached value of the '{@link #getInEnd() <em>In End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEnd()
	 * @generated
	 * @ordered
	 */
	protected FlowEnd inEnd;

	/**
	 * The cached value of the '{@link #getOutEnd() <em>Out End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEnd()
	 * @generated
	 * @ordered
	 */
	protected FlowEnd outEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getFlowImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getFeaturingClassifier() {
		// TODO: implement this method to return the 'Featuring Classifier' reference list
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
	public FlowKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(FlowKind newKind) {
		FlowKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowSpecification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (FlowSpecification)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSpecification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecification(FlowSpecification newSpecification) {
		FlowSpecification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowSegment> getOwnedFlowSegment() {
		if (ownedFlowSegment == null) {
			ownedFlowSegment = new EObjectContainmentEList<FlowSegment>(FlowSegment.class, this, Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT);
		}
		return ownedFlowSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowEnd getInEnd() {
		return inEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInEnd(FlowEnd newInEnd, NotificationChain msgs) {
		FlowEnd oldInEnd = inEnd;
		inEnd = newInEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__IN_END, oldInEnd, newInEnd);
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
	public void setInEnd(FlowEnd newInEnd) {
		if (newInEnd != inEnd) {
			NotificationChain msgs = null;
			if (inEnd != null)
				msgs = ((InternalEObject)inEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_IMPLEMENTATION__IN_END, null, msgs);
			if (newInEnd != null)
				msgs = ((InternalEObject)newInEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_IMPLEMENTATION__IN_END, null, msgs);
			msgs = basicSetInEnd(newInEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__IN_END, newInEnd, newInEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowEnd getOutEnd() {
		return outEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutEnd(FlowEnd newOutEnd, NotificationChain msgs) {
		FlowEnd oldOutEnd = outEnd;
		outEnd = newOutEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__OUT_END, oldOutEnd, newOutEnd);
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
	public void setOutEnd(FlowEnd newOutEnd) {
		if (newOutEnd != outEnd) {
			NotificationChain msgs = null;
			if (outEnd != null)
				msgs = ((InternalEObject)outEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_IMPLEMENTATION__OUT_END, null, msgs);
			if (newOutEnd != null)
				msgs = ((InternalEObject)newOutEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.FLOW_IMPLEMENTATION__OUT_END, null, msgs);
			msgs = basicSetOutEnd(newOutEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.FLOW_IMPLEMENTATION__OUT_END, newOutEnd, newOutEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT:
				return ((InternalEList<?>)getOwnedFlowSegment()).basicRemove(otherEnd, msgs);
			case Aadl2Package.FLOW_IMPLEMENTATION__IN_END:
				return basicSetInEnd(null, msgs);
			case Aadl2Package.FLOW_IMPLEMENTATION__OUT_END:
				return basicSetOutEnd(null, msgs);
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
			case Aadl2Package.FLOW_IMPLEMENTATION__FEATURING_CLASSIFIER:
				return getFeaturingClassifier();
			case Aadl2Package.FLOW_IMPLEMENTATION__KIND:
				return getKind();
			case Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT:
				return getOwnedFlowSegment();
			case Aadl2Package.FLOW_IMPLEMENTATION__IN_END:
				return getInEnd();
			case Aadl2Package.FLOW_IMPLEMENTATION__OUT_END:
				return getOutEnd();
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
			case Aadl2Package.FLOW_IMPLEMENTATION__KIND:
				setKind((FlowKind)newValue);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION:
				setSpecification((FlowSpecification)newValue);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT:
				getOwnedFlowSegment().clear();
				getOwnedFlowSegment().addAll((Collection<? extends FlowSegment>)newValue);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__IN_END:
				setInEnd((FlowEnd)newValue);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__OUT_END:
				setOutEnd((FlowEnd)newValue);
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
			case Aadl2Package.FLOW_IMPLEMENTATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION:
				setSpecification((FlowSpecification)null);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT:
				getOwnedFlowSegment().clear();
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__IN_END:
				setInEnd((FlowEnd)null);
				return;
			case Aadl2Package.FLOW_IMPLEMENTATION__OUT_END:
				setOutEnd((FlowEnd)null);
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
			case Aadl2Package.FLOW_IMPLEMENTATION__FEATURING_CLASSIFIER:
				return !getFeaturingClassifier().isEmpty();
			case Aadl2Package.FLOW_IMPLEMENTATION__KIND:
				return kind != KIND_EDEFAULT;
			case Aadl2Package.FLOW_IMPLEMENTATION__SPECIFICATION:
				return specification != null;
			case Aadl2Package.FLOW_IMPLEMENTATION__OWNED_FLOW_SEGMENT:
				return ownedFlowSegment != null && !ownedFlowSegment.isEmpty();
			case Aadl2Package.FLOW_IMPLEMENTATION__IN_END:
				return inEnd != null;
			case Aadl2Package.FLOW_IMPLEMENTATION__OUT_END:
				return outEnd != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ClassifierFeature.class) {
			switch (derivedFeatureID) {
				case Aadl2Package.FLOW_IMPLEMENTATION__FEATURING_CLASSIFIER: return Aadl2Package.CLASSIFIER_FEATURE__FEATURING_CLASSIFIER;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ClassifierFeature.class) {
			switch (baseFeatureID) {
				case Aadl2Package.CLASSIFIER_FEATURE__FEATURING_CLASSIFIER: return Aadl2Package.FLOW_IMPLEMENTATION__FEATURING_CLASSIFIER;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //FlowImplementationImpl
