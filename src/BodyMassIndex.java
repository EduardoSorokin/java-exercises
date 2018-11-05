import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's calculate your BMI!");
		
		System.out.println("\nType your weight (kg):");
		double kg = scan.nextDouble();
		
		System.out.println("\nType your height (m):");
		double cm = scan.nextDouble();
		
		double bmi = kg / (cm * cm);
		
		System.out.printf("\nYour BMI is %.1f", bmi);

		scan.close();
	}

}
