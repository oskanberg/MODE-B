/**
 */
package MediaLibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.Device#getHostOf <em>Host Of</em>}</li>
 *   <li>{@link MediaLibrary.Device#getCollections <em>Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getDevice()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Host Of</b></em>' reference list.
	 * The list contents are of type {@link MediaLibrary.MediaCollection}.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.MediaCollection#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Of</em>' reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getDevice_HostOf()
	 * @see MediaLibrary.MediaCollection#getHost
	 * @model opposite="host"
	 * @generated
	 */
	EList<MediaCollection> getHostOf();

	/**
	 * Returns the value of the '<em><b>Collections</b></em>' reference list.
	 * The list contents are of type {@link MediaLibrary.MediaCollection}.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.MediaCollection#getSyncedDevices <em>Synced Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getDevice_Collections()
	 * @see MediaLibrary.MediaCollection#getSyncedDevices
	 * @model opposite="syncedDevices"
	 * @generated
	 */
	EList<MediaCollection> getCollections();

} // Device
