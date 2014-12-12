/**
 */
package MediaLibrary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.ExternalSource#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getExternalSource()
 * @model
 * @generated
 */
public interface ExternalSource extends MediaSource {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MediaLibrary.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see MediaLibrary.SourceType
	 * @see #setSourceType(SourceType)
	 * @see MediaLibrary.MediaLibraryPackage#getExternalSource_SourceType()
	 * @model
	 * @generated
	 */
	SourceType getSourceType();

	/**
	 * Sets the value of the '{@link MediaLibrary.ExternalSource#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see MediaLibrary.SourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(SourceType value);

} // ExternalSource
