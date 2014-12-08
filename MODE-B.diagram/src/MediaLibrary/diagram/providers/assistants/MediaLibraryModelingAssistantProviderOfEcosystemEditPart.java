/*
 * 
 */
package MediaLibrary.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MediaLibraryModelingAssistantProviderOfEcosystemEditPart extends
		MediaLibrary.diagram.providers.MediaLibraryModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006);
		types.add(MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007);
		return types;
	}

}
