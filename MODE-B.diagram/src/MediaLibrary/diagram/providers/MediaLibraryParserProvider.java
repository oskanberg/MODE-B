/*
 * 
 */
package MediaLibrary.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MediaLibraryParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser tabletName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTabletName_5001Parser() {
		if (tabletName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			tabletName_5001Parser = parser;
		}
		return tabletName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser computerName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getComputerName_5002Parser() {
		if (computerName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			computerName_5002Parser = parser;
		}
		return computerName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser smartphoneName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSmartphoneName_5003Parser() {
		if (smartphoneName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			smartphoneName_5003Parser = parser;
		}
		return smartphoneName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser eReaderName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEReaderName_5004Parser() {
		if (eReaderName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			eReaderName_5004Parser = parser;
		}
		return eReaderName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalSourceName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getExternalSourceName_5005Parser() {
		if (externalSourceName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			externalSourceName_5005Parser = parser;
		}
		return externalSourceName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser storeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getStoreName_5006Parser() {
		if (storeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			storeName_5006Parser = parser;
		}
		return storeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser libraryName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getLibraryName_5013Parser() {
		if (libraryName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			libraryName_5013Parser = parser;
		}
		return libraryName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser mediaCollectionName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getMediaCollectionName_5012Parser() {
		if (mediaCollectionName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			mediaCollectionName_5012Parser = parser;
		}
		return mediaCollectionName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser audioBookName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAudioBookName_5007Parser() {
		if (audioBookName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			audioBookName_5007Parser = parser;
		}
		return audioBookName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser musicTrackName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getMusicTrackName_5008Parser() {
		if (musicTrackName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			musicTrackName_5008Parser = parser;
		}
		return musicTrackName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser videoName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getVideoName_5009Parser() {
		if (videoName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			videoName_5009Parser = parser;
		}
		return videoName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser imageName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getImageName_5010Parser() {
		if (imageName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			imageName_5010Parser = parser;
		}
		return imageName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser ebookName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEbookName_5011Parser() {
		if (ebookName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { MediaLibrary.MediaLibraryPackage.eINSTANCE
					.getNamedElement_Name() };
			MediaLibrary.diagram.parsers.MessageFormatParser parser = new MediaLibrary.diagram.parsers.MessageFormatParser(
					features);
			ebookName_5011Parser = parser;
		}
		return ebookName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MediaLibrary.diagram.edit.parts.TabletNameEditPart.VISUAL_ID:
			return getTabletName_5001Parser();
		case MediaLibrary.diagram.edit.parts.ComputerNameEditPart.VISUAL_ID:
			return getComputerName_5002Parser();
		case MediaLibrary.diagram.edit.parts.SmartphoneNameEditPart.VISUAL_ID:
			return getSmartphoneName_5003Parser();
		case MediaLibrary.diagram.edit.parts.EReaderNameEditPart.VISUAL_ID:
			return getEReaderName_5004Parser();
		case MediaLibrary.diagram.edit.parts.ExternalSourceNameEditPart.VISUAL_ID:
			return getExternalSourceName_5005Parser();
		case MediaLibrary.diagram.edit.parts.StoreNameEditPart.VISUAL_ID:
			return getStoreName_5006Parser();
		case MediaLibrary.diagram.edit.parts.LibraryNameEditPart.VISUAL_ID:
			return getLibraryName_5013Parser();
		case MediaLibrary.diagram.edit.parts.MediaCollectionNameEditPart.VISUAL_ID:
			return getMediaCollectionName_5012Parser();
		case MediaLibrary.diagram.edit.parts.AudioBookNameEditPart.VISUAL_ID:
			return getAudioBookName_5007Parser();
		case MediaLibrary.diagram.edit.parts.MusicTrackNameEditPart.VISUAL_ID:
			return getMusicTrackName_5008Parser();
		case MediaLibrary.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
			return getVideoName_5009Parser();
		case MediaLibrary.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
			return getImageName_5010Parser();
		case MediaLibrary.diagram.edit.parts.EbookNameEditPart.VISUAL_ID:
			return getEbookName_5011Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MediaLibrary.diagram.part.MediaLibraryVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MediaLibrary.diagram.providers.MediaLibraryElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
