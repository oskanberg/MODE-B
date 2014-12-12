/**
 */
package MediaLibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MediaLibrary.MediaCollection#getMembers <em>Members</em>}</li>
 *   <li>{@link MediaLibrary.MediaCollection#getHost <em>Host</em>}</li>
 *   <li>{@link MediaLibrary.MediaCollection#getSyncedDevices <em>Synced Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see MediaLibrary.MediaLibraryPackage#getMediaCollection()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface MediaCollection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link MediaLibrary.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getMediaCollection_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Artifact> getMembers();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.Device#getHostOf <em>Host Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(Device)
	 * @see MediaLibrary.MediaLibraryPackage#getMediaCollection_Host()
	 * @see MediaLibrary.Device#getHostOf
	 * @model opposite="hostOf" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='255,0,0' label.text='host'"
	 * @generated
	 */
	Device getHost();

	/**
	 * Sets the value of the '{@link MediaLibrary.MediaCollection#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(Device value);

	/**
	 * Returns the value of the '<em><b>Synced Devices</b></em>' reference list.
	 * The list contents are of type {@link MediaLibrary.Device}.
	 * It is bidirectional and its opposite is '{@link MediaLibrary.Device#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synced Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synced Devices</em>' reference list.
	 * @see MediaLibrary.MediaLibraryPackage#getMediaCollection_SyncedDevices()
	 * @see MediaLibrary.Device#getCollections
	 * @model opposite="collections" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' label.text='syncedDevice'"
	 * @generated
	 */
	EList<Device> getSyncedDevices();

} // MediaCollection
