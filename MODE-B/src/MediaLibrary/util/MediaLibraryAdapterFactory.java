/**
 */
package MediaLibrary.util;

import MediaLibrary.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MediaLibrary.MediaLibraryPackage
 * @generated
 */
public class MediaLibraryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MediaLibraryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaLibraryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MediaLibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaLibrarySwitch<Adapter> modelSwitch =
		new MediaLibrarySwitch<Adapter>() {
			@Override
			public Adapter caseEcosystem(Ecosystem object) {
				return createEcosystemAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseMediaCollection(MediaCollection object) {
				return createMediaCollectionAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseTablet(Tablet object) {
				return createTabletAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseSmartphone(Smartphone object) {
				return createSmartphoneAdapter();
			}
			@Override
			public Adapter caseEReader(EReader object) {
				return createEReaderAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseDurationArtifact(DurationArtifact object) {
				return createDurationArtifactAdapter();
			}
			@Override
			public Adapter caseAudioBook(AudioBook object) {
				return createAudioBookAdapter();
			}
			@Override
			public Adapter caseMusicTrack(MusicTrack object) {
				return createMusicTrackAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseEbook(Ebook object) {
				return createEbookAdapter();
			}
			@Override
			public Adapter caseMediaSource(MediaSource object) {
				return createMediaSourceAdapter();
			}
			@Override
			public Adapter caseExternalSource(ExternalSource object) {
				return createExternalSourceAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Ecosystem <em>Ecosystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Ecosystem
	 * @generated
	 */
	public Adapter createEcosystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.MediaCollection <em>Media Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.MediaCollection
	 * @generated
	 */
	public Adapter createMediaCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Tablet <em>Tablet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Tablet
	 * @generated
	 */
	public Adapter createTabletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Smartphone <em>Smartphone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Smartphone
	 * @generated
	 */
	public Adapter createSmartphoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.EReader <em>EReader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.EReader
	 * @generated
	 */
	public Adapter createEReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.DurationArtifact <em>Duration Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.DurationArtifact
	 * @generated
	 */
	public Adapter createDurationArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.AudioBook <em>Audio Book</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.AudioBook
	 * @generated
	 */
	public Adapter createAudioBookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.MusicTrack <em>Music Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.MusicTrack
	 * @generated
	 */
	public Adapter createMusicTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Ebook <em>Ebook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Ebook
	 * @generated
	 */
	public Adapter createEbookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.MediaSource <em>Media Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.MediaSource
	 * @generated
	 */
	public Adapter createMediaSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.ExternalSource <em>External Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.ExternalSource
	 * @generated
	 */
	public Adapter createExternalSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MediaLibrary.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MediaLibrary.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MediaLibraryAdapterFactory
