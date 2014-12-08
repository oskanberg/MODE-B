/*
 * 
 */
package MediaLibrary.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MediaLibraryDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> getSemanticChildren(
			View view) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return getEcosystem_1000SemanticChildren(view);
		case MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID:
			return getLibraryLibraryCollectionsCompartment_7001SemanticChildren(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID:
			return getMediaCollectionMediaCollectionMembersCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> getEcosystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MediaLibrary.Ecosystem modelElement = (MediaLibrary.Ecosystem) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDevices().iterator(); it
				.hasNext();) {
			MediaLibrary.Device childElement = (MediaLibrary.Device) it.next();
			int visualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMediaSources().iterator(); it
				.hasNext();) {
			MediaLibrary.MediaSource childElement = (MediaLibrary.MediaSource) it
					.next();
			int visualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLibraries().iterator(); it
				.hasNext();) {
			MediaLibrary.Library childElement = (MediaLibrary.Library) it
					.next();
			int visualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> getLibraryLibraryCollectionsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediaLibrary.Library modelElement = (MediaLibrary.Library) containerView
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCollections().iterator(); it
				.hasNext();) {
			MediaLibrary.MediaCollection childElement = (MediaLibrary.MediaCollection) it
					.next();
			int visualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> getMediaCollectionMediaCollectionMembersCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MediaLibrary.MediaCollection modelElement = (MediaLibrary.MediaCollection) containerView
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMembers().iterator(); it
				.hasNext();) {
			MediaLibrary.Artifact childElement = (MediaLibrary.Artifact) it
					.next();
			int visualID = MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getContainedLinks(
			View view) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return getEcosystem_1000ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return getTablet_2001ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return getComputer_2002ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return getSmartphone_2003ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return getEReader_2004ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return getExternalSource_2005ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return getStore_2006ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return getLibrary_2007ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return getMediaCollection_3001ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return getAudioBook_3002ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return getMusicTrack_3003ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3004ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3005ContainedLinks(view);
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return getEbook_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getIncomingLinks(
			View view) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return getTablet_2001IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return getComputer_2002IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return getSmartphone_2003IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return getEReader_2004IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return getExternalSource_2005IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return getStore_2006IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return getLibrary_2007IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return getMediaCollection_3001IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return getAudioBook_3002IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return getMusicTrack_3003IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3004IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3005IncomingLinks(view);
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return getEbook_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return getTablet_2001OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return getComputer_2002OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return getSmartphone_2003OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return getEReader_2004OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return getExternalSource_2005OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return getStore_2006OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return getLibrary_2007OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return getMediaCollection_3001OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return getAudioBook_3002OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return getMusicTrack_3003OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3004OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3005OutgoingLinks(view);
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return getEbook_3006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEcosystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getTablet_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getComputer_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getSmartphone_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEReader_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getExternalSource_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getStore_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getLibrary_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMediaCollection_3001ContainedLinks(
			View view) {
		MediaLibrary.MediaCollection modelElement = (MediaLibrary.MediaCollection) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MediaCollection_Host_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getAudioBook_3002ContainedLinks(
			View view) {
		MediaLibrary.AudioBook modelElement = (MediaLibrary.AudioBook) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMusicTrack_3003ContainedLinks(
			View view) {
		MediaLibrary.MusicTrack modelElement = (MediaLibrary.MusicTrack) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getVideo_3004ContainedLinks(
			View view) {
		MediaLibrary.Video modelElement = (MediaLibrary.Video) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getImage_3005ContainedLinks(
			View view) {
		MediaLibrary.Image modelElement = (MediaLibrary.Image) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEbook_3006ContainedLinks(
			View view) {
		MediaLibrary.Ebook modelElement = (MediaLibrary.Ebook) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getTablet_2001IncomingLinks(
			View view) {
		MediaLibrary.Tablet modelElement = (MediaLibrary.Tablet) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_Host_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getComputer_2002IncomingLinks(
			View view) {
		MediaLibrary.Computer modelElement = (MediaLibrary.Computer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_Host_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getSmartphone_2003IncomingLinks(
			View view) {
		MediaLibrary.Smartphone modelElement = (MediaLibrary.Smartphone) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_Host_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEReader_2004IncomingLinks(
			View view) {
		MediaLibrary.EReader modelElement = (MediaLibrary.EReader) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_Host_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getExternalSource_2005IncomingLinks(
			View view) {
		MediaLibrary.ExternalSource modelElement = (MediaLibrary.ExternalSource) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Artifact_Origin_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getStore_2006IncomingLinks(
			View view) {
		MediaLibrary.Store modelElement = (MediaLibrary.Store) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Artifact_Origin_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getLibrary_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMediaCollection_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getAudioBook_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMusicTrack_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getVideo_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getImage_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEbook_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getTablet_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getComputer_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getSmartphone_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEReader_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getExternalSource_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getStore_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getLibrary_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMediaCollection_3001OutgoingLinks(
			View view) {
		MediaLibrary.MediaCollection modelElement = (MediaLibrary.MediaCollection) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MediaCollection_Host_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getAudioBook_3002OutgoingLinks(
			View view) {
		MediaLibrary.AudioBook modelElement = (MediaLibrary.AudioBook) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getMusicTrack_3003OutgoingLinks(
			View view) {
		MediaLibrary.MusicTrack modelElement = (MediaLibrary.MusicTrack) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getVideo_3004OutgoingLinks(
			View view) {
		MediaLibrary.Video modelElement = (MediaLibrary.Video) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getImage_3005OutgoingLinks(
			View view) {
		MediaLibrary.Image modelElement = (MediaLibrary.Image) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getEbook_3006OutgoingLinks(
			View view) {
		MediaLibrary.Ebook modelElement = (MediaLibrary.Ebook) view
				.getElement();
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getIncomingFeatureModelFacetLinks_MediaCollection_Host_4001(
			MediaLibrary.Device target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getMediaCollection_Host()) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
						setting.getEObject(),
						target,
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001,
						MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getIncomingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
			MediaLibrary.Device target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getMediaCollection_SyncedDevices()) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
						setting.getEObject(),
						target,
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002,
						MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getIncomingFeatureModelFacetLinks_Artifact_Origin_4003(
			MediaLibrary.MediaSource target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getArtifact_Origin()) {
				result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
						setting.getEObject(),
						target,
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003,
						MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getOutgoingFeatureModelFacetLinks_MediaCollection_Host_4001(
			MediaLibrary.MediaCollection source) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		MediaLibrary.Device destination = source.getHost();
		if (destination == null) {
			return result;
		}
		result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
				source,
				destination,
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001,
				MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getOutgoingFeatureModelFacetLinks_MediaCollection_SyncedDevices_4002(
			MediaLibrary.MediaCollection source) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		for (Iterator<?> destinations = source.getSyncedDevices().iterator(); destinations
				.hasNext();) {
			MediaLibrary.Device destination = (MediaLibrary.Device) destinations
					.next();
			result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
					source,
					destination,
					MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002,
					MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getOutgoingFeatureModelFacetLinks_Artifact_Origin_4003(
			MediaLibrary.Artifact source) {
		LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> result = new LinkedList<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor>();
		MediaLibrary.MediaSource destination = source.getOrigin();
		if (destination == null) {
			return result;
		}
		result.add(new MediaLibrary.diagram.part.MediaLibraryLinkDescriptor(
				source,
				destination,
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003,
				MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MediaLibrary.diagram.part.MediaLibraryNodeDescriptor> getSemanticChildren(
				View view) {
			return MediaLibraryDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getContainedLinks(
				View view) {
			return MediaLibraryDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getIncomingLinks(
				View view) {
			return MediaLibraryDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MediaLibrary.diagram.part.MediaLibraryLinkDescriptor> getOutgoingLinks(
				View view) {
			return MediaLibraryDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
