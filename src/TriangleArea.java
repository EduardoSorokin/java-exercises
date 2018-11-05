import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's calculate the area of a triangle.");
		
		System.out.println("Type the value of the triangle's base (cm): ");
		double base = scan.nextDouble();
		
		System.out.println("Type the value of the triangle's height (cm): ");
		double height = scan.nextDouble();
		
		double area = base * height / 2;
		
		System.out.printf("The area of the triangle is %.2f", area);
		
		scan.close();
		
	}

}
