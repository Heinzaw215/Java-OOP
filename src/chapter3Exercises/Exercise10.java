/*
	Write a program that does the reverse of Exercise 9, that is, input degrees Fahrenheit and prints out the temperature in degrees Celsius. 
	The formula to convert degrees Fahrenheit to equivalent degrees Celsius is
		Celsius = 5 / 9 * (Fahrenheit - 32)
*/

package chapter3Exercises;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Fahrenheit temperature: ");
		double fTemp = scan.nextDouble();
		
		double cTemp = 5 / 9 * (fTemp - 32);
		
		System.out.println(fTemp + " Degree Fahrenheit is equal to " + cTemp + " celsius temperature.");
		
		scan.close();
	}
}
