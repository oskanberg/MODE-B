/**
 */
package MediaLibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MediaLibrary.MediaLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface MediaLibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MediaLibrary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MediaLibrary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MediaLibrary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MediaLibraryPackage eINSTANCE = MediaLibrary.impl.MediaLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.EcosystemImpl <em>Ecosystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.EcosystemImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEcosystem()
	 * @generated
	 */
	int ECOSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOSYSTEM__LIBRARIES = 0;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOSYSTEM__DEVICES = 1;

	/**
	 * The feature id for the '<em><b>Media Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOSYSTEM__MEDIA_SOURCES = 2;

	/**
	 * The number of structural features of the '<em>Ecosystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOSYSTEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.LibraryImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__COLLECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.MediaCollectionImpl <em>Media Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.MediaCollectionImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMediaCollection()
	 * @generated
	 */
	int MEDIA_COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_COLLECTION__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_COLLECTION__HOST = 2;

	/**
	 * The feature id for the '<em><b>Synced Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_COLLECTION__SYNCED_DEVICES = 3;

	/**
	 * The number of structural features of the '<em>Media Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_COLLECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.DeviceImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HOST_OF = 1;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__COLLECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.TabletImpl <em>Tablet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.TabletImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getTablet()
	 * @generated
	 */
	int TABLET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Host Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__HOST_OF = DEVICE__HOST_OF;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__COLLECTIONS = DEVICE__COLLECTIONS;

	/**
	 * The number of structural features of the '<em>Tablet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.ComputerImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Host Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__HOST_OF = DEVICE__HOST_OF;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__COLLECTIONS = DEVICE__COLLECTIONS;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.SmartphoneImpl <em>Smartphone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.SmartphoneImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getSmartphone()
	 * @generated
	 */
	int SMARTPHONE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Host Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__HOST_OF = DEVICE__HOST_OF;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__COLLECTIONS = DEVICE__COLLECTIONS;

	/**
	 * The number of structural features of the '<em>Smartphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.EReaderImpl <em>EReader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.EReaderImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEReader()
	 * @generated
	 */
	int EREADER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Host Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER__HOST_OF = DEVICE__HOST_OF;

	/**
	 * The feature id for the '<em><b>Collections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER__COLLECTIONS = DEVICE__COLLECTIONS;

	/**
	 * The feature id for the '<em><b>Video Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER__VIDEO_ENABLED = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Audio Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER__AUDIO_ENABLED = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EReader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREADER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.ArtifactImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ORIGIN = 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.DurationArtifactImpl <em>Duration Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.DurationArtifactImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getDurationArtifact()
	 * @generated
	 */
	int DURATION_ARTIFACT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_ARTIFACT__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_ARTIFACT__ORIGIN = ARTIFACT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_ARTIFACT__DURATION = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_ARTIFACT_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.AudioBookImpl <em>Audio Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.AudioBookImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getAudioBook()
	 * @generated
	 */
	int AUDIO_BOOK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BOOK__NAME = DURATION_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BOOK__ORIGIN = DURATION_ARTIFACT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BOOK__DURATION = DURATION_ARTIFACT__DURATION;

	/**
	 * The number of structural features of the '<em>Audio Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_BOOK_FEATURE_COUNT = DURATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.MusicTrackImpl <em>Music Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.MusicTrackImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMusicTrack()
	 * @generated
	 */
	int MUSIC_TRACK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__NAME = DURATION_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__ORIGIN = DURATION_ARTIFACT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK__DURATION = DURATION_ARTIFACT__DURATION;

	/**
	 * The number of structural features of the '<em>Music Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_TRACK_FEATURE_COUNT = DURATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.VideoImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = DURATION_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ORIGIN = DURATION_ARTIFACT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = DURATION_ARTIFACT__DURATION;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = DURATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.ImageImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORIGIN = ARTIFACT__ORIGIN;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.EbookImpl <em>Ebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.EbookImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEbook()
	 * @generated
	 */
	int EBOOK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOK__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOK__ORIGIN = ARTIFACT__ORIGIN;

	/**
	 * The number of structural features of the '<em>Ebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOK_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.MediaSourceImpl <em>Media Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.MediaSourceImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMediaSource()
	 * @generated
	 */
	int MEDIA_SOURCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SOURCE__CONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Media Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_SOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.ExternalSourceImpl <em>External Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.ExternalSourceImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getExternalSource()
	 * @generated
	 */
	int EXTERNAL_SOURCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOURCE__NAME = MEDIA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOURCE__CONTENTS = MEDIA_SOURCE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOURCE__SOURCE_TYPE = MEDIA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SOURCE_FEATURE_COUNT = MEDIA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link MediaLibrary.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.impl.StoreImpl
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = MEDIA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__CONTENTS = MEDIA_SOURCE__CONTENTS;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = MEDIA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link MediaLibrary.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MediaLibrary.SourceType
	 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link MediaLibrary.Ecosystem <em>Ecosystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecosystem</em>'.
	 * @see MediaLibrary.Ecosystem
	 * @generated
	 */
	EClass getEcosystem();

	/**
	 * Returns the meta object for the containment reference list '{@link MediaLibrary.Ecosystem#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see MediaLibrary.Ecosystem#getLibraries()
	 * @see #getEcosystem()
	 * @generated
	 */
	EReference getEcosystem_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link MediaLibrary.Ecosystem#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see MediaLibrary.Ecosystem#getDevices()
	 * @see #getEcosystem()
	 * @generated
	 */
	EReference getEcosystem_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link MediaLibrary.Ecosystem#getMediaSources <em>Media Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media Sources</em>'.
	 * @see MediaLibrary.Ecosystem#getMediaSources()
	 * @see #getEcosystem()
	 * @generated
	 */
	EReference getEcosystem_MediaSources();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see MediaLibrary.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MediaLibrary.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MediaLibrary.Library#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collections</em>'.
	 * @see MediaLibrary.Library#getCollections()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Collections();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.MediaCollection <em>Media Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Collection</em>'.
	 * @see MediaLibrary.MediaCollection
	 * @generated
	 */
	EClass getMediaCollection();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.MediaCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MediaLibrary.MediaCollection#getName()
	 * @see #getMediaCollection()
	 * @generated
	 */
	EAttribute getMediaCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MediaLibrary.MediaCollection#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see MediaLibrary.MediaCollection#getMembers()
	 * @see #getMediaCollection()
	 * @generated
	 */
	EReference getMediaCollection_Members();

	/**
	 * Returns the meta object for the reference '{@link MediaLibrary.MediaCollection#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see MediaLibrary.MediaCollection#getHost()
	 * @see #getMediaCollection()
	 * @generated
	 */
	EReference getMediaCollection_Host();

	/**
	 * Returns the meta object for the reference list '{@link MediaLibrary.MediaCollection#getSyncedDevices <em>Synced Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synced Devices</em>'.
	 * @see MediaLibrary.MediaCollection#getSyncedDevices()
	 * @see #getMediaCollection()
	 * @generated
	 */
	EReference getMediaCollection_SyncedDevices();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see MediaLibrary.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MediaLibrary.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the reference list '{@link MediaLibrary.Device#getHostOf <em>Host Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Host Of</em>'.
	 * @see MediaLibrary.Device#getHostOf()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_HostOf();

	/**
	 * Returns the meta object for the reference list '{@link MediaLibrary.Device#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collections</em>'.
	 * @see MediaLibrary.Device#getCollections()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Collections();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Tablet <em>Tablet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tablet</em>'.
	 * @see MediaLibrary.Tablet
	 * @generated
	 */
	EClass getTablet();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see MediaLibrary.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Smartphone <em>Smartphone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smartphone</em>'.
	 * @see MediaLibrary.Smartphone
	 * @generated
	 */
	EClass getSmartphone();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.EReader <em>EReader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReader</em>'.
	 * @see MediaLibrary.EReader
	 * @generated
	 */
	EClass getEReader();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.EReader#getVideoEnabled <em>Video Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Enabled</em>'.
	 * @see MediaLibrary.EReader#getVideoEnabled()
	 * @see #getEReader()
	 * @generated
	 */
	EAttribute getEReader_VideoEnabled();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.EReader#getAudioEnabled <em>Audio Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Audio Enabled</em>'.
	 * @see MediaLibrary.EReader#getAudioEnabled()
	 * @see #getEReader()
	 * @generated
	 */
	EAttribute getEReader_AudioEnabled();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see MediaLibrary.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MediaLibrary.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the reference '{@link MediaLibrary.Artifact#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see MediaLibrary.Artifact#getOrigin()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Origin();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.DurationArtifact <em>Duration Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Artifact</em>'.
	 * @see MediaLibrary.DurationArtifact
	 * @generated
	 */
	EClass getDurationArtifact();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.DurationArtifact#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see MediaLibrary.DurationArtifact#getDuration()
	 * @see #getDurationArtifact()
	 * @generated
	 */
	EAttribute getDurationArtifact_Duration();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.AudioBook <em>Audio Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Book</em>'.
	 * @see MediaLibrary.AudioBook
	 * @generated
	 */
	EClass getAudioBook();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.MusicTrack <em>Music Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Track</em>'.
	 * @see MediaLibrary.MusicTrack
	 * @generated
	 */
	EClass getMusicTrack();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see MediaLibrary.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see MediaLibrary.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Ebook <em>Ebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebook</em>'.
	 * @see MediaLibrary.Ebook
	 * @generated
	 */
	EClass getEbook();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.MediaSource <em>Media Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Source</em>'.
	 * @see MediaLibrary.MediaSource
	 * @generated
	 */
	EClass getMediaSource();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.MediaSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MediaLibrary.MediaSource#getName()
	 * @see #getMediaSource()
	 * @generated
	 */
	EAttribute getMediaSource_Name();

	/**
	 * Returns the meta object for the reference list '{@link MediaLibrary.MediaSource#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see MediaLibrary.MediaSource#getContents()
	 * @see #getMediaSource()
	 * @generated
	 */
	EReference getMediaSource_Contents();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.ExternalSource <em>External Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Source</em>'.
	 * @see MediaLibrary.ExternalSource
	 * @generated
	 */
	EClass getExternalSource();

	/**
	 * Returns the meta object for the attribute '{@link MediaLibrary.ExternalSource#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see MediaLibrary.ExternalSource#getSourceType()
	 * @see #getExternalSource()
	 * @generated
	 */
	EAttribute getExternalSource_SourceType();

	/**
	 * Returns the meta object for class '{@link MediaLibrary.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see MediaLibrary.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for enum '{@link MediaLibrary.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see MediaLibrary.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MediaLibraryFactory getMediaLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.EcosystemImpl <em>Ecosystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.EcosystemImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEcosystem()
		 * @generated
		 */
		EClass ECOSYSTEM = eINSTANCE.getEcosystem();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOSYSTEM__LIBRARIES = eINSTANCE.getEcosystem_Libraries();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOSYSTEM__DEVICES = eINSTANCE.getEcosystem_Devices();

		/**
		 * The meta object literal for the '<em><b>Media Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOSYSTEM__MEDIA_SOURCES = eINSTANCE.getEcosystem_MediaSources();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.LibraryImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__COLLECTIONS = eINSTANCE.getLibrary_Collections();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.MediaCollectionImpl <em>Media Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.MediaCollectionImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMediaCollection()
		 * @generated
		 */
		EClass MEDIA_COLLECTION = eINSTANCE.getMediaCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_COLLECTION__NAME = eINSTANCE.getMediaCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_COLLECTION__MEMBERS = eINSTANCE.getMediaCollection_Members();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_COLLECTION__HOST = eINSTANCE.getMediaCollection_Host();

		/**
		 * The meta object literal for the '<em><b>Synced Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_COLLECTION__SYNCED_DEVICES = eINSTANCE.getMediaCollection_SyncedDevices();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.DeviceImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Host Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__HOST_OF = eINSTANCE.getDevice_HostOf();

		/**
		 * The meta object literal for the '<em><b>Collections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__COLLECTIONS = eINSTANCE.getDevice_Collections();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.TabletImpl <em>Tablet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.TabletImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getTablet()
		 * @generated
		 */
		EClass TABLET = eINSTANCE.getTablet();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.ComputerImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.SmartphoneImpl <em>Smartphone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.SmartphoneImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getSmartphone()
		 * @generated
		 */
		EClass SMARTPHONE = eINSTANCE.getSmartphone();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.EReaderImpl <em>EReader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.EReaderImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEReader()
		 * @generated
		 */
		EClass EREADER = eINSTANCE.getEReader();

		/**
		 * The meta object literal for the '<em><b>Video Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREADER__VIDEO_ENABLED = eINSTANCE.getEReader_VideoEnabled();

		/**
		 * The meta object literal for the '<em><b>Audio Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREADER__AUDIO_ENABLED = eINSTANCE.getEReader_AudioEnabled();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.ArtifactImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ORIGIN = eINSTANCE.getArtifact_Origin();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.DurationArtifactImpl <em>Duration Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.DurationArtifactImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getDurationArtifact()
		 * @generated
		 */
		EClass DURATION_ARTIFACT = eINSTANCE.getDurationArtifact();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_ARTIFACT__DURATION = eINSTANCE.getDurationArtifact_Duration();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.AudioBookImpl <em>Audio Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.AudioBookImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getAudioBook()
		 * @generated
		 */
		EClass AUDIO_BOOK = eINSTANCE.getAudioBook();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.MusicTrackImpl <em>Music Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.MusicTrackImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMusicTrack()
		 * @generated
		 */
		EClass MUSIC_TRACK = eINSTANCE.getMusicTrack();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.VideoImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.ImageImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.EbookImpl <em>Ebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.EbookImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getEbook()
		 * @generated
		 */
		EClass EBOOK = eINSTANCE.getEbook();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.MediaSourceImpl <em>Media Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.MediaSourceImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getMediaSource()
		 * @generated
		 */
		EClass MEDIA_SOURCE = eINSTANCE.getMediaSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_SOURCE__NAME = eINSTANCE.getMediaSource_Name();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_SOURCE__CONTENTS = eINSTANCE.getMediaSource_Contents();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.ExternalSourceImpl <em>External Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.ExternalSourceImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getExternalSource()
		 * @generated
		 */
		EClass EXTERNAL_SOURCE = eINSTANCE.getExternalSource();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_SOURCE__SOURCE_TYPE = eINSTANCE.getExternalSource_SourceType();

		/**
		 * The meta object literal for the '{@link MediaLibrary.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.impl.StoreImpl
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '{@link MediaLibrary.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MediaLibrary.SourceType
		 * @see MediaLibrary.impl.MediaLibraryPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

	}

} //MediaLibraryPackage
