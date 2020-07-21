/**
 */
package instance.util;

import aadl2.ClassifierFeature;
import aadl2.Element;
import aadl2.Mode;
import aadl2.ModeFeature;
import aadl2.NamedElement;
import aadl2.PropertyAssociation;
import aadl2.PropertyExpression;
import aadl2.PropertyValue;

import instance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstancePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSwitch<Adapter> modelSwitch =
		new InstanceSwitch<Adapter>() {
			@Override
			public Adapter caseFeatureInstance(FeatureInstance object) {
				return createFeatureInstanceAdapter();
			}
			@Override
			public Adapter caseInstanceObject(InstanceObject object) {
				return createInstanceObjectAdapter();
			}
			@Override
			public Adapter caseAnnexInstance(AnnexInstance object) {
				return createAnnexInstanceAdapter();
			}
			@Override
			public Adapter casePropertyAssociationInstance(PropertyAssociationInstance object) {
				return createPropertyAssociationInstanceAdapter();
			}
			@Override
			public Adapter caseConnectionInstanceEnd(ConnectionInstanceEnd object) {
				return createConnectionInstanceEndAdapter();
			}
			@Override
			public Adapter caseConnectionInstance(ConnectionInstance object) {
				return createConnectionInstanceAdapter();
			}
			@Override
			public Adapter caseFlowElementInstance(FlowElementInstance object) {
				return createFlowElementInstanceAdapter();
			}
			@Override
			public Adapter caseSystemOperationMode(SystemOperationMode object) {
				return createSystemOperationModeAdapter();
			}
			@Override
			public Adapter caseModeInstance(ModeInstance object) {
				return createModeInstanceAdapter();
			}
			@Override
			public Adapter caseModeTransitionInstance(ModeTransitionInstance object) {
				return createModeTransitionInstanceAdapter();
			}
			@Override
			public Adapter caseConnectionReference(ConnectionReference object) {
				return createConnectionReferenceAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseFlowSpecificationInstance(FlowSpecificationInstance object) {
				return createFlowSpecificationInstanceAdapter();
			}
			@Override
			public Adapter caseEndToEndFlowInstance(EndToEndFlowInstance object) {
				return createEndToEndFlowInstanceAdapter();
			}
			@Override
			public Adapter caseSystemInstance(SystemInstance object) {
				return createSystemInstanceAdapter();
			}
			@Override
			public Adapter caseInstanceReferenceValue(InstanceReferenceValue object) {
				return createInstanceReferenceValueAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePropertyAssociation(PropertyAssociation object) {
				return createPropertyAssociationAdapter();
			}
			@Override
			public Adapter caseClassifierFeature(ClassifierFeature object) {
				return createClassifierFeatureAdapter();
			}
			@Override
			public Adapter caseModeFeature(ModeFeature object) {
				return createModeFeatureAdapter();
			}
			@Override
			public Adapter caseMode(Mode object) {
				return createModeAdapter();
			}
			@Override
			public Adapter casePropertyExpression(PropertyExpression object) {
				return createPropertyExpressionAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link instance.FeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.FeatureInstance
	 * @generated
	 */
	public Adapter createFeatureInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.InstanceObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.InstanceObject
	 * @generated
	 */
	public Adapter createInstanceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.AnnexInstance <em>Annex Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.AnnexInstance
	 * @generated
	 */
	public Adapter createAnnexInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.PropertyAssociationInstance <em>Property Association Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.PropertyAssociationInstance
	 * @generated
	 */
	public Adapter createPropertyAssociationInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ConnectionInstanceEnd <em>Connection Instance End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ConnectionInstanceEnd
	 * @generated
	 */
	public Adapter createConnectionInstanceEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ConnectionInstance <em>Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ConnectionInstance
	 * @generated
	 */
	public Adapter createConnectionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.FlowElementInstance <em>Flow Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.FlowElementInstance
	 * @generated
	 */
	public Adapter createFlowElementInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.SystemOperationMode <em>System Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.SystemOperationMode
	 * @generated
	 */
	public Adapter createSystemOperationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ModeInstance <em>Mode Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ModeInstance
	 * @generated
	 */
	public Adapter createModeInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ModeTransitionInstance <em>Mode Transition Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ModeTransitionInstance
	 * @generated
	 */
	public Adapter createModeTransitionInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ConnectionReference <em>Connection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ConnectionReference
	 * @generated
	 */
	public Adapter createConnectionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.FlowSpecificationInstance <em>Flow Specification Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.FlowSpecificationInstance
	 * @generated
	 */
	public Adapter createFlowSpecificationInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.EndToEndFlowInstance <em>End To End Flow Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.EndToEndFlowInstance
	 * @generated
	 */
	public Adapter createEndToEndFlowInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.SystemInstance
	 * @generated
	 */
	public Adapter createSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instance.InstanceReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instance.InstanceReferenceValue
	 * @generated
	 */
	public Adapter createInstanceReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.PropertyAssociation <em>Property Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.PropertyAssociation
	 * @generated
	 */
	public Adapter createPropertyAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.ClassifierFeature <em>Classifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.ClassifierFeature
	 * @generated
	 */
	public Adapter createClassifierFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.ModeFeature <em>Mode Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.ModeFeature
	 * @generated
	 */
	public Adapter createModeFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.PropertyExpression <em>Property Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.PropertyExpression
	 * @generated
	 */
	public Adapter createPropertyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aadl2.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aadl2.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InstanceAdapterFactory
