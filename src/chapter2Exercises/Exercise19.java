// Input the user’s first, middle, and last name as three separate strings and display the name in the order of the first name, the middle initial, and the last name. Include the period after the middle initial. If the input strings are Wolfgang, Amadeus, and Mozart, for example, then the ouput would be Wolfgang A. Mozart. Use the console window for output.

package chapter2Exercises;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter your First name: ");
		String fName = scan.next();
		System.out.print("Enter your Middle intial name: ");
		String sName = scan.next();
		System.out.print("Enter your Last name: ");
		String lName = scan.next();
		
		System.out.println(fName + " " + sName + ". " + lName);
		
		scan.close();
	}
}
