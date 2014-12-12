/**
 */
package MediaLibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecosystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.Ecosystem#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link MediaLibrary.Ecosystem#getDevices <em>Devices</em>}</li>
 *   <li>{@link MediaLibrary.Ecosystem#getMediaSources <em>Media Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getEcosystem()
 * @model
 * @generated
 */
public interface Ecosystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link MediaLibrary.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getEcosystem_Libraries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link MediaLibrary.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getEcosystem_Devices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Media Sources</b></em>' containment reference list.
	 * The list contents are of type {@link MediaLibrary.MediaSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Sources</em>' containment reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getEcosystem_MediaSources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MediaSource> getMediaSources();

} // Ecosystem
