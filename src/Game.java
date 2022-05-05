import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner scan = new Scanner(System.in);;
		Town town;
		int direction = -1;
		int buySell = -1;
		int item = -1;
		boolean input = false;
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		Player player = new Player(name);
		
		player.inv.coins += 100;
		player.inv.add(new Weapon("Wooden Sword", 10, 2, EquipSlot.MAINHAND));
		
		System.out.println("Welcome to RagnarokRPG " + player.name);
		
		
		
		while(flag) {
			town = new Town();
			scan = new Scanner(System.in);
			player.health = player.maxHealth;
			player.mana = player.maxMana;
			direction = -1;
			buySell = -1;
			item = -1;
			input = false;
			
			System.out.println("You are in town.\n");
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
			
			while(!input) {
				try {
					direction = scan.nextInt();
					input = true;
				} catch (InputMismatchException e){
					System.out.print("\nMust enter a number. Try again: ");
					scan.next();
					continue;
				} 
			}
			
			
			if (direction == 0) {
				flag = false;
				continue;
			}
			
			if (direction == 1) {
				town.bladeSmith.enter(player);
			}
			
			if (direction == 2) {
				town.leatherWorker.enter(player);
			}
			
			if (direction == 3) {
				town.armorer.enter(player);
			}
			
			if (direction == 4) {
				town.food.enter(player);
			}
			
			if (direction == 5) {
				new Forest(player);
			}
			
			if (direction == 6) {
				new Cave(player);
			}
			
			if (direction == 7) {
				new Mountain(player);
			}
			
			if (direction == 8) {
				player.inv.displayInv();
				player.inv.equipFlow(player);
			}
			
			if (direction == 9) {
				System.out.println(player);
			}
			
		
		}
	

	}
}
