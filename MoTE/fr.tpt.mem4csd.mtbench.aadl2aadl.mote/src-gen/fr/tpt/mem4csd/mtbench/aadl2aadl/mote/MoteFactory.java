/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage
 * @generated
 */
public interface MoteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoteFactory eINSTANCE = fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MoteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom</em>'.
	 * @generated
	 */
	CorrAxiom createCorrAxiom();

	/**
	 * Returns a new object of class '<em>Corr Component2 Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Component2 Component</em>'.
	 * @generated
	 */
	CorrComponent2Component createCorrComponent2Component();

	/**
	 * Returns a new object of class '<em>Corr Connection2 Data Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Connection2 Data Access</em>'.
	 * @generated
	 */
	CorrConnection2DataAccess createCorrConnection2DataAccess();

	/**
	 * Returns a new object of class '<em>Corr Ref2 Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Ref2 Ref</em>'.
	 * @generated
	 */
	CorrRef2Ref createCorrRef2Ref();

	/**
	 * Returns a new object of class '<em>Corr Conn2 Conn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Conn2 Conn</em>'.
	 * @generated
	 */
	CorrConn2Conn createCorrConn2Conn();

	/**
	 * Returns a new object of class '<em>Corr Connection2 Data Access Sys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Connection2 Data Access Sys</em>'.
	 * @generated
	 */
	CorrConnection2DataAccessSys createCorrConnection2DataAccessSys();

	/**
	 * Returns a new object of class '<em>Corr Feature2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Feature2 Feature</em>'.
	 * @generated
	 */
	CorrFeature2Feature createCorrFeature2Feature();

	/**
	 * Returns a new object of class '<em>Corr Ref2 Ref Other</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Ref2 Ref Other</em>'.
	 * @generated
	 */
	CorrRef2RefOther createCorrRef2RefOther();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MotePackage getMotePackage();

} //MoteFactory
