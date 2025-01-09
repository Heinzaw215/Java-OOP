//Write a program to convert centimeters (input) to feet and inches (output). 1in = 2.54cm.

package chapter3Exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		double inch, centimeter, feet;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the centimeter: ");
		centimeter = scanner.nextDouble();
		
		inch = centimeter / 2.54;
		feet = inch / 12;
		
		System.out.println(centimeter + " centimeters is equal to " + inch + " inches and " + feet + " feet.");
		scanner.close();
	}
}
