package javaText;

import java.util.Scanner;

public class Exercise3b {
	public static void main(String[] args) {
		float celsius, fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the degree Celsius: ");
		celsius = scanner.nextFloat();
		
		fahrenheit = celsius * 9/5 + 32;
		
		System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " degree fahrenheit.");
		
		fahrenheit = (float) celsius * 9/5 + 32;
		
		System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " degree fahrenheit.");
		
		scanner.close();
	}
}
