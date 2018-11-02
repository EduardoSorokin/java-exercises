import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of conversion would you like to do?");
		System.out.println("[1] Celsius to Fahrenheit");
		System.out.println("[2] Fahrenheit to Celsius");
		
		Set<Integer> validOptions = new HashSet<Integer>(Arrays.asList(1,2));
		int option = 0;
		boolean isValid = false;
		
		do {
			System.out.println("\nType the option [1 or 2]:");
			option = scan.nextInt();

			isValid = validOptions.contains(option);

			if (!isValid)
				System.out.println("\nInvalid option!");

		} while(!isValid);

		System.out.println("\nType the value for the temperature:");
		double temperature = scan.nextDouble();
		
		scan.close();
		
		TemperatureConverter tc = new TemperatureConverter();
		
		switch (option) {
			case 1:
				System.out.printf("\n" + temperature + "°C = %.2f°F", tc.celsiusToFahrenheit(temperature));
				break;
			case 2:
				System.out.printf("\n" + temperature + "°F = %.2f°C", tc.fahrenheitToCelsius(temperature));
				break;
		}
		
		System.out.println("\n\nTHE END!");
	}

	private double celsiusToFahrenheit(double temperature) {
		return temperature * 9 / 5 + 32;
	}
	
	private double fahrenheitToCelsius(double temperature) {
		return (temperature - 32) * 5 / 9;
	}

}
