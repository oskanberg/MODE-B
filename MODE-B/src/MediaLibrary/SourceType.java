/**
 */
package MediaLibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Source Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MediaLibrary.MediaLibraryPackage#getSourceType()
 * @model
 * @generated
 */
public enum SourceType implements Enumerator {
	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(0, "CD", "CD"),

	/**
	 * The '<em><b>DVD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DVD_VALUE
	 * @generated
	 * @ordered
	 */
	DVD(1, "DVD", "DVD"),

	/**
	 * The '<em><b>VHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VHS_VALUE
	 * @generated
	 * @ordered
	 */
	VHS(2, "VHS", "VHS"),

	/**
	 * The '<em><b>CASSETTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSETTE_VALUE
	 * @generated
	 * @ordered
	 */
	CASSETTE(3, "CASSETTE", "CASSETTE"),

	/**
	 * The '<em><b>HDD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDD_VALUE
	 * @generated
	 * @ordered
	 */
	HDD(4, "HDD", "HDD"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "OTHER", "OTHER");

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 0;

	/**
	 * The '<em><b>DVD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DVD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DVD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DVD_VALUE = 1;

	/**
	 * The '<em><b>VHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VHS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VHS_VALUE = 2;

	/**
	 * The '<em><b>CASSETTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASSETTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASSETTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASSETTE_VALUE = 3;

	/**
	 * The '<em><b>HDD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HDD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HDD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HDD_VALUE = 4;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceType[] VALUES_ARRAY =
		new SourceType[] {
			CD,
			DVD,
			VHS,
			CASSETTE,
			HDD,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceType get(int value) {
		switch (value) {
			case CD_VALUE: return CD;
			case DVD_VALUE: return DVD;
			case VHS_VALUE: return VHS;
			case CASSETTE_VALUE: return CASSETTE;
			case HDD_VALUE: return HDD;
			case OTHER_VALUE: return OTHER;
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
	private SourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //SourceType
