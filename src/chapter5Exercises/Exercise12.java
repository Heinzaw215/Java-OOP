package chapter5Exercises;

public class Exercise12 { 
 	static boolean isLeapYear(int year) { 
	     boolean ans; 
 	     if((year%4==0 && year%100!=0) || (year%400==0))
	    
		ans=true; 

	     else 
		ans=false; 
        return ans; 
} 
public static void main(String[] args) 
{ 
	boolean leap=isLeapYear(2000); 
	 if(leap)
		System.out.println("It is Leap Year"); 
	else
		 System.out.println("It is not Leap Year"); 
} 
     }

