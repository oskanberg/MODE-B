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
public class MediaLibraryModelingAssistantProviderOfMediaCollectionEditPart
		extends
		MediaLibrary.diagram.providers.MediaLibraryModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MediaLibrary.diagram.edit.parts.MediaCollectionEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			MediaLibrary.diagram.edit.parts.MediaCollectionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
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
				(MediaLibrary.diagram.edit.parts.MediaCollectionEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			MediaLibrary.diagram.edit.parts.MediaCollectionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.TabletEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.ComputerEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.SmartphoneEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.EReaderEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.TabletEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.ComputerEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.SmartphoneEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
		}
		if (targetEditPart instanceof MediaLibrary.diagram.edit.parts.EReaderEditPart) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002);
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
				(MediaLibrary.diagram.edit.parts.MediaCollectionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			MediaLibrary.diagram.edit.parts.MediaCollectionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004);
		} else if (relationshipType == MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002) {
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003);
			types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004);
		}
		return types;
	}

}
