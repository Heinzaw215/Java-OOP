/*In the RollDice program, we created three Die objects and rolled them once.
Rewrite the program so you will create only one Die object and roll it three
times. */

package chapter4Exercises;

import javaText.Dice;

public class Exercise05 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();
		dice.roll();
		dice.roll();
		System.out.println("Dice number after rolling: " + dice + ", " + dice + ", " + dice);
	}
}
