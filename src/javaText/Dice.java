package javaText;

import java.util.*;

public class Dice {
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 6;
	public static final int NO_NUMBER = 0;
	private int number;
	private Random random;
	
	public Dice() {
		random = new Random();
		number = NO_NUMBER;
	}
	
	public void roll() {
		number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	}
	
	public int getNumber() {
		return number;
	}
}
