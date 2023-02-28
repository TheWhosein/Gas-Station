package gasStation;
import java.util.*;

public class GasStation {
	static double market(double total) {
		Scanner market = new Scanner(System.in);
		int choose;
		System.out.println("\nWelcome to the market");
		System.out.println("1 - Water       Price - 1$\n2 - Cigarettes  Price - 5$\n3 - Sandwich    Price - 2.50$");
		choose = market.nextInt();
		if (choose == 1) {
			 total += 1;
		}
		else if (choose == 2) {
			total += 5;
		}
		else if (choose == 3) {
			total += 2.5;
		}
		market.close();
		return total;
	}
	
	static double gas(double total) {
		Scanner gas = new Scanner(System.in);
		double liter, price;
		int gasType, type;
		System.out.println("\nWhich gasoline do you want?");
		System.out.println("1-Diesel     Price(liter)-0.80$\\n2-Super      Price(liter)-2.30$\\n3-Premium    Price(liter)-2.00$");
		gasType = gas.nextInt();
		System.out.print("Do you want to buy by liter or by price?(1- liter, 2- price): ");
		type = gas.nextInt(); 
		if (gasType == 1) {
			if(type == 1) {
				System.out.print("Enter the desire liter: ");
				liter = gas.nextInt();
				total += (liter * 0.8);
				}
			else if(type == 2) {
				System.out.print("Enter the desire price: ");
				price = gas.nextInt();
				total += price;
			}
			else {
				System.out.print("Your choice not correct");
			}
		}
		else if(gasType == 2) {
			if(type == 1) {
				System.out.print("Enter the desire liter: ");
				liter = gas.nextInt();
				total += (liter * 2.3);
				}
			else if(type == 2) {
				System.out.print("Enter the desire price: ");
				price = gas.nextInt();
				total += price;
			}
			else {
				System.out.println("Your choice not correct");
			}
		}
		else if(gasType == 3) {
			if(type == 1) {
				System.out.print("Enter the desire liter: ");
				liter = gas.nextInt();
				total += (liter * 2);
				}
			else if(type == 2) {
				System.out.print("Enter the desire price: ");
				price = gas.nextInt();
				total += price;
			}
			else {
				System.out.println("Your choice not correct");
			}
		}
		else {
			System.out.println("Your choice not correct");
		}
		gas.close();
		
		return total;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0, price = 0, marketPrice = 0;
		int s;
		System.out.println("Welcome to the gas station");
		System.out.print("Do you want gas or will you buy from the market?(1- market, 2- gas): ");
		s = input.nextInt();
		if (s == 1) {
			marketPrice = market(marketPrice);
			total += marketPrice;
		}
		else if (s == 2) {
			price = gas(price);
			total += price;
		}
		else {
			System.out.println("Your choice not correct");
		}

		System.out.println("\nPlease pay " + total + "$");
		System.out.println("\nThank you for choosing us. Goodbye");
		
		input.close();
	}
}
