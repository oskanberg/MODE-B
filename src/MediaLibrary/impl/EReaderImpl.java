/**
 */
package MediaLibrary.impl;

import MediaLibrary.EReader;
import MediaLibrary.MediaLibraryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link MediaLibrary.impl.EReaderImpl#getVideoEnabled <em>Video Enabled</em>}</li>
 *   <li>{@link MediaLibrary.impl.EReaderImpl#getAudioEnabled <em>Audio Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EReaderImpl extends DeviceImpl implements EReader {
	/**
	 * The default value of the '{@link #getVideoEnabled() <em>Video Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VIDEO_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoEnabled() <em>Video Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean videoEnabled = VIDEO_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioEnabled() <em>Audio Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIO_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudioEnabled() <em>Audio Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean audioEnabled = AUDIO_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MediaLibraryPackage.Literals.EREADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVideoEnabled() {
		return videoEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoEnabled(Boolean newVideoEnabled) {
		Boolean oldVideoEnabled = videoEnabled;
		videoEnabled = newVideoEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaLibraryPackage.EREADER__VIDEO_ENABLED, oldVideoEnabled, videoEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAudioEnabled() {
		return audioEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioEnabled(Boolean newAudioEnabled) {
		Boolean oldAudioEnabled = audioEnabled;
		audioEnabled = newAudioEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MediaLibraryPackage.EREADER__AUDIO_ENABLED, oldAudioEnabled, audioEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MediaLibraryPackage.EREADER__VIDEO_ENABLED:
				return getVideoEnabled();
			case MediaLibraryPackage.EREADER__AUDIO_ENABLED:
				return getAudioEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MediaLibraryPackage.EREADER__VIDEO_ENABLED:
				setVideoEnabled((Boolean)newValue);
				return;
			case MediaLibraryPackage.EREADER__AUDIO_ENABLED:
				setAudioEnabled((Boolean)newValue);
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
			case MediaLibraryPackage.EREADER__VIDEO_ENABLED:
				setVideoEnabled(VIDEO_ENABLED_EDEFAULT);
				return;
			case MediaLibraryPackage.EREADER__AUDIO_ENABLED:
				setAudioEnabled(AUDIO_ENABLED_EDEFAULT);
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
			case MediaLibraryPackage.EREADER__VIDEO_ENABLED:
				return VIDEO_ENABLED_EDEFAULT == null ? videoEnabled != null : !VIDEO_ENABLED_EDEFAULT.equals(videoEnabled);
			case MediaLibraryPackage.EREADER__AUDIO_ENABLED:
				return AUDIO_ENABLED_EDEFAULT == null ? audioEnabled != null : !AUDIO_ENABLED_EDEFAULT.equals(audioEnabled);
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
		result.append(" (videoEnabled: ");
		result.append(videoEnabled);
		result.append(", audioEnabled: ");
		result.append(audioEnabled);
		result.append(')');
		return result.toString();
	}

} //EReaderImpl
