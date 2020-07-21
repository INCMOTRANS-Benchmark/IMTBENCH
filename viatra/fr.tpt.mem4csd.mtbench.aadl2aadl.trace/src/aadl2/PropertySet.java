/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLProperties::PropertySets.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.PropertySet#getOwnedPropertyType <em>Owned Property Type</em>}</li>
 *   <li>{@link aadl2.PropertySet#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link aadl2.PropertySet#getOwnedPropertyConstant <em>Owned Property Constant</em>}</li>
 *   <li>{@link aadl2.PropertySet#getImportedUnit <em>Imported Unit</em>}</li>
 *   <li>{@link aadl2.PropertySet#getOwnedAnnexSubclause <em>Owned Annex Subclause</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getPropertySet()
 * @model
 * @generated
 */
public interface PropertySet extends Namespace, ModelUnit {
	/**
	 * Returns the value of the '<em><b>Owned Property Type</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Type</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertySet_OwnedPropertyType()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PropertyType> getOwnedPropertyType();

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertySet_OwnedProperty()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Owned Property Constant</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.PropertyConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Constant</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertySet_OwnedPropertyConstant()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PropertyConstant> getOwnedPropertyConstant();

	/**
	 * Returns the value of the '<em><b>Imported Unit</b></em>' reference list.
	 * The list contents are of type {@link aadl2.ModelUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Unit</em>' reference list.
	 * @see aadl2.Aadl2Package#getPropertySet_ImportedUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelUnit> getImportedUnit();

	/**
	 * Returns the value of the '<em><b>Owned Annex Subclause</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AnnexSubclause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLProperties::PropertySets.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annex Subclause</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getPropertySet_OwnedAnnexSubclause()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AnnexSubclause> getOwnedAnnexSubclause();

} // PropertySet
