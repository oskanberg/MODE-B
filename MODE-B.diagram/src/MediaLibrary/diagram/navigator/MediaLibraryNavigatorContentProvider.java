/*
 * 
 */
package MediaLibrary.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class MediaLibraryNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public MediaLibraryNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem> result = new ArrayList<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup group = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem navigatorItem = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
				.getVisualID(view)) {

		case MediaLibrary.diagram.edit.parts.EcosystemEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup links = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Ecosystem_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Tablet_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Computer_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Smartphone_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_EReader_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_ExternalSource_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup incominglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Store_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.LibraryEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.LibraryLibraryCollectionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MediaCollection_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionMediaCollectionMembersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_AudioBook_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MusicTrack_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Video_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Image_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Node sv = (Node) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup outgoinglinks = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_Ebook_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.MediaCollectionHostEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup target = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MediaCollectionHost_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup source = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MediaCollectionHost_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.MediaCollectionSyncedDevicesEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup target = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MediaCollectionSyncedDevices_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup source = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_MediaCollectionSyncedDevices_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.TabletEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ComputerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.SmartphoneEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.EReaderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MediaCollectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MediaLibrary.diagram.edit.parts.ArtifactOriginEditPart.VISUAL_ID: {
			LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem> result = new LinkedList<MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup target = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_ArtifactOrigin_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup source = new MediaLibrary.diagram.navigator.MediaLibraryNavigatorGroup(
					MediaLibrary.diagram.part.Messages.NavigatorGroupName_ArtifactOrigin_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ExternalSourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.StoreEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.AudioBookEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.MusicTrackEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
							.getType(MediaLibrary.diagram.edit.parts.EbookEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MediaLibrary.diagram.edit.parts.EcosystemEditPart.MODEL_ID
				.equals(MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem> result = new ArrayList<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem) {
			MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem abstractNavigatorItem = (MediaLibrary.diagram.navigator.MediaLibraryAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
