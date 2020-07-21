/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTrace;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2AadlTraceSpec;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlFactory;
import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadl2aadlPackageImpl extends EPackageImpl implements Aadl2aadlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadl2AadlTraceSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadl2AadlTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.Aadl2aadlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Aadl2aadlPackageImpl() {
		super(eNS_URI, Aadl2aadlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Aadl2aadlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Aadl2aadlPackage init() {
		if (isInited) return (Aadl2aadlPackage)EPackage.Registry.INSTANCE.getEPackage(Aadl2aadlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAadl2aadlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Aadl2aadlPackageImpl theAadl2aadlPackage = registeredAadl2aadlPackage instanceof Aadl2aadlPackageImpl ? (Aadl2aadlPackageImpl)registeredAadl2aadlPackage : new Aadl2aadlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Aadl2Package.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAadl2aadlPackage.createPackageContents();

		// Initialize created meta-data
		theAadl2aadlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAadl2aadlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Aadl2aadlPackage.eNS_URI, theAadl2aadlPackage);
		return theAadl2aadlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadl2AadlTraceSpec() {
		return aadl2AadlTraceSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadl2AadlTraceSpec_LeftSystem() {
		return (EReference)aadl2AadlTraceSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadl2AadlTraceSpec_RightSystem() {
		return (EReference)aadl2AadlTraceSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadl2AadlTraceSpec_Traces() {
		return (EReference)aadl2AadlTraceSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAadl2AadlTrace() {
		return aadl2AadlTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadl2AadlTrace_LeftInstance() {
		return (EReference)aadl2AadlTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAadl2AadlTrace_RightInstance() {
		return (EReference)aadl2AadlTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadl2aadlFactory getAadl2aadlFactory() {
		return (Aadl2aadlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aadl2AadlTraceSpecEClass = createEClass(AADL2_AADL_TRACE_SPEC);
		createEReference(aadl2AadlTraceSpecEClass, AADL2_AADL_TRACE_SPEC__LEFT_SYSTEM);
		createEReference(aadl2AadlTraceSpecEClass, AADL2_AADL_TRACE_SPEC__RIGHT_SYSTEM);
		createEReference(aadl2AadlTraceSpecEClass, AADL2_AADL_TRACE_SPEC__TRACES);

		aadl2AadlTraceEClass = createEClass(AADL2_AADL_TRACE);
		createEReference(aadl2AadlTraceEClass, AADL2_AADL_TRACE__LEFT_INSTANCE);
		createEReference(aadl2AadlTraceEClass, AADL2_AADL_TRACE__RIGHT_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aadl2AadlTraceSpecEClass, Aadl2AadlTraceSpec.class, "Aadl2AadlTraceSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAadl2AadlTraceSpec_LeftSystem(), theInstancePackage.getSystemInstance(), null, "leftSystem", null, 0, 1, Aadl2AadlTraceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAadl2AadlTraceSpec_RightSystem(), theInstancePackage.getSystemInstance(), null, "rightSystem", null, 0, 1, Aadl2AadlTraceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAadl2AadlTraceSpec_Traces(), this.getAadl2AadlTrace(), null, "traces", null, 0, -1, Aadl2AadlTraceSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aadl2AadlTraceEClass, Aadl2AadlTrace.class, "Aadl2AadlTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAadl2AadlTrace_LeftInstance(), theInstancePackage.getInstanceObject(), null, "leftInstance", null, 0, -1, Aadl2AadlTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAadl2AadlTrace_RightInstance(), theInstancePackage.getInstanceObject(), null, "rightInstance", null, 0, -1, Aadl2AadlTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Aadl2aadlPackageImpl
