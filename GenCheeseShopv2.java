import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		names[0] = "Humboldt Fog";
		prices[0] = 25.00;
		
		names[1] = "Red Hawk";
		prices[1] = 40.50;
		
		names[2] = "Teleme";
		prices[2] = 17.25;

		
		
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts, double[]prices, String[]lbs) {
		Random ranGen = new Random(100);
 		int MAXCHEESE = names.length - 3;
		
 		for (int i = 0; i < MAXCHEESE; i++) {
			
			if (i>2) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			}
			
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
			
			}
 		

		for (int i = 0; i < MAXCHEESE; i++) {
			Scanner scan3 = new Scanner(System.in);
			
			if (i>2) {
			System.out.print("Enter the amount of" + " Cheese Type " + (char)('A' + i) + " : ");
			} else {
			System.out.print("Enter the amount of " + names[i] + " : ");
			}
			amounts[i] = scan3.nextInt();
			
			if (amounts[i]>1) {
				lbs[i] = "lbs";
			} else {
				lbs[i] = "lb";
			}
				
			}
 	
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts, String[] lbs) {
		int MAXCHEESE = names.length - 3;
		Scanner scan = new Scanner(System.in);
		
		if(MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			}
			
			int choice = scan.nextInt();
			if (choice == 1) {
				for (int i = 0; i < MAXCHEESE; i++) {
					
					double cost2 = amounts[i] * prices[i];
					if (amounts[i] > 0) {
					System.out.println(amounts[i] + " " + lbs[i] + " of " + names[i] + " @ " + prices[i] + " = $" + cost2);
					}
					
					}
				}
	}

	public static double calcSubTotal(double subtot, String[] names, double[] prices, int[] amounts) {
		int MAXCHEESE = names.length - 3;
		
		for (int i = 0; i < MAXCHEESE; i++) {
			double cost = amounts[i] * prices[i];
			subtot = (subtot + cost);	
		}

		System.out.println(" ");
		System.out.println("Sub Total: $" + subtot);
		
		return subtot;
	}

	public static double discount(double subtot, double dis, String[] names, double[] prices, int[] amounts){
		int MAXCHEESE = names.length - 3;
		
		for (int i = 0; i < MAXCHEESE; i++) {
			double cost = amounts[i] * prices[i];
			subtot = (subtot + cost);	
		}
		
		if (subtot > 100) {
			dis = 25;
		} else {
			if (subtot > 50) {
				dis = 10;
			} else {
				if (subtot > 0) {
					dis = 0;
					} 
			}
		}
		
		System.out.println("-Discount: $" + dis);
		double tot = subtot - dis;
		System.out.println("Total	: $" + tot);
		
		return dis;
	}

	
	public static void main(String[] args) {

		final int MAXCHEESE = 5;
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		double subtot = 0;
 		double dis = 0 ;

		String[] names = new String[MAXCHEESE+3];
		double[] prices = new double[MAXCHEESE+3];
		int[] amounts = new int[MAXCHEESE+3];
		String[] lbs = new String[MAXCHEESE+3];

		Scanner input = new Scanner(System.in);
		
		if(MAXCHEESE > 0) {
		intro(names, prices, amounts);
		getAmount(input, names, amounts, prices, lbs);
		itemizedList(names, prices, amounts, lbs);
		}
		calcSubTotal(subtot, names, prices, amounts);
		discount(subtot, dis, names, prices, amounts);
		
	}
}