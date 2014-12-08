/**
 */
package MediaLibrary.tests;

import MediaLibrary.MediaLibraryFactory;
import MediaLibrary.MusicTrack;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Music Track</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicTrackTest extends DurationArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MusicTrackTest.class);
	}

	/**
	 * Constructs a new Music Track test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicTrackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Music Track test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MusicTrack getFixture() {
		return (MusicTrack)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MediaLibraryFactory.eINSTANCE.createMusicTrack());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MusicTrackTest
