/*
 * 
 */
package MediaLibrary.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MediaLibraryElementTypes {

	/**
	 * @generated
	 */
	private MediaLibraryElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Ecosystem_1000 = getElementType("MODE-B.diagram.Ecosystem_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Tablet_2001 = getElementType("MODE-B.diagram.Tablet_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Computer_2002 = getElementType("MODE-B.diagram.Computer_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Smartphone_2003 = getElementType("MODE-B.diagram.Smartphone_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EReader_2004 = getElementType("MODE-B.diagram.EReader_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalSource_2005 = getElementType("MODE-B.diagram.ExternalSource_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Store_2006 = getElementType("MODE-B.diagram.Store_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Library_2007 = getElementType("MODE-B.diagram.Library_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MediaCollection_3001 = getElementType("MODE-B.diagram.MediaCollection_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AudioBook_3002 = getElementType("MODE-B.diagram.AudioBook_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MusicTrack_3003 = getElementType("MODE-B.diagram.MusicTrack_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Video_3004 = getElementType("MODE-B.diagram.Video_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_3005 = getElementType("MODE-B.diagram.Image_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ebook_3006 = getElementType("MODE-B.diagram.Ebook_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MediaCollectionHost_4001 = getElementType("MODE-B.diagram.MediaCollectionHost_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MediaCollectionSyncedDevices_4002 = getElementType("MODE-B.diagram.MediaCollectionSyncedDevices_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArtifactOrigin_4003 = getElementType("MODE-B.diagram.ArtifactOrigin_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Ecosystem_1000,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getEcosystem());

			elements.put(Tablet_2001,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getTablet());

			elements.put(Computer_2002,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getComputer());

			elements.put(Smartphone_2003,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getSmartphone());

			elements.put(EReader_2004,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getEReader());

			elements.put(ExternalSource_2005,
					MediaLibrary.MediaLibraryPackage.eINSTANCE
							.getExternalSource());

			elements.put(Store_2006,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getStore());

			elements.put(Library_2007,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getLibrary());

			elements.put(MediaCollection_3001,
					MediaLibrary.MediaLibraryPackage.eINSTANCE
							.getMediaCollection());

			elements.put(AudioBook_3002,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getAudioBook());

			elements.put(MusicTrack_3003,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getMusicTrack());

			elements.put(Video_3004,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getVideo());

			elements.put(Image_3005,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getImage());

			elements.put(Ebook_3006,
					MediaLibrary.MediaLibraryPackage.eINSTANCE.getEbook());

			elements.put(MediaCollectionHost_4001,
					MediaLibrary.MediaLibraryPackage.eINSTANCE
							.getMediaCollection_Host());

			elements.put(MediaCollectionSyncedDevices_4002,
					MediaLibrary.MediaLibraryPackage.eINSTANCE
							.getMediaCollection_SyncedDevices());

			elements.put(ArtifactOrigin_4003,
					MediaLibrary.MediaLibraryPackage.eINSTANCE
							.getArtifact_Origin());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Ecosystem_1000);
			KNOWN_ELEMENT_TYPES.add(Tablet_2001);
			KNOWN_ELEMENT_TYPES.add(Computer_2002);
			KNOWN_ELEMENT_TYPES.add(Smartphone_2003);
			KNOWN_ELEMENT_TYPES.add(EReader_2004);
			KNOWN_ELEMENT_TYPES.add(ExternalSource_2005);
			KNOWN_ELEMENT_TYPES.add(Store_2006);
			KNOWN_ELEMENT_TYPES.add(Library_2007);
			KNOWN_ELEMENT_TYPES.add(MediaCollection_3001);
			KNOWN_ELEMENT_TYPES.add(AudioBook_3002);
			KNOWN_ELEMENT_TYPES.add(MusicTrack_3003);
			KNOWN_ELEMENT_TYPES.add(Video_3004);
			KNOWN_ELEMENT_TYPES.add(Image_3005);
			KNOWN_ELEMENT_TYPES.add(Ebook_3006);
			KNOWN_ELEMENT_TYPES.add(MediaCollectionHost_4001);
			KNOWN_ELEMENT_TYPES.add(MediaCollectionSyncedDevices_4002);
			KNOWN_ELEMENT_TYPES.add(ArtifactOrigin_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return Ecosystem_1000;
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return Tablet_2001;
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return Computer_2002;
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return Smartphone_2003;
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return EReader_2004;
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return ExternalSource_2005;
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return Store_2006;
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return Library_2007;
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return MediaCollection_3001;
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return AudioBook_3002;
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return MusicTrack_3003;
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return Video_3004;
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return Image_3005;
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return Ebook_3006;
		case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID:
			return MediaCollectionHost_4001;
		case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID:
			return MediaCollectionSyncedDevices_4002;
		case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID:
			return ArtifactOrigin_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return MediaLibrary.diagram.providers.MediaLibraryElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return MediaLibrary.diagram.providers.MediaLibraryElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return MediaLibrary.diagram.providers.MediaLibraryElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
