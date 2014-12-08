/**
 */
package MediaLibrary.tests;

import MediaLibrary.MediaLibraryFactory;
import MediaLibrary.Smartphone;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smartphone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartphoneTest extends DeviceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmartphoneTest.class);
	}

	/**
	 * Constructs a new Smartphone test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartphoneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Smartphone test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Smartphone getFixture() {
		return (Smartphone)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MediaLibraryFactory.eINSTANCE.createSmartphone());
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

} //SmartphoneTest
