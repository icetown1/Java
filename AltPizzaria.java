import java.util.*;

public class AltPizzaria{
	
	Scanner keyboard = new Scanner(System.in);
	
	double totalPrice = 0.0;
	int choice = 1;
	
	public static void main(String[] args){
		
		AltPizzaria ourObject = new AltPizzaria();
		
		while(ourObject.choice == 1){
			ourObject.PrintMenu();
			ourObject.getChoice(ourObject.keyboard);
			ourObject.totalPrice += ourObject.determinePizza(ourObject.choice);
			ourObject.totalPrice = ourObject.getExtras(ourObject.totalPrice, ourObject.keyboard);
			System.out.print("Would you like to order another pizza? (1 = Yes, 2 = No) ");
			ourObject.choice = ourObject.keyboard.nextInt();
		}
		
		if(ourObject.totalPrice != 0.0){
			ourObject.finalCost(ourObject.totalPrice);
		}
		
		
	}
	
	public void PrintMenu(){
		
		System.out.println("Welcome to Joe's Airport Pizzaria");
		
		System.out.println("======== Menu =========");
		System.out.println("1 - Cheese, $19.00");
		System.out.println("2 - Pepperoni, $29.00");
		System.out.println("3 - Combination, $39.00");
		
		System.out.print("Enter your selection (1-3): ");
		
	}
	
	public void getChoice(Scanner x){
		
		choice = x.nextInt();
		
	}
	
	public double determinePizza(int x){
		
		if(x == 1){
			System.out.println("You have selected cheese.");
			return 19.00;
		}
		else if(x == 2){
			System.out.println("You have selected pepperoni.");
			return 29.00;
		}
		else if(x == 3){
			System.out.println("You have selected combination.");
			return 39.00;
		}
		else{
			System.out.println("Go fly away and learn to read...");
			return 0.0;
		}
		
	}
	
	public double getExtras(double x, Scanner y){
		
		if(x != 0.0){
			System.out.println("For additional toppings, enter 1 (+$4.00)");
			System.out.println("For standard toppings, enter 2 (free)");
			
			System.out.print("Enter 1 or 2: ");
			getChoice(y);
			
			switch(choice){
				case 1:
					System.out.println("You have opted for additional toppings. $4 added to the final cost of the pizza.");
					return totalPrice + 4.00;
					
				case 2:
					System.out.println("Standard toppings selected at no additional cost.");
					return totalPrice;
					
				default:
					System.out.println("Invalid selection.");
					return totalPrice;
			}
		}
		else{
			System.out.println("No order has been placed.");
			return 0.0;
		}
		
	}
	
	public void finalCost(double x){
		
		System.out.println("The final cost for your pizza is: " + x);
		
	}
	
	
}