/**
 */
package aadl2.impl;

import aadl2.Aadl2Package;
import aadl2.AbstractSubcomponent;
import aadl2.AccessConnection;
import aadl2.ComponentImplementation;
import aadl2.ComponentType;
import aadl2.Connection;
import aadl2.EndToEndFlow;
import aadl2.EventDataSource;
import aadl2.EventSource;
import aadl2.FeatureConnection;
import aadl2.FeatureGroupConnection;
import aadl2.FlowImplementation;
import aadl2.ImplementationExtension;
import aadl2.InternalFeature;
import aadl2.ParameterConnection;
import aadl2.PortConnection;
import aadl2.PortProxy;
import aadl2.ProcessorFeature;
import aadl2.Realization;
import aadl2.Subcomponent;
import aadl2.SubprogramProxy;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getType <em>Type</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedSubcomponent <em>Owned Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedFlowImplementation <em>Owned Flow Implementation</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedRealization <em>Owned Realization</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedEndToEndFlow <em>Owned End To End Flow</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedAbstractSubcomponent <em>Owned Abstract Subcomponent</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedAccessConnection <em>Owned Access Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedParameterConnection <em>Owned Parameter Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedPortConnection <em>Owned Port Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedFeatureConnection <em>Owned Feature Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedFeatureGroupConnection <em>Owned Feature Group Connection</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#isNoSubcomponents <em>No Subcomponents</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#isNoConnections <em>No Connections</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#isNoCalls <em>No Calls</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedProcessorFeature <em>Owned Processor Feature</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedInternalFeature <em>Owned Internal Feature</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedEventSource <em>Owned Event Source</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedEventDataSource <em>Owned Event Data Source</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedPortProxy <em>Owned Port Proxy</em>}</li>
 *   <li>{@link aadl2.impl.ComponentImplementationImpl#getOwnedSubprogramProxy <em>Owned Subprogram Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImplementationImpl extends ComponentClassifierImpl implements ComponentImplementation {
	/**
	 * The cached value of the '{@link #getOwnedFlowImplementation() <em>Owned Flow Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlowImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowImplementation> ownedFlowImplementation;

	/**
	 * The cached value of the '{@link #getOwnedExtension() <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtension()
	 * @generated
	 * @ordered
	 */
	protected ImplementationExtension ownedExtension;

	/**
	 * The cached value of the '{@link #getOwnedRealization() <em>Owned Realization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRealization()
	 * @generated
	 * @ordered
	 */
	protected Realization ownedRealization;

	/**
	 * The cached value of the '{@link #getOwnedEndToEndFlow() <em>Owned End To End Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndToEndFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<EndToEndFlow> ownedEndToEndFlow;

	/**
	 * The cached value of the '{@link #getOwnedAbstractSubcomponent() <em>Owned Abstract Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSubcomponent> ownedAbstractSubcomponent;

	/**
	 * The cached value of the '{@link #getOwnedAccessConnection() <em>Owned Access Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAccessConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessConnection> ownedAccessConnection;

	/**
	 * The cached value of the '{@link #getOwnedParameterConnection() <em>Owned Parameter Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterConnection> ownedParameterConnection;

	/**
	 * The cached value of the '{@link #getOwnedPortConnection() <em>Owned Port Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnection> ownedPortConnection;

	/**
	 * The cached value of the '{@link #getOwnedFeatureConnection() <em>Owned Feature Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureConnection> ownedFeatureConnection;

	/**
	 * The cached value of the '{@link #getOwnedFeatureGroupConnection() <em>Owned Feature Group Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureGroupConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroupConnection> ownedFeatureGroupConnection;

	/**
	 * The default value of the '{@link #isNoSubcomponents() <em>No Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SUBCOMPONENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoSubcomponents() <em>No Subcomponents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected boolean noSubcomponents = NO_SUBCOMPONENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoConnections() <em>No Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoConnections()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_CONNECTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoConnections() <em>No Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoConnections()
	 * @generated
	 * @ordered
	 */
	protected boolean noConnections = NO_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoCalls() <em>No Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoCalls()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_CALLS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoCalls() <em>No Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoCalls()
	 * @generated
	 * @ordered
	 */
	protected boolean noCalls = NO_CALLS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEventSource() <em>Owned Event Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventSource()
	 * @generated
	 * @ordered
	 */
	protected EList<EventSource> ownedEventSource;

	/**
	 * The cached value of the '{@link #getOwnedEventDataSource() <em>Owned Event Data Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEventDataSource()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDataSource> ownedEventDataSource;

	/**
	 * The cached value of the '{@link #getOwnedPortProxy() <em>Owned Port Proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<PortProxy> ownedPortProxy;

	/**
	 * The cached value of the '{@link #getOwnedSubprogramProxy() <em>Owned Subprogram Proxy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubprogramProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<SubprogramProxy> ownedSubprogramProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Aadl2Package.eINSTANCE.getComponentImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getType() {
		ComponentType type = basicGetType();
		return type != null && type.eIsProxy() ? (ComponentType)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComponentType newType) {
		// TODO: implement this method to set the 'Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subcomponent> getOwnedSubcomponent() {
		// TODO: implement this method to return the 'Owned Subcomponent' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentImplementation getExtended() {
		ComponentImplementation extended = basicGetExtended();
		return extended != null && extended.eIsProxy() ? (ComponentImplementation)eResolveProxy((InternalEObject)extended) : extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation basicGetExtended() {
		// TODO: implement this method to return the 'Extended' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtended(ComponentImplementation newExtended) {
		// TODO: implement this method to set the 'Extended' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowImplementation> getOwnedFlowImplementation() {
		if (ownedFlowImplementation == null) {
			ownedFlowImplementation = new EObjectContainmentEList<FlowImplementation>(FlowImplementation.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION);
		}
		return ownedFlowImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOwnedConnection() {
		// TODO: implement this method to return the 'Owned Connection' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationExtension getOwnedExtension() {
		return ownedExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExtension(ImplementationExtension newOwnedExtension, NotificationChain msgs) {
		ImplementationExtension oldOwnedExtension = ownedExtension;
		ownedExtension = newOwnedExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION, oldOwnedExtension, newOwnedExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedExtension(ImplementationExtension newOwnedExtension) {
		if (newOwnedExtension != ownedExtension) {
			NotificationChain msgs = null;
			if (ownedExtension != null)
				msgs = ((InternalEObject)ownedExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION, null, msgs);
			if (newOwnedExtension != null)
				msgs = ((InternalEObject)newOwnedExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION, null, msgs);
			msgs = basicSetOwnedExtension(newOwnedExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION, newOwnedExtension, newOwnedExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Realization getOwnedRealization() {
		return ownedRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRealization(Realization newOwnedRealization, NotificationChain msgs) {
		Realization oldOwnedRealization = ownedRealization;
		ownedRealization = newOwnedRealization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION, oldOwnedRealization, newOwnedRealization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedRealization(Realization newOwnedRealization) {
		if (newOwnedRealization != ownedRealization) {
			NotificationChain msgs = null;
			if (ownedRealization != null)
				msgs = ((InternalEObject)ownedRealization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION, null, msgs);
			if (newOwnedRealization != null)
				msgs = ((InternalEObject)newOwnedRealization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION, null, msgs);
			msgs = basicSetOwnedRealization(newOwnedRealization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION, newOwnedRealization, newOwnedRealization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndToEndFlow> getOwnedEndToEndFlow() {
		if (ownedEndToEndFlow == null) {
			ownedEndToEndFlow = new EObjectContainmentEList<EndToEndFlow>(EndToEndFlow.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW);
		}
		return ownedEndToEndFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractSubcomponent> getOwnedAbstractSubcomponent() {
		if (ownedAbstractSubcomponent == null) {
			ownedAbstractSubcomponent = new EObjectContainmentEList<AbstractSubcomponent>(AbstractSubcomponent.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT);
		}
		return ownedAbstractSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessConnection> getOwnedAccessConnection() {
		if (ownedAccessConnection == null) {
			ownedAccessConnection = new EObjectContainmentEList<AccessConnection>(AccessConnection.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION);
		}
		return ownedAccessConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterConnection> getOwnedParameterConnection() {
		if (ownedParameterConnection == null) {
			ownedParameterConnection = new EObjectContainmentEList<ParameterConnection>(ParameterConnection.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION);
		}
		return ownedParameterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortConnection> getOwnedPortConnection() {
		if (ownedPortConnection == null) {
			ownedPortConnection = new EObjectContainmentEList<PortConnection>(PortConnection.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION);
		}
		return ownedPortConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureConnection> getOwnedFeatureConnection() {
		if (ownedFeatureConnection == null) {
			ownedFeatureConnection = new EObjectContainmentEList<FeatureConnection>(FeatureConnection.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION);
		}
		return ownedFeatureConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureGroupConnection> getOwnedFeatureGroupConnection() {
		if (ownedFeatureGroupConnection == null) {
			ownedFeatureGroupConnection = new EObjectContainmentEList<FeatureGroupConnection>(FeatureGroupConnection.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION);
		}
		return ownedFeatureGroupConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoSubcomponents() {
		return noSubcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoSubcomponents(boolean newNoSubcomponents) {
		boolean oldNoSubcomponents = noSubcomponents;
		noSubcomponents = newNoSubcomponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS, oldNoSubcomponents, noSubcomponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoConnections() {
		return noConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoConnections(boolean newNoConnections) {
		boolean oldNoConnections = noConnections;
		noConnections = newNoConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS, oldNoConnections, noConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoCalls() {
		return noCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoCalls(boolean newNoCalls) {
		boolean oldNoCalls = noCalls;
		noCalls = newNoCalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS, oldNoCalls, noCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessorFeature> getOwnedProcessorFeature() {
		// TODO: implement this method to return the 'Owned Processor Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternalFeature> getOwnedInternalFeature() {
		// TODO: implement this method to return the 'Owned Internal Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventSource> getOwnedEventSource() {
		if (ownedEventSource == null) {
			ownedEventSource = new EObjectContainmentEList<EventSource>(EventSource.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE);
		}
		return ownedEventSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDataSource> getOwnedEventDataSource() {
		if (ownedEventDataSource == null) {
			ownedEventDataSource = new EObjectContainmentEList<EventDataSource>(EventDataSource.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE);
		}
		return ownedEventDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortProxy> getOwnedPortProxy() {
		if (ownedPortProxy == null) {
			ownedPortProxy = new EObjectContainmentEList<PortProxy>(PortProxy.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY);
		}
		return ownedPortProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubprogramProxy> getOwnedSubprogramProxy() {
		if (ownedSubprogramProxy == null) {
			ownedSubprogramProxy = new EObjectContainmentEList<SubprogramProxy>(SubprogramProxy.class, this, Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY);
		}
		return ownedSubprogramProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Subcomponent> getAllSubcomponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
				return ((InternalEList<?>)getOwnedFlowImplementation()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
				return basicSetOwnedExtension(null, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
				return basicSetOwnedRealization(null, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
				return ((InternalEList<?>)getOwnedEndToEndFlow()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
				return ((InternalEList<?>)getOwnedAbstractSubcomponent()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
				return ((InternalEList<?>)getOwnedAccessConnection()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				return ((InternalEList<?>)getOwnedParameterConnection()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return ((InternalEList<?>)getOwnedPortConnection()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
				return ((InternalEList<?>)getOwnedFeatureConnection()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
				return ((InternalEList<?>)getOwnedFeatureGroupConnection()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
				return ((InternalEList<?>)getOwnedEventSource()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
				return ((InternalEList<?>)getOwnedEventDataSource()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
				return ((InternalEList<?>)getOwnedPortProxy()).basicRemove(otherEnd, msgs);
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
				return ((InternalEList<?>)getOwnedSubprogramProxy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBCOMPONENT:
				return getOwnedSubcomponent();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__EXTENDED:
				if (resolve) return getExtended();
				return basicGetExtended();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
				return getOwnedFlowImplementation();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_CONNECTION:
				return getOwnedConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
				return getOwnedExtension();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
				return getOwnedRealization();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
				return getOwnedEndToEndFlow();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
				return getOwnedAbstractSubcomponent();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
				return getOwnedAccessConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				return getOwnedParameterConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return getOwnedPortConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
				return getOwnedFeatureConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
				return getOwnedFeatureGroupConnection();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS:
				return isNoSubcomponents();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS:
				return isNoConnections();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS:
				return isNoCalls();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PROCESSOR_FEATURE:
				return getOwnedProcessorFeature();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_INTERNAL_FEATURE:
				return getOwnedInternalFeature();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
				return getOwnedEventSource();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
				return getOwnedEventDataSource();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
				return getOwnedPortProxy();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
				return getOwnedSubprogramProxy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION__TYPE:
				setType((ComponentType)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__EXTENDED:
				setExtended((ComponentImplementation)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
				getOwnedFlowImplementation().clear();
				getOwnedFlowImplementation().addAll((Collection<? extends FlowImplementation>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
				setOwnedExtension((ImplementationExtension)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
				setOwnedRealization((Realization)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
				getOwnedEndToEndFlow().clear();
				getOwnedEndToEndFlow().addAll((Collection<? extends EndToEndFlow>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
				getOwnedAbstractSubcomponent().clear();
				getOwnedAbstractSubcomponent().addAll((Collection<? extends AbstractSubcomponent>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
				getOwnedAccessConnection().clear();
				getOwnedAccessConnection().addAll((Collection<? extends AccessConnection>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
				getOwnedParameterConnection().addAll((Collection<? extends ParameterConnection>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				getOwnedPortConnection().addAll((Collection<? extends PortConnection>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
				getOwnedFeatureConnection().clear();
				getOwnedFeatureConnection().addAll((Collection<? extends FeatureConnection>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
				getOwnedFeatureGroupConnection().clear();
				getOwnedFeatureGroupConnection().addAll((Collection<? extends FeatureGroupConnection>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS:
				setNoSubcomponents((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS:
				setNoConnections((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS:
				setNoCalls((Boolean)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
				getOwnedEventSource().clear();
				getOwnedEventSource().addAll((Collection<? extends EventSource>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
				getOwnedEventDataSource().clear();
				getOwnedEventDataSource().addAll((Collection<? extends EventDataSource>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
				getOwnedPortProxy().clear();
				getOwnedPortProxy().addAll((Collection<? extends PortProxy>)newValue);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
				getOwnedSubprogramProxy().clear();
				getOwnedSubprogramProxy().addAll((Collection<? extends SubprogramProxy>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION__TYPE:
				setType((ComponentType)null);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__EXTENDED:
				setExtended((ComponentImplementation)null);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
				getOwnedFlowImplementation().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
				setOwnedExtension((ImplementationExtension)null);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
				setOwnedRealization((Realization)null);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
				getOwnedEndToEndFlow().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
				getOwnedAbstractSubcomponent().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
				getOwnedAccessConnection().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				getOwnedParameterConnection().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				getOwnedPortConnection().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
				getOwnedFeatureConnection().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
				getOwnedFeatureGroupConnection().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS:
				setNoSubcomponents(NO_SUBCOMPONENTS_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS:
				setNoConnections(NO_CONNECTIONS_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS:
				setNoCalls(NO_CALLS_EDEFAULT);
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
				getOwnedEventSource().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
				getOwnedEventDataSource().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
				getOwnedPortProxy().clear();
				return;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
				getOwnedSubprogramProxy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION__TYPE:
				return basicGetType() != null;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBCOMPONENT:
				return !getOwnedSubcomponent().isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__EXTENDED:
				return basicGetExtended() != null;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FLOW_IMPLEMENTATION:
				return ownedFlowImplementation != null && !ownedFlowImplementation.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_CONNECTION:
				return !getOwnedConnection().isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EXTENSION:
				return ownedExtension != null;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_REALIZATION:
				return ownedRealization != null;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_END_TO_END_FLOW:
				return ownedEndToEndFlow != null && !ownedEndToEndFlow.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ABSTRACT_SUBCOMPONENT:
				return ownedAbstractSubcomponent != null && !ownedAbstractSubcomponent.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_ACCESS_CONNECTION:
				return ownedAccessConnection != null && !ownedAccessConnection.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PARAMETER_CONNECTION:
				return ownedParameterConnection != null && !ownedParameterConnection.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_CONNECTION:
				return ownedPortConnection != null && !ownedPortConnection.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_CONNECTION:
				return ownedFeatureConnection != null && !ownedFeatureConnection.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_FEATURE_GROUP_CONNECTION:
				return ownedFeatureGroupConnection != null && !ownedFeatureGroupConnection.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_SUBCOMPONENTS:
				return noSubcomponents != NO_SUBCOMPONENTS_EDEFAULT;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CONNECTIONS:
				return noConnections != NO_CONNECTIONS_EDEFAULT;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__NO_CALLS:
				return noCalls != NO_CALLS_EDEFAULT;
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PROCESSOR_FEATURE:
				return !getOwnedProcessorFeature().isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_INTERNAL_FEATURE:
				return !getOwnedInternalFeature().isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_SOURCE:
				return ownedEventSource != null && !ownedEventSource.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_EVENT_DATA_SOURCE:
				return ownedEventDataSource != null && !ownedEventDataSource.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_PORT_PROXY:
				return ownedPortProxy != null && !ownedPortProxy.isEmpty();
			case Aadl2Package.COMPONENT_IMPLEMENTATION__OWNED_SUBPROGRAM_PROXY:
				return ownedSubprogramProxy != null && !ownedSubprogramProxy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Aadl2Package.COMPONENT_IMPLEMENTATION___GET_ALL_SUBCOMPONENTS:
				return getAllSubcomponents();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (noSubcomponents: ");
		result.append(noSubcomponents);
		result.append(", noConnections: ");
		result.append(noConnections);
		result.append(", noCalls: ");
		result.append(noCalls);
		result.append(')');
		return result.toString();
	}

} //ComponentImplementationImpl
