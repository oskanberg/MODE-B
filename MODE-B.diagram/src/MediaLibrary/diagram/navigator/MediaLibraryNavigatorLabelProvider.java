/*
 * 
 */
package MediaLibrary.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MediaLibraryNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem
				&& !isOwnView(((MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup group = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) element;
			return MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem navigatorItem = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?MediaLibrary?Ecosystem", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ecosystem_1000); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?Tablet", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?Computer", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?Smartphone", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?EReader", MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?ExternalSource", MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?Store", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?MediaLibrary?Library", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?MediaCollection", MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?AudioBook", MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?MusicTrack", MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?Video", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?Image", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?MediaLibrary?Ebook", MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?MediaLibrary?MediaCollection?host", MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?MediaLibrary?MediaCollection?syncedDevices", MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002); //$NON-NLS-1$
		case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?MediaLibrary?Artifact?origin", MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& MediaLibrary.diagram.providers.MediaLibraryElementTypes
						.isKnownElementType(elementType)) {
			image = MediaLibrary.diagram.providers.MediaLibraryElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup group = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem navigatorItem = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {
		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID:
			return getEcosystem_1000Text(view);
		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID:
			return getTablet_2001Text(view);
		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID:
			return getComputer_2002Text(view);
		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID:
			return getSmartphone_2003Text(view);
		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID:
			return getEReader_2004Text(view);
		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID:
			return getExternalSource_2005Text(view);
		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID:
			return getStore_2006Text(view);
		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID:
			return getLibrary_2007Text(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID:
			return getMediaCollection_3001Text(view);
		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID:
			return getAudioBook_3002Text(view);
		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID:
			return getMusicTrack_3003Text(view);
		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3004Text(view);
		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3005Text(view);
		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID:
			return getEbook_3006Text(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID:
			return getMediaCollectionHost_4001Text(view);
		case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID:
			return getMediaCollectionSyncedDevices_4002Text(view);
		case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID:
			return getArtifactOrigin_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getEcosystem_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTablet_2001Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.TabletNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComputer_2002Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.ComputerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSmartphone_2003Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.SmartphoneNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEReader_2004Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.EReaderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalSource_2005Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.ExternalSourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStore_2006Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.StoreNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLibrary_2007Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.LibraryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMediaCollection_3001Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.MediaCollectionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAudioBook_3002Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.AudioBookNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMusicTrack_3003Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.MusicTrackNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVideo_3004Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.VideoNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImage_3005Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.ImageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEbook_3006Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006,
						view.getElement() != null ? view.getElement() : view,
						MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
								.getType(MediaLibrary.diagram.edit.parts.EbookNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMediaCollectionHost_4001Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMediaCollectionSyncedDevices_4002Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtifactOrigin_4003Text(View view) {
		IParser parser = MediaLibrary.diagram.providers.MediaLibraryParserProvider
				.getParser(
						MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
						.getModelID(view));
	}

}
