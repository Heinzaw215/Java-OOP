package chapter5Exercises;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalSale, wage = 0;
		int hour, overTimeHour;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of hours worked: ");
		hour = scan.nextInt();
		System.out.print("Enter the total sales: ");
		totalSale = scan.nextDouble();
		
		overTimeHour = 8 - hour;
		
		if (overTimeHour > 8) {
			if ((totalSale <= 99.99) && (totalSale >= 0)) {
				wage = 8 * 7.27 + (overTimeHour * 7.27 / 2) + (totalSale * 0.05);
			} else if ((totalSale <= 299.99) && (totalSale >= 100)) {
				wage = 8 * 7.27 + (overTimeHour * 7.27 / 2) + (totalSale * 0.1);
			} else if ((totalSale >= 300)) {
				wage = 8 * 7.27 + (overTimeHour * 7.27 / 2) + (totalSale * 0.15);
			} 
		} else {
			wage = hour * 7.27;
		}
		
		
		System.out.println("The amount of wages: " + wage);
		
		scan.close();
	}

}
