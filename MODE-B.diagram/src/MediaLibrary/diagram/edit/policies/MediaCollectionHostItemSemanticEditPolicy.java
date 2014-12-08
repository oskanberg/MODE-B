/*
 * 
 */
package MediaLibrary.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MediaCollectionHostItemSemanticEditPolicy
		extends
		MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MediaCollectionHostItemSemanticEditPolicy() {
		super(
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.MediaCollectionHost_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
