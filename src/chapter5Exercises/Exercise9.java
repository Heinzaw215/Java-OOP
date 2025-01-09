package chapter5Exercises;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		
		Scanner c = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = c.nextInt();
		int result = sumDigit(num);
		System.out.println("Sum of digits " + num + " is "+ result);
		
		c.close();
	}
	
	static int sumDigit(int n) {
		int sum=0;

		while(n > 0)
		{
			sum+=n %10;
			n /= 10;
		}
		return sum;
	}
}

