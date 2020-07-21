/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::PropertySets.</p>
 * <p>From package AADLConstructs::Packaging.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.GlobalNamespace#getPackage <em>Package</em>}</li>
 *   <li>{@link aadl2.GlobalNamespace#getPropertySet <em>Property Set</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getGlobalNamespace()
 * @model
 * @generated
 */
public interface GlobalNamespace extends Namespace {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link aadl2.PublicPackageSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Packaging.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see aadl2.Aadl2Package#getGlobalNamespace_Package()
	 * @model transient="true" volatile="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PublicPackageSection> getPackage();

	/**
	 * Returns the value of the '<em><b>Property Set</b></em>' reference list.
	 * The list contents are of type {@link aadl2.PropertySet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Set</em>' reference list.
	 * @see aadl2.Aadl2Package#getGlobalNamespace_PropertySet()
	 * @model transient="true" volatile="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PropertySet> getPropertySet();

} // GlobalNamespace
