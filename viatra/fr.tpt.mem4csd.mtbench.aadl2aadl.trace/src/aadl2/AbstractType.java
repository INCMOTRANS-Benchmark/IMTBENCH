/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Abstract.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.AbstractType#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedDataAccess <em>Owned Data Access</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedSubprogramAccess <em>Owned Subprogram Access</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedDataPort <em>Owned Data Port</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedEventPort <em>Owned Event Port</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedEventDataPort <em>Owned Event Data Port</em>}</li>
 *   <li>{@link aadl2.AbstractType#getOwnedSubprogramGroupAccess <em>Owned Subprogram Group Access</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getAbstractType()
 * @model
 * @generated
 */
public interface AbstractType extends ComponentType, AbstractClassifier, CallContext {
	/**
	 * Returns the value of the '<em><b>Owned Bus Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedBusAccess()
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
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedDataAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataAccess> getOwnedDataAccess();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedSubprogramAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramAccess> getOwnedSubprogramAccess();

	/**
	 * Returns the value of the '<em><b>Owned Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.DataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DataPort> getOwnedDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedEventPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventPort> getOwnedEventPort();

	/**
	 * Returns the value of the '<em><b>Owned Event Data Port</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.EventDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Event Data Port</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedEventDataPort()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EventDataPort> getOwnedEventDataPort();

	/**
	 * Returns the value of the '<em><b>Owned Subprogram Group Access</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.SubprogramGroupAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Abstract.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subprogram Group Access</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getAbstractType_OwnedSubprogramGroupAccess()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SubprogramGroupAccess> getOwnedSubprogramGroupAccess();

} // AbstractType
