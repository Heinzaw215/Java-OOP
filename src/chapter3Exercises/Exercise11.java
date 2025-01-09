package chapter3Exercises;

import java.util.Scanner; 
import java.util.Calendar;

public class Exercise11 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter the birth year: ");
		int birthYear = scanner.nextInt();
		scanner.close();
		
		int age = currentYear - birthYear;
		
		System.out.println("You were born in " + birthYear + " and  will be " + age + " this year.");
	}
}
