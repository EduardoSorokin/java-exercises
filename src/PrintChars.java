import java.util.Scanner;

public class PrintChars {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a word and hit [ENTER]:");
		String word = scan.nextLine();
		
		scan.close();
		
		for (int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
	}
	
}
