/**
 */
package instance;

import aadl2.FlowSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.FlowSpecificationInstance#getSource <em>Source</em>}</li>
 *   <li>{@link instance.FlowSpecificationInstance#getDestination <em>Destination</em>}</li>
 *   <li>{@link instance.FlowSpecificationInstance#getFlowSpecification <em>Flow Specification</em>}</li>
 *   <li>{@link instance.FlowSpecificationInstance#getInMode <em>In Mode</em>}</li>
 *   <li>{@link instance.FlowSpecificationInstance#getInModeTransition <em>In Mode Transition</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getFlowSpecificationInstance()
 * @model
 * @generated
 */
public interface FlowSpecificationInstance extends FlowElementInstance {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.FeatureInstance#getSrcFlowSpec <em>Src Flow Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FeatureInstance)
	 * @see instance.InstancePackage#getFlowSpecificationInstance_Source()
	 * @see instance.FeatureInstance#getSrcFlowSpec
	 * @model opposite="srcFlowSpec" resolveProxies="false" ordered="false"
	 * @generated
	 */
	FeatureInstance getSource();

	/**
	 * Sets the value of the '{@link instance.FlowSpecificationInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FeatureInstance value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link instance.FeatureInstance#getDstFlowSpec <em>Dst Flow Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(FeatureInstance)
	 * @see instance.InstancePackage#getFlowSpecificationInstance_Destination()
	 * @see instance.FeatureInstance#getDstFlowSpec
	 * @model opposite="dstFlowSpec" resolveProxies="false" ordered="false"
	 * @generated
	 */
	FeatureInstance getDestination();

	/**
	 * Sets the value of the '{@link instance.FlowSpecificationInstance#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(FeatureInstance value);

	/**
	 * Returns the value of the '<em><b>Flow Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Specification</em>' reference.
	 * @see #setFlowSpecification(FlowSpecification)
	 * @see instance.InstancePackage#getFlowSpecificationInstance_FlowSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FlowSpecification getFlowSpecification();

	/**
	 * Sets the value of the '{@link instance.FlowSpecificationInstance#getFlowSpecification <em>Flow Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Specification</em>' reference.
	 * @see #getFlowSpecification()
	 * @generated
	 */
	void setFlowSpecification(FlowSpecification value);

	/**
	 * Returns the value of the '<em><b>In Mode</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Mode</em>' reference list.
	 * @see instance.InstancePackage#getFlowSpecificationInstance_InMode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeInstance> getInMode();

	/**
	 * Returns the value of the '<em><b>In Mode Transition</b></em>' reference list.
	 * The list contents are of type {@link instance.ModeTransitionInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Mode Transition</em>' reference list.
	 * @see instance.InstancePackage#getFlowSpecificationInstance_InModeTransition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModeTransitionInstance> getInModeTransition();

} // FlowSpecificationInstance
