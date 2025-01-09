package chapter5Exercises;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number (0-4): ");
		int selection = scan.nextInt();
		
		switch (selection) {
		case 0: 
			System.out.println("You selected Maganta.");
			break;
		case 1:
			System.out.println("You selected Cyan.");
			break;
		case 2:
			System.out.println("You selected Red.");
			break;
		case 3:
			System.out.println("You selected Blue.");
			break;
		case 4:
			System.out.println("You selected Green.");
			break;
		default:
			System.out.println("Invalid selection.");
			break;
		}
		scan.close();	
	}

}
