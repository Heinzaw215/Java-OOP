/*
Write a program that accepts a person’s weight and displays the number of calories the person needs in one day. A person needs 19 calories per pound of body weight, so the formula expressed in Java is
		calories = bodyWeight * 19;
(Note:We are not distinguishing between genders.)
*/

package chapter3Exercises;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		double calories, bodyWeight;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the bodyWeight: ");
		bodyWeight = scanner.nextDouble();
		
		calories = bodyWeight * 19;
		
		System.out.println(bodyWeight + " pounds is equal to " + calories + " calories.");
		scanner.close();
	}
}
