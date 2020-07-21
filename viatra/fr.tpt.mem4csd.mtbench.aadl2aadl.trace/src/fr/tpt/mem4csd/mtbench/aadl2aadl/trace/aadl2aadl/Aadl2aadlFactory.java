/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage
 * @generated
 */
public interface Aadl2aadlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aadl2aadlFactory eINSTANCE = fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aadl2 Aadl Trace Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aadl2 Aadl Trace Spec</em>'.
	 * @generated
	 */
	Aadl2AadlTraceSpec createAadl2AadlTraceSpec();

	/**
	 * Returns a new object of class '<em>Aadl2 Aadl Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aadl2 Aadl Trace</em>'.
	 * @generated
	 */
	Aadl2AadlTrace createAadl2AadlTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Aadl2aadlPackage getAadl2aadlPackage();

} //Aadl2aadlFactory
