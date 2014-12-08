/**
 */
package MediaLibrary.tests;

import MediaLibrary.ExternalSource;
import MediaLibrary.MediaLibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalSourceTest extends MediaSourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalSourceTest.class);
	}

	/**
	 * Constructs a new External Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalSource getFixture() {
		return (ExternalSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MediaLibraryFactory.eINSTANCE.createExternalSource());
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

} //ExternalSourceTest
