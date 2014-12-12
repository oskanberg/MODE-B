/**
 */
package MediaLibrary.impl;

import MediaLibrary.Device;
import MediaLibrary.Ecosystem;
import MediaLibrary.Library;
import MediaLibrary.MediaLibraryPackage;
import MediaLibrary.MediaSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecosystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MediaLibrary.impl.EcosystemImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link MediaLibrary.impl.EcosystemImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link MediaLibrary.impl.EcosystemImpl#getMediaSources <em>Media Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcosystemImpl extends EObjectImpl implements Ecosystem {
	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getMediaSources() <em>Media Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSources()
	 * @generated
	 * @ordered
	 */
	protected EList<MediaSource> mediaSources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcosystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaLibraryPackage.Literals.ECOSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Library>(Library.class, this, MediaLibraryPackage.ECOSYSTEM__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, MediaLibraryPackage.ECOSYSTEM__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MediaSource> getMediaSources() {
		if (mediaSources == null) {
			mediaSources = new EObjectContainmentEList<MediaSource>(MediaSource.class, this, MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES);
		}
		return mediaSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MediaLibraryPackage.ECOSYSTEM__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case MediaLibraryPackage.ECOSYSTEM__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES:
				return ((InternalEList<?>)getMediaSources()).basicRemove(otherEnd, msgs);
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
			case MediaLibraryPackage.ECOSYSTEM__LIBRARIES:
				return getLibraries();
			case MediaLibraryPackage.ECOSYSTEM__DEVICES:
				return getDevices();
			case MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES:
				return getMediaSources();
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
			case MediaLibraryPackage.ECOSYSTEM__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case MediaLibraryPackage.ECOSYSTEM__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES:
				getMediaSources().clear();
				getMediaSources().addAll((Collection<? extends MediaSource>)newValue);
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
			case MediaLibraryPackage.ECOSYSTEM__LIBRARIES:
				getLibraries().clear();
				return;
			case MediaLibraryPackage.ECOSYSTEM__DEVICES:
				getDevices().clear();
				return;
			case MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES:
				getMediaSources().clear();
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
			case MediaLibraryPackage.ECOSYSTEM__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case MediaLibraryPackage.ECOSYSTEM__DEVICES:
				return devices != null && !devices.isEmpty();
			case MediaLibraryPackage.ECOSYSTEM__MEDIA_SOURCES:
				return mediaSources != null && !mediaSources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EcosystemImpl
