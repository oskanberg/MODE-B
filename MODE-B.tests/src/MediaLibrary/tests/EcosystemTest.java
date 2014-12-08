/**
 */
package MediaLibrary.tests;

import MediaLibrary.Ecosystem;
import MediaLibrary.MediaLibraryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ecosystem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcosystemTest extends TestCase {

	/**
	 * The fixture for this Ecosystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ecosystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EcosystemTest.class);
	}

	/**
	 * Constructs a new Ecosystem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcosystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ecosystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ecosystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ecosystem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ecosystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MediaLibraryFactory.eINSTANCE.createEcosystem());
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

} //EcosystemTest
