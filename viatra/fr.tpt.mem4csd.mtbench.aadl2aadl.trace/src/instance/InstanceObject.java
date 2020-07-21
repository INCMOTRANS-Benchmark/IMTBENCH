/**
 */
package instance;

import aadl2.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.InstanceObject#getAnnexInstance <em>Annex Instance</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getInstanceObject()
 * @model abstract="true"
 *        annotation="duplicates"
 * @generated
 */
public interface InstanceObject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Annex Instance</b></em>' containment reference list.
	 * The list contents are of type {@link instance.AnnexInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annex Instance</em>' containment reference list.
	 * @see instance.InstancePackage#getInstanceObject_AnnexInstance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AnnexInstance> getAnnexInstance();

} // InstanceObject
