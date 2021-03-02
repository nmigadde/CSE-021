import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		int choi = 0;
		int choice[] = new int[1];
		int num[] = new int[1];
		String names[] = new String[10];
		double prices[] = new double[10];
		int amount[] = new int[10];
		double finPrice[] = new double[10];
		double dis[] = new double[1];
		double rate[] = new double[1];
		Scanner scan = new Scanner(System.in);
		
		
		while (choi != 1) {
			intro(choice);
			choi = choice[0];
			switch (choi) {
	        case 1:  setup(num, names, prices, dis, rate);
	                 break;
	        default: System.out.println("Shop is not set up yet!");
	        		 System.out.println(" ");
	                 break;
	     }
		}
		
		 
		while (choi != 1 || choi != 2) {
		intro(choice);
		choi = choice[0];
		switch (choi) {
        case 1:  setup(num, names, prices, dis, rate);
                 break;
        case 2:  buy(num, names, prices, amount);
                 break;
        default: System.out.println("Try again: You have not bought anything");
                 break;
     }
	}
		
		while (choi > 2) {
		intro(choice);
		choi = choice[0];
		switch (choi) {
        case 1:  setup(num, names, prices, dis, rate);
                 break;
        case 2:  buy(num, names, prices, amount);
                 break;
        case 3:  list(num, names, prices, amount, finPrice);
                 break;
        default: System.out.println("Try again: You have not bought anything");
                 break;
     }
	}
		
		intro(choice);
		choi = choice[0];
		 switch (choi) {
         case 1:  setup(num, names, prices, dis, rate);
                  break;
         case 2:  buy(num, names, prices, amount);
                  break;
         case 3:  list(num, names, prices, amount, finPrice);
                  break;
         case 4:  checkout(num, names, prices, amount, finPrice, dis, rate);
                  break;
         default: System.out.println("Invaild input");
                  break;
     }
		
		
		
		 
		/*setup(num, names, prices, dis, rate);
		buy(num, names, prices, amount);
		list(num, names, prices, amount, finPrice);
		checkout(num, names, prices, amount, finPrice, dis, rate);
		*/
	}
	
	
	public static void intro(int[] choice) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("This program supports 4 programs: ");
		System.out.println("	1. Setup Shop ");
		System.out.println("	2. Buy ");
		System.out.println("	3. List Items ");
		System.out.println("	4. Checkout  ");
		System.out.print("Please choose the function you want: ");
		choice[0] = scan1.nextInt();	
		System.out.println(" ");
	}
		
	
	public static void setup(int[] num, String[] names, double[] prices, double[] dis, double[] rate){ 
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Please enter the number of items: ");
		num[0] = scan2.nextInt();
		
		for(int i = 0; i < num[0]; i++){
			int itemNum = i + 1;
			System.out.print("Enter name of product " + itemNum + ": ");
			names[i] = scan2.next();
			System.out.print("Enter price of product " + itemNum + ": ");
			prices[i] = scan2.nextDouble();
		}
			
		
		System.out.print("Please enter the amount to qualify for discount: ");
		dis[0] = scan2.nextDouble();
		System.out.print("Please enter the discount rate (0.1 for 10%): ");
		rate[0] = scan2.nextDouble();
		System.out.println(" ");
	}

	
	public static void buy(int num[], String[] names, double[] prices, int[] amount){
		Scanner scan3 = new Scanner(System.in);
		
		for(int i = 0; i < num[0]; i++) {
		System.out.print("Enter the amount of " + names[i] + ": ");
		amount[i] = scan3.nextInt();
		}
		System.out.println(" ");
	}
	
	public static void list(int num[], String[] names, double[] prices, int[] amount, double[] finPrice) {
		
		for(int i = 0; i < num[0]; i++) {
			finPrice[i] = amount[i] * prices[i];
			System.out.println(amount[i] + " count of " + names[i] + " @ " + prices[i] + " = $" + finPrice[i]);
		}
		System.out.println(" ");
	}
	
	public static void checkout(int num[], String[] names, double[] prices, int[] amount, double[] finPrice, double[] dis, double[] rate) {
		double subtot = 0;
		double drop = 0;
		double total = 0;
		
		System.out.println("Thanks for coming!");
		
		for(int i = 0; i < num[0]; i++) {
			subtot = subtot + finPrice[i];
		}
		
		System.out.println("Sub Total: $" + subtot);
		
		if(subtot > dis[0]) {
			drop = subtot * rate[0];
		}
		
		System.out.println("-Discount: $" + drop);
		
		total = subtot - drop;
		
		System.out.println("Total: $" + total);
		System.out.println(" ");
		
		
	}
		
}
	
	

