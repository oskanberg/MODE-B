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
public class ArtifactOriginItemSemanticEditPolicy
		extends
		MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactOriginItemSemanticEditPolicy() {
		super(
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.ArtifactOrigin_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
