/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.trace.aadl2aadl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Aadl2aadlFactoryImpl extends EFactoryImpl implements Aadl2aadlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Aadl2aadlFactory init() {
		try {
			Aadl2aadlFactory theAadl2aadlFactory = (Aadl2aadlFactory)EPackage.Registry.INSTANCE.getEFactory(Aadl2aadlPackage.eNS_URI);
			if (theAadl2aadlFactory != null) {
				return theAadl2aadlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Aadl2aadlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aadl2aadlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Aadl2aadlPackage.AADL2_AADL_TRACE_SPEC: return createAadl2AadlTraceSpec();
			case Aadl2aadlPackage.AADL2_AADL_TRACE: return createAadl2AadlTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadl2AadlTraceSpec createAadl2AadlTraceSpec() {
		Aadl2AadlTraceSpecImpl aadl2AadlTraceSpec = new Aadl2AadlTraceSpecImpl();
		return aadl2AadlTraceSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadl2AadlTrace createAadl2AadlTrace() {
		Aadl2AadlTraceImpl aadl2AadlTrace = new Aadl2AadlTraceImpl();
		return aadl2AadlTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aadl2aadlPackage getAadl2aadlPackage() {
		return (Aadl2aadlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Aadl2aadlPackage getPackage() {
		return Aadl2aadlPackage.eINSTANCE;
	}

} //Aadl2aadlFactoryImpl
