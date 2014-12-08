/*
 * 
 */
package MediaLibrary.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MediaLibraryModelingAssistantProviderOfMusicTrackEditPart extends
		MediaLibrary.diagram.providers.MediaLibraryModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MediaLibrary.diagram.edit.parts.MusicTrackEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			MediaLibrary.diagram.edit.parts.MusicTrackEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(MediaLibrary.diagram.edit.parts.MusicTrackEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			MediaLibrary.diagram.edit.parts.MusicTrackEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.ExternalSourceEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.StoreEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(MediaLibrary.diagram.edit.parts.MusicTrackEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			MediaLibrary.diagram.edit.parts.MusicTrackEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006);
		}
		return types;
	}

}
