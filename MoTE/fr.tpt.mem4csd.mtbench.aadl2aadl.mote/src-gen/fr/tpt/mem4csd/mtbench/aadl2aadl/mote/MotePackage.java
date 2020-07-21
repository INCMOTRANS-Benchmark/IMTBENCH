/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MoteFactory
 * @model kind="package"
 * @generated
 */
public interface MotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://mem4csd.telecom-paristech.fr/mtbench.aadl2aadl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MotePackage eINSTANCE = fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrAxiomImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrAxiom()
	 * @generated
	 */
	int CORR_AXIOM = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_AXIOM_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrComponent2ComponentImpl <em>Corr Component2 Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrComponent2ComponentImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrComponent2Component()
	 * @generated
	 */
	int CORR_COMPONENT2_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Component2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Component2 Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_COMPONENT2_COMPONENT_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessImpl <em>Corr Connection2 Data Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConnection2DataAccess()
	 * @generated
	 */
	int CORR_CONNECTION2_DATA_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Connection2 Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Connection2 Data Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefImpl <em>Corr Ref2 Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrRef2Ref()
	 * @generated
	 */
	int CORR_REF2_REF = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Ref2 Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Ref2 Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConn2ConnImpl <em>Corr Conn2 Conn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConn2ConnImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConn2Conn()
	 * @generated
	 */
	int CORR_CONN2_CONN = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Conn2 Conn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Conn2 Conn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONN2_CONN_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessSysImpl <em>Corr Connection2 Data Access Sys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessSysImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConnection2DataAccessSys()
	 * @generated
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Connection2 Data Access Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Connection2 Data Access Sys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_CONNECTION2_DATA_ACCESS_SYS_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrFeature2FeatureImpl <em>Corr Feature2 Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrFeature2FeatureImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrFeature2Feature()
	 * @generated
	 */
	int CORR_FEATURE2_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Feature2 Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Feature2 Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE2_FEATURE_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefOtherImpl <em>Corr Ref2 Ref Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefOtherImpl
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrRef2RefOther()
	 * @generated
	 */
	int CORR_REF2_REF_OTHER = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The number of structural features of the '<em>Corr Ref2 Ref Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Corr Ref2 Ref Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_REF2_REF_OTHER_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Axiom</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrAxiom
	 * @generated
	 */
	EClass getCorrAxiom();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrComponent2Component <em>Corr Component2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Component2 Component</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrComponent2Component
	 * @generated
	 */
	EClass getCorrComponent2Component();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccess <em>Corr Connection2 Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Connection2 Data Access</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccess
	 * @generated
	 */
	EClass getCorrConnection2DataAccess();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2Ref <em>Corr Ref2 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Ref2 Ref</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2Ref
	 * @generated
	 */
	EClass getCorrRef2Ref();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConn2Conn <em>Corr Conn2 Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Conn2 Conn</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConn2Conn
	 * @generated
	 */
	EClass getCorrConn2Conn();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccessSys <em>Corr Connection2 Data Access Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Connection2 Data Access Sys</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccessSys
	 * @generated
	 */
	EClass getCorrConnection2DataAccessSys();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrFeature2Feature <em>Corr Feature2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Feature2 Feature</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrFeature2Feature
	 * @generated
	 */
	EClass getCorrFeature2Feature();

	/**
	 * Returns the meta object for class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2RefOther <em>Corr Ref2 Ref Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Ref2 Ref Other</em>'.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2RefOther
	 * @generated
	 */
	EClass getCorrRef2RefOther();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoteFactory getMoteFactory();

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
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrAxiomImpl <em>Corr Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrAxiomImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrAxiom()
		 * @generated
		 */
		EClass CORR_AXIOM = eINSTANCE.getCorrAxiom();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrComponent2ComponentImpl <em>Corr Component2 Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrComponent2ComponentImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrComponent2Component()
		 * @generated
		 */
		EClass CORR_COMPONENT2_COMPONENT = eINSTANCE.getCorrComponent2Component();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessImpl <em>Corr Connection2 Data Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConnection2DataAccess()
		 * @generated
		 */
		EClass CORR_CONNECTION2_DATA_ACCESS = eINSTANCE.getCorrConnection2DataAccess();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefImpl <em>Corr Ref2 Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrRef2Ref()
		 * @generated
		 */
		EClass CORR_REF2_REF = eINSTANCE.getCorrRef2Ref();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConn2ConnImpl <em>Corr Conn2 Conn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConn2ConnImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConn2Conn()
		 * @generated
		 */
		EClass CORR_CONN2_CONN = eINSTANCE.getCorrConn2Conn();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessSysImpl <em>Corr Connection2 Data Access Sys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrConnection2DataAccessSysImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrConnection2DataAccessSys()
		 * @generated
		 */
		EClass CORR_CONNECTION2_DATA_ACCESS_SYS = eINSTANCE.getCorrConnection2DataAccessSys();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrFeature2FeatureImpl <em>Corr Feature2 Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrFeature2FeatureImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrFeature2Feature()
		 * @generated
		 */
		EClass CORR_FEATURE2_FEATURE = eINSTANCE.getCorrFeature2Feature();

		/**
		 * The meta object literal for the '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefOtherImpl <em>Corr Ref2 Ref Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.CorrRef2RefOtherImpl
		 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl.MotePackageImpl#getCorrRef2RefOther()
		 * @generated
		 */
		EClass CORR_REF2_REF_OTHER = eINSTANCE.getCorrRef2RefOther();

	}

} //MotePackage
