/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage
 * @generated
 */
public class MoteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MotePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MotePackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoteSwitch<Adapter> modelSwitch = new MoteSwitch<Adapter>() {
		@Override
		public Adapter caseCorrAxiom(CorrAxiom object) {
			return createCorrAxiomAdapter();
		}

		@Override
		public Adapter caseCorrComponent2Component(CorrComponent2Component object) {
			return createCorrComponent2ComponentAdapter();
		}

		@Override
		public Adapter caseCorrConnection2DataAccess(CorrConnection2DataAccess object) {
			return createCorrConnection2DataAccessAdapter();
		}

		@Override
		public Adapter caseCorrRef2Ref(CorrRef2Ref object) {
			return createCorrRef2RefAdapter();
		}

		@Override
		public Adapter caseCorrConn2Conn(CorrConn2Conn object) {
			return createCorrConn2ConnAdapter();
		}

		@Override
		public Adapter caseCorrConnection2DataAccessSys(CorrConnection2DataAccessSys object) {
			return createCorrConnection2DataAccessSysAdapter();
		}

		@Override
		public Adapter caseCorrFeature2Feature(CorrFeature2Feature object) {
			return createCorrFeature2FeatureAdapter();
		}

		@Override
		public Adapter caseCorrRef2RefOther(CorrRef2RefOther object) {
			return createCorrRef2RefOtherAdapter();
		}

		@Override
		public Adapter caseMLAnnotatedElement(MLAnnotatedElement object) {
			return createMLAnnotatedElementAdapter();
		}

		@Override
		public Adapter caseTGGNode(TGGNode object) {
			return createTGGNodeAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrAxiom <em>Corr Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrAxiom
	 * @generated
	 */
	public Adapter createCorrAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrComponent2Component <em>Corr Component2 Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrComponent2Component
	 * @generated
	 */
	public Adapter createCorrComponent2ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccess <em>Corr Connection2 Data Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccess
	 * @generated
	 */
	public Adapter createCorrConnection2DataAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2Ref <em>Corr Ref2 Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2Ref
	 * @generated
	 */
	public Adapter createCorrRef2RefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConn2Conn <em>Corr Conn2 Conn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConn2Conn
	 * @generated
	 */
	public Adapter createCorrConn2ConnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccessSys <em>Corr Connection2 Data Access Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrConnection2DataAccessSys
	 * @generated
	 */
	public Adapter createCorrConnection2DataAccessSysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrFeature2Feature <em>Corr Feature2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrFeature2Feature
	 * @generated
	 */
	public Adapter createCorrFeature2FeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2RefOther <em>Corr Ref2 Ref Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.CorrRef2RefOther
	 * @generated
	 */
	public Adapter createCorrRef2RefOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mlcore.MLAnnotatedElement <em>ML Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mlcore.MLAnnotatedElement
	 * @generated
	 */
	public Adapter createMLAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.TGGNode <em>TGG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.TGGNode
	 * @generated
	 */
	public Adapter createTGGNodeAdapter() {
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

} //MoteAdapterFactory
