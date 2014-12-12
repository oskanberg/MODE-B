/**
 */
package MediaLibrary.impl;

import MediaLibrary.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediaLibraryFactoryImpl extends EFactoryImpl implements MediaLibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediaLibraryFactory init() {
		try {
			MediaLibraryFactory theMediaLibraryFactory = (MediaLibraryFactory)EPackage.Registry.INSTANCE.getEFactory(MediaLibraryPackage.eNS_URI);
			if (theMediaLibraryFactory != null) {
				return theMediaLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MediaLibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaLibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MediaLibraryPackage.ECOSYSTEM: return createEcosystem();
			case MediaLibraryPackage.LIBRARY: return createLibrary();
			case MediaLibraryPackage.MEDIA_COLLECTION: return createMediaCollection();
			case MediaLibraryPackage.TABLET: return createTablet();
			case MediaLibraryPackage.COMPUTER: return createComputer();
			case MediaLibraryPackage.SMARTPHONE: return createSmartphone();
			case MediaLibraryPackage.EREADER: return createEReader();
			case MediaLibraryPackage.AUDIO_BOOK: return createAudioBook();
			case MediaLibraryPackage.MUSIC_TRACK: return createMusicTrack();
			case MediaLibraryPackage.VIDEO: return createVideo();
			case MediaLibraryPackage.IMAGE: return createImage();
			case MediaLibraryPackage.EBOOK: return createEbook();
			case MediaLibraryPackage.EXTERNAL_SOURCE: return createExternalSource();
			case MediaLibraryPackage.STORE: return createStore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MediaLibraryPackage.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MediaLibraryPackage.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecosystem createEcosystem() {
		EcosystemImpl ecosystem = new EcosystemImpl();
		return ecosystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaCollection createMediaCollection() {
		MediaCollectionImpl mediaCollection = new MediaCollectionImpl();
		return mediaCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tablet createTablet() {
		TabletImpl tablet = new TabletImpl();
		return tablet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartphone createSmartphone() {
		SmartphoneImpl smartphone = new SmartphoneImpl();
		return smartphone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReader createEReader() {
		EReaderImpl eReader = new EReaderImpl();
		return eReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioBook createAudioBook() {
		AudioBookImpl audioBook = new AudioBookImpl();
		return audioBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicTrack createMusicTrack() {
		MusicTrackImpl musicTrack = new MusicTrackImpl();
		return musicTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ebook createEbook() {
		EbookImpl ebook = new EbookImpl();
		return ebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSource createExternalSource() {
		ExternalSourceImpl externalSource = new ExternalSourceImpl();
		return externalSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaLibraryPackage getMediaLibraryPackage() {
		return (MediaLibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MediaLibraryPackage getPackage() {
		return MediaLibraryPackage.eINSTANCE;
	}

} //MediaLibraryFactoryImpl
