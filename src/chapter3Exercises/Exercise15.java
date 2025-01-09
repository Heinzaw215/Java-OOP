package chapter3Exercises;

import java.util.Scanner;

public class Exercise15 {

	private static final double ME = 5.98e24;
	private static final double G = 6.67e-11;
	
	public static double calculateVelocity(double radius) {
		return Math.sqrt(G * ME / radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scanner.nextDouble();
		
		double velocity = calculateVelocity(radius);
		System.out.println("The velocity of the satellite: " + velocity);
		
		scanner.close();
	}

}
