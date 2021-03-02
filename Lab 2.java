
import java.util.Scanner;

public class ImportTest {
	public static void main(String[] args) {
		System.out.println("Answer to Questions");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		String input3 = scan.nextLine();
		System.out.println("Hi, I interviewed " + input + ".");
		System.out.println("His favorite color is " + input1 + ".");
		System.out.println("He likes " + input2 + ".");
		System.out.println("He thinks this class is " + input3 + " so far.");
		
	}

}
