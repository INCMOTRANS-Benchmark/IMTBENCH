/**
 */
package instance;

import aadl2.DirectionType;
import aadl2.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.FeatureInstance#getSrcFlowSpec <em>Src Flow Spec</em>}</li>
 *   <li>{@link instance.FeatureInstance#getDstFlowSpec <em>Dst Flow Spec</em>}</li>
 *   <li>{@link instance.FeatureInstance#getFeatureInstance <em>Feature Instance</em>}</li>
 *   <li>{@link instance.FeatureInstance#getCategory <em>Category</em>}</li>
 *   <li>{@link instance.FeatureInstance#getDirection <em>Direction</em>}</li>
 *   <li>{@link instance.FeatureInstance#getFeature <em>Feature</em>}</li>
 *   <li>{@link instance.FeatureInstance#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getFeatureInstance()
 * @model
 * @generated
 */
public interface FeatureInstance extends ConnectionInstanceEnd, InstanceObject {
	/**
	 * Returns the value of the '<em><b>Src Flow Spec</b></em>' reference list.
	 * The list contents are of type {@link instance.FlowSpecificationInstance}.
	 * It is bidirectional and its opposite is '{@link instance.FlowSpecificationInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Flow Spec</em>' reference list.
	 * @see instance.InstancePackage#getFeatureInstance_SrcFlowSpec()
	 * @see instance.FlowSpecificationInstance#getSource
	 * @model opposite="source" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<FlowSpecificationInstance> getSrcFlowSpec();

	/**
	 * Returns the value of the '<em><b>Dst Flow Spec</b></em>' reference list.
	 * The list contents are of type {@link instance.FlowSpecificationInstance}.
	 * It is bidirectional and its opposite is '{@link instance.FlowSpecificationInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Flow Spec</em>' reference list.
	 * @see instance.InstancePackage#getFeatureInstance_DstFlowSpec()
	 * @see instance.FlowSpecificationInstance#getDestination
	 * @model opposite="destination" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<FlowSpecificationInstance> getDstFlowSpec();

	/**
	 * Returns the value of the '<em><b>Feature Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.FeatureInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getFeatureInstance_FeatureInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FeatureInstance> getFeatureInstance();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link instance.FeatureCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see instance.FeatureCategory
	 * @see #setCategory(FeatureCategory)
	 * @see instance.InstancePackage#getFeatureInstance_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FeatureCategory getCategory();

	/**
	 * Sets the value of the '{@link instance.FeatureInstance#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see instance.FeatureCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(FeatureCategory value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link aadl2.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see instance.InstancePackage#getFeatureInstance_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link instance.FeatureInstance#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see aadl2.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see instance.InstancePackage#getFeatureInstance_Feature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link instance.FeatureInstance#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(long)
	 * @see instance.InstancePackage#getFeatureInstance_Index()
	 * @model unique="false" dataType="aadl2.Integer" ordered="false"
	 * @generated
	 */
	long getIndex();

	/**
	 * Sets the value of the '{@link instance.FeatureInstance#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(long value);

} // FeatureInstance
