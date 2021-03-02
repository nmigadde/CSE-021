import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the max number: ");
		int max = scan.nextInt();
		System.out.print("Please enter the divisor: ");
		int div = scan.nextInt();
		
		for(int i = 0; i < max; i++) {
			int num = i + 1;
			int ans = num % div;
			System.out.println("Num: " + num + " % " + div + " = " + ans);
		}

	}

}
