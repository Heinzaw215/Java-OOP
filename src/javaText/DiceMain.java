package javaText;

public class DiceMain {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		d1.roll();
		System.out.println("Dice number after rolling: " + d1.getNumber());
	}
}
