/**
 */
package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.impl;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mlexpressions.MlexpressionsPackage;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MoteFactory;
import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.GeneratedPackage;

import fr.tpt.mem4csd.mtbench.aadl2aadl.mote.generated.impl.GeneratedPackageImpl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotePackageImpl extends EPackageImpl implements MotePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "mote.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrComponent2ComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConnection2DataAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrRef2RefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConn2ConnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrConnection2DataAccessSysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrFeature2FeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrRef2RefOtherEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.tpt.mem4csd.mtbench.aadl2aadl.mote.MotePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MotePackageImpl() {
		super(eNS_URI, MoteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MotePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MotePackage init() {
		if (isInited)
			return (MotePackage) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMotePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MotePackageImpl theMotePackage = registeredMotePackage instanceof MotePackageImpl
				? (MotePackageImpl) registeredMotePackage
				: new MotePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Mote2Package.eINSTANCE.eClass();
		MlcorePackage.eINSTANCE.eClass();
		SdmPackage.eINSTANCE.eClass();
		MlsdmPackage.eINSTANCE.eClass();
		MlexpressionsPackage.eINSTANCE.eClass();
		MlstorypatternsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (registeredPackage instanceof GeneratedPackageImpl
				? registeredPackage
				: GeneratedPackage.eINSTANCE);

		// Load packages
		theMotePackage.loadPackage();

		// Fix loaded packages
		theMotePackage.fixPackageContents();
		theGeneratedPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMotePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MotePackage.eNS_URI, theMotePackage);
		return theMotePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrAxiom() {
		if (corrAxiomEClass == null) {
			corrAxiomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return corrAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrComponent2Component() {
		if (corrComponent2ComponentEClass == null) {
			corrComponent2ComponentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return corrComponent2ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrConnection2DataAccess() {
		if (corrConnection2DataAccessEClass == null) {
			corrConnection2DataAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return corrConnection2DataAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrRef2Ref() {
		if (corrRef2RefEClass == null) {
			corrRef2RefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI).getEClassifiers()
					.get(3);
		}
		return corrRef2RefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrConn2Conn() {
		if (corrConn2ConnEClass == null) {
			corrConn2ConnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI).getEClassifiers()
					.get(4);
		}
		return corrConn2ConnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrConnection2DataAccessSys() {
		if (corrConnection2DataAccessSysEClass == null) {
			corrConnection2DataAccessSysEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return corrConnection2DataAccessSysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrFeature2Feature() {
		if (corrFeature2FeatureEClass == null) {
			corrFeature2FeatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return corrFeature2FeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorrRef2RefOther() {
		if (corrRef2RefOtherEClass == null) {
			corrRef2RefOtherEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MotePackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return corrRef2RefOtherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoteFactory getMoteFactory() {
		return (MoteFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fr.tpt.mem4csd.mtbench.aadl2aadl.mote." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //MotePackageImpl
