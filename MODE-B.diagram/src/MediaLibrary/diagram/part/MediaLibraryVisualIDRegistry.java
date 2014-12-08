/*
 * 
 */
package MediaLibrary.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MediaLibraryVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "MODE-B.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
					.equals(view.getType())) {
				return MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getEcosystem()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((MediaLibrary.Ecosystem) domainElement)) {
			return MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getModelID(containerView);
		if (!MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"MediaLibrary".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getTablet()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getComputer()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getSmartphone()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getEReader()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getExternalSource()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getStore()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getLibrary()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID;
			}
			break;
		case MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID:
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getMediaCollection()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID:
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getAudioBook()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getMusicTrack()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getVideo()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getImage()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			if (MediaLibrary.MediaLibraryPackage.eINSTANCE.getEbook()
					.isSuperTypeOf(domainElement.eClass())) {
				return MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getModelID(containerView);
		if (!MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"MediaLibrary".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.TabletNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.ComputerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.SmartphoneNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.EReaderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.ExternalSourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.StoreNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.LibraryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.MediaCollectionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.AudioBookNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.MusicTrackNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.VideoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.ImageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.EbookNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.MediaCollectionHostExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID:
			if (MediaLibrary.diagram.edit.parts.ArtifactOriginExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MediaLibrary.Ecosystem element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return false;
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
