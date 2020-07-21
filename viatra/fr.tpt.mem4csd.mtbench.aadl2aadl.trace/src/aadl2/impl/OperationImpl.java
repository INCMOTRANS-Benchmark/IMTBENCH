/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Operation;
import aadl2.OperationKind;
import aadl2.PropertyExpression;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.OperationImpl#getOp <em>Op</em>}</li>
 *   <li>{@link aadl2.impl.OperationImpl#getOwnedPropertyExpression <em>Owned Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends PropertyExpressionImpl implements Operation {
	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final OperationKind OP_EDEFAULT = OperationKind.AND;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected OperationKind op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyExpression() <em>Owned Property Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyExpression> ownedPropertyExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationKind getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(OperationKind newOp) {
		OperationKind oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.OPERATION__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyExpression> getOwnedPropertyExpression() {
		if (ownedPropertyExpression == null) {
			ownedPropertyExpression = new EObjectContainmentEList<PropertyExpression>(PropertyExpression.class, this, Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION);
		}
		return ownedPropertyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION:
				return ((InternalEList<?>)getOwnedPropertyExpression()).basicRemove(otherEnd, msgs);
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
			case Aadl2Package.OPERATION__OP:
				return getOp();
			case Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION:
				return getOwnedPropertyExpression();
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
			case Aadl2Package.OPERATION__OP:
				setOp((OperationKind)newValue);
				return;
			case Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION:
				getOwnedPropertyExpression().clear();
				getOwnedPropertyExpression().addAll((Collection<? extends PropertyExpression>)newValue);
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
			case Aadl2Package.OPERATION__OP:
				setOp(OP_EDEFAULT);
				return;
			case Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION:
				getOwnedPropertyExpression().clear();
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
			case Aadl2Package.OPERATION__OP:
				return op != OP_EDEFAULT;
			case Aadl2Package.OPERATION__OWNED_PROPERTY_EXPRESSION:
				return ownedPropertyExpression != null && !ownedPropertyExpression.isEmpty();
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
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
