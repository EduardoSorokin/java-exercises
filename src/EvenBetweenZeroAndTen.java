import java.util.Scanner;

public class EvenBetweenZeroAndTen {

	/**
	 *  Receive an integer number and check if:
	 *  
	 *  - The number is between 0 and 10;
	 *  - The number is an even number.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Type an integer number: ");
		int num = scan.nextInt();
		
		scan.close();
		
		if (num < 0 || num > 10) {
			System.out.println("\nThe number " + num + " is not between 0 and 10.");
			System.exit(0);
		}

		System.out.println("\nThe number is between 0 and 10 " + (num % 2 == 0 ? "and is an" : "but is not") + " an even number.");
		
	}
	
}
