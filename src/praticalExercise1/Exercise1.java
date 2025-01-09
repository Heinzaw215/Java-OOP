package praticalExercise1;

public class Exercise1 {
	public static void main(String[] args) {
		double circleArea, circleCircumference;
		int radius = 25;
		final double PI = 3.14;
		
		circleArea = PI * radius * radius;
		System.out.println("Radius = " + radius + ", Area = " + circleArea);
		
		circleCircumference = 2 * PI * radius;
		System.out.println("Radius = " + radius + ", Circumference = " + circleCircumference);
	}
}
