/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.osate.aadl2.instance.InstanceObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aadl2 Aadl Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl#getLeftInstance <em>Left Instance</em>}</li>
 *   <li>{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl#getRightInstance <em>Right Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Aadl2AadlTraceImpl extends MinimalEObjectImpl.Container implements Aadl2AadlTrace {
	/**
	 * The cached value of the '{@link #getLeftInstance() <em>Left Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceObject> leftInstance;

	/**
	 * The cached value of the '{@link #getRightInstance() <em>Right Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceObject> rightInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aadl2AadlTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2aadlPackage.Literals.AADL2_AADL_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceObject> getLeftInstance() {
		if (leftInstance == null) {
			leftInstance = new EObjectResolvingEList<InstanceObject>(InstanceObject.class, this, Aadl2aadlPackage.AADL2_AADL_TRACE__LEFT_INSTANCE);
		}
		return leftInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceObject> getRightInstance() {
		if (rightInstance == null) {
			rightInstance = new EObjectResolvingEList<InstanceObject>(InstanceObject.class, this, Aadl2aadlPackage.AADL2_AADL_TRACE__RIGHT_INSTANCE);
		}
		return rightInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2aadlPackage.AADL2_AADL_TRACE__LEFT_INSTANCE:
				return getLeftInstance();
			case Aadl2aadlPackage.AADL2_AADL_TRACE__RIGHT_INSTANCE:
				return getRightInstance();
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE__LEFT_INSTANCE:
				getLeftInstance().clear();
				getLeftInstance().addAll((Collection<? extends InstanceObject>)newValue);
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE__RIGHT_INSTANCE:
				getRightInstance().clear();
				getRightInstance().addAll((Collection<? extends InstanceObject>)newValue);
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE__LEFT_INSTANCE:
				getLeftInstance().clear();
				return;
			case Aadl2aadlPackage.AADL2_AADL_TRACE__RIGHT_INSTANCE:
				getRightInstance().clear();
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
			case Aadl2aadlPackage.AADL2_AADL_TRACE__LEFT_INSTANCE:
				return leftInstance != null && !leftInstance.isEmpty();
			case Aadl2aadlPackage.AADL2_AADL_TRACE__RIGHT_INSTANCE:
				return rightInstance != null && !rightInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Aadl2AadlTraceImpl
