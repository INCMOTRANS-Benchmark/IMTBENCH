/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLConstructs::Features.</p>
 * <p>From package AADLDetails::Features.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getExtended <em>Extended</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getInverse <em>Inverse</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedExtension <em>Owned Extension</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedDataPort <em>Owned Data Port</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedEventDataPort <em>Owned Event Data Port</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedEventPort <em>Owned Event Port</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedFeatureGroup <em>Owned Feature Group</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedSubprogramGroupAccess <em>Owned Subprogram Group Access</em>}</li>
 *   <li>{@link aadl2.FeatureGroupType#getOwnedAbstractFeature <em>Owned Abstract Feature</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getFeatureGroupType()
 * @model
 * @generated
 */
public interface FeatureGroupType extends Classifier, FeatureType {
	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' reference list.
	 * The list contents are of type {@link aadl2.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature</em>' reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedFeature()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' reference.
	 * @see #setExtended(FeatureGroupType)
	 * @see aadl2.Aadl2Package#getFeatureGroupType_Extended()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	FeatureGroupType getExtended();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupType#getExtended <em>Extended</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(FeatureGroupType value);

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(FeatureGroupType)
	 * @see aadl2.Aadl2Package#getFeatureGroupType_Inverse()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureGroupType getInverse();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupType#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(FeatureGroupType value);

	/**
	 * Returns the value of the '<em><b>Owned Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLConstructs::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Extension</em>' containment reference.
	 * @see #setOwnedExtension(GroupExtension)
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedExtension()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	GroupExtension getOwnedExtension();

	/**
	 * Sets the value of the '{@link aadl2.FeatureGroupType#getOwnedExtension <em>Owned Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Extension</em>' containment reference.
	 * @see #getOwnedExtension()
	 * @generated
	 */
	void setOwnedExtension(GroupExtension value);

	/**
	 * Returns the value of the '<em><b>Owned Bus Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedBusAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BusAccess> getOwnedBusAccess();

	/**
	 * Returns the value of the '<em><b>Owned Data Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedDataAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataAccess> getOwnedDataAccess();

	/**
	 * Returns the value of the '<em><b>Owned Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataPort> getOwnedDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedEventDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventDataPort> getOwnedEventDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedEventPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventPort> getOwnedEventPort();

	/**
	 * Returns the value of the '<em><b>Owned Feature Group</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.FeatureGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Group</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedFeatureGroup()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureGroup> getOwnedFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedParameter()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedSubprogramAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramAccess> getOwnedSubprogramAccess();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Group Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramGroupAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedSubprogramGroupAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupAccess> getOwnedSubprogramGroupAccess();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Feature</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.AbstractFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Features.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Abstract Feature</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getFeatureGroupType_OwnedAbstractFeature()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AbstractFeature> getOwnedAbstractFeature();

} // FeatureGroupType
