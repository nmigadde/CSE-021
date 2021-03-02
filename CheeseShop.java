import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		//Welcome Message
		System.out.println("Welcome to the CheeseShop!");
		System.out.println("");
		
		//List all the cheese types
		System.out.println("We sell 3 types of Cheese:");
		System.out.println("Humboldt Fog: $25.00 per pound");
		System.out.println("Red Hawk: $40.50 per pound");
		System.out.println("Teleme: $17.25 per pound");
		System.out.println("");
		
		//Input how many pounds the customer wants
		Scanner scan = new Scanner(System.in);
		System.out.print("How many pounds of Humboldt Fog: ");
		int numHum = scan.nextInt();
		System.out.print("How many pounds of Red Hawk: ");
		int numRed= scan.nextInt();
		System.out.print("How many pounds of Teleme: ");
		int numTel = scan.nextInt();
		System.out.println("");
		
		//Select if its lb or lbs
		String lbHum = "O";
		String lbRed = "O";
		String lbTel = "O";
		if (numHum>1) {
			lbHum = "lbs";
		} else {
			lbHum = "lb";
		}
		
		if (numRed>1) {
			lbRed = "lbs";
		} else {
			lbRed = "lb";
		}

		if (numTel>1) {
			lbTel = "lbs";
		} else {
			lbTel = "lb";
		}
		
		//Declare variables
		double costHum = numHum * 25;
		double costRed = numRed * 40.5;
		double costTel = numTel * 17.25;
		
		//Print the list
		System.out.print("Display the itemized list? (1 for yes) ");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println(numHum + " " + lbHum + " of Humboldt Fog @ $25.00 = $" + costHum);
			System.out.println(numRed + " " + lbRed + " of Red Hawk @ $40.50 = $" + costRed);
			System.out.println(numTel + " " + lbTel + " of Teleme @ $17.252 = $" + costTel);
		}
		
		//Calculate subtotal
		double subtot = costHum + costRed + costTel;
		System.out.println("Sub Total: $" + subtot);
		
		//Calculate discount
		double dis = 0 ;
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
		
		//Display Discount and Final Total
		System.out.println("-Discount: $" + dis);
		double tot = subtot - dis;
		System.out.println("Total	: $" + tot);
	}

}
