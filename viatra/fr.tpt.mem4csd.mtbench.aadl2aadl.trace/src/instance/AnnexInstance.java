/**
 */
package instance;

import aadl2.AnnexSubclause;
import aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annex Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.AnnexInstance#getAnnexSubclause <em>Annex Subclause</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getAnnexInstance()
 * @model abstract="true"
 * @generated
 */
public interface AnnexInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Annex Subclause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annex Subclause</em>' reference.
	 * @see #setAnnexSubclause(AnnexSubclause)
	 * @see instance.InstancePackage#getAnnexInstance_AnnexSubclause()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnnexSubclause getAnnexSubclause();

	/**
	 * Sets the value of the '{@link instance.AnnexInstance#getAnnexSubclause <em>Annex Subclause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annex Subclause</em>' reference.
	 * @see #getAnnexSubclause()
	 * @generated
	 */
	void setAnnexSubclause(AnnexSubclause value);

} // AnnexInstance
