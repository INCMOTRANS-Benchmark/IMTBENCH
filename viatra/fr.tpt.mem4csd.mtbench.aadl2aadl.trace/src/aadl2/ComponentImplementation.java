/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::NoneSupport.</p>
 * <p>From package AADLConstructs::Components.</p>
 * <p>From package AADLDetails::Components::Abstract.</p>
 * <p>From package AADLDetails::Connections.</p>
 * <p>From package AADLDetails::Special Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.ComponentImplementation#getType <em>Type</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedSubcomponent <em>Owned Subcomponent</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedFlowImplementation <em>Owned Flow Implementation</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedRealization <em>Owned Realization</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedEndToEndFlow <em>Owned End To End Flow</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedAbstractSubcomponent <em>Owned Abstract Subcomponent</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedAccessConnection <em>Owned Access Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedParameterConnection <em>Owned Parameter Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedPortConnection <em>Owned Port Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedFeatureConnection <em>Owned Feature Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedFeatureGroupConnection <em>Owned Feature Group Connection</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#isNoSubcomponents <em>No Subcomponents</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#isNoConnections <em>No Connections</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#isNoCalls <em>No Calls</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedProcessorFeature <em>Owned Processor Feature</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedInternalFeature <em>Owned Internal Feature</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedEventSource <em>Owned Event Source</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedEventDataSource <em>Owned Event Data Source</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedPortProxy <em>Owned Port Proxy</em>}</li>
 *   <li>{@link aadl2.ComponentImplementation#getOwnedSubprogramProxy <em>Owned Subprogram Proxy</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getComponentImplementation()
 * @model abstract="true"
 * @generated
 */
public interface ComponentImplementation extends ComponentClassifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see aadl2.Aadl2Package#getComponentImplementation_Type()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Owned Subcomponent</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Subcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subcomponent</em>' reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedSubcomponent()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Subcomponent> getOwnedSubcomponent();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(ComponentImplementation)
	 * @see aadl2.Aadl2Package#getComponentImplementation_Extended()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ComponentImplementation getExtended();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Owned Flow Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FlowImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Flow Implementation</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedFlowImplementation()
	 * @model containment="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FlowImplementation> getOwnedFlowImplementation();

	/**
	 * Returns the value of the '<em><b>Owned Connection</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connection</em>' reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedConnection()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Connection> getOwnedConnection();

	/**
	 * Returns the value of the '<em><b>Owned Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Extension</em>' containment reference.
	 * @see #setOwnedExtension(ImplementationExtension)
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedExtension()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ImplementationExtension getOwnedExtension();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#getOwnedExtension <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Extension</em>' containment reference.
	 * @see #getOwnedExtension()
	 * @generated
	 */
	void setOwnedExtension(ImplementationExtension value);

	/**
	 * Returns the value of the '<em><b>Owned Realization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Realization</em>' containment reference.
	 * @see #setOwnedRealization(Realization)
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedRealization()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Realization getOwnedRealization();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#getOwnedRealization <em>Owned Realization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Realization</em>' containment reference.
	 * @see #getOwnedRealization()
	 * @generated
	 */
	void setOwnedRealization(Realization value);

	/**
	 * Returns the value of the '<em><b>Owned End To End Flow</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EndToEndFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End To End Flow</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedEndToEndFlow()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EndToEndFlow> getOwnedEndToEndFlow();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AbstractSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Abstract Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedAbstractSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AbstractSubcomponent> getOwnedAbstractSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Access Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AccessConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Access Connection</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedAccessConnection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AccessConnection> getOwnedAccessConnection();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.ParameterConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter Connection</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedParameterConnection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ParameterConnection> getOwnedParameterConnection();

	/**
	 * Returns the value of the '<em><b>Owned Port Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PortConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port Connection</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedPortConnection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortConnection> getOwnedPortConnection();

	/**
	 * Returns the value of the '<em><b>Owned Feature Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FeatureConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Connection</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedFeatureConnection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureConnection> getOwnedFeatureConnection();

	/**
	 * Returns the value of the '<em><b>Owned Feature Group Connection</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FeatureGroupConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Connections.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Group Connection</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedFeatureGroupConnection()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureGroupConnection> getOwnedFeatureGroupConnection();

	/**
	 * Returns the value of the '<em><b>No Subcomponents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Subcomponents</em>' attribute.
	 * @see #setNoSubcomponents(boolean)
	 * @see aadl2.Aadl2Package#getComponentImplementation_NoSubcomponents()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoSubcomponents();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#isNoSubcomponents <em>No Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Subcomponents</em>' attribute.
	 * @see #isNoSubcomponents()
	 * @generated
	 */
	void setNoSubcomponents(boolean value);

	/**
	 * Returns the value of the '<em><b>No Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Connections</em>' attribute.
	 * @see #setNoConnections(boolean)
	 * @see aadl2.Aadl2Package#getComponentImplementation_NoConnections()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoConnections();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#isNoConnections <em>No Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Connections</em>' attribute.
	 * @see #isNoConnections()
	 * @generated
	 */
	void setNoConnections(boolean value);

	/**
	 * Returns the value of the '<em><b>No Calls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::NoneSupport.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Calls</em>' attribute.
	 * @see #setNoCalls(boolean)
	 * @see aadl2.Aadl2Package#getComponentImplementation_NoCalls()
	 * @model dataType="aadl2.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoCalls();

	/**
	 * Sets the value of the '{@link aadl2.ComponentImplementation#isNoCalls <em>No Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Calls</em>' attribute.
	 * @see #isNoCalls()
	 * @generated
	 */
	void setNoCalls(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Processor Feature</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ProcessorFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Processor Feature</em>' reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedProcessorFeature()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ProcessorFeature> getOwnedProcessorFeature();

	/**
	 * Returns the value of the '<em><b>Owned Internal Feature</b></em>' reference list.
	 * The list contents are of type {@link aadl2.InternalFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Internal Feature</em>' reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedInternalFeature()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<InternalFeature> getOwnedInternalFeature();

	/**
	 * Returns the value of the '<em><b>Owned Event Source</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Source</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedEventSource()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventSource> getOwnedEventSource();

	/**
	 * Returns the value of the '<em><b>Owned Event Data Source</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventDataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Data Source</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedEventDataSource()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventDataSource> getOwnedEventDataSource();

	/**
	 * Returns the value of the '<em><b>Owned Port Proxy</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PortProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port Proxy</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedPortProxy()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortProxy> getOwnedPortProxy();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Proxy</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramProxy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Special Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Proxy</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getComponentImplementation_OwnedSubprogramProxy()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramProxy> getOwnedSubprogramProxy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Components.</p>
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Subcomponent> getAllSubcomponents();

} // ComponentImplementation
