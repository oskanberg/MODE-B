/*
 * 
 */
package MediaLibrary.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MediaLibraryNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) {
			MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem item = (MediaLibrary.diagram.navigator.MediaLibraryNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
