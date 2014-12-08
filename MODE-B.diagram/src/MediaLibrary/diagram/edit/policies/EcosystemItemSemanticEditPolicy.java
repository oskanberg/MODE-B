/*
 * 
 */
package MediaLibrary.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class EcosystemItemSemanticEditPolicy
		extends
		MediaLibrary.diagram.edit.policies.MediaLibraryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EcosystemItemSemanticEditPolicy() {
		super(
				MediaLibrary.diagram.providers.MediaLibraryElementTypes.Ecosystem_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Tablet_2001 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.TabletCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Computer_2002 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.ComputerCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Smartphone_2003 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.SmartphoneCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.EReader_2004 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.EReaderCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.ExternalSource_2005 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.ExternalSourceCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Store_2006 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.StoreCreateCommand(
					req));
		}
		if (MediaLibrary.diagram.providers.MediaLibraryElementTypes.Library_2007 == req
				.getElementType()) {
			return getGEFWrapper(new MediaLibrary.diagram.edit.commands.LibraryCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
