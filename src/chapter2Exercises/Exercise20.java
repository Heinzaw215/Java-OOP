//Write a program to display today’s date in this format: 10 December 2008. Use the console window for output. Refer to Table 2.1 for the necessary designator symbols.

package chapter2Exercises;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise20 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(sdf.format(today));
	}
}
