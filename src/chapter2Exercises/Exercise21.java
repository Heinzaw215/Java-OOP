//Repeat Exercise 20, but this time use this format: Monday December 10, 2008.

package chapter2Exercises;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise21 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd, yyyy");
		System.out.println(sdf.format(today));
	}

}
