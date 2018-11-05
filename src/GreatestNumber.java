import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			System.out.println("[" + (i+1) + " of 10] Type an integer value to be storage: ");
			list.add(scan.nextInt());
		}

		System.out.println("\nThe greatest stored value is: " + Collections.max(list));
		
		scan.close();
	}
	
}
