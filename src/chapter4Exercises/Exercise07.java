package chapter4Exercises;

import javaText.Temperature;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Temperature temp;
		double fahrenheit, celsius;
		
		temp = new Temperature();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit Degree: ");
		fahrenheit = scan.nextDouble();
		
		
		temp.setFahrenheit(fahrenheit);
		celsius = temp.toCelsius(fahrenheit);
		System.out.println(fahrenheit + " Fahrenheit degree is equal to " + celsius + " Celcius degree.");
		
		scan.close();
		}
	
}
