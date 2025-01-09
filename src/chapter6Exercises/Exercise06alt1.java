package chapter6Exercises;

public class Exercise06alt1 {

	public static void main(String[] args) {
		int price;
		
		System.out.print("\t5\t10\t15\t20\t25");
		System.out.print("\n\n");
		
		for (int width = 8; width <= 12; width++) 
		{
			System.out.print(width + " ");
			for (int length = 5; length <= 25; length += 5) {
				price = width * length;
				System.out.print("\t" + price);
				}
			
			System.out.println("");
			}
		
		}
	
	}

}