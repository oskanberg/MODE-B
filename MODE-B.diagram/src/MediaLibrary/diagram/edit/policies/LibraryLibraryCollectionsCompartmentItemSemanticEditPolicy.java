/*
 * 
 */
package MediaLibrary.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class LibraryLibraryCollectionsCompartmentItemSemanticEditPolicy
		extends
		MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LibraryLibraryCollectionsCompartmentItemSemanticEditPolicy() {
		super(
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollection_3001 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.MediaCollectionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
