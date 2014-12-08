/*
 * 
 */
package MediaLibrary.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
