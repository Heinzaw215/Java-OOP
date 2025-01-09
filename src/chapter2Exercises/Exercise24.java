/*Write a Java program that displays a frame window 300 pixels wide and 200 pixels high with the title My First Frame. Place the frame so that its top left corner is at a position 50 pixels from the top of the screen and 100 pixels from the left of the screen. To position a window at a specified location, you use the setLocation method, as in

	//assume mainWindow is declared and created
	frame.setLocation( 50, 50 );

Through experimentation, determine how the two arguments in the setLocation method affect the positioning of the window. */

package chapter2Exercises;

import javax.swing.JFrame;

public class Exercise24 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("My First Frame");
		frame.setLocation(50, 100);
		frame.setVisible(true);
	}

}
