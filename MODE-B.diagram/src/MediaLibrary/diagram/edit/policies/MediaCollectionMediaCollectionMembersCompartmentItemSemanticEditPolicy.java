/*
 * 
 */
package MediaLibrary.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MediaCollectionMediaCollectionMembersCompartmentItemSemanticEditPolicy
		extends
		MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MediaCollectionMediaCollectionMembersCompartmentItemSemanticEditPolicy() {
		super(
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.AudioBookCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.MusicTrackCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.VideoCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.ImageCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.EbookCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
