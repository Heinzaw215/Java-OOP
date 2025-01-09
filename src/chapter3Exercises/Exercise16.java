package chapter3Exercises;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		double wEarth, wMercury, wVenus, wJupiter, wSaturn;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the weight: ");
		wEarth = scanner.nextFloat();
		
		wMercury = wEarth * 0.4;
		wVenus = wEarth * 0.9;
		wJupiter = wEarth * 2.5;
		wSaturn = wEarth * 1.1;
		
		System.out.println("\nThe Earth's weight: " + wEarth + "\nMercury's weight:" + wMercury + "\nThe Venus's weight : " + wVenus + "\nThe Jupiter's weight : " + wJupiter + "\nThe Saturn's weight : " + wSaturn);
		scanner.close();
	}

}
