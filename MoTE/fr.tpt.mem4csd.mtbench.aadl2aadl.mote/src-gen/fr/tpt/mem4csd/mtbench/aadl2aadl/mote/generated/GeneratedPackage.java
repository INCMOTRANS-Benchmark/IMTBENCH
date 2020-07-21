/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.GeneratedFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generated";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://mem4csd.telecom-paristech.fr/mtbench.aadl2aadl/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mote.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteOperationalTGGImpl <em>mote Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteOperationalTGGImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getmoteOperationalTGG()
	 * @generated
	 */
	int MOTE_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>mote Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The number of operations of the '<em>mote Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteAxiomImpl <em>mote Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteAxiomImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getmoteAxiom()
	 * @generated
	 */
	int MOTE_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>mote Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>mote Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionImpl <em>connection2connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connection()
	 * @generated
	 */
	int CONNECTION2CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>connection2connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>connection2connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_copyImpl <em>Port Connection2 Data Access Sys00 For Feat Group copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_copyImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00_ForFeatGroup_copy()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00 For Feat Group copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00 For Feat Group copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00Impl <em>Port Connection2 Data Access Sys00</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00 = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.component2componentImpl <em>component2component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.component2componentImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getcomponent2component()
	 * @generated
	 */
	int COMPONENT2COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>component2component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>component2component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys10Impl <em>Port Connection2 Data Access Sys10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys10Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys10()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10 = 6;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys01Impl <em>Port Connection2 Data Access Sys01</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys01Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys01()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01 = 7;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys01</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys01</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroupImpl <em>Port Connection2 Data Access Sys00 For Feat Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroupImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00_ForFeatGroup()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00 For Feat Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00 For Feat Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessImpl <em>Port Connection2 Data Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccess()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS = 9;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subcomponent2subcomponentImpl <em>subcomponent2subcomponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subcomponent2subcomponentImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getsubcomponent2subcomponent()
	 * @generated
	 */
	int SUBCOMPONENT2SUBCOMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>subcomponent2subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>subcomponent2subcomponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysImpl <em>connection2connection Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connectionSys()
	 * @generated
	 */
	int CONNECTION2CONNECTION_SYS = 11;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>connection2connection Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>connection2connection Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subfeature2subfeatureImpl <em>subfeature2subfeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subfeature2subfeatureImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getsubfeature2subfeature()
	 * @generated
	 */
	int SUBFEATURE2SUBFEATURE = 12;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>subfeature2subfeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>subfeature2subfeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11Impl <em>Port Connection2 Data Access Sys11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys11()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11 = 13;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysDeviceImpl <em>connection2connection Sys Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysDeviceImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connectionSysDevice()
	 * @generated
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE = 14;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>connection2connection Sys Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>connection2connection Sys Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.feature2featureImpl <em>feature2feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.feature2featureImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getfeature2feature()
	 * @generated
	 */
	int FEATURE2FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>feature2feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>feature2feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connectionref2connectionrefImpl <em>connectionref2connectionref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connectionref2connectionrefImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnectionref2connectionref()
	 * @generated
	 */
	int CONNECTIONREF2CONNECTIONREF = 16;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>connectionref2connectionref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>connectionref2connectionref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11PlusImpl <em>Port Connection2 Data Access Sys11 Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11PlusImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys11Plus()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS = 17;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys11 Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys11 Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteAxiom_r0Impl <em>mote Axiom r0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.moteAxiom_r0Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getmoteAxiom_r0()
	 * @generated
	 */
	int MOTE_AXIOM_R0 = 18;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>mote Axiom r0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>mote Axiom r0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTE_AXIOM_R0_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_r11Impl <em>Port Connection2 Data Access Sys00 For Feat Group r11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_r11Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11 = 19;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00 For Feat Group r11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00 For Feat Group r11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_R11_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.component2component_r1Impl <em>component2component r1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.component2component_r1Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getcomponent2component_r1()
	 * @generated
	 */
	int COMPONENT2COMPONENT_R1 = 20;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>component2component r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>component2component r1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT2COMPONENT_R1_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSys_r9Impl <em>connection2connection Sys r9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSys_r9Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connectionSys_r9()
	 * @generated
	 */
	int CONNECTION2CONNECTION_SYS_R9 = 21;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>connection2connection Sys r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>connection2connection Sys r9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_R9_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccess_r4Impl <em>Port Connection2 Data Access r4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccess_r4Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccess_r4()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4 = 22;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access r4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_R4_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12Impl <em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12 = 23;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_FOR_FEAT_GROUP_COPY_R12_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys01_r801Impl <em>Port Connection2 Data Access Sys01 r801</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys01_r801Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801 = 24;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys01 r801</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys01 r801</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS01_R801_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_r800Impl <em>Port Connection2 Data Access Sys00 r800</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys00_r800Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800 = 25;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys00 r800</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys00 r800</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS00_R800_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subcomponent2subcomponent_r2Impl <em>subcomponent2subcomponent r2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subcomponent2subcomponent_r2Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2 = 26;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>subcomponent2subcomponent r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>subcomponent2subcomponent r2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCOMPONENT2SUBCOMPONENT_R2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11Plus_r811pImpl <em>Port Connection2 Data Access Sys11 Plus r811p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11Plus_r811pImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P = 27;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys11 Plus r811p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys11 Plus r811p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_PLUS_R811P_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.feature2feature_r3Impl <em>feature2feature r3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.feature2feature_r3Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getfeature2feature_r3()
	 * @generated
	 */
	int FEATURE2FEATURE_R3 = 28;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>feature2feature r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>feature2feature r3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE2FEATURE_R3_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys10_r810Impl <em>Port Connection2 Data Access Sys10 r810</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys10_r810Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810 = 29;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys10 r810</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys10 r810</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS10_R810_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysDevice_r7Impl <em>connection2connection Sys Device r7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connectionSysDevice_r7Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7 = 30;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>connection2connection Sys Device r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>connection2connection Sys Device r7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_SYS_DEVICE_R7_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subfeature2subfeature_r10Impl <em>subfeature2subfeature r10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.subfeature2subfeature_r10Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getsubfeature2subfeature_r10()
	 * @generated
	 */
	int SUBFEATURE2SUBFEATURE_R10 = 31;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>subfeature2subfeature r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>subfeature2subfeature r10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBFEATURE2SUBFEATURE_R10_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11_r811Impl <em>Port Connection2 Data Access Sys11 r811</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.PortConnection2DataAccessSys11_r811Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811 = 32;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>Port Connection2 Data Access Sys11 r811</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>Port Connection2 Data Access Sys11 r811</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONNECTION2_DATA_ACCESS_SYS11_R811_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connectionref2connectionref_r6Impl <em>connectionref2connectionref r6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connectionref2connectionref_r6Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnectionref2connectionref_r6()
	 * @generated
	 */
	int CONNECTIONREF2CONNECTIONREF_R6 = 33;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>connectionref2connectionref r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>connectionref2connectionref r6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONREF2CONNECTIONREF_R6_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connection_r5Impl <em>connection2connection r5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.connection2connection_r5Impl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl#getconnection2connection_r5()
	 * @generated
	 */
	int CONNECTION2CONNECTION_R5 = 34;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>connection2connection r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>connection2connection r5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION2CONNECTION_R5_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteOperationalTGG <em>mote Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mote Operational TGG</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteOperationalTGG
	 * @generated
	 */
	EClass getmoteOperationalTGG();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom <em>mote Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mote Axiom</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom
	 * @generated
	 */
	EClass getmoteAxiom();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection <em>connection2connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection
	 * @generated
	 */
	EClass getconnection2connection();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy <em>Port Connection2 Data Access Sys00 For Feat Group copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00 For Feat Group copy</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00_ForFeatGroup_copy();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00 <em>Port Connection2 Data Access Sys00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component <em>component2component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>component2component</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component
	 * @generated
	 */
	EClass getcomponent2component();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10 <em>Port Connection2 Data Access Sys10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys10</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys10();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01 <em>Port Connection2 Data Access Sys01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys01</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys01();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup <em>Port Connection2 Data Access Sys00 For Feat Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00 For Feat Group</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00_ForFeatGroup();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess <em>Port Connection2 Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess
	 * @generated
	 */
	EClass getPortConnection2DataAccess();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent <em>subcomponent2subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subcomponent2subcomponent</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent
	 * @generated
	 */
	EClass getsubcomponent2subcomponent();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys <em>connection2connection Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection Sys</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys
	 * @generated
	 */
	EClass getconnection2connectionSys();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature <em>subfeature2subfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subfeature2subfeature</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature
	 * @generated
	 */
	EClass getsubfeature2subfeature();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11 <em>Port Connection2 Data Access Sys11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys11</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys11();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice <em>connection2connection Sys Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection Sys Device</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice
	 * @generated
	 */
	EClass getconnection2connectionSysDevice();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature <em>feature2feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>feature2feature</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature
	 * @generated
	 */
	EClass getfeature2feature();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref <em>connectionref2connectionref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connectionref2connectionref</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref
	 * @generated
	 */
	EClass getconnectionref2connectionref();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus <em>Port Connection2 Data Access Sys11 Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys11 Plus</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys11Plus();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0 <em>mote Axiom r0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mote Axiom r0</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0
	 * @generated
	 */
	EClass getmoteAxiom_r0();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getAddElementActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getMoveElementActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getChangeAttributeActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformForwardActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformMappingActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getTransformBackwardActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getSynchronizeForwardActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#getSynchronizeBackwardActivity()
	 * @see #getmoteAxiom_r0()
	 * @generated
	 */
	EReference getmoteAxiom_r0_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.moteAxiom_r0#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getmoteAxiom_r0__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11 <em>Port Connection2 Data Access Sys00 For Feat Group r11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00 For Feat Group r11</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00_ForFeatGroup_r11();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_r11()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_r11_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_r11#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_r11__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1 <em>component2component r1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>component2component r1</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1
	 * @generated
	 */
	EClass getcomponent2component_r1();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getAddElementActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getMoveElementActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getChangeAttributeActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformForwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformMappingActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getTransformBackwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckForwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckMappingActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getConflictCheckBackwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getSynchronizeForwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getSynchronizeBackwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getRepairForwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#getRepairBackwardActivity()
	 * @see #getcomponent2component_r1()
	 * @generated
	 */
	EReference getcomponent2component_r1_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getcomponent2component_r1__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getcomponent2component_r1__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getcomponent2component_r1__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getcomponent2component_r1__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getcomponent2component_r1__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getcomponent2component_r1__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.component2component_r1#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getcomponent2component_r1__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9 <em>connection2connection Sys r9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection Sys r9</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9
	 * @generated
	 */
	EClass getconnection2connectionSys_r9();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getAddElementActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getMoveElementActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getChangeAttributeActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformForwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformMappingActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getTransformBackwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckForwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckMappingActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getConflictCheckBackwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getSynchronizeForwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getSynchronizeBackwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getRepairForwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#getRepairBackwardActivity()
	 * @see #getconnection2connectionSys_r9()
	 * @generated
	 */
	EReference getconnection2connectionSys_r9_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSys_r9#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSys_r9__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4 <em>Port Connection2 Data Access r4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access r4</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4
	 * @generated
	 */
	EClass getPortConnection2DataAccess_r4();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getAddElementActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getMoveElementActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccess_r4()
	 * @generated
	 */
	EReference getPortConnection2DataAccess_r4_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccess_r4#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccess_r4__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12 <em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00 For Feat Group copy r12</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_ForFeatGroup_copy_r12#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_ForFeatGroup_copy_r12__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801 <em>Port Connection2 Data Access Sys01 r801</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys01 r801</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys01_r801();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys01_r801()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys01_r801_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys01_r801#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys01_r801__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800 <em>Port Connection2 Data Access Sys00 r800</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys00 r800</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys00_r800();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys00_r800()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys00_r800_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys00_r800#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys00_r800__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2 <em>subcomponent2subcomponent r2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subcomponent2subcomponent r2</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2
	 * @generated
	 */
	EClass getsubcomponent2subcomponent_r2();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getAddElementActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getMoveElementActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getChangeAttributeActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformForwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformMappingActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getTransformBackwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckForwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckMappingActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getConflictCheckBackwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getSynchronizeForwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getSynchronizeBackwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getRepairForwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#getRepairBackwardActivity()
	 * @see #getsubcomponent2subcomponent_r2()
	 * @generated
	 */
	EReference getsubcomponent2subcomponent_r2_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subcomponent2subcomponent_r2#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubcomponent2subcomponent_r2__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p <em>Port Connection2 Data Access Sys11 Plus r811p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys11 Plus r811p</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys11Plus_r811p();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11Plus_r811p()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11Plus_r811p_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11Plus_r811p#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11Plus_r811p__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3 <em>feature2feature r3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>feature2feature r3</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3
	 * @generated
	 */
	EClass getfeature2feature_r3();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getAddElementActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getMoveElementActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getChangeAttributeActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformForwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformMappingActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getTransformBackwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckForwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckMappingActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getConflictCheckBackwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getSynchronizeForwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getSynchronizeBackwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getRepairForwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#getRepairBackwardActivity()
	 * @see #getfeature2feature_r3()
	 * @generated
	 */
	EReference getfeature2feature_r3_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getfeature2feature_r3__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getfeature2feature_r3__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getfeature2feature_r3__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getfeature2feature_r3__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getfeature2feature_r3__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getfeature2feature_r3__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.feature2feature_r3#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getfeature2feature_r3__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810 <em>Port Connection2 Data Access Sys10 r810</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys10 r810</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys10_r810();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys10_r810()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys10_r810_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys10_r810#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys10_r810__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7 <em>connection2connection Sys Device r7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection Sys Device r7</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7
	 * @generated
	 */
	EClass getconnection2connectionSysDevice_r7();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getAddElementActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getMoveElementActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getChangeAttributeActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformForwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformMappingActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getTransformBackwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckForwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckMappingActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getConflictCheckBackwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getSynchronizeForwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getSynchronizeBackwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getRepairForwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#getRepairBackwardActivity()
	 * @see #getconnection2connectionSysDevice_r7()
	 * @generated
	 */
	EReference getconnection2connectionSysDevice_r7_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connectionSysDevice_r7#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connectionSysDevice_r7__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10 <em>subfeature2subfeature r10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subfeature2subfeature r10</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10
	 * @generated
	 */
	EClass getsubfeature2subfeature_r10();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getAddElementActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getMoveElementActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getChangeAttributeActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformForwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformMappingActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getTransformBackwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckForwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckMappingActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getConflictCheckBackwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getSynchronizeForwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getSynchronizeBackwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getRepairForwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#getRepairBackwardActivity()
	 * @see #getsubfeature2subfeature_r10()
	 * @generated
	 */
	EReference getsubfeature2subfeature_r10_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.subfeature2subfeature_r10#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getsubfeature2subfeature_r10__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811 <em>Port Connection2 Data Access Sys11 r811</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Connection2 Data Access Sys11 r811</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811
	 * @generated
	 */
	EClass getPortConnection2DataAccessSys11_r811();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getAddElementActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getMoveElementActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getChangeAttributeActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformForwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformMappingActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getTransformBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckForwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckMappingActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getConflictCheckBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getSynchronizeForwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getSynchronizeBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getRepairForwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#getRepairBackwardActivity()
	 * @see #getPortConnection2DataAccessSys11_r811()
	 * @generated
	 */
	EReference getPortConnection2DataAccessSys11_r811_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.PortConnection2DataAccessSys11_r811#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getPortConnection2DataAccessSys11_r811__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6 <em>connectionref2connectionref r6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connectionref2connectionref r6</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6
	 * @generated
	 */
	EClass getconnectionref2connectionref_r6();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getAddElementActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getMoveElementActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getChangeAttributeActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformForwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformMappingActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getTransformBackwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckForwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckMappingActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getConflictCheckBackwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getSynchronizeForwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getSynchronizeBackwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getRepairForwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#getRepairBackwardActivity()
	 * @see #getconnectionref2connectionref_r6()
	 * @generated
	 */
	EReference getconnectionref2connectionref_r6_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connectionref2connectionref_r6#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnectionref2connectionref_r6__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5 <em>connection2connection r5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connection2connection r5</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5
	 * @generated
	 */
	EClass getconnection2connection_r5();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getAddElementActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getMoveElementActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getChangeAttributeActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformForwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformMappingActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getTransformBackwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckForwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckMappingActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getConflictCheckBackwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getSynchronizeForwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getSynchronizeBackwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getRepairForwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#getRepairBackwardActivity()
	 * @see #getconnection2connection_r5()
	 * @generated
	 */
	EReference getconnection2connection_r5_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connection_r5__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getconnection2connection_r5__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connection_r5__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connection_r5__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connection_r5__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getconnection2connection_r5__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.connection2connection_r5#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getconnection2connection_r5__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

} //GeneratedPackage
