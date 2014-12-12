/**
 */
package MediaLibrary.impl;

import MediaLibrary.Artifact;
import MediaLibrary.Device;
import MediaLibrary.MediaCollection;
import MediaLibrary.MediaLibraryPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MediaLibrary.impl.MediaCollectionImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link MediaLibrary.impl.MediaCollectionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MediaLibrary.impl.MediaCollectionImpl#getSyncedDevices <em>Synced Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaCollectionImpl extends NamedElementImpl implements MediaCollection {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> members;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected Device host;

	/**
	 * The cached value of the '{@link #getSyncedDevices() <em>Synced Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> syncedDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaLibraryPackage.Literals.MEDIA_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Artifact>(Artifact.class, this, MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (Device)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MediaLibraryPackage.MEDIA_COLLECTION__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(Device newHost, NotificationChain msgs) {
		Device oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MediaLibraryPackage.MEDIA_COLLECTION__HOST, oldHost, newHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(Device newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, MediaLibraryPackage.DEVICE__HOST_OF, Device.class, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, MediaLibraryPackage.DEVICE__HOST_OF, Device.class, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaLibraryPackage.MEDIA_COLLECTION__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getSyncedDevices() {
		if (syncedDevices == null) {
			syncedDevices = new EObjectWithInverseResolvingEList.ManyInverse<Device>(Device.class, this, MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES, MediaLibraryPackage.DEVICE__COLLECTIONS);
		}
		return syncedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				if (host != null)
					msgs = ((InternalEObject)host).eInverseRemove(this, MediaLibraryPackage.DEVICE__HOST_OF, Device.class, msgs);
				return basicSetHost((Device)otherEnd, msgs);
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSyncedDevices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				return basicSetHost(null, msgs);
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				return ((InternalEList<?>)getSyncedDevices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS:
				return getMembers();
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				return getSyncedDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Artifact>)newValue);
				return;
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				setHost((Device)newValue);
				return;
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				getSyncedDevices().clear();
				getSyncedDevices().addAll((Collection<? extends Device>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS:
				getMembers().clear();
				return;
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				setHost((Device)null);
				return;
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				getSyncedDevices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MediaLibraryPackage.MEDIA_COLLECTION__MEMBERS:
				return members != null && !members.isEmpty();
			case MediaLibraryPackage.MEDIA_COLLECTION__HOST:
				return host != null;
			case MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES:
				return syncedDevices != null && !syncedDevices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MediaCollectionImpl
