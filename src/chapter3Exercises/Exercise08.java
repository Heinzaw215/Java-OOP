/* Write a program that inputs temperature in degrees Celsius and prints out the temperature in degrees Fahrenheit. The formula to convert degrees Celsius to equivalent degrees Fahrenheit is
		Fahrenheit = 1.8 * Celsius + 32 
*/

package chapter3Exercises;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the degree Fahrenheit: ");
		celsius = scanner.nextFloat();
		
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " degree fahrenheit.");
		
		scanner.close();
	}
}
