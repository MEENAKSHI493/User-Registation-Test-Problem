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

	// Check First Name
	@Test
	public void givenName_WhenFirstNameCaptial_ShouldReturn() {

		boolean actual = UserReg.isFirstName("Meenakshi");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase() {

		boolean actual = UserReg.isFirstName("meenakshi");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = UserReg.isFirstName("Meenakshi@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_HaveNumbers() {

		boolean actual = UserReg.isFirstName("Meenakshi123");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_whenFirstName_Havespace() {
		
		boolean actual = UserReg.isFirstName("Meen  akshi");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_whenFirstName_givenspace_haveNumber() {
		
		boolean actual = UserReg.isFirstName("Meenakshi 123");
		Assert.assertFalse(actual);

	}

	// Check Last Name

	@Test
	public void givenName_WhenLastNameCaptial_ShouldReturn() {

		boolean actual = UserReg.isLastName("Budarkar");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenLastName_FirstCharacter_IsInLowerCase() {

		boolean actual = UserReg.isLastName("budarkar");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = UserReg.isLastName("Budarkar@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_HaveNumbers() {

		boolean actual = UserReg.isLastName("Budarkar123");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_whenLastName_Havespace() {
		
		boolean actual = UserReg.isFirstName("Budarkar@##$5 ");
		Assert.assertFalse(actual);

	}

	public void givenName_whenLastName_givenspace_haveNumber() {
		
		boolean actual = UserReg.isFirstName("Budarkar 123");
		Assert.assertFalse(actual);
	}
	// Check Email

	@Test
	public void givenEmail_WhenEmail_is_Valid_ShouldReturn() {

		boolean actual = UserReg.isEmail("meenakshi.budar@gamil.com.in");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenEmail_WhenEmail_does_not_contain_Special_char_ShouldReturn() {

		boolean actual = UserReg.isEmail("meenaks!hibudar@gmail.com.in");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_Should_not_End_with_Number_ShouldReturn() {

		boolean actual = UserReg.isEmail("meenakshi.budar@gmail.com.in12");
		Assert.assertFalse(actual);
	}
	// Check Mobile Format

	@Test
	public void givenmobileNo_WhenMobileNo_is_Valid_ShouldReturn() {

		boolean actual = UserReg.isMobileNo("91 7005803672");
		Assert.assertTrue(actual);

	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_char_ShouldReturn() {

		boolean actual = UserReg.isMobileNo("91 700580367a");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_more_then_one_space_ShouldReturn() {

		boolean actual = UserReg.isMobileNo("91  7005803672");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_Contain_More_Then_Ten_Digit_ShouldReturn() {

		boolean actual = UserReg.isMobileNo("91 700580367233");
		Assert.assertFalse(actual);
	}
	
	// Check Password

	@Test
	public void givenpassword_WhenPassword_is_Valid_ShouldReturn() {

		boolean actual = UserReg.isPassword("abcdefgh");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword_WhenPassword_is_Less_then_8_char_ShouldReturn() {

		boolean actual = UserReg.isPassword("abcdefg");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_contain_number_char_ShouldReturn() {

		boolean actual = UserReg.isPassword("abcdefgh7i");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_contain_special_char_ShouldReturn() {

		boolean actual = UserReg.isPassword("abcdefgh7$");
		Assert.assertFalse(actual);

	}

	@Test
	public void givenpassword_WhenPassword_contain_capital_char_ShouldReturn() {

		boolean actual = UserReg.isPassword("abcd efgh");
		Assert.assertFalse(actual);
	}
	
	// Check Password Rule 2

		@Test
		public void givenpassword1_WhenPassword_is_Valid_ShouldReturn() {

			boolean actual = UserReg.isPassword("Abcdefgh");
			Assert.assertTrue(actual);
		}
		@Test
		public void givenpassword1_WhenPassword1_Contain_Lower_Case_ShouldReturn() {

			boolean actual = userReg.isPassword1("abcdefghi");
			Assert.assertFalse(actual);
		}
	
		// Check Password Rule 3

				@Test
				public void givenpassword_WhenPassword2_is_Valid_ShouldReturn() {

					boolean actual = UserReg.isPassword2("Abcdefgh12");
					Assert.assertTrue(actual);
				}

				@Test
				public void givenpassword1_WhenPassword2_does_not_have_digit_ShouldReturn() {

					boolean actual = UserReg.isPassword2("Abcdefghi");
					Assert.assertFalse(actual);
				}
				// Check Password Rule 4

				@Test
				public void givenpassword3_WhenPassword3_is_Valid_ShouldReturn_True() {

					boolean actual = userReg.isPassword3("Abcdefgh12@12");
					Assert.assertTrue(actual);
				}

				@Test
				public void givenpassword3_WhenPassword3_have_Lessthen_8_digit_ShouldReturn_False() {

					boolean actual = userReg.isPassword3("Abcdefg");
					Assert.assertFalse(actual);
				}
				
				@Test
				public void givenpassword3_WhenPassword3_have_only_character_ShouldReturn_False() {

					boolean actual = userReg.isPassword3("Abcdefgijkl");
					Assert.assertFalse(actual);
				}
				
				@Test
				public void givenpassword3_WhenPassword3_dont_have_specialCharacter_ShouldReturn_False() {

					boolean actual = userReg.isPassword3("Abcdefgijkl");
					Assert.assertFalse(actual);
				}


		
		
}