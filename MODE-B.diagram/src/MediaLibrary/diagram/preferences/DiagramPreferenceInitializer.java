/*
 * 
 */
package MediaLibrary.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		MediaLibrary.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		MediaLibrary.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		MediaLibrary.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		MediaLibrary.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		MediaLibrary.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return MediaLibrary.diagram.part.MediaLibraryDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
