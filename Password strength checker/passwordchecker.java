import java.util.NoSuchElementException;
import java.util.Scanner;
public class passwordchecker {
	
	public static void checkPassword(String password) { 
		int length = password.length(); 
		if(length < 14) {
			System.out.println("Error, " +length+ " charactes is too short!");
			System.out.println("Password must be 14 characters or more."); 
		}
		if(length >= 14) {
			System.out.println("The password is "+length+" characters long.");
		}
		
		 boolean isUpperCase = false; 
			for(int i = 0; i < password.length(); i++) {
				if(Character.isUpperCase(password.charAt(i))) {
					isUpperCase = true;  
				}
			}
			if(isUpperCase == true) {
				System.out.println("Password has at least one upper case letter");
			}
			else {
				System.out.println("Password does not have a upper case letter"); 
			}
		 
			
		 boolean isLowerCase = false; 
			for(int i = 0; i < password.length(); i++) {
				if(Character.isLowerCase(password.charAt(i))) {
					isLowerCase = true;  
				}
			}
			if(isLowerCase == true) {
				System.out.println("Password has at least one lower case letter");
			}
			else {
				System.out.println("Password has at least one lower case letter");
			}
			
			
		 boolean isDigit = false; 
			for(int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i))) {
					isDigit = true;  
				}
			}
			if(isDigit == true) {
				System.out.println("Password has at least one number"); 
			}
			else {
				System.out.println("Password does not contain any numbers");
			}
		
		boolean isSpecialCharacter = false; 
			for(int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if(!Character.isLetterOrDigit(ch) && !Character.isUpperCase(ch)) {
					isSpecialCharacter = true; 
				}
			}
			if(isSpecialCharacter = true) {
				System.out.println("Password contains a special Character"); 
				System.out.println();
			}
			else {
				System.out.println("Password does not contain a special Character");
			}
			
			
			if(length >= 14 && isUpperCase == true && isLowerCase == true && isDigit == true && isSpecialCharacter == true) {
				System.out.println(password + " meets the security guidelines");
			}
			else {
				System.out.println(password + " does not meet the security guidelines");
			}
	 }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String password = ""; 
		String continueProgram = ""; 
		
		System.out.println("Password Strength checker");
		System.out.println("Guidelines for a secure password: ");
		System.out.println("(1) At least fourteen characters long.");
		System.out.println("(2) At least one uppercase letter.");
		System.out.println("(3) At least one number. ");
		System.out.println("(4) At least one special character.");
		
		try {
		do {
			System.out.println();
			System.out.print("Enter the password you want to check: ");  
			password = scan.next();
			System.out.println(); 
			passwordchecker.checkPassword(password);
			System.out.println(); 
			System.out.print("Do you want to enter another password? (Y/N): ");
			continueProgram = scan.next();
		}while(continueProgram.equalsIgnoreCase("y")); 
		scan.close();
		} catch (NoSuchElementException e) {
			System.out.println(); 
			System.out.print("NoSuchElementException");
		}
	}

}

