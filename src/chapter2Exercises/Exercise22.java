// Write a program that displays a frame window W pixels wide and H pixels high. Use the Scanner to enter the values for W and H. The title of the frame is also entered by the user.

package chapter2Exercises;

import java.util.Scanner;
import javax.swing.JFrame;

public class Exercise22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the pixels width: ");
		int width = scan.nextInt();
		System.out.print("Enter the pixels height: ");
		int height = scan.nextInt();
		
		JFrame myWindow = new JFrame();
		myWindow.setSize(width, height);
		myWindow.setTitle("My first Java Program.");
		myWindow.setVisible(true);
		
		scan.close();
	}

}
