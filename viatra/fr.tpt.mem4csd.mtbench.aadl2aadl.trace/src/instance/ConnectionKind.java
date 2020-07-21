/**
 */
package instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Connection Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see instance.InstancePackage#getConnectionKind()
 * @model
 * @generated
 */
public enum ConnectionKind implements Enumerator {
	/**
	 * The '<em><b>Feature Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_CONNECTION(0, "featureConnection", "featureConnection"),

	/**
	 * The '<em><b>Access Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_CONNECTION(1, "accessConnection", "accessConnection"),

	/**
	 * The '<em><b>Parameter Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_CONNECTION(2, "parameterConnection", "parameterConnection"),

	/**
	 * The '<em><b>Port Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PORT_CONNECTION(3, "portConnection", "portConnection"),

	/**
	 * The '<em><b>Mode Transition Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_TRANSITION_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MODE_TRANSITION_CONNECTION(4, "modeTransitionConnection", "modeTransitionConnection"),

	/**
	 * The '<em><b>Feature Group Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_GROUP_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_GROUP_CONNECTION(5, "featureGroupConnection", "featureGroupConnection");

	/**
	 * The '<em><b>Feature Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONNECTION
	 * @model name="featureConnection"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_CONNECTION_VALUE = 0;

	/**
	 * The '<em><b>Access Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_CONNECTION
	 * @model name="accessConnection"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_CONNECTION_VALUE = 1;

	/**
	 * The '<em><b>Parameter Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_CONNECTION
	 * @model name="parameterConnection"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_CONNECTION_VALUE = 2;

	/**
	 * The '<em><b>Port Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_CONNECTION
	 * @model name="portConnection"
	 * @generated
	 * @ordered
	 */
	public static final int PORT_CONNECTION_VALUE = 3;

	/**
	 * The '<em><b>Mode Transition Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_TRANSITION_CONNECTION
	 * @model name="modeTransitionConnection"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_TRANSITION_CONNECTION_VALUE = 4;

	/**
	 * The '<em><b>Feature Group Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_GROUP_CONNECTION
	 * @model name="featureGroupConnection"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_GROUP_CONNECTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Connection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConnectionKind[] VALUES_ARRAY =
		new ConnectionKind[] {
			FEATURE_CONNECTION,
			ACCESS_CONNECTION,
			PARAMETER_CONNECTION,
			PORT_CONNECTION,
			MODE_TRANSITION_CONNECTION,
			FEATURE_GROUP_CONNECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Connection Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConnectionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Connection Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConnectionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Connection Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConnectionKind get(int value) {
		switch (value) {
			case FEATURE_CONNECTION_VALUE: return FEATURE_CONNECTION;
			case ACCESS_CONNECTION_VALUE: return ACCESS_CONNECTION;
			case PARAMETER_CONNECTION_VALUE: return PARAMETER_CONNECTION;
			case PORT_CONNECTION_VALUE: return PORT_CONNECTION;
			case MODE_TRANSITION_CONNECTION_VALUE: return MODE_TRANSITION_CONNECTION;
			case FEATURE_GROUP_CONNECTION_VALUE: return FEATURE_GROUP_CONNECTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConnectionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConnectionKind
