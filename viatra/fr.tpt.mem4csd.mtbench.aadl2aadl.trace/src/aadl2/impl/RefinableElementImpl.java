/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.Classifier;
import aadl2.RefinableElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refinable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.RefinableElementImpl#getRefinementContext <em>Refinement Context</em>}</li>
 *   <li>{@link aadl2.impl.RefinableElementImpl#getRefinedElement <em>Refined Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RefinableElementImpl extends NamedElementImpl implements RefinableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getRefinableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getRefinementContext() {
		Classifier refinementContext = basicGetRefinementContext();
		return refinementContext != null && refinementContext.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)refinementContext) : refinementContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetRefinementContext() {
		// TODO: implement this method to return the 'Refinement Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinableElement getRefinedElement() {
		RefinableElement refinedElement = basicGetRefinedElement();
		return refinedElement != null && refinedElement.eIsProxy() ? (RefinableElement)eResolveProxy((InternalEObject)refinedElement) : refinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinableElement basicGetRefinedElement() {
		// TODO: implement this method to return the 'Refined Element' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.REFINABLE_ELEMENT__REFINEMENT_CONTEXT:
				if (resolve) return getRefinementContext();
				return basicGetRefinementContext();
			case Aadl2Package.REFINABLE_ELEMENT__REFINED_ELEMENT:
				if (resolve) return getRefinedElement();
				return basicGetRefinedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Aadl2Package.REFINABLE_ELEMENT__REFINEMENT_CONTEXT:
				return basicGetRefinementContext() != null;
			case Aadl2Package.REFINABLE_ELEMENT__REFINED_ELEMENT:
				return basicGetRefinedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinableElementImpl
