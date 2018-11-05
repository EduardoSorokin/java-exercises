import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Try guessing the secret number (between 0 and 100) that the computer is storing.");
		System.out.println("NOTE: You have 10 tries.");
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(101);
		
		boolean bingo = false;
		int tries = 10;
		int guess;
		
		do {
			System.out.println("\nType the number: ");

			guess = scan.nextInt();
			
			if (guess == randomNumber) {
				bingo = true;
				break;
			}
			
			if (guess < randomNumber) {
				System.out.println("\n" + guess + " is lower than the secret number.");

			} else if (guess > randomNumber) {
				System.out.println("\n" + guess + " is greater than the secret number.");
			}
			
			tries--;
			
		} while (tries > 0 && !bingo);
		
		if (bingo) {
			System.out.println("\nBINGO! You guessed the secret number within " + (11 - tries) + " guesses.");

		} else {
			System.out.println("\nOops! Your tries just ended.");
		}

		scan.close();

	}
	
}
