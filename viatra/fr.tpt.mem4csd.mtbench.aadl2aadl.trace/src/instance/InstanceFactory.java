/**
 */
package instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = instance.impl.InstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Instance</em>'.
	 * @generated
	 */
	FeatureInstance createFeatureInstance();

	/**
	 * Returns a new object of class '<em>Property Association Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Association Instance</em>'.
	 * @generated
	 */
	PropertyAssociationInstance createPropertyAssociationInstance();

	/**
	 * Returns a new object of class '<em>Connection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Instance</em>'.
	 * @generated
	 */
	ConnectionInstance createConnectionInstance();

	/**
	 * Returns a new object of class '<em>System Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Operation Mode</em>'.
	 * @generated
	 */
	SystemOperationMode createSystemOperationMode();

	/**
	 * Returns a new object of class '<em>Mode Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Instance</em>'.
	 * @generated
	 */
	ModeInstance createModeInstance();

	/**
	 * Returns a new object of class '<em>Mode Transition Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition Instance</em>'.
	 * @generated
	 */
	ModeTransitionInstance createModeTransitionInstance();

	/**
	 * Returns a new object of class '<em>Connection Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Reference</em>'.
	 * @generated
	 */
	ConnectionReference createConnectionReference();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Flow Specification Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Specification Instance</em>'.
	 * @generated
	 */
	FlowSpecificationInstance createFlowSpecificationInstance();

	/**
	 * Returns a new object of class '<em>End To End Flow Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End To End Flow Instance</em>'.
	 * @generated
	 */
	EndToEndFlowInstance createEndToEndFlowInstance();

	/**
	 * Returns a new object of class '<em>System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Instance</em>'.
	 * @generated
	 */
	SystemInstance createSystemInstance();

	/**
	 * Returns a new object of class '<em>Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Value</em>'.
	 * @generated
	 */
	InstanceReferenceValue createInstanceReferenceValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancePackage getInstancePackage();

} //InstanceFactory
