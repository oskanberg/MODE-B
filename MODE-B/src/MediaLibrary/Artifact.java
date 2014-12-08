/**
 */
package MediaLibrary;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link MediaLibrary.Artifact#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getArtifact()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MediaLibrary.MediaLibraryPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MediaLibrary.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.MediaSource#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(MediaSource)
	 * @see MediaLibrary.MediaLibraryPackage#getArtifact_Origin()
	 * @see MediaLibrary.MediaSource#getContents
	 * @model opposite="contents" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='50,200,0' label.text='origin'"
	 * @generated
	 */
	MediaSource getOrigin();

	/**
	 * Sets the value of the '{@link MediaLibrary.Artifact#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(MediaSource value);

} // Artifact
