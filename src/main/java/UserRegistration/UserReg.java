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
	
	
	//Check Email
	
	public static boolean isEmail(String email) {
		String regex = "^[a-zA-Z]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		Pattern patt = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher match = patt.matcher(email);
		return match.matches();
	}
	
	//Check Mobile Format
	
	public static boolean isMobileNo(String mobile) {
		String regex = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
		Pattern patt = Pattern.compile(regex);
		if (mobile == null) {
			return false;
		}
		Matcher match = patt.matcher(mobile);
		return match.matches();
	}
	
	//Check Password
	
	public static boolean isPassword(String password) {
		String regex = "^[a-zA-Z]{8,}$";
		Pattern patt = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher match = patt.matcher(password);
		return match.matches();
	}
	//Check Password Rule 2
	
		public static boolean isPassword1(String password1) {
			String regex = "^[A-Z]{1}+[a-zA-Z]{7,}$";
			Pattern patt = Pattern.compile(regex);
			if (password1 == null) {
				return false;
			}
			Matcher match = patt.matcher(password1);
			return match.matches();
		}
		//Check Password Rule 3
		
		public static boolean isPassword2(String password2) {
			String regex = "^[A-Z]{1}+[a-zA-Z].+[0-9].+{8,}$";
			Pattern patt = Pattern.compile(regex);
			if (password2 == null) {
				return false;
			}
			Matcher match = patt.matcher(password2);
			return match.matches();
		}   

		//Check Password Rule 4
		
		public static boolean isPassword3(String password3) {
			String regex = "^[A-Z]{1}+[a-zA-Z].*[@#$%^&*._+=].*[0-9].*{8,}$";
			Pattern patt = Pattern.compile(regex);
			if (password3 == null) {
				return false;
			}
			Matcher match = patt.matcher(password3);
			return match.matches();
		}

	
}