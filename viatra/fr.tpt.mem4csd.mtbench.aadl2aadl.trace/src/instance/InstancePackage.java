/**
 */
package instance;

import aadl2.Aadl2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see instance.InstanceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='aadl2Instance'"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://aadl.info/AADL/2.0/instance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link instance.impl.InstanceObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.InstanceObjectImpl
	 * @see instance.impl.InstancePackageImpl#getInstanceObject()
	 * @generated
	 */
	int INSTANCE_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT__ANNEX_INSTANCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT___GET_OWNER = Aadl2Package.NAMED_ELEMENT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT___GET_NAMESPACE = Aadl2Package.NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT___QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT___GET_PROPERTY_VALUES__STRING_STRING = Aadl2Package.NAMED_ELEMENT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJECT_OPERATION_COUNT = Aadl2Package.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ConnectionInstanceEndImpl <em>Connection Instance End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ConnectionInstanceEndImpl
	 * @see instance.impl.InstancePackageImpl#getConnectionInstanceEnd()
	 * @generated
	 */
	int CONNECTION_INSTANCE_END = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__OWNED_ELEMENT = INSTANCE_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__OWNED_COMMENT = INSTANCE_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__QUALIFIED_NAME = INSTANCE_OBJECT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__OWNED_PROPERTY_ASSOCIATION = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__ANNEX_INSTANCE = INSTANCE_OBJECT__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection Instance End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END___GET_OWNER = INSTANCE_OBJECT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END___GET_NAMESPACE = INSTANCE_OBJECT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END___QUALIFIED_NAME = INSTANCE_OBJECT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END___GET_PROPERTY_VALUES__STRING_STRING = INSTANCE_OBJECT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Connection Instance End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_END_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.FeatureInstanceImpl <em>Feature Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.FeatureInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getFeatureInstance()
	 * @generated
	 */
	int FEATURE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OWNED_ELEMENT = CONNECTION_INSTANCE_END__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OWNED_COMMENT = CONNECTION_INSTANCE_END__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__NAME = CONNECTION_INSTANCE_END__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__QUALIFIED_NAME = CONNECTION_INSTANCE_END__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__OWNED_PROPERTY_ASSOCIATION = CONNECTION_INSTANCE_END__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__ANNEX_INSTANCE = CONNECTION_INSTANCE_END__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__SRC_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__DST_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Flow Spec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__SRC_FLOW_SPEC = CONNECTION_INSTANCE_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dst Flow Spec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__DST_FLOW_SPEC = CONNECTION_INSTANCE_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__FEATURE_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__CATEGORY = CONNECTION_INSTANCE_END_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__DIRECTION = CONNECTION_INSTANCE_END_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__FEATURE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE__INDEX = CONNECTION_INSTANCE_END_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE_FEATURE_COUNT = CONNECTION_INSTANCE_END_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE___GET_OWNER = CONNECTION_INSTANCE_END___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE___GET_NAMESPACE = CONNECTION_INSTANCE_END___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE___QUALIFIED_NAME = CONNECTION_INSTANCE_END___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = CONNECTION_INSTANCE_END___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Feature Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_INSTANCE_OPERATION_COUNT = CONNECTION_INSTANCE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.AnnexInstanceImpl <em>Annex Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.AnnexInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getAnnexInstance()
	 * @generated
	 */
	int ANNEX_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Subclause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE__ANNEX_SUBCLAUSE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annex Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE___GET_OWNER = Aadl2Package.NAMED_ELEMENT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE___GET_NAMESPACE = Aadl2Package.NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE___QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = Aadl2Package.NAMED_ELEMENT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Annex Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNEX_INSTANCE_OPERATION_COUNT = Aadl2Package.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.PropertyAssociationInstanceImpl <em>Property Association Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.PropertyAssociationInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getPropertyAssociationInstance()
	 * @generated
	 */
	int PROPERTY_ASSOCIATION_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__OWNED_ELEMENT = Aadl2Package.PROPERTY_ASSOCIATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__OWNED_COMMENT = Aadl2Package.PROPERTY_ASSOCIATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__PROPERTY = Aadl2Package.PROPERTY_ASSOCIATION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__APPLIES_TO = Aadl2Package.PROPERTY_ASSOCIATION__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>In Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__IN_BINDING = Aadl2Package.PROPERTY_ASSOCIATION__IN_BINDING;

	/**
	 * The feature id for the '<em><b>Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__APPEND = Aadl2Package.PROPERTY_ASSOCIATION__APPEND;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__CONSTANT = Aadl2Package.PROPERTY_ASSOCIATION__CONSTANT;

	/**
	 * The feature id for the '<em><b>Owned Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__OWNED_VALUE = Aadl2Package.PROPERTY_ASSOCIATION__OWNED_VALUE;

	/**
	 * The feature id for the '<em><b>Property Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION = Aadl2Package.PROPERTY_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE_FEATURE_COUNT = Aadl2Package.PROPERTY_ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE___GET_OWNER = Aadl2Package.PROPERTY_ASSOCIATION___GET_OWNER;

	/**
	 * The number of operations of the '<em>Property Association Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ASSOCIATION_INSTANCE_OPERATION_COUNT = Aadl2Package.PROPERTY_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.FlowElementInstanceImpl <em>Flow Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.FlowElementInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getFlowElementInstance()
	 * @generated
	 */
	int FLOW_ELEMENT_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__OWNED_ELEMENT = INSTANCE_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__OWNED_COMMENT = INSTANCE_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__QUALIFIED_NAME = INSTANCE_OBJECT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE__ANNEX_INSTANCE = INSTANCE_OBJECT__ANNEX_INSTANCE;

	/**
	 * The number of structural features of the '<em>Flow Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE___GET_OWNER = INSTANCE_OBJECT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE___GET_NAMESPACE = INSTANCE_OBJECT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE___QUALIFIED_NAME = INSTANCE_OBJECT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = INSTANCE_OBJECT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Flow Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ConnectionInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getConnectionInstance()
	 * @generated
	 */
	int CONNECTION_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__OWNED_ELEMENT = FLOW_ELEMENT_INSTANCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__OWNED_COMMENT = FLOW_ELEMENT_INSTANCE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__NAME = FLOW_ELEMENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__OWNED_PROPERTY_ASSOCIATION = FLOW_ELEMENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__ANNEX_INSTANCE = FLOW_ELEMENT_INSTANCE__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>In System Operation Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Mode Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__IN_MODE_TRANSITION = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__COMPLETE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__KIND = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__DESTINATION = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__CONNECTION_REFERENCE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__BIDIRECTIONAL = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__SOURCE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_FEATURE_COUNT = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE___GET_OWNER = FLOW_ELEMENT_INSTANCE___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE___GET_NAMESPACE = FLOW_ELEMENT_INSTANCE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE___QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = FLOW_ELEMENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_OPERATION_COUNT = FLOW_ELEMENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.SystemOperationModeImpl <em>System Operation Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.SystemOperationModeImpl
	 * @see instance.impl.InstancePackageImpl#getSystemOperationMode()
	 * @generated
	 */
	int SYSTEM_OPERATION_MODE = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__OWNED_ELEMENT = Aadl2Package.MODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__OWNED_COMMENT = Aadl2Package.MODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__NAME = Aadl2Package.MODE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__QUALIFIED_NAME = Aadl2Package.MODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.MODE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__FEATURING_CLASSIFIER = Aadl2Package.MODE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__INITIAL = Aadl2Package.MODE__INITIAL;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__DERIVED = Aadl2Package.MODE__DERIVED;

	/**
	 * The feature id for the '<em><b>Current Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE__CURRENT_MODE = Aadl2Package.MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE_FEATURE_COUNT = Aadl2Package.MODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE___GET_OWNER = Aadl2Package.MODE___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE___GET_NAMESPACE = Aadl2Package.MODE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE___QUALIFIED_NAME = Aadl2Package.MODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE___GET_PROPERTY_VALUES__STRING_STRING = Aadl2Package.MODE___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>System Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_MODE_OPERATION_COUNT = Aadl2Package.MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ModeInstanceImpl <em>Mode Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ModeInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getModeInstance()
	 * @generated
	 */
	int MODE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__OWNED_ELEMENT = INSTANCE_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__OWNED_COMMENT = INSTANCE_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__QUALIFIED_NAME = INSTANCE_OBJECT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__OWNED_PROPERTY_ASSOCIATION = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__ANNEX_INSTANCE = INSTANCE_OBJECT__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Mode Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__SRC_MODE_TRANSITION = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dst Mode Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__DST_MODE_TRANSITION = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__INITIAL = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__MODE = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__DERIVED = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE__PARENT = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mode Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE___GET_OWNER = INSTANCE_OBJECT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE___GET_NAMESPACE = INSTANCE_OBJECT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE___QUALIFIED_NAME = INSTANCE_OBJECT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = INSTANCE_OBJECT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Mode Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_INSTANCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ModeTransitionInstanceImpl <em>Mode Transition Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ModeTransitionInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getModeTransitionInstance()
	 * @generated
	 */
	int MODE_TRANSITION_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__OWNED_ELEMENT = CONNECTION_INSTANCE_END__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__OWNED_COMMENT = CONNECTION_INSTANCE_END__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__NAME = CONNECTION_INSTANCE_END__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__QUALIFIED_NAME = CONNECTION_INSTANCE_END__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__OWNED_PROPERTY_ASSOCIATION = CONNECTION_INSTANCE_END__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__ANNEX_INSTANCE = CONNECTION_INSTANCE_END__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__SRC_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__DST_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__DESTINATION = CONNECTION_INSTANCE_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__MODE_TRANSITION = CONNECTION_INSTANCE_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__TRIGGER = CONNECTION_INSTANCE_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE__SOURCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mode Transition Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE_FEATURE_COUNT = CONNECTION_INSTANCE_END_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE___GET_OWNER = CONNECTION_INSTANCE_END___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE___GET_NAMESPACE = CONNECTION_INSTANCE_END___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE___QUALIFIED_NAME = CONNECTION_INSTANCE_END___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = CONNECTION_INSTANCE_END___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Mode Transition Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_INSTANCE_OPERATION_COUNT = CONNECTION_INSTANCE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ConnectionReferenceImpl <em>Connection Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ConnectionReferenceImpl
	 * @see instance.impl.InstancePackageImpl#getConnectionReference()
	 * @generated
	 */
	int CONNECTION_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__OWNED_ELEMENT = INSTANCE_OBJECT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__OWNED_COMMENT = INSTANCE_OBJECT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__NAME = INSTANCE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__QUALIFIED_NAME = INSTANCE_OBJECT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__OWNED_PROPERTY_ASSOCIATION = INSTANCE_OBJECT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__ANNEX_INSTANCE = INSTANCE_OBJECT__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__CONTEXT = INSTANCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__CONNECTION = INSTANCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__SOURCE = INSTANCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__DESTINATION = INSTANCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE__REVERSE = INSTANCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE_FEATURE_COUNT = INSTANCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE___GET_OWNER = INSTANCE_OBJECT___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE___GET_NAMESPACE = INSTANCE_OBJECT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE___QUALIFIED_NAME = INSTANCE_OBJECT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE___GET_PROPERTY_VALUES__STRING_STRING = INSTANCE_OBJECT___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Connection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_REFERENCE_OPERATION_COUNT = INSTANCE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.ComponentInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OWNED_ELEMENT = CONNECTION_INSTANCE_END__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OWNED_COMMENT = CONNECTION_INSTANCE_END__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = CONNECTION_INSTANCE_END__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__QUALIFIED_NAME = CONNECTION_INSTANCE_END__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION = CONNECTION_INSTANCE_END__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ANNEX_INSTANCE = CONNECTION_INSTANCE_END__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SRC_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DST_CONNECTION_INSTANCE = CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Feature Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FEATURE_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__MODE_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mode Transition Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CATEGORY = CONNECTION_INSTANCE_END_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__IN_MODE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flow Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FLOW_SPECIFICATION = CONNECTION_INSTANCE_END_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End To End Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__END_TO_END_FLOW = CONNECTION_INSTANCE_END_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connection Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CONNECTION_INSTANCE = CONNECTION_INSTANCE_END_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SUBCOMPONENT = CONNECTION_INSTANCE_END_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INDEX = CONNECTION_INSTANCE_END_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CLASSIFIER = CONNECTION_INSTANCE_END_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = CONNECTION_INSTANCE_END_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_OWNER = CONNECTION_INSTANCE_END___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_NAMESPACE = CONNECTION_INSTANCE_END___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___QUALIFIED_NAME = CONNECTION_INSTANCE_END___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = CONNECTION_INSTANCE_END___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = CONNECTION_INSTANCE_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.FlowSpecificationInstanceImpl <em>Flow Specification Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.FlowSpecificationInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getFlowSpecificationInstance()
	 * @generated
	 */
	int FLOW_SPECIFICATION_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__OWNED_ELEMENT = FLOW_ELEMENT_INSTANCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__OWNED_COMMENT = FLOW_ELEMENT_INSTANCE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__NAME = FLOW_ELEMENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__OWNED_PROPERTY_ASSOCIATION = FLOW_ELEMENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__ANNEX_INSTANCE = FLOW_ELEMENT_INSTANCE__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__SOURCE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__DESTINATION = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__IN_MODE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Mode Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Flow Specification Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE_FEATURE_COUNT = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE___GET_OWNER = FLOW_ELEMENT_INSTANCE___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE___GET_NAMESPACE = FLOW_ELEMENT_INSTANCE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE___QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = FLOW_ELEMENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>Flow Specification Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SPECIFICATION_INSTANCE_OPERATION_COUNT = FLOW_ELEMENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.EndToEndFlowInstanceImpl <em>End To End Flow Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.EndToEndFlowInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getEndToEndFlowInstance()
	 * @generated
	 */
	int END_TO_END_FLOW_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__OWNED_ELEMENT = FLOW_ELEMENT_INSTANCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__OWNED_COMMENT = FLOW_ELEMENT_INSTANCE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__NAME = FLOW_ELEMENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__OWNED_PROPERTY_ASSOCIATION = FLOW_ELEMENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__ANNEX_INSTANCE = FLOW_ELEMENT_INSTANCE__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__IN_MODE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In System Operation Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End To End Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>End To End Flow Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE_FEATURE_COUNT = FLOW_ELEMENT_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE___GET_OWNER = FLOW_ELEMENT_INSTANCE___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE___GET_NAMESPACE = FLOW_ELEMENT_INSTANCE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE___QUALIFIED_NAME = FLOW_ELEMENT_INSTANCE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = FLOW_ELEMENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>End To End Flow Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_INSTANCE_OPERATION_COUNT = FLOW_ELEMENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.SystemInstanceImpl <em>System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.SystemInstanceImpl
	 * @see instance.impl.InstancePackageImpl#getSystemInstance()
	 * @generated
	 */
	int SYSTEM_INSTANCE = 14;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__OWNED_ELEMENT = COMPONENT_INSTANCE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__OWNED_COMMENT = COMPONENT_INSTANCE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__QUALIFIED_NAME = COMPONENT_INSTANCE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__OWNED_PROPERTY_ASSOCIATION = COMPONENT_INSTANCE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Annex Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__ANNEX_INSTANCE = COMPONENT_INSTANCE__ANNEX_INSTANCE;

	/**
	 * The feature id for the '<em><b>Src Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__SRC_CONNECTION_INSTANCE = COMPONENT_INSTANCE__SRC_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__DST_CONNECTION_INSTANCE = COMPONENT_INSTANCE__DST_CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Feature Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__FEATURE_INSTANCE = COMPONENT_INSTANCE__FEATURE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__COMPONENT_INSTANCE = COMPONENT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Mode Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__MODE_INSTANCE = COMPONENT_INSTANCE__MODE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Mode Transition Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__MODE_TRANSITION_INSTANCE = COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__CATEGORY = COMPONENT_INSTANCE__CATEGORY;

	/**
	 * The feature id for the '<em><b>In Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__IN_MODE = COMPONENT_INSTANCE__IN_MODE;

	/**
	 * The feature id for the '<em><b>Flow Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__FLOW_SPECIFICATION = COMPONENT_INSTANCE__FLOW_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>End To End Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__END_TO_END_FLOW = COMPONENT_INSTANCE__END_TO_END_FLOW;

	/**
	 * The feature id for the '<em><b>Connection Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__CONNECTION_INSTANCE = COMPONENT_INSTANCE__CONNECTION_INSTANCE;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__SUBCOMPONENT = COMPONENT_INSTANCE__SUBCOMPONENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__INDEX = COMPONENT_INSTANCE__INDEX;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__CLASSIFIER = COMPONENT_INSTANCE__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>System Operation Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE___GET_OWNER = COMPONENT_INSTANCE___GET_OWNER;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE___GET_NAMESPACE = COMPONENT_INSTANCE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE___QUALIFIED_NAME = COMPONENT_INSTANCE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Get Property Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING = COMPONENT_INSTANCE___GET_PROPERTY_VALUES__STRING_STRING;

	/**
	 * The number of operations of the '<em>System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.impl.InstanceReferenceValueImpl <em>Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.impl.InstanceReferenceValueImpl
	 * @see instance.impl.InstancePackageImpl#getInstanceReferenceValue()
	 * @generated
	 */
	int INSTANCE_REFERENCE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE__OWNED_ELEMENT = Aadl2Package.PROPERTY_VALUE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE__OWNED_COMMENT = Aadl2Package.PROPERTY_VALUE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Referenced Instance Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT = Aadl2Package.PROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE_FEATURE_COUNT = Aadl2Package.PROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE___GET_OWNER = Aadl2Package.PROPERTY_VALUE___GET_OWNER;

	/**
	 * The number of operations of the '<em>Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_REFERENCE_VALUE_OPERATION_COUNT = Aadl2Package.PROPERTY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instance.ConnectionKind <em>Connection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.ConnectionKind
	 * @see instance.impl.InstancePackageImpl#getConnectionKind()
	 * @generated
	 */
	int CONNECTION_KIND = 16;

	/**
	 * The meta object id for the '{@link instance.FeatureCategory <em>Feature Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instance.FeatureCategory
	 * @see instance.impl.InstancePackageImpl#getFeatureCategory()
	 * @generated
	 */
	int FEATURE_CATEGORY = 17;


	/**
	 * Returns the meta object for class '{@link instance.FeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Instance</em>'.
	 * @see instance.FeatureInstance
	 * @generated
	 */
	EClass getFeatureInstance();

	/**
	 * Returns the meta object for the reference list '{@link instance.FeatureInstance#getSrcFlowSpec <em>Src Flow Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Src Flow Spec</em>'.
	 * @see instance.FeatureInstance#getSrcFlowSpec()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_SrcFlowSpec();

	/**
	 * Returns the meta object for the reference list '{@link instance.FeatureInstance#getDstFlowSpec <em>Dst Flow Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dst Flow Spec</em>'.
	 * @see instance.FeatureInstance#getDstFlowSpec()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_DstFlowSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.FeatureInstance#getFeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Instance</em>'.
	 * @see instance.FeatureInstance#getFeatureInstance()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_FeatureInstance();

	/**
	 * Returns the meta object for the attribute '{@link instance.FeatureInstance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see instance.FeatureInstance#getCategory()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EAttribute getFeatureInstance_Category();

	/**
	 * Returns the meta object for the attribute '{@link instance.FeatureInstance#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see instance.FeatureInstance#getDirection()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EAttribute getFeatureInstance_Direction();

	/**
	 * Returns the meta object for the reference '{@link instance.FeatureInstance#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see instance.FeatureInstance#getFeature()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EReference getFeatureInstance_Feature();

	/**
	 * Returns the meta object for the attribute '{@link instance.FeatureInstance#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see instance.FeatureInstance#getIndex()
	 * @see #getFeatureInstance()
	 * @generated
	 */
	EAttribute getFeatureInstance_Index();

	/**
	 * Returns the meta object for class '{@link instance.InstanceObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see instance.InstanceObject
	 * @generated
	 */
	EClass getInstanceObject();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.InstanceObject#getAnnexInstance <em>Annex Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annex Instance</em>'.
	 * @see instance.InstanceObject#getAnnexInstance()
	 * @see #getInstanceObject()
	 * @generated
	 */
	EReference getInstanceObject_AnnexInstance();

	/**
	 * Returns the meta object for class '{@link instance.AnnexInstance <em>Annex Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annex Instance</em>'.
	 * @see instance.AnnexInstance
	 * @generated
	 */
	EClass getAnnexInstance();

	/**
	 * Returns the meta object for the reference '{@link instance.AnnexInstance#getAnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annex Subclause</em>'.
	 * @see instance.AnnexInstance#getAnnexSubclause()
	 * @see #getAnnexInstance()
	 * @generated
	 */
	EReference getAnnexInstance_AnnexSubclause();

	/**
	 * Returns the meta object for class '{@link instance.PropertyAssociationInstance <em>Property Association Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Association Instance</em>'.
	 * @see instance.PropertyAssociationInstance
	 * @generated
	 */
	EClass getPropertyAssociationInstance();

	/**
	 * Returns the meta object for the reference '{@link instance.PropertyAssociationInstance#getPropertyAssociation <em>Property Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Association</em>'.
	 * @see instance.PropertyAssociationInstance#getPropertyAssociation()
	 * @see #getPropertyAssociationInstance()
	 * @generated
	 */
	EReference getPropertyAssociationInstance_PropertyAssociation();

	/**
	 * Returns the meta object for class '{@link instance.ConnectionInstanceEnd <em>Connection Instance End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Instance End</em>'.
	 * @see instance.ConnectionInstanceEnd
	 * @generated
	 */
	EClass getConnectionInstanceEnd();

	/**
	 * Returns the meta object for the reference list '{@link instance.ConnectionInstanceEnd#getSrcConnectionInstance <em>Src Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Src Connection Instance</em>'.
	 * @see instance.ConnectionInstanceEnd#getSrcConnectionInstance()
	 * @see #getConnectionInstanceEnd()
	 * @generated
	 */
	EReference getConnectionInstanceEnd_SrcConnectionInstance();

	/**
	 * Returns the meta object for the reference list '{@link instance.ConnectionInstanceEnd#getDstConnectionInstance <em>Dst Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dst Connection Instance</em>'.
	 * @see instance.ConnectionInstanceEnd#getDstConnectionInstance()
	 * @see #getConnectionInstanceEnd()
	 * @generated
	 */
	EReference getConnectionInstanceEnd_DstConnectionInstance();

	/**
	 * Returns the meta object for class '{@link instance.ConnectionInstance <em>Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Instance</em>'.
	 * @see instance.ConnectionInstance
	 * @generated
	 */
	EClass getConnectionInstance();

	/**
	 * Returns the meta object for the reference list '{@link instance.ConnectionInstance#getInSystemOperationMode <em>In System Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In System Operation Mode</em>'.
	 * @see instance.ConnectionInstance#getInSystemOperationMode()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_InSystemOperationMode();

	/**
	 * Returns the meta object for the reference list '{@link instance.ConnectionInstance#getInModeTransition <em>In Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Mode Transition</em>'.
	 * @see instance.ConnectionInstance#getInModeTransition()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_InModeTransition();

	/**
	 * Returns the meta object for the attribute '{@link instance.ConnectionInstance#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see instance.ConnectionInstance#isComplete()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EAttribute getConnectionInstance_Complete();

	/**
	 * Returns the meta object for the attribute '{@link instance.ConnectionInstance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see instance.ConnectionInstance#getKind()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EAttribute getConnectionInstance_Kind();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see instance.ConnectionInstance#getDestination()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_Destination();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ConnectionInstance#getConnectionReference <em>Connection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Reference</em>'.
	 * @see instance.ConnectionInstance#getConnectionReference()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_ConnectionReference();

	/**
	 * Returns the meta object for the attribute '{@link instance.ConnectionInstance#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see instance.ConnectionInstance#isBidirectional()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EAttribute getConnectionInstance_Bidirectional();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see instance.ConnectionInstance#getSource()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_Source();

	/**
	 * Returns the meta object for class '{@link instance.FlowElementInstance <em>Flow Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element Instance</em>'.
	 * @see instance.FlowElementInstance
	 * @generated
	 */
	EClass getFlowElementInstance();

	/**
	 * Returns the meta object for class '{@link instance.SystemOperationMode <em>System Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Operation Mode</em>'.
	 * @see instance.SystemOperationMode
	 * @generated
	 */
	EClass getSystemOperationMode();

	/**
	 * Returns the meta object for the reference list '{@link instance.SystemOperationMode#getCurrentMode <em>Current Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Mode</em>'.
	 * @see instance.SystemOperationMode#getCurrentMode()
	 * @see #getSystemOperationMode()
	 * @generated
	 */
	EReference getSystemOperationMode_CurrentMode();

	/**
	 * Returns the meta object for class '{@link instance.ModeInstance <em>Mode Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Instance</em>'.
	 * @see instance.ModeInstance
	 * @generated
	 */
	EClass getModeInstance();

	/**
	 * Returns the meta object for the reference list '{@link instance.ModeInstance#getSrcModeTransition <em>Src Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Src Mode Transition</em>'.
	 * @see instance.ModeInstance#getSrcModeTransition()
	 * @see #getModeInstance()
	 * @generated
	 */
	EReference getModeInstance_SrcModeTransition();

	/**
	 * Returns the meta object for the reference list '{@link instance.ModeInstance#getDstModeTransition <em>Dst Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dst Mode Transition</em>'.
	 * @see instance.ModeInstance#getDstModeTransition()
	 * @see #getModeInstance()
	 * @generated
	 */
	EReference getModeInstance_DstModeTransition();

	/**
	 * Returns the meta object for the attribute '{@link instance.ModeInstance#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see instance.ModeInstance#isInitial()
	 * @see #getModeInstance()
	 * @generated
	 */
	EAttribute getModeInstance_Initial();

	/**
	 * Returns the meta object for the reference '{@link instance.ModeInstance#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see instance.ModeInstance#getMode()
	 * @see #getModeInstance()
	 * @generated
	 */
	EReference getModeInstance_Mode();

	/**
	 * Returns the meta object for the attribute '{@link instance.ModeInstance#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see instance.ModeInstance#isDerived()
	 * @see #getModeInstance()
	 * @generated
	 */
	EAttribute getModeInstance_Derived();

	/**
	 * Returns the meta object for the reference list '{@link instance.ModeInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent</em>'.
	 * @see instance.ModeInstance#getParent()
	 * @see #getModeInstance()
	 * @generated
	 */
	EReference getModeInstance_Parent();

	/**
	 * Returns the meta object for class '{@link instance.ModeTransitionInstance <em>Mode Transition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition Instance</em>'.
	 * @see instance.ModeTransitionInstance
	 * @generated
	 */
	EClass getModeTransitionInstance();

	/**
	 * Returns the meta object for the reference '{@link instance.ModeTransitionInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see instance.ModeTransitionInstance#getDestination()
	 * @see #getModeTransitionInstance()
	 * @generated
	 */
	EReference getModeTransitionInstance_Destination();

	/**
	 * Returns the meta object for the reference '{@link instance.ModeTransitionInstance#getModeTransition <em>Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode Transition</em>'.
	 * @see instance.ModeTransitionInstance#getModeTransition()
	 * @see #getModeTransitionInstance()
	 * @generated
	 */
	EReference getModeTransitionInstance_ModeTransition();

	/**
	 * Returns the meta object for the reference list '{@link instance.ModeTransitionInstance#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger</em>'.
	 * @see instance.ModeTransitionInstance#getTrigger()
	 * @see #getModeTransitionInstance()
	 * @generated
	 */
	EReference getModeTransitionInstance_Trigger();

	/**
	 * Returns the meta object for the reference '{@link instance.ModeTransitionInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see instance.ModeTransitionInstance#getSource()
	 * @see #getModeTransitionInstance()
	 * @generated
	 */
	EReference getModeTransitionInstance_Source();

	/**
	 * Returns the meta object for class '{@link instance.ConnectionReference <em>Connection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Reference</em>'.
	 * @see instance.ConnectionReference
	 * @generated
	 */
	EClass getConnectionReference();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionReference#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see instance.ConnectionReference#getContext()
	 * @see #getConnectionReference()
	 * @generated
	 */
	EReference getConnectionReference_Context();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionReference#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see instance.ConnectionReference#getConnection()
	 * @see #getConnectionReference()
	 * @generated
	 */
	EReference getConnectionReference_Connection();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionReference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see instance.ConnectionReference#getSource()
	 * @see #getConnectionReference()
	 * @generated
	 */
	EReference getConnectionReference_Source();

	/**
	 * Returns the meta object for the reference '{@link instance.ConnectionReference#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see instance.ConnectionReference#getDestination()
	 * @see #getConnectionReference()
	 * @generated
	 */
	EReference getConnectionReference_Destination();

	/**
	 * Returns the meta object for the attribute '{@link instance.ConnectionReference#isReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see instance.ConnectionReference#isReverse()
	 * @see #getConnectionReference()
	 * @generated
	 */
	EAttribute getConnectionReference_Reverse();

	/**
	 * Returns the meta object for class '{@link instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getFeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Instance</em>'.
	 * @see instance.ComponentInstance#getFeatureInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_FeatureInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instance</em>'.
	 * @see instance.ComponentInstance#getComponentInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getModeInstance <em>Mode Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Instance</em>'.
	 * @see instance.ComponentInstance#getModeInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ModeInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getModeTransitionInstance <em>Mode Transition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode Transition Instance</em>'.
	 * @see instance.ComponentInstance#getModeTransitionInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ModeTransitionInstance();

	/**
	 * Returns the meta object for the attribute '{@link instance.ComponentInstance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see instance.ComponentInstance#getCategory()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Category();

	/**
	 * Returns the meta object for the reference list '{@link instance.ComponentInstance#getInMode <em>In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Mode</em>'.
	 * @see instance.ComponentInstance#getInMode()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_InMode();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getFlowSpecification <em>Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Specification</em>'.
	 * @see instance.ComponentInstance#getFlowSpecification()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_FlowSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getEndToEndFlow <em>End To End Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End To End Flow</em>'.
	 * @see instance.ComponentInstance#getEndToEndFlow()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_EndToEndFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.ComponentInstance#getConnectionInstance <em>Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Instance</em>'.
	 * @see instance.ComponentInstance#getConnectionInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ConnectionInstance();

	/**
	 * Returns the meta object for the reference '{@link instance.ComponentInstance#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subcomponent</em>'.
	 * @see instance.ComponentInstance#getSubcomponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Subcomponent();

	/**
	 * Returns the meta object for the attribute list '{@link instance.ComponentInstance#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index</em>'.
	 * @see instance.ComponentInstance#getIndex()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Index();

	/**
	 * Returns the meta object for the reference '{@link instance.ComponentInstance#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see instance.ComponentInstance#getClassifier()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Classifier();

	/**
	 * Returns the meta object for class '{@link instance.FlowSpecificationInstance <em>Flow Specification Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Specification Instance</em>'.
	 * @see instance.FlowSpecificationInstance
	 * @generated
	 */
	EClass getFlowSpecificationInstance();

	/**
	 * Returns the meta object for the reference '{@link instance.FlowSpecificationInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see instance.FlowSpecificationInstance#getSource()
	 * @see #getFlowSpecificationInstance()
	 * @generated
	 */
	EReference getFlowSpecificationInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link instance.FlowSpecificationInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see instance.FlowSpecificationInstance#getDestination()
	 * @see #getFlowSpecificationInstance()
	 * @generated
	 */
	EReference getFlowSpecificationInstance_Destination();

	/**
	 * Returns the meta object for the reference '{@link instance.FlowSpecificationInstance#getFlowSpecification <em>Flow Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Specification</em>'.
	 * @see instance.FlowSpecificationInstance#getFlowSpecification()
	 * @see #getFlowSpecificationInstance()
	 * @generated
	 */
	EReference getFlowSpecificationInstance_FlowSpecification();

	/**
	 * Returns the meta object for the reference list '{@link instance.FlowSpecificationInstance#getInMode <em>In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Mode</em>'.
	 * @see instance.FlowSpecificationInstance#getInMode()
	 * @see #getFlowSpecificationInstance()
	 * @generated
	 */
	EReference getFlowSpecificationInstance_InMode();

	/**
	 * Returns the meta object for the reference list '{@link instance.FlowSpecificationInstance#getInModeTransition <em>In Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Mode Transition</em>'.
	 * @see instance.FlowSpecificationInstance#getInModeTransition()
	 * @see #getFlowSpecificationInstance()
	 * @generated
	 */
	EReference getFlowSpecificationInstance_InModeTransition();

	/**
	 * Returns the meta object for class '{@link instance.EndToEndFlowInstance <em>End To End Flow Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End To End Flow Instance</em>'.
	 * @see instance.EndToEndFlowInstance
	 * @generated
	 */
	EClass getEndToEndFlowInstance();

	/**
	 * Returns the meta object for the reference list '{@link instance.EndToEndFlowInstance#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow Element</em>'.
	 * @see instance.EndToEndFlowInstance#getFlowElement()
	 * @see #getEndToEndFlowInstance()
	 * @generated
	 */
	EReference getEndToEndFlowInstance_FlowElement();

	/**
	 * Returns the meta object for the reference list '{@link instance.EndToEndFlowInstance#getInMode <em>In Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Mode</em>'.
	 * @see instance.EndToEndFlowInstance#getInMode()
	 * @see #getEndToEndFlowInstance()
	 * @generated
	 */
	EReference getEndToEndFlowInstance_InMode();

	/**
	 * Returns the meta object for the reference list '{@link instance.EndToEndFlowInstance#getInSystemOperationMode <em>In System Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In System Operation Mode</em>'.
	 * @see instance.EndToEndFlowInstance#getInSystemOperationMode()
	 * @see #getEndToEndFlowInstance()
	 * @generated
	 */
	EReference getEndToEndFlowInstance_InSystemOperationMode();

	/**
	 * Returns the meta object for the reference '{@link instance.EndToEndFlowInstance#getEndToEndFlow <em>End To End Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End To End Flow</em>'.
	 * @see instance.EndToEndFlowInstance#getEndToEndFlow()
	 * @see #getEndToEndFlowInstance()
	 * @generated
	 */
	EReference getEndToEndFlowInstance_EndToEndFlow();

	/**
	 * Returns the meta object for class '{@link instance.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Instance</em>'.
	 * @see instance.SystemInstance
	 * @generated
	 */
	EClass getSystemInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link instance.SystemInstance#getSystemOperationMode <em>System Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Operation Mode</em>'.
	 * @see instance.SystemInstance#getSystemOperationMode()
	 * @see #getSystemInstance()
	 * @generated
	 */
	EReference getSystemInstance_SystemOperationMode();

	/**
	 * Returns the meta object for the reference '{@link instance.SystemInstance#getComponentImplementation <em>Component Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Implementation</em>'.
	 * @see instance.SystemInstance#getComponentImplementation()
	 * @see #getSystemInstance()
	 * @generated
	 */
	EReference getSystemInstance_ComponentImplementation();

	/**
	 * Returns the meta object for class '{@link instance.InstanceReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Value</em>'.
	 * @see instance.InstanceReferenceValue
	 * @generated
	 */
	EClass getInstanceReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link instance.InstanceReferenceValue#getReferencedInstanceObject <em>Referenced Instance Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Instance Object</em>'.
	 * @see instance.InstanceReferenceValue#getReferencedInstanceObject()
	 * @see #getInstanceReferenceValue()
	 * @generated
	 */
	EReference getInstanceReferenceValue_ReferencedInstanceObject();

	/**
	 * Returns the meta object for enum '{@link instance.ConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Kind</em>'.
	 * @see instance.ConnectionKind
	 * @generated
	 */
	EEnum getConnectionKind();

	/**
	 * Returns the meta object for enum '{@link instance.FeatureCategory <em>Feature Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Category</em>'.
	 * @see instance.FeatureCategory
	 * @generated
	 */
	EEnum getFeatureCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstanceFactory getInstanceFactory();

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
		 * The meta object literal for the '{@link instance.impl.FeatureInstanceImpl <em>Feature Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.FeatureInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getFeatureInstance()
		 * @generated
		 */
		EClass FEATURE_INSTANCE = eINSTANCE.getFeatureInstance();

		/**
		 * The meta object literal for the '<em><b>Src Flow Spec</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__SRC_FLOW_SPEC = eINSTANCE.getFeatureInstance_SrcFlowSpec();

		/**
		 * The meta object literal for the '<em><b>Dst Flow Spec</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__DST_FLOW_SPEC = eINSTANCE.getFeatureInstance_DstFlowSpec();

		/**
		 * The meta object literal for the '<em><b>Feature Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__FEATURE_INSTANCE = eINSTANCE.getFeatureInstance_FeatureInstance();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INSTANCE__CATEGORY = eINSTANCE.getFeatureInstance_Category();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INSTANCE__DIRECTION = eINSTANCE.getFeatureInstance_Direction();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_INSTANCE__FEATURE = eINSTANCE.getFeatureInstance_Feature();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_INSTANCE__INDEX = eINSTANCE.getFeatureInstance_Index();

		/**
		 * The meta object literal for the '{@link instance.impl.InstanceObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.InstanceObjectImpl
		 * @see instance.impl.InstancePackageImpl#getInstanceObject()
		 * @generated
		 */
		EClass INSTANCE_OBJECT = eINSTANCE.getInstanceObject();

		/**
		 * The meta object literal for the '<em><b>Annex Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJECT__ANNEX_INSTANCE = eINSTANCE.getInstanceObject_AnnexInstance();

		/**
		 * The meta object literal for the '{@link instance.impl.AnnexInstanceImpl <em>Annex Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.AnnexInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getAnnexInstance()
		 * @generated
		 */
		EClass ANNEX_INSTANCE = eINSTANCE.getAnnexInstance();

		/**
		 * The meta object literal for the '<em><b>Annex Subclause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNEX_INSTANCE__ANNEX_SUBCLAUSE = eINSTANCE.getAnnexInstance_AnnexSubclause();

		/**
		 * The meta object literal for the '{@link instance.impl.PropertyAssociationInstanceImpl <em>Property Association Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.PropertyAssociationInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getPropertyAssociationInstance()
		 * @generated
		 */
		EClass PROPERTY_ASSOCIATION_INSTANCE = eINSTANCE.getPropertyAssociationInstance();

		/**
		 * The meta object literal for the '<em><b>Property Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ASSOCIATION_INSTANCE__PROPERTY_ASSOCIATION = eINSTANCE.getPropertyAssociationInstance_PropertyAssociation();

		/**
		 * The meta object literal for the '{@link instance.impl.ConnectionInstanceEndImpl <em>Connection Instance End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ConnectionInstanceEndImpl
		 * @see instance.impl.InstancePackageImpl#getConnectionInstanceEnd()
		 * @generated
		 */
		EClass CONNECTION_INSTANCE_END = eINSTANCE.getConnectionInstanceEnd();

		/**
		 * The meta object literal for the '<em><b>Src Connection Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE_END__SRC_CONNECTION_INSTANCE = eINSTANCE.getConnectionInstanceEnd_SrcConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>Dst Connection Instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE_END__DST_CONNECTION_INSTANCE = eINSTANCE.getConnectionInstanceEnd_DstConnectionInstance();

		/**
		 * The meta object literal for the '{@link instance.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ConnectionInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getConnectionInstance()
		 * @generated
		 */
		EClass CONNECTION_INSTANCE = eINSTANCE.getConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>In System Operation Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__IN_SYSTEM_OPERATION_MODE = eINSTANCE.getConnectionInstance_InSystemOperationMode();

		/**
		 * The meta object literal for the '<em><b>In Mode Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__IN_MODE_TRANSITION = eINSTANCE.getConnectionInstance_InModeTransition();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INSTANCE__COMPLETE = eINSTANCE.getConnectionInstance_Complete();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INSTANCE__KIND = eINSTANCE.getConnectionInstance_Kind();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__DESTINATION = eINSTANCE.getConnectionInstance_Destination();

		/**
		 * The meta object literal for the '<em><b>Connection Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__CONNECTION_REFERENCE = eINSTANCE.getConnectionInstance_ConnectionReference();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_INSTANCE__BIDIRECTIONAL = eINSTANCE.getConnectionInstance_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__SOURCE = eINSTANCE.getConnectionInstance_Source();

		/**
		 * The meta object literal for the '{@link instance.impl.FlowElementInstanceImpl <em>Flow Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.FlowElementInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getFlowElementInstance()
		 * @generated
		 */
		EClass FLOW_ELEMENT_INSTANCE = eINSTANCE.getFlowElementInstance();

		/**
		 * The meta object literal for the '{@link instance.impl.SystemOperationModeImpl <em>System Operation Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.SystemOperationModeImpl
		 * @see instance.impl.InstancePackageImpl#getSystemOperationMode()
		 * @generated
		 */
		EClass SYSTEM_OPERATION_MODE = eINSTANCE.getSystemOperationMode();

		/**
		 * The meta object literal for the '<em><b>Current Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OPERATION_MODE__CURRENT_MODE = eINSTANCE.getSystemOperationMode_CurrentMode();

		/**
		 * The meta object literal for the '{@link instance.impl.ModeInstanceImpl <em>Mode Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ModeInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getModeInstance()
		 * @generated
		 */
		EClass MODE_INSTANCE = eINSTANCE.getModeInstance();

		/**
		 * The meta object literal for the '<em><b>Src Mode Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_INSTANCE__SRC_MODE_TRANSITION = eINSTANCE.getModeInstance_SrcModeTransition();

		/**
		 * The meta object literal for the '<em><b>Dst Mode Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_INSTANCE__DST_MODE_TRANSITION = eINSTANCE.getModeInstance_DstModeTransition();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_INSTANCE__INITIAL = eINSTANCE.getModeInstance_Initial();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_INSTANCE__MODE = eINSTANCE.getModeInstance_Mode();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_INSTANCE__DERIVED = eINSTANCE.getModeInstance_Derived();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_INSTANCE__PARENT = eINSTANCE.getModeInstance_Parent();

		/**
		 * The meta object literal for the '{@link instance.impl.ModeTransitionInstanceImpl <em>Mode Transition Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ModeTransitionInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getModeTransitionInstance()
		 * @generated
		 */
		EClass MODE_TRANSITION_INSTANCE = eINSTANCE.getModeTransitionInstance();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_INSTANCE__DESTINATION = eINSTANCE.getModeTransitionInstance_Destination();

		/**
		 * The meta object literal for the '<em><b>Mode Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_INSTANCE__MODE_TRANSITION = eINSTANCE.getModeTransitionInstance_ModeTransition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_INSTANCE__TRIGGER = eINSTANCE.getModeTransitionInstance_Trigger();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_INSTANCE__SOURCE = eINSTANCE.getModeTransitionInstance_Source();

		/**
		 * The meta object literal for the '{@link instance.impl.ConnectionReferenceImpl <em>Connection Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ConnectionReferenceImpl
		 * @see instance.impl.InstancePackageImpl#getConnectionReference()
		 * @generated
		 */
		EClass CONNECTION_REFERENCE = eINSTANCE.getConnectionReference();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_REFERENCE__CONTEXT = eINSTANCE.getConnectionReference_Context();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_REFERENCE__CONNECTION = eINSTANCE.getConnectionReference_Connection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_REFERENCE__SOURCE = eINSTANCE.getConnectionReference_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_REFERENCE__DESTINATION = eINSTANCE.getConnectionReference_Destination();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_REFERENCE__REVERSE = eINSTANCE.getConnectionReference_Reverse();

		/**
		 * The meta object literal for the '{@link instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.ComponentInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Feature Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__FEATURE_INSTANCE = eINSTANCE.getComponentInstance_FeatureInstance();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getComponentInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Mode Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__MODE_INSTANCE = eINSTANCE.getComponentInstance_ModeInstance();

		/**
		 * The meta object literal for the '<em><b>Mode Transition Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__MODE_TRANSITION_INSTANCE = eINSTANCE.getComponentInstance_ModeTransitionInstance();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__CATEGORY = eINSTANCE.getComponentInstance_Category();

		/**
		 * The meta object literal for the '<em><b>In Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__IN_MODE = eINSTANCE.getComponentInstance_InMode();

		/**
		 * The meta object literal for the '<em><b>Flow Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__FLOW_SPECIFICATION = eINSTANCE.getComponentInstance_FlowSpecification();

		/**
		 * The meta object literal for the '<em><b>End To End Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__END_TO_END_FLOW = eINSTANCE.getComponentInstance_EndToEndFlow();

		/**
		 * The meta object literal for the '<em><b>Connection Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__CONNECTION_INSTANCE = eINSTANCE.getComponentInstance_ConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__SUBCOMPONENT = eINSTANCE.getComponentInstance_Subcomponent();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__INDEX = eINSTANCE.getComponentInstance_Index();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__CLASSIFIER = eINSTANCE.getComponentInstance_Classifier();

		/**
		 * The meta object literal for the '{@link instance.impl.FlowSpecificationInstanceImpl <em>Flow Specification Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.FlowSpecificationInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getFlowSpecificationInstance()
		 * @generated
		 */
		EClass FLOW_SPECIFICATION_INSTANCE = eINSTANCE.getFlowSpecificationInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_INSTANCE__SOURCE = eINSTANCE.getFlowSpecificationInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_INSTANCE__DESTINATION = eINSTANCE.getFlowSpecificationInstance_Destination();

		/**
		 * The meta object literal for the '<em><b>Flow Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_INSTANCE__FLOW_SPECIFICATION = eINSTANCE.getFlowSpecificationInstance_FlowSpecification();

		/**
		 * The meta object literal for the '<em><b>In Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_INSTANCE__IN_MODE = eINSTANCE.getFlowSpecificationInstance_InMode();

		/**
		 * The meta object literal for the '<em><b>In Mode Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SPECIFICATION_INSTANCE__IN_MODE_TRANSITION = eINSTANCE.getFlowSpecificationInstance_InModeTransition();

		/**
		 * The meta object literal for the '{@link instance.impl.EndToEndFlowInstanceImpl <em>End To End Flow Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.EndToEndFlowInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getEndToEndFlowInstance()
		 * @generated
		 */
		EClass END_TO_END_FLOW_INSTANCE = eINSTANCE.getEndToEndFlowInstance();

		/**
		 * The meta object literal for the '<em><b>Flow Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW_INSTANCE__FLOW_ELEMENT = eINSTANCE.getEndToEndFlowInstance_FlowElement();

		/**
		 * The meta object literal for the '<em><b>In Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW_INSTANCE__IN_MODE = eINSTANCE.getEndToEndFlowInstance_InMode();

		/**
		 * The meta object literal for the '<em><b>In System Operation Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW_INSTANCE__IN_SYSTEM_OPERATION_MODE = eINSTANCE.getEndToEndFlowInstance_InSystemOperationMode();

		/**
		 * The meta object literal for the '<em><b>End To End Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW_INSTANCE__END_TO_END_FLOW = eINSTANCE.getEndToEndFlowInstance_EndToEndFlow();

		/**
		 * The meta object literal for the '{@link instance.impl.SystemInstanceImpl <em>System Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.SystemInstanceImpl
		 * @see instance.impl.InstancePackageImpl#getSystemInstance()
		 * @generated
		 */
		EClass SYSTEM_INSTANCE = eINSTANCE.getSystemInstance();

		/**
		 * The meta object literal for the '<em><b>System Operation Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INSTANCE__SYSTEM_OPERATION_MODE = eINSTANCE.getSystemInstance_SystemOperationMode();

		/**
		 * The meta object literal for the '<em><b>Component Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_INSTANCE__COMPONENT_IMPLEMENTATION = eINSTANCE.getSystemInstance_ComponentImplementation();

		/**
		 * The meta object literal for the '{@link instance.impl.InstanceReferenceValueImpl <em>Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.impl.InstanceReferenceValueImpl
		 * @see instance.impl.InstancePackageImpl#getInstanceReferenceValue()
		 * @generated
		 */
		EClass INSTANCE_REFERENCE_VALUE = eINSTANCE.getInstanceReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Referenced Instance Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_REFERENCE_VALUE__REFERENCED_INSTANCE_OBJECT = eINSTANCE.getInstanceReferenceValue_ReferencedInstanceObject();

		/**
		 * The meta object literal for the '{@link instance.ConnectionKind <em>Connection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.ConnectionKind
		 * @see instance.impl.InstancePackageImpl#getConnectionKind()
		 * @generated
		 */
		EEnum CONNECTION_KIND = eINSTANCE.getConnectionKind();

		/**
		 * The meta object literal for the '{@link instance.FeatureCategory <em>Feature Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instance.FeatureCategory
		 * @see instance.impl.InstancePackageImpl#getFeatureCategory()
		 * @generated
		 */
		EEnum FEATURE_CATEGORY = eINSTANCE.getFeatureCategory();

	}

} //InstancePackage
