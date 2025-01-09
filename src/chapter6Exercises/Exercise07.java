package chapter6Exercises;

import java.util.Scanner;

public class Exercise07 { 
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		do
		{
			if (num<0)
		 		break;
			else
			{
				int count=2;
				while(count <= num)
				{
					if(num % count==0) 
				 		 break;
					count ++;
				}
				if(count== num)
					System.out.println("This is Prime Number.");
				else
					System.out.println("This is not Prime Number.");
			}
		  System.out.println("Do you want to try again number.");
		   num=s.nextInt();
		} while(num>0);
	}
	
	public boolean isPrime() {
		return prime;
	}
}
