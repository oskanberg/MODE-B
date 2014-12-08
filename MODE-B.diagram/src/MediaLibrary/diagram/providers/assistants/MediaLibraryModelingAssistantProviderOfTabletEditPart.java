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
public class MediaLibraryModelingAssistantProviderOfTabletEditPart extends
		MediaLibrary.diagram.providers.MediaLibraryModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MediaLibrary.diagram.edit.parts.TabletEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			MediaLibrary.diagram.edit.parts.TabletEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
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
				(MediaLibrary.diagram.edit.parts.TabletEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			MediaLibrary.diagram.edit.parts.TabletEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001);
		} else if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001);
		}
		return types;
	}

}
