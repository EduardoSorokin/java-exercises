import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a year to check if is a leap year or not: ");
		int year = scan.nextInt();

		boolean isLeap = ((year % 4 == 0) && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)));

		System.out.println("The year " + year + " is " + (!isLeap ? "NOT " : "") + "a leap year.");

		scan.close();

	}
	
}
