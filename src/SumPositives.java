import java.util.Scanner;

public class SumPositives {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int oldValue = 0;
		int newValue = 0;
		
		do {
			System.out.println("Type a integer value:");
			newValue = scan.nextInt();
			
			if (newValue < 0 ) {
				System.out.println("\nTHE END!");
				break;
			}
			
			oldValue = oldValue + newValue;
				
			System.out.println("\nThe sum of the last 2 typed values is: " + oldValue + "\n");
			
		} while (newValue > 0);
		
		scan.close();
		
	}

}
