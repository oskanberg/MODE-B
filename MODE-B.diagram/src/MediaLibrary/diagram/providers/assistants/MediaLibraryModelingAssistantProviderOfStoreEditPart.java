/*
 * 
 */
package MediaLibrary.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MediaLibraryModelingAssistantProviderOfStoreEditPart extends
		MediaLibrary.diagram.providers.MediaLibraryModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MediaLibrary.diagram.edit.parts.StoreEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			MediaLibrary.diagram.edit.parts.StoreEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(MediaLibrary.diagram.edit.parts.StoreEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			MediaLibrary.diagram.edit.parts.StoreEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006);
		}
		return types;
	}

}
