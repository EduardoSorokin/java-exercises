import java.util.Scanner;

public class SquaredAndCubed {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a numeric value to see it squared and cubed:");
		double num = scan.nextDouble();

		System.out.println(num + "² = " + Math.pow(num, 2));
		System.out.println(num + "³ = " + Math.pow(num, 3));
		
		scan.close();
				
	}

}
