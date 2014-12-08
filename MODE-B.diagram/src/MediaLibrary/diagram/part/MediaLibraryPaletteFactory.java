/*
 * 
 */
package MediaLibrary.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MediaLibraryPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				MediaLibrary.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAudioBook1CreationTool());
		paletteContainer.add(createComputer2CreationTool());
		paletteContainer.add(createEReader3CreationTool());
		paletteContainer.add(createEbook4CreationTool());
		paletteContainer.add(createExternalSource5CreationTool());
		paletteContainer.add(createImage6CreationTool());
		paletteContainer.add(createLibrary7CreationTool());
		paletteContainer.add(createMediaCollection8CreationTool());
		paletteContainer.add(createMusicTrack9CreationTool());
		paletteContainer.add(createSmartphone10CreationTool());
		paletteContainer.add(createStore11CreationTool());
		paletteContainer.add(createTablet12CreationTool());
		paletteContainer.add(createVideo13CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				MediaLibrary.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createHost1CreationTool());
		paletteContainer.add(createOrigin2CreationTool());
		paletteContainer.add(createSyncedDevices3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAudioBook1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.AudioBook1CreationTool_title,
				MediaLibrary.diagram.part.Messages.AudioBook1CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002));
		entry.setId("createAudioBook1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.AudioBook_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComputer2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Computer2CreationTool_title,
				MediaLibrary.diagram.part.Messages.Computer2CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002));
		entry.setId("createComputer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEReader3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.EReader3CreationTool_title,
				MediaLibrary.diagram.part.Messages.EReader3CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004));
		entry.setId("createEReader3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEbook4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Ebook4CreationTool_title,
				MediaLibrary.diagram.part.Messages.Ebook4CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006));
		entry.setId("createEbook4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ebook_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalSource5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.ExternalSource5CreationTool_title,
				MediaLibrary.diagram.part.Messages.ExternalSource5CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005));
		entry.setId("createExternalSource5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImage6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Image6CreationTool_title,
				MediaLibrary.diagram.part.Messages.Image6CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005));
		entry.setId("createImage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Image_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLibrary7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Library7CreationTool_title,
				MediaLibrary.diagram.part.Messages.Library7CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007));
		entry.setId("createLibrary7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMediaCollection8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.MediaCollection8CreationTool_title,
				MediaLibrary.diagram.part.Messages.MediaCollection8CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001));
		entry.setId("createMediaCollection8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMusicTrack9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.MusicTrack9CreationTool_title,
				MediaLibrary.diagram.part.Messages.MusicTrack9CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003));
		entry.setId("createMusicTrack9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MusicTrack_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmartphone10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Smartphone10CreationTool_title,
				MediaLibrary.diagram.part.Messages.Smartphone10CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003));
		entry.setId("createSmartphone10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStore11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Store11CreationTool_title,
				MediaLibrary.diagram.part.Messages.Store11CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006));
		entry.setId("createStore11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTablet12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Tablet12CreationTool_title,
				MediaLibrary.diagram.part.Messages.Tablet12CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001));
		entry.setId("createTablet12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVideo13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MediaLibrary.diagram.part.Messages.Video13CreationTool_title,
				MediaLibrary.diagram.part.Messages.Video13CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004));
		entry.setId("createVideo13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Video_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHost1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				MediaLibrary.diagram.part.Messages.Host1CreationTool_title,
				MediaLibrary.diagram.part.Messages.Host1CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001));
		entry.setId("createHost1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrigin2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				MediaLibrary.diagram.part.Messages.Origin2CreationTool_title,
				MediaLibrary.diagram.part.Messages.Origin2CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003));
		entry.setId("createOrigin2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSyncedDevices3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				MediaLibrary.diagram.part.Messages.SyncedDevices3CreationTool_title,
				MediaLibrary.diagram.part.Messages.SyncedDevices3CreationTool_desc,
				Collections
						.singletonList(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002));
		entry.setId("createSyncedDevices3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MediaLibrary.diagram.providers.MediaLibraryElementTypes
				.getImageDescriptor(MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionSyncedDevices_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
