package chapter3Exercises;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double BMI;
		int weight, height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the weight in kilogram: ");
		weight = scanner.nextInt();
		System.out.print("Enter the height in centimeter: ");
		height = scanner.nextInt();
		
		BMI = weight / Math.pow(height / 100.0, 2);
		
		System.out.print("The Body Mass Index of weight " + weight + " kilogram and height " + height + " centimeter is " + BMI);
		
		if (BMI >= 20 && BMI <= 25) {
			System.out.println("Your IBM is normal");
		}
		
		scanner.close();
	}

}
