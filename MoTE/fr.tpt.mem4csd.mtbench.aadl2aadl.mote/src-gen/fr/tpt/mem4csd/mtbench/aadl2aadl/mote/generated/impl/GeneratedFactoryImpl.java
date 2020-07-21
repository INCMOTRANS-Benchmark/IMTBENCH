/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.*;

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
public class GeneratedFactoryImpl extends EFactoryImpl implements GeneratedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratedFactory init() {
		try {
			GeneratedFactory theGeneratedFactory = (GeneratedFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratedPackage.eNS_URI);
			if (theGeneratedFactory != null) {
				return theGeneratedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactoryImpl() {
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
		case GeneratedPackage.MOTE_OPERATIONAL_TGG:
			return createmoteOperationalTGG();
		case GeneratedPackage.MOTE_AXIOM:
			return createmoteAxiom();
		case GeneratedPackage.CONNECTION2CONNECTION:
			return createconnection2connection();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY:
			return createPortConnection2DataAccessSys00_ForFeatGroup_copy();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00:
			return createPortConnection2DataAccessSys00();
		case GeneratedPackage.COMPONENT2COMPONENT:
			return createcomponent2component();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS10:
			return createPortConnection2DataAccessSys10();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS01:
			return createPortConnection2DataAccessSys01();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP:
			return createPortConnection2DataAccessSys00_ForFeatGroup();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS:
			return createPortConnection2DataAccess();
		case GeneratedPackage.SUBCOMPONENT2SUBCOMPONENT:
			return createsubcomponent2subcomponent();
		case GeneratedPackage.CONNECTION2CONNECTION_SYS:
			return createconnection2connectionSys();
		case GeneratedPackage.SUBFEATURE2SUBFEATURE:
			return createsubfeature2subfeature();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11:
			return createPortConnection2DataAccessSys11();
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_DEVICE:
			return createconnection2connectionSysDevice();
		case GeneratedPackage.FEATURE2FEATURE:
			return createfeature2feature();
		case GeneratedPackage.CONNECTIONREF2CONNECTIONREF:
			return createconnectionref2connectionref();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS:
			return createPortConnection2DataAccessSys11Plus();
		case GeneratedPackage.MOTE_AXIOM_R0:
			return createmoteAxiom_r0();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11:
			return createPortConnection2DataAccessSys00_ForFeatGroup_r11();
		case GeneratedPackage.COMPONENT2COMPONENT_R1:
			return createcomponent2component_r1();
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_R9:
			return createconnection2connectionSys_r9();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_R4:
			return createPortConnection2DataAccess_r4();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12:
			return createPortConnection2DataAccessSys00_ForFeatGroup_copy_r12();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS01_R801:
			return createPortConnection2DataAccessSys01_r801();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS00_R800:
			return createPortConnection2DataAccessSys00_r800();
		case GeneratedPackage.SUBCOMPONENT2SUBCOMPONENT_R2:
			return createsubcomponent2subcomponent_r2();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P:
			return createPortConnection2DataAccessSys11Plus_r811p();
		case GeneratedPackage.FEATURE2FEATURE_R3:
			return createfeature2feature_r3();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS10_R810:
			return createPortConnection2DataAccessSys10_r810();
		case GeneratedPackage.CONNECTION2CONNECTION_SYS_DEVICE_R7:
			return createconnection2connectionSysDevice_r7();
		case GeneratedPackage.SUBFEATURE2SUBFEATURE_R10:
			return createsubfeature2subfeature_r10();
		case GeneratedPackage.PORT_CONNECTION2_DATA_ACCESS_SYS11_R811:
			return createPortConnection2DataAccessSys11_r811();
		case GeneratedPackage.CONNECTIONREF2CONNECTIONREF_R6:
			return createconnectionref2connectionref_r6();
		case GeneratedPackage.CONNECTION2CONNECTION_R5:
			return createconnection2connection_r5();
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
	public moteOperationalTGG createmoteOperationalTGG() {
		moteOperationalTGGImpl moteOperationalTGG = new moteOperationalTGGImpl();
		return moteOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public moteAxiom createmoteAxiom() {
		moteAxiomImpl moteAxiom = new moteAxiomImpl();
		return moteAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connection createconnection2connection() {
		connection2connectionImpl connection2connection = new connection2connectionImpl();
		return connection2connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00_ForFeatGroup_copy createPortConnection2DataAccessSys00_ForFeatGroup_copy() {
		PortConnection2DataAccessSys00_ForFeatGroup_copyImpl portConnection2DataAccessSys00_ForFeatGroup_copy = new PortConnection2DataAccessSys00_ForFeatGroup_copyImpl();
		return portConnection2DataAccessSys00_ForFeatGroup_copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00 createPortConnection2DataAccessSys00() {
		PortConnection2DataAccessSys00Impl portConnection2DataAccessSys00 = new PortConnection2DataAccessSys00Impl();
		return portConnection2DataAccessSys00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public component2component createcomponent2component() {
		component2componentImpl component2component = new component2componentImpl();
		return component2component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys10 createPortConnection2DataAccessSys10() {
		PortConnection2DataAccessSys10Impl portConnection2DataAccessSys10 = new PortConnection2DataAccessSys10Impl();
		return portConnection2DataAccessSys10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys01 createPortConnection2DataAccessSys01() {
		PortConnection2DataAccessSys01Impl portConnection2DataAccessSys01 = new PortConnection2DataAccessSys01Impl();
		return portConnection2DataAccessSys01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00_ForFeatGroup createPortConnection2DataAccessSys00_ForFeatGroup() {
		PortConnection2DataAccessSys00_ForFeatGroupImpl portConnection2DataAccessSys00_ForFeatGroup = new PortConnection2DataAccessSys00_ForFeatGroupImpl();
		return portConnection2DataAccessSys00_ForFeatGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccess createPortConnection2DataAccess() {
		PortConnection2DataAccessImpl portConnection2DataAccess = new PortConnection2DataAccessImpl();
		return portConnection2DataAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public subcomponent2subcomponent createsubcomponent2subcomponent() {
		subcomponent2subcomponentImpl subcomponent2subcomponent = new subcomponent2subcomponentImpl();
		return subcomponent2subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connectionSys createconnection2connectionSys() {
		connection2connectionSysImpl connection2connectionSys = new connection2connectionSysImpl();
		return connection2connectionSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public subfeature2subfeature createsubfeature2subfeature() {
		subfeature2subfeatureImpl subfeature2subfeature = new subfeature2subfeatureImpl();
		return subfeature2subfeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys11 createPortConnection2DataAccessSys11() {
		PortConnection2DataAccessSys11Impl portConnection2DataAccessSys11 = new PortConnection2DataAccessSys11Impl();
		return portConnection2DataAccessSys11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connectionSysDevice createconnection2connectionSysDevice() {
		connection2connectionSysDeviceImpl connection2connectionSysDevice = new connection2connectionSysDeviceImpl();
		return connection2connectionSysDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public feature2feature createfeature2feature() {
		feature2featureImpl feature2feature = new feature2featureImpl();
		return feature2feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connectionref2connectionref createconnectionref2connectionref() {
		connectionref2connectionrefImpl connectionref2connectionref = new connectionref2connectionrefImpl();
		return connectionref2connectionref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys11Plus createPortConnection2DataAccessSys11Plus() {
		PortConnection2DataAccessSys11PlusImpl portConnection2DataAccessSys11Plus = new PortConnection2DataAccessSys11PlusImpl();
		return portConnection2DataAccessSys11Plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public moteAxiom_r0 createmoteAxiom_r0() {
		moteAxiom_r0Impl moteAxiom_r0 = new moteAxiom_r0Impl();
		return moteAxiom_r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00_ForFeatGroup_r11 createPortConnection2DataAccessSys00_ForFeatGroup_r11() {
		PortConnection2DataAccessSys00_ForFeatGroup_r11Impl portConnection2DataAccessSys00_ForFeatGroup_r11 = new PortConnection2DataAccessSys00_ForFeatGroup_r11Impl();
		return portConnection2DataAccessSys00_ForFeatGroup_r11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public component2component_r1 createcomponent2component_r1() {
		component2component_r1Impl component2component_r1 = new component2component_r1Impl();
		return component2component_r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connectionSys_r9 createconnection2connectionSys_r9() {
		connection2connectionSys_r9Impl connection2connectionSys_r9 = new connection2connectionSys_r9Impl();
		return connection2connectionSys_r9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccess_r4 createPortConnection2DataAccess_r4() {
		PortConnection2DataAccess_r4Impl portConnection2DataAccess_r4 = new PortConnection2DataAccess_r4Impl();
		return portConnection2DataAccess_r4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 createPortConnection2DataAccessSys00_ForFeatGroup_copy_r12() {
		PortConnection2DataAccessSys00_ForFeatGroup_copy_r12Impl portConnection2DataAccessSys00_ForFeatGroup_copy_r12 = new PortConnection2DataAccessSys00_ForFeatGroup_copy_r12Impl();
		return portConnection2DataAccessSys00_ForFeatGroup_copy_r12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys01_r801 createPortConnection2DataAccessSys01_r801() {
		PortConnection2DataAccessSys01_r801Impl portConnection2DataAccessSys01_r801 = new PortConnection2DataAccessSys01_r801Impl();
		return portConnection2DataAccessSys01_r801;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys00_r800 createPortConnection2DataAccessSys00_r800() {
		PortConnection2DataAccessSys00_r800Impl portConnection2DataAccessSys00_r800 = new PortConnection2DataAccessSys00_r800Impl();
		return portConnection2DataAccessSys00_r800;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public subcomponent2subcomponent_r2 createsubcomponent2subcomponent_r2() {
		subcomponent2subcomponent_r2Impl subcomponent2subcomponent_r2 = new subcomponent2subcomponent_r2Impl();
		return subcomponent2subcomponent_r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys11Plus_r811p createPortConnection2DataAccessSys11Plus_r811p() {
		PortConnection2DataAccessSys11Plus_r811pImpl portConnection2DataAccessSys11Plus_r811p = new PortConnection2DataAccessSys11Plus_r811pImpl();
		return portConnection2DataAccessSys11Plus_r811p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public feature2feature_r3 createfeature2feature_r3() {
		feature2feature_r3Impl feature2feature_r3 = new feature2feature_r3Impl();
		return feature2feature_r3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys10_r810 createPortConnection2DataAccessSys10_r810() {
		PortConnection2DataAccessSys10_r810Impl portConnection2DataAccessSys10_r810 = new PortConnection2DataAccessSys10_r810Impl();
		return portConnection2DataAccessSys10_r810;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connectionSysDevice_r7 createconnection2connectionSysDevice_r7() {
		connection2connectionSysDevice_r7Impl connection2connectionSysDevice_r7 = new connection2connectionSysDevice_r7Impl();
		return connection2connectionSysDevice_r7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public subfeature2subfeature_r10 createsubfeature2subfeature_r10() {
		subfeature2subfeature_r10Impl subfeature2subfeature_r10 = new subfeature2subfeature_r10Impl();
		return subfeature2subfeature_r10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConnection2DataAccessSys11_r811 createPortConnection2DataAccessSys11_r811() {
		PortConnection2DataAccessSys11_r811Impl portConnection2DataAccessSys11_r811 = new PortConnection2DataAccessSys11_r811Impl();
		return portConnection2DataAccessSys11_r811;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connectionref2connectionref_r6 createconnectionref2connectionref_r6() {
		connectionref2connectionref_r6Impl connectionref2connectionref_r6 = new connectionref2connectionref_r6Impl();
		return connectionref2connectionref_r6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connection2connection_r5 createconnection2connection_r5() {
		connection2connection_r5Impl connection2connection_r5 = new connection2connection_r5Impl();
		return connection2connection_r5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneratedPackage getGeneratedPackage() {
		return (GeneratedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratedPackage getPackage() {
		return GeneratedPackage.eINSTANCE;
	}

} //GeneratedFactoryImpl
