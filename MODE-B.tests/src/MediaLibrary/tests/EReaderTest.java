/**
 */
package MediaLibrary.tests;

import MediaLibrary.EReader;
import MediaLibrary.MediaLibraryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EReader</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EReaderTest extends DeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EReaderTest.class);
	}

	/**
	 * Constructs a new EReader test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReaderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EReader test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EReader getFixture() {
		return (EReader)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MediaLibraryFactory.eINSTANCE.createEReader());
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

} //EReaderTest
