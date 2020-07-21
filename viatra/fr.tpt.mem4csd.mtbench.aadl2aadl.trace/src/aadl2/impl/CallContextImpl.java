/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.CallContext;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CallContextImpl extends MinimalEObjectImpl.Container implements CallContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getCallContext();
	}

} //CallContextImpl
