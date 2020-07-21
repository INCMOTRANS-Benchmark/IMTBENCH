/**
 */
package aadl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package AADLDetails::Components::Memory.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aadl2.MemoryImplementation#getOwnedBusSubcomponent <em>Owned Bus Subcomponent</em>}</li>
 *   <li>{@link aadl2.MemoryImplementation#getOwnedMemorySubcomponent <em>Owned Memory Subcomponent</em>}</li>
 * </ul>
 *
 * @see aadl2.Aadl2Package#getMemoryImplementation()
 * @model annotation="duplicates"
 * @generated
 */
public interface MemoryImplementation extends ComponentImplementation, MemoryClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Bus Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.BusSubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Memory.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Bus Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getMemoryImplementation_OwnedBusSubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BusSubcomponent> getOwnedBusSubcomponent();

	/**
	 * Returns the value of the '<em><b>Owned Memory Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link aadl2.MemorySubcomponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>From package AADLDetails::Components::Memory.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Memory Subcomponent</em>' containment reference list.
	 * @see aadl2.Aadl2Package#getMemoryImplementation_OwnedMemorySubcomponent()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<MemorySubcomponent> getOwnedMemorySubcomponent();

} // MemoryImplementation
