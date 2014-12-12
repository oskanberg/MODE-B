/**
 */
package MediaLibrary;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.MediaSource#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getMediaSource()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface MediaSource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link MediaLibrary.Artifact}.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.Artifact#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getMediaSource_Contents()
	 * @see MediaLibrary.Artifact#getOrigin
	 * @model opposite="origin"
	 * @generated
	 */
	EList<Artifact> getContents();

} // MediaSource
