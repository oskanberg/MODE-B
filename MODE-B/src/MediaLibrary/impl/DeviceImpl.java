/**
 */
package MediaLibrary.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MediaLibrary.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link MediaLibrary.impl.DeviceImpl#getHostOf <em>Host Of</em>}</li>
 *   <li>{@link MediaLibrary.impl.DeviceImpl#getCollections <em>Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeviceImpl extends EObjectImpl implements Device {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostOf() <em>Host Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostOf()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaCollection> hostOf;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaCollection> collections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaLibraryPackage.Literals.DEVICE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaLibraryPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaCollection> getHostOf() {
		if (hostOf == null) {
			hostOf = new EObjectWithInverseResolvingEList<MediaCollection>(MediaCollection.class, this, MediaLibraryPackage.DEVICE__HOST_OF, MediaLibraryPackage.MEDIA_COLLECTION__HOST);
		}
		return hostOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaCollection> getCollections() {
		if (collections == null) {
			collections = new EObjectWithInverseResolvingEList.ManyInverse<MediaCollection>(MediaCollection.class, this, MediaLibraryPackage.DEVICE__COLLECTIONS, MediaLibraryPackage.MEDIA_COLLECTION__SYNCED_DEVICES);
		}
		return collections;
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
			case MediaLibraryPackage.DEVICE__HOST_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHostOf()).basicAdd(otherEnd, msgs);
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCollections()).basicAdd(otherEnd, msgs);
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
			case MediaLibraryPackage.DEVICE__HOST_OF:
				return ((InternalEList<?>)getHostOf()).basicRemove(otherEnd, msgs);
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
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
			case MediaLibraryPackage.DEVICE__NAME:
				return getName();
			case MediaLibraryPackage.DEVICE__HOST_OF:
				return getHostOf();
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				return getCollections();
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
			case MediaLibraryPackage.DEVICE__NAME:
				setName((String)newValue);
				return;
			case MediaLibraryPackage.DEVICE__HOST_OF:
				getHostOf().clear();
				getHostOf().addAll((Collection<? extends MediaCollection>)newValue);
				return;
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((Collection<? extends MediaCollection>)newValue);
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
			case MediaLibraryPackage.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MediaLibraryPackage.DEVICE__HOST_OF:
				getHostOf().clear();
				return;
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				getCollections().clear();
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
			case MediaLibraryPackage.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MediaLibraryPackage.DEVICE__HOST_OF:
				return hostOf != null && !hostOf.isEmpty();
			case MediaLibraryPackage.DEVICE__COLLECTIONS:
				return collections != null && !collections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
