/*
 * 
 */
package MediaLibrary.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class MediaCollectionSyncedDevicesReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public MediaCollectionSyncedDevicesReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof MediaLibrary.MediaCollection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MediaLibrary.Device && newEnd instanceof MediaLibrary.MediaCollection)) {
			return false;
		}
		return MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistMediaCollectionSyncedDevices_4002(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MediaLibrary.Device && newEnd instanceof MediaLibrary.Device)) {
			return false;
		}
		return MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistMediaCollectionSyncedDevices_4002(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getSyncedDevices().remove(getOldTarget());
		getNewSource().getSyncedDevices().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getSyncedDevices().remove(getOldTarget());
		getOldSource().getSyncedDevices().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected MediaLibrary.MediaCollection getOldSource() {
		return (MediaLibrary.MediaCollection) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected MediaLibrary.MediaCollection getNewSource() {
		return (MediaLibrary.MediaCollection) newEnd;
	}

	/**
	 * @generated
	 */
	protected MediaLibrary.Device getOldTarget() {
		return (MediaLibrary.Device) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MediaLibrary.Device getNewTarget() {
		return (MediaLibrary.Device) newEnd;
	}
}
