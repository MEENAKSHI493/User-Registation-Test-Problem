package UserRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
	//Check First Name
	
	public static boolean isFirstName(String firstname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern patt = Pattern.compile(regex);
		if (firstname == null) {
			return false;
		}
		Matcher match = patt.matcher(firstname);
		return match.matches();
	}
	
	//Check Last Name
	
	public static boolean isLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern patt = Pattern.compile(regex);
		if (lastname == null) {
			return false;
		}
		Matcher match = patt.matcher(lastname);
		return match.matches();
	}

}