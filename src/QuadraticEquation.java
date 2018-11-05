import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's build a quadratic equation (ax² + bx + c = 0) and solve it by using the Bhaskara's formula.");
		
		System.out.println("\nType a value for 'a': ");
		int a = scan.nextInt();
		
		System.out.println("\nType a value for 'b': ");
		int b = scan.nextInt();
		
		System.out.println("\nType a value for 'c': ");
		int c = scan.nextInt();
		
		int delta = (b*b) - (4*a*c);
		
		System.out.printf("\nYour equation is: %dx² + %dx + %d = 0", a, b, c);
		System.out.println("\nAnd the DELTA is: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		
		System.out.printf("\nThe 'x1' for the equation is: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.printf("\nThe 'x2' for the equation is: %.2f", x2);
		
		scan.close();
		
	}

}
