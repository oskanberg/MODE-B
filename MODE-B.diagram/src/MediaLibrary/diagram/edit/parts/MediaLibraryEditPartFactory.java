/*
 * 
 */
package MediaLibrary.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MediaLibraryEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(view)) {

			case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.EcosystemEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.TabletEditPart(view);

			case MediaLibrary.diagram.edit.parts.TabletNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.TabletNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ComputerEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ComputerNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ComputerNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.SmartphoneEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.SmartphoneNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.SmartphoneNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.EReaderEditPart(view);

			case MediaLibrary.diagram.edit.parts.EReaderNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.EReaderNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ExternalSourceEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ExternalSourceNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ExternalSourceNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.StoreEditPart(view);

			case MediaLibrary.diagram.edit.parts.StoreNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.StoreNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.LibraryEditPart(view);

			case MediaLibrary.diagram.edit.parts.LibraryNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.LibraryNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.AudioBookEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.AudioBookNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.AudioBookNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MusicTrackEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MusicTrackNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MusicTrackNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.VideoEditPart(view);

			case MediaLibrary.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.VideoNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ImageEditPart(view);

			case MediaLibrary.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ImageNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.EbookEditPart(view);

			case MediaLibrary.diagram.edit.parts.EbookNameEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.EbookNameEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionHostExternalLabelEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionHostExternalLabelEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesExternalLabelEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesExternalLabelEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart(
						view);

			case MediaLibrary.diagram.edit.parts.ArtifactOriginExternalLabelEditPart.VISUAL_ID:
				return new MediaLibrary.diagram.edit.parts.ArtifactOriginExternalLabelEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
