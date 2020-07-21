/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.*;

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
public class MoteFactoryImpl extends EFactoryImpl implements MoteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoteFactory init() {
		try {
			MoteFactory theMoteFactory = (MoteFactory) EPackage.Registry.INSTANCE.getEFactory(MotePackage.eNS_URI);
			if (theMoteFactory != null) {
				return theMoteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoteFactoryImpl() {
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
		case MotePackage.CORR_AXIOM:
			return createCorrAxiom();
		case MotePackage.CORR_COMPONENT2_COMPONENT:
			return createCorrComponent2Component();
		case MotePackage.CORR_CONNECTION2_DATA_ACCESS:
			return createCorrConnection2DataAccess();
		case MotePackage.CORR_REF2_REF:
			return createCorrRef2Ref();
		case MotePackage.CORR_CONN2_CONN:
			return createCorrConn2Conn();
		case MotePackage.CORR_CONNECTION2_DATA_ACCESS_SYS:
			return createCorrConnection2DataAccessSys();
		case MotePackage.CORR_FEATURE2_FEATURE:
			return createCorrFeature2Feature();
		case MotePackage.CORR_REF2_REF_OTHER:
			return createCorrRef2RefOther();
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
	public CorrAxiom createCorrAxiom() {
		CorrAxiomImpl corrAxiom = new CorrAxiomImpl();
		return corrAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrComponent2Component createCorrComponent2Component() {
		CorrComponent2ComponentImpl corrComponent2Component = new CorrComponent2ComponentImpl();
		return corrComponent2Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrConnection2DataAccess createCorrConnection2DataAccess() {
		CorrConnection2DataAccessImpl corrConnection2DataAccess = new CorrConnection2DataAccessImpl();
		return corrConnection2DataAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrRef2Ref createCorrRef2Ref() {
		CorrRef2RefImpl corrRef2Ref = new CorrRef2RefImpl();
		return corrRef2Ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrConn2Conn createCorrConn2Conn() {
		CorrConn2ConnImpl corrConn2Conn = new CorrConn2ConnImpl();
		return corrConn2Conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrConnection2DataAccessSys createCorrConnection2DataAccessSys() {
		CorrConnection2DataAccessSysImpl corrConnection2DataAccessSys = new CorrConnection2DataAccessSysImpl();
		return corrConnection2DataAccessSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrFeature2Feature createCorrFeature2Feature() {
		CorrFeature2FeatureImpl corrFeature2Feature = new CorrFeature2FeatureImpl();
		return corrFeature2Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorrRef2RefOther createCorrRef2RefOther() {
		CorrRef2RefOtherImpl corrRef2RefOther = new CorrRef2RefOtherImpl();
		return corrRef2RefOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MotePackage getMotePackage() {
		return (MotePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MotePackage getPackage() {
		return MotePackage.eINSTANCE;
	}

} //MoteFactoryImpl
