/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.CallContext;
import aadl2.CalledSubprogram;
import aadl2.SubprogramCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subprogram Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.SubprogramCallImpl#getCalledSubprogram <em>Called Subprogram</em>}</li>
 *   <li>{@link aadl2.impl.SubprogramCallImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprogramCallImpl extends BehavioralFeatureImpl implements SubprogramCall {
	/**
	 * The cached value of the '{@link #getCalledSubprogram() <em>Called Subprogram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledSubprogram()
	 * @generated
	 * @ordered
	 */
	protected CalledSubprogram calledSubprogram;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected CallContext context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprogramCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getSubprogramCall();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalledSubprogram getCalledSubprogram() {
		if (calledSubprogram != null && calledSubprogram.eIsProxy()) {
			InternalEObject oldCalledSubprogram = (InternalEObject)calledSubprogram;
			calledSubprogram = (CalledSubprogram)eResolveProxy(oldCalledSubprogram);
			if (calledSubprogram != oldCalledSubprogram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM, oldCalledSubprogram, calledSubprogram));
			}
		}
		return calledSubprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalledSubprogram basicGetCalledSubprogram() {
		return calledSubprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalledSubprogram(CalledSubprogram newCalledSubprogram) {
		CalledSubprogram oldCalledSubprogram = calledSubprogram;
		calledSubprogram = newCalledSubprogram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM, oldCalledSubprogram, calledSubprogram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (CallContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Aadl2Package.SUBPROGRAM_CALL__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(CallContext newContext) {
		CallContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.SUBPROGRAM_CALL__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM:
				if (resolve) return getCalledSubprogram();
				return basicGetCalledSubprogram();
			case Aadl2Package.SUBPROGRAM_CALL__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM:
				setCalledSubprogram((CalledSubprogram)newValue);
				return;
			case Aadl2Package.SUBPROGRAM_CALL__CONTEXT:
				setContext((CallContext)newValue);
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
			case Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM:
				setCalledSubprogram((CalledSubprogram)null);
				return;
			case Aadl2Package.SUBPROGRAM_CALL__CONTEXT:
				setContext((CallContext)null);
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
			case Aadl2Package.SUBPROGRAM_CALL__CALLED_SUBPROGRAM:
				return calledSubprogram != null;
			case Aadl2Package.SUBPROGRAM_CALL__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //SubprogramCallImpl
