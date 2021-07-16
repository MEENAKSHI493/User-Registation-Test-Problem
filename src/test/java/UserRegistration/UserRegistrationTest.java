package UserRegistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;


public class UserRegistrationTest {
	UserReg userReg;

	@Before
	public void setUp() {
		userReg = new UserReg();

	}
	@Test
	public void givenName_WhenFirstNameCaptial_ShouldReturn() {

		boolean actual = userReg.isFirstName("Meenakshi");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase() {

		boolean actual = userReg.isFirstName("meenakshi");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = userReg.isFirstName("Meenakshi@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_HaveNumbers() {

		boolean actual = userReg.isFirstName("Meenakshi123");
		Assert.assertFalse(actual);
	}
	
	@Test
	public void givenName_whenFirstName_Havespace() {
		boolean actual = userReg.isFirstName("Meen  akshi");
		Assert.assertFalse(actual);
	}
	
	@Test
	public void givenName_whenFirstName_givenspace_haveNumber() {
		boolean actual = userReg.isFirstName("Meenakshi 123");
		Assert.assertFalse(actual);
	
}
	}
