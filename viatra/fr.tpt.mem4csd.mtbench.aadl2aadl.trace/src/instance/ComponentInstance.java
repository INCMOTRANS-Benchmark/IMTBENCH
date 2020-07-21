/**
 */
package instance;

import aadl2.ComponentCategory;
import aadl2.ComponentClassifier;
import aadl2.Subcomponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ComponentInstance#getFeatureInstance <em>Feature Instance</em>}</li>
 *   <li>{@link instance.ComponentInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link instance.ComponentInstance#getModeInstance <em>Mode Instance</em>}</li>
 *   <li>{@link instance.ComponentInstance#getModeTransitionInstance <em>Mode Transition Instance</em>}</li>
 *   <li>{@link instance.ComponentInstance#getCategory <em>Category</em>}</li>
 *   <li>{@link instance.ComponentInstance#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.ComponentInstance#getFlowSpecification <em>Flow Specification</em>}</li>
 *   <li>{@link instance.ComponentInstance#getEndToEndFlow <em>End To End Flow</em>}</li>
 *   <li>{@link instance.ComponentInstance#getConnectionInstance <em>Connection Instance</em>}</li>
 *   <li>{@link instance.ComponentInstance#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link instance.ComponentInstance#getIndex <em>Index</em>}</li>
 *   <li>{@link instance.ComponentInstance#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends ConnectionInstanceEnd, FlowElementInstance {
	/**
	 * Returns the value of the '<em><b>Feature Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_FeatureInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FeatureInstance> getFeatureInstance();

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_ComponentInstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstance();

	/**
	 * Returns the value of the '<em><b>Mode Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_ModeInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModeInstance> getModeInstance();

	/**
	 * Returns the value of the '<em><b>Mode Transition Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ModeTransitionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Transition Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_ModeTransitionInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModeTransitionInstance> getModeTransitionInstance();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.ComponentCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #setCategory(ComponentCategory)
	 * @see instance.InstancePackage#getComponentInstance_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentCategory getCategory();

	/**
	 * Sets the value of the '{@link instance.ComponentInstance#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see aadl2.ComponentCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ComponentCategory value);

	/**
	 * Returns the value of the '<em><b>In Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Mode</em>' reference list.
	 * @see instance.InstancePackage#getComponentInstance_InMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeInstance> getInMode();

	/**
	 * Returns the value of the '<em><b>Flow Specification</b></em>' containment reference list.
	 * The list contents are of type {@link instance.FlowSpecificationInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Specification</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_FlowSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FlowSpecificationInstance> getFlowSpecification();

	/**
	 * Returns the value of the '<em><b>End To End Flow</b></em>' containment reference list.
	 * The list contents are of type {@link instance.EndToEndFlowInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Flow</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_EndToEndFlow()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EndToEndFlowInstance> getEndToEndFlow();

	/**
	 * Returns the value of the '<em><b>Connection Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.ConnectionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getComponentInstance_ConnectionInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionInstance> getConnectionInstance();

	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent</em>' reference.
	 * @see #setSubcomponent(Subcomponent)
	 * @see instance.InstancePackage#getComponentInstance_Subcomponent()
	 * @model ordered="false"
	 * @generated
	 */
	Subcomponent getSubcomponent();

	/**
	 * Sets the value of the '{@link instance.ComponentInstance#getSubcomponent <em>Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent</em>' reference.
	 * @see #getSubcomponent()
	 * @generated
	 */
	void setSubcomponent(Subcomponent value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute list.
	 * @see instance.InstancePackage#getComponentInstance_Index()
	 * @model unique="false" dataType="aadl2.Integer" ordered="false"
	 * @generated
	 */
	EList<Long> getIndex();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(ComponentClassifier)
	 * @see instance.InstancePackage#getComponentInstance_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	ComponentClassifier getClassifier();

	/**
	 * Sets the value of the '{@link instance.ComponentInstance#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ComponentClassifier value);

} // ComponentInstance
