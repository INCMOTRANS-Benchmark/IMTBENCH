/**
 */
package instance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Instance End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instance.ConnectionInstanceEnd#getSrcConnectionInstance <em>Src Connection Instance</em>}</li>
 *   <li>{@link instance.ConnectionInstanceEnd#getDstConnectionInstance <em>Dst Connection Instance</em>}</li>
 * </ul>
 *
 * @see instance.InstancePackage#getConnectionInstanceEnd()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionInstanceEnd extends InstanceObject {
	/**
	 * Returns the value of the '<em><b>Src Connection Instance</b></em>' reference list.
	 * The list contents are of type {@link instance.ConnectionInstance}.
	 * It is bidirectional and its opposite is '{@link instance.ConnectionInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Connection Instance</em>' reference list.
	 * @see instance.InstancePackage#getConnectionInstanceEnd_SrcConnectionInstance()
	 * @see instance.ConnectionInstance#getSource
	 * @model opposite="source" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionInstance> getSrcConnectionInstance();

	/**
	 * Returns the value of the '<em><b>Dst Connection Instance</b></em>' reference list.
	 * The list contents are of type {@link instance.ConnectionInstance}.
	 * It is bidirectional and its opposite is '{@link instance.ConnectionInstance#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Connection Instance</em>' reference list.
	 * @see instance.InstancePackage#getConnectionInstanceEnd_DstConnectionInstance()
	 * @see instance.ConnectionInstance#getDestination
	 * @model opposite="destination" resolveProxies="false" transient="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionInstance> getDstConnectionInstance();

} // ConnectionInstanceEnd
