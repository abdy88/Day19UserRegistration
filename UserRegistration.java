package bl.com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Regular Expression program to validate User Registration!!!");
		UserRegistration userEntry = new UserRegistration();

		System.out.println("Enter First Name : ");
		userEntry.checkFirstName(userEntry.getUserInput());
	}

	private String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	private void checkFirstName(String input) {

		String fName = "^[A-Z][a-zA-Z]{3,}$";

		Pattern pattern = Pattern.compile(fName);
		Matcher match = pattern.matcher(input);

		System.out.println("Validating First Name...");
		printResult(match.matches(), input);

	}

	public void printResult(boolean isOk, String input) {
		if (isOk)
			System.out.println(" " + input + " is Valid");
		else
			System.out.println(" " + input + " is Invalid");
	}

}