import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a positive integer number: ");
		int num = scan.nextInt();

		if (num < 2) {
			System.out.println("\n" + num + " is NOT a prime number.");
			System.exit(0);

		} else if (num == 2) {
			System.out.println("\n" + num + " is a prime number.");
			System.exit(0);
		}
		
		boolean isPrime = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println("\n" + num + " is " + (!isPrime ? "NOT " : "") + "a prime number.");
		
	}
	
}
