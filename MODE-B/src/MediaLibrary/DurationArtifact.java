/**
 */
package MediaLibrary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.DurationArtifact#getDuration <em>Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getDurationArtifact()
 * @model abstract="true"
 * @generated
 */
public interface DurationArtifact extends Artifact {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see MediaLibrary.MediaLibraryPackage#getDurationArtifact_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link MediaLibrary.DurationArtifact#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

} // DurationArtifact
