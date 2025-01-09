//Display the current time in the title of a frame window using this format: 12:45:43 PM. Refer to Table 2.1 for the necessary designator symbols.

package chapter2Exercises;

import javax.swing.JFrame;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise23 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		
		JFrame myWindow = new JFrame();
		myWindow.setSize(500, 600);
		myWindow.setTitle(sdf.format(today));
		myWindow.setVisible(true);
	}

}
