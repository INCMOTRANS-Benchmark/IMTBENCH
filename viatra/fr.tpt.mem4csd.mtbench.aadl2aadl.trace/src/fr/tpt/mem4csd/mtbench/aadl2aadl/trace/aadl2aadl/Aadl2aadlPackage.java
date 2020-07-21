/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlFactory
 * @model kind="package"
 * @generated
 */
public interface Aadl2aadlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aadl2aadl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.tpt.mem4csd.mtbench.aadl2aadl.trace/aadl2aadl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aadl2aadl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Aadl2aadlPackage eINSTANCE = fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl <em>Aadl2 Aadl Trace Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlPackageImpl#getAadl2AadlTraceSpec()
	 * @generated
	 */
	int AADL2_AADL_TRACE_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Left System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Right System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_SPEC__TRACES = 2;

	/**
	 * The number of structural features of the '<em>Aadl2 Aadl Trace Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aadl2 Aadl Trace Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl <em>Aadl2 Aadl Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlPackageImpl#getAadl2AadlTrace()
	 * @generated
	 */
	int AADL2_AADL_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Left Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE__LEFT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Right Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE__RIGHT_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Aadl2 Aadl Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aadl2 Aadl Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL2_AADL_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec <em>Aadl2 Aadl Trace Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aadl2 Aadl Trace Spec</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec
	 * @generated
	 */
	EClass getAadl2AadlTraceSpec();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getLeftSystem <em>Left System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left System</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getLeftSystem()
	 * @see #getAadl2AadlTraceSpec()
	 * @generated
	 */
	EReference getAadl2AadlTraceSpec_LeftSystem();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getRightSystem <em>Right System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right System</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getRightSystem()
	 * @see #getAadl2AadlTraceSpec()
	 * @generated
	 */
	EReference getAadl2AadlTraceSpec_RightSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec#getTraces()
	 * @see #getAadl2AadlTraceSpec()
	 * @generated
	 */
	EReference getAadl2AadlTraceSpec_Traces();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace <em>Aadl2 Aadl Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aadl2 Aadl Trace</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace
	 * @generated
	 */
	EClass getAadl2AadlTrace();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getLeftInstance <em>Left Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Instance</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getLeftInstance()
	 * @see #getAadl2AadlTrace()
	 * @generated
	 */
	EReference getAadl2AadlTrace_LeftInstance();

	/**
	 * Returns the meta object for the reference list '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getRightInstance <em>Right Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Instance</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace#getRightInstance()
	 * @see #getAadl2AadlTrace()
	 * @generated
	 */
	EReference getAadl2AadlTrace_RightInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Aadl2aadlFactory getAadl2aadlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl <em>Aadl2 Aadl Trace Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceSpecImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlPackageImpl#getAadl2AadlTraceSpec()
		 * @generated
		 */
		EClass AADL2_AADL_TRACE_SPEC = eINSTANCE.getAadl2AadlTraceSpec();

		/**
		 * The meta object literal for the '<em><b>Left System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM = eINSTANCE.getAadl2AadlTraceSpec_LeftSystem();

		/**
		 * The meta object literal for the '<em><b>Right System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM = eINSTANCE.getAadl2AadlTraceSpec_RightSystem();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL2_AADL_TRACE_SPEC__TRACES = eINSTANCE.getAadl2AadlTraceSpec_Traces();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl <em>Aadl2 Aadl Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2AadlTraceImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl.Aadl2aadlPackageImpl#getAadl2AadlTrace()
		 * @generated
		 */
		EClass AADL2_AADL_TRACE = eINSTANCE.getAadl2AadlTrace();

		/**
		 * The meta object literal for the '<em><b>Left Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL2_AADL_TRACE__LEFT_INSTANCE = eINSTANCE.getAadl2AadlTrace_LeftInstance();

		/**
		 * The meta object literal for the '<em><b>Right Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL2_AADL_TRACE__RIGHT_INSTANCE = eINSTANCE.getAadl2AadlTrace_RightInstance();

	}

} //Aadl2aadlPackage
