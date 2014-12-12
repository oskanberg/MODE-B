/**
 */
package MediaLibrary.util;

import MediaLibrary.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MediaLibrary.MediaLibraryPackage
 * @generated
 */
public class MediaLibrarySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MediaLibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaLibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = MediaLibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MediaLibraryPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.ECOSYSTEM: {
				Ecosystem ecosystem = (Ecosystem)theEObject;
				T result = caseEcosystem(ecosystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseNamedElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.MEDIA_COLLECTION: {
				MediaCollection mediaCollection = (MediaCollection)theEObject;
				T result = caseMediaCollection(mediaCollection);
				if (result == null) result = caseNamedElement(mediaCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseNamedElement(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.TABLET: {
				Tablet tablet = (Tablet)theEObject;
				T result = caseTablet(tablet);
				if (result == null) result = caseDevice(tablet);
				if (result == null) result = caseNamedElement(tablet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = caseDevice(computer);
				if (result == null) result = caseNamedElement(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.SMARTPHONE: {
				Smartphone smartphone = (Smartphone)theEObject;
				T result = caseSmartphone(smartphone);
				if (result == null) result = caseDevice(smartphone);
				if (result == null) result = caseNamedElement(smartphone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.EREADER: {
				EReader eReader = (EReader)theEObject;
				T result = caseEReader(eReader);
				if (result == null) result = caseDevice(eReader);
				if (result == null) result = caseNamedElement(eReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.DURATION_ARTIFACT: {
				DurationArtifact durationArtifact = (DurationArtifact)theEObject;
				T result = caseDurationArtifact(durationArtifact);
				if (result == null) result = caseArtifact(durationArtifact);
				if (result == null) result = caseNamedElement(durationArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.AUDIO_BOOK: {
				AudioBook audioBook = (AudioBook)theEObject;
				T result = caseAudioBook(audioBook);
				if (result == null) result = caseDurationArtifact(audioBook);
				if (result == null) result = caseArtifact(audioBook);
				if (result == null) result = caseNamedElement(audioBook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.MUSIC_TRACK: {
				MusicTrack musicTrack = (MusicTrack)theEObject;
				T result = caseMusicTrack(musicTrack);
				if (result == null) result = caseDurationArtifact(musicTrack);
				if (result == null) result = caseArtifact(musicTrack);
				if (result == null) result = caseNamedElement(musicTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseDurationArtifact(video);
				if (result == null) result = caseArtifact(video);
				if (result == null) result = caseNamedElement(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseArtifact(image);
				if (result == null) result = caseNamedElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.EBOOK: {
				Ebook ebook = (Ebook)theEObject;
				T result = caseEbook(ebook);
				if (result == null) result = caseArtifact(ebook);
				if (result == null) result = caseNamedElement(ebook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.MEDIA_SOURCE: {
				MediaSource mediaSource = (MediaSource)theEObject;
				T result = caseMediaSource(mediaSource);
				if (result == null) result = caseNamedElement(mediaSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.EXTERNAL_SOURCE: {
				ExternalSource externalSource = (ExternalSource)theEObject;
				T result = caseExternalSource(externalSource);
				if (result == null) result = caseMediaSource(externalSource);
				if (result == null) result = caseNamedElement(externalSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MediaLibraryPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseMediaSource(store);
				if (result == null) result = caseNamedElement(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecosystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecosystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcosystem(Ecosystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaCollection(MediaCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tablet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tablet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTablet(Tablet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smartphone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smartphone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartphone(Smartphone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReader(EReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationArtifact(DurationArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Book</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Book</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioBook(AudioBook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Music Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Music Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMusicTrack(MusicTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ebook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ebook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEbook(Ebook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaSource(MediaSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalSource(ExternalSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MediaLibrarySwitch
