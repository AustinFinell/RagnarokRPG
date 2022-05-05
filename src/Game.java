import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		Town town;
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		Player player = new Player(name);
		
		System.out.println("Welcome to RagnarokRPG " + player.name);
		
		int direction = -1;
		int buySell = -1;
		int item = -1;
		
		while(flag) {
			town = new Town();
			System.out.println("You are in town.");
			System.out.println("Shops");
			System.out.println("\t1. Blade Smith");
			System.out.println("\t2. LeatherWorker");
			System.out.println("\t3. Armorer");
			System.out.println("\t4. Food");
			System.out.println("Encounters");
			System.out.println("\t5. Forest");
			System.out.println("\t6. Cave");
			System.out.println("\t7. Mountain");
			System.out.println("Stats");
			System.out.println("\t8. Inventory");
			System.out.println("\t9. Player Stats");
			System.out.print("What would you like to do? (0 to quit) ");
			direction = scan.nextInt();
			
			while(direction < 0 || direction > 9) {
				System.out.print("\nInvalid input. Try again: ");
				direction = scan.nextInt();
			}
			
			if (direction == 0) {
				flag = false;
				continue;
			}
			
			if (direction == 1) {
				town.bladeSmith.inv.displayInv();
				System.out.println("Welcome to the blade smith.");
				System.out.print("0 to exit, 1 to buy, 2 to sell: ");
				
				buySell = scan.nextInt();
				
				while (buySell < 0 || buySell > 2) {
					System.out.print("\nInvalid input. Try again: ");
				}
				
				if(buySell == 0) {
					continue;
				}
				if(buySell == 1) {
					int tempCount = 0;
					for (int i = 0; i < town.bladeSmith.inv.count; i++) {
						System.out.println((i+1) + ". " + town.bladeSmith.inv.get(i).name + " Price: " + town.bladeSmith.inv.get(i).value);
						tempCount = i;
					}
					System.out.print("What would you like to buy? (0 to exit) ");
					item = scan.nextInt();
					
					if (item <0 || item > tempCount) {
						System.out.print("\nInvalid input. Try again: ");
					}
					
					if (item == 0) {
						continue;
					}
					
					else {
						town.bladeSmith.buy(player, town.bladeSmith.inv.get(item-1));;
					}	
				}
			}
			
			if (direction == 2) {
				town.leatherWorker.inv.displayInv();
				System.out.println("Welcome to the leather worker.");
				System.out.print("0 to exit, 1 to buy, 2 to sell: ");
				
				buySell = scan.nextInt();
				
				while (buySell < 0 || buySell > 2) {
					System.out.print("\nInvalid input. Try again: ");
				}
				
				if(buySell == 0) {
					continue;
				}
				if(buySell == 1) {
					int tempCount = 0;
					for (int i = 0; i < town.leatherWorker.inv.count; i++) {
						System.out.println((i+1) + ". " + town.leatherWorker.inv.get(i).name + " Price: " + town.leatherWorker.inv.get(i).value);
						tempCount = i;
					}
					System.out.print("What would you like to buy? (0 to exit) ");
					item = scan.nextInt();
					
					if (item <0 || item > tempCount) {
						System.out.print("\nInvalid input. Try again: ");
					}
					
					if (item == 0) {
						continue;
					}
					
					else {
						town.leatherWorker.buy(player, town.leatherWorker.inv.get(item-1));;
					}	
				}
			}
			
			if (direction == 3) {
				town.armorer.inv.displayInv();
				System.out.println("Welcome to the leather worker.");
				System.out.print("0 to exit, 1 to buy, 2 to sell: ");
				
				buySell = scan.nextInt();
				
				while (buySell < 0 || buySell > 2) {
					System.out.print("\nInvalid input. Try again: ");
				}
				
				if(buySell == 0) {
					continue;
				}
				if(buySell == 1) {
					int tempCount = 0;
					for (int i = 0; i < town.armorer.inv.count; i++) {
						System.out.println((i+1) + ". " + town.armorer.inv.get(i).name + " Price: " + town.armorer.inv.get(i).value);
						tempCount = i;
					}
					System.out.print("What would you like to buy? (0 to exit) ");
					item = scan.nextInt();
					
					if (item <0 || item > tempCount) {
						System.out.print("\nInvalid input. Try again: ");
					}
					
					if (item == 0) {
						continue;
					}
					
					else {
						town.armorer.buy(player, town.armorer.inv.get(item-1));;
					}	
				}
			}
			
			if (direction == 4) {
				town.food.inv.displayInv();
				System.out.println("Welcome to the leather worker.");
				System.out.print("0 to exit, 1 to buy, 2 to sell: ");
				
				buySell = scan.nextInt();
				
				while (buySell < 0 || buySell > 2) {
					System.out.print("\nInvalid input. Try again: ");
				}
				
				if(buySell == 0) {
					continue;
				}
				if(buySell == 1) {
					int tempCount = 0;
					for (int i = 0; i < town.food.inv.count; i++) {
						System.out.println((i+1) + ". " + town.food.inv.get(i).name + " Price: " + town.food.inv.get(i).value);
						tempCount = i;
					}
					System.out.print("What would you like to buy? (0 to exit) ");
					item = scan.nextInt();
					
					if (item <0 || item > tempCount) {
						System.out.print("\nInvalid input. Try again: ");
					}
					
					if (item == 0) {
						continue;
					}
					
					else {
						town.food.buy(player, town.food.inv.get(item-1));;
					}	
				}
			}
			
			if (direction == 5) {
				
			}
			
			if (direction == 6) {
				
			}
			
			if (direction == 7) {
				
			}
			
			if (direction == 8) {
				player.inv.displayInv();
			}
			
			if (direction == 9) {
				System.out.println(player);
			}
			
		
		}
	

	}
}
