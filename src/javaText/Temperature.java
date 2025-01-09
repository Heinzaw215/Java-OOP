package javaText;

public class Temperature {
	private double celsius, fahrenheit;
	
	public void setCelsius(double cTemp) {
		celsius = cTemp;
	}
	
	public void setFahrenheit(double fTemp) {
		fahrenheit = fTemp;
	}
	
	public double toCelsius(double fahrenheit) {
		return  5.0 / 9 * (fahrenheit - 32);
	}
	
	public double toFahrenheit(double celsius) {
		return celsius * 9.0 / 5 + 32;
	}

	public double getCelsius() {
		return celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}
}
