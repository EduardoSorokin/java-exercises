import java.util.Scanner;

public class SchoolAverage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the first grade [1 of 2]:");
		double grade1 = scan.nextDouble();
		
		System.out.println("Type the second grade [2 of 2]:");
		double grade2 = scan.nextDouble();
		
		double avg = (grade1 + grade2) / 2;
		
		String status;
		
		if (avg >= 7.0) {
			status = "Approved";

		} else if (avg >= 4.0) {
			status = "Need to take summer school classes";

		} else {
			status = "Reproved";
		}

        System.out.println("\nStatus: " + status);
        
        scan.close();
	}
	
}
