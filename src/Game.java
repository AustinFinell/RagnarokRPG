import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main control loop for RagnarokRPG.
 * @author Austin Finell
 * Last Update: 5/6/2022
 *
 */
public class Game {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);;
		Town town;
		
		boolean running = true;
		int direction = -1;
		boolean input = false;
		
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		Player player = new Player(name);
		
		player.inv.coins += 100;
		player.inv.add(new Weapon("Wooden Sword", 10, 2, EquipSlot.MAINHAND));
		
		System.out.println("Welcome to RagnarokRPG " + player.name);
		
		
		
		while(running) {
			
			town = new Town();
			
			player.health = player.maxHealth;
			player.mana = player.maxMana;
			
			
			direction = -1;
			input = false;
			
			//Introduce the player to town and lay out their options
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
			
			
			//Exception handled input from player
			while(!input) {
				try {
					direction = scan.nextInt();
					while(direction < 0 || direction > 9) {
						System.out.print("You can't go that way! Try again: ");
						direction = scan.nextInt();
					}
					input = true;
				} catch (InputMismatchException e){
					System.out.print("\nMust enter a number. Try again: ");
					scan.next();
					continue;
				} 
			}
			
			
			//Switch for player decision
			switch (direction){
			case 0:
				running = false;
				break;
			case 1:
				town.bladeSmith.enter(player);
				break;
			case 2:
				town.leatherWorker.enter(player);
				break;
			case 3:
				town.armorer.enter(player);
				break;
			case 4:
				town.food.enter(player);
				break;
			case 5:
				new Forest(player);
				break;
			case 6:
				new Cave(player);
				break;
			case 7:
				new Mountain(player);
				break;
			case 8:
				player.inv.displayInv();
				player.inv.equipFlow(player);
				break;
			case 9:
				System.out.println(player);
				break;
			default:
				break;
			}
			
		}
		
		scan.close();
	

	}
}
