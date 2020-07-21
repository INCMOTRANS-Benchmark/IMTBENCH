/**
 */
package instance.impl;

import instance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstanceFactory init() {
		try {
			InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
			if (theInstanceFactory != null) {
				return theInstanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactoryImpl() {
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
			case InstancePackage.FEATURE_INSTANCE: return createFeatureInstance();
			case InstancePackage.PROPERTY_ASSOCIATION_INSTANCE: return createPropertyAssociationInstance();
			case InstancePackage.CONNECTION_INSTANCE: return createConnectionInstance();
			case InstancePackage.SYSTEM_OPERATION_MODE: return createSystemOperationMode();
			case InstancePackage.MODE_INSTANCE: return createModeInstance();
			case InstancePackage.MODE_TRANSITION_INSTANCE: return createModeTransitionInstance();
			case InstancePackage.CONNECTION_REFERENCE: return createConnectionReference();
			case InstancePackage.COMPONENT_INSTANCE: return createComponentInstance();
			case InstancePackage.FLOW_SPECIFICATION_INSTANCE: return createFlowSpecificationInstance();
			case InstancePackage.END_TO_END_FLOW_INSTANCE: return createEndToEndFlowInstance();
			case InstancePackage.SYSTEM_INSTANCE: return createSystemInstance();
			case InstancePackage.INSTANCE_REFERENCE_VALUE: return createInstanceReferenceValue();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InstancePackage.CONNECTION_KIND:
				return createConnectionKindFromString(eDataType, initialValue);
			case InstancePackage.FEATURE_CATEGORY:
				return createFeatureCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InstancePackage.CONNECTION_KIND:
				return convertConnectionKindToString(eDataType, instanceValue);
			case InstancePackage.FEATURE_CATEGORY:
				return convertFeatureCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureInstance createFeatureInstance() {
		FeatureInstanceImpl featureInstance = new FeatureInstanceImpl();
		return featureInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAssociationInstance createPropertyAssociationInstance() {
		PropertyAssociationInstanceImpl propertyAssociationInstance = new PropertyAssociationInstanceImpl();
		return propertyAssociationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionInstance createConnectionInstance() {
		ConnectionInstanceImpl connectionInstance = new ConnectionInstanceImpl();
		return connectionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemOperationMode createSystemOperationMode() {
		SystemOperationModeImpl systemOperationMode = new SystemOperationModeImpl();
		return systemOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeInstance createModeInstance() {
		ModeInstanceImpl modeInstance = new ModeInstanceImpl();
		return modeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeTransitionInstance createModeTransitionInstance() {
		ModeTransitionInstanceImpl modeTransitionInstance = new ModeTransitionInstanceImpl();
		return modeTransitionInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionReference createConnectionReference() {
		ConnectionReferenceImpl connectionReference = new ConnectionReferenceImpl();
		return connectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowSpecificationInstance createFlowSpecificationInstance() {
		FlowSpecificationInstanceImpl flowSpecificationInstance = new FlowSpecificationInstanceImpl();
		return flowSpecificationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndToEndFlowInstance createEndToEndFlowInstance() {
		EndToEndFlowInstanceImpl endToEndFlowInstance = new EndToEndFlowInstanceImpl();
		return endToEndFlowInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemInstance createSystemInstance() {
		SystemInstanceImpl systemInstance = new SystemInstanceImpl();
		return systemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceReferenceValue createInstanceReferenceValue() {
		InstanceReferenceValueImpl instanceReferenceValue = new InstanceReferenceValueImpl();
		return instanceReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionKind createConnectionKindFromString(EDataType eDataType, String initialValue) {
		ConnectionKind result = ConnectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCategory createFeatureCategoryFromString(EDataType eDataType, String initialValue) {
		FeatureCategory result = FeatureCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancePackage getInstancePackage() {
		return (InstancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancePackage getPackage() {
		return InstancePackage.eINSTANCE;
	}

} //InstanceFactoryImpl
