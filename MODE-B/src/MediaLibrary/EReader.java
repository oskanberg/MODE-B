/**
 */
package MediaLibrary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.EReader#getVideoEnabled <em>Video Enabled</em>}</li>
 *   <li>{@link MediaLibrary.EReader#getAudioEnabled <em>Audio Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getEReader()
 * @model
 * @generated
 */
public interface EReader extends Device {
	/**
	 * Returns the value of the '<em><b>Video Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Enabled</em>' attribute.
	 * @see #setVideoEnabled(Boolean)
	 * @see MediaLibrary.MediaLibraryPackage#getEReader_VideoEnabled()
	 * @model
	 * @generated
	 */
	Boolean getVideoEnabled();

	/**
	 * Sets the value of the '{@link MediaLibrary.EReader#getVideoEnabled <em>Video Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Enabled</em>' attribute.
	 * @see #getVideoEnabled()
	 * @generated
	 */
	void setVideoEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Audio Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Enabled</em>' attribute.
	 * @see #setAudioEnabled(Boolean)
	 * @see MediaLibrary.MediaLibraryPackage#getEReader_AudioEnabled()
	 * @model
	 * @generated
	 */
	Boolean getAudioEnabled();

	/**
	 * Sets the value of the '{@link MediaLibrary.EReader#getAudioEnabled <em>Audio Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Enabled</em>' attribute.
	 * @see #getAudioEnabled()
	 * @generated
	 */
	void setAudioEnabled(Boolean value);

} // EReader
