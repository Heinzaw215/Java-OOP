package chapter4Exercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int numberOfA_Seats, numberOfB_Seats, numberOfC_Seats;
		double totalSales, pricePerA_Seat, pricePerB_Seat, pricePerC_Seat;
		
		System.out.print("Number of A seats: ");
		numberOfA_Seats = scan.nextInt();
		
		System.out.print("Price of A seat: ");
		pricePerA_Seat = scan.nextDouble();
		
		System.out.print("Number of B seats: ");
		numberOfB_Seats = scan.nextInt();
		
		System.out.print("Price of B seat: ");
		pricePerB_Seat = scan.nextDouble();
		
		System.out.print("Number of C seats: ");
		numberOfC_Seats = scan.nextInt();
		
		System.out.print("price of C seat: ");
		pricePerC_Seat = scan.nextDouble();
		
		totalSales = numberOfA_Seats * pricePerA_Seat +
				numberOfB_Seats * pricePerB_Seat +
				numberOfC_Seats * pricePerC_Seat;
		
		System.out.println("\nTotal Sales: $" + totalSales);
		
		scan.close();
	}

}
