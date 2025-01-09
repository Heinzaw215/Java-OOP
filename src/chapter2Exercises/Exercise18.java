//Input the user’s first and last name as two separate strings. Then display a
//frame window with its title set to <last>, <first>, where <last> and <first> are
//the input values. For example, if the input values are Johann and Strauss,
//then the title would be Strauss, Johann.

package chapter2Exercises;

import javax.swing.JFrame;
import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first title name: ");
		String first = scanner.next();
		System.out.print("Enter the last title name: ");
		String last = scanner.next();

		JFrame myWindow = new JFrame();
		myWindow.setSize(800, 600);
		myWindow.setTitle(first + " " + last);
		myWindow.setVisible(true);
		
//		close the scanner
		scanner.close();
	}

}
