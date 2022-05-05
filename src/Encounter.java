import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Encounter {
	
	private int pDex;
	private int eEvade;
	private int turn;
	private int move;
	private int run;
	private Scanner scan;
	private Random rand;
	private boolean pDefending;
	
	Encounter(Player player, Enemy enemy){
		rand = new Random();
		scan = new Scanner(System.in);
		pDefending = false;
		pDex = rand.nextInt(player.getDex());
		eEvade = rand.nextInt(enemy.getEvade());
		
		
		System.out.println("\n---Battle---\n");
		if(		enemy.name.toLowerCase().charAt(0) == 'a' || enemy.name.toLowerCase().charAt(0) == 'e' || 
				enemy.name.toLowerCase().charAt(0) == 'i' || enemy.name.toLowerCase().charAt(0) == 'o' || 
				enemy.name.toLowerCase().charAt(0) == 'u') {
			System.out.println(player.name + " has encountered an " + enemy.name +"!\n");
		}
		System.out.println(player.name + " has encountered a " + enemy.name +"!\n");
		
		if(pDex > eEvade) {
			turn = 1;
		}
		
		else {
			turn = 0;
		}
		
		
		while(!player.isDead() && !enemy.isDead()) {
			if (turn == 1) {
				pDefending = false;
				move = -1;
				
				System.out.println("It is " + player.name + "'s turn.");
				System.out.println("What would you like to do?"
						+ "\n1. Attack"
						+ "\n2. Defend"
						+ "\n3. Consumable"
						+ "\n4. Run");
				
				while (move < 1 || move > 4) {
					try {
						move = scan.nextInt();
						if(move < 1 || move > 4) {
							System.out.print("Invalid input. Try again: ");
						}
					} catch (InputMismatchException e) {
						scan.next();
						System.out.println("Must enter a number. Try again: ");
						continue;
					}
				}
				
				if(move == 1) {
					player.attack(enemy);
					turn = 0;
				}
				
				if(move == 2) {
					pDefending = true;
					turn = 0;
				}
				
				if(move == 3) {
					int choice = -1;
					int count = 1;
					
					for (int i = 0; i < player.inv.count; i++) {
						
						if(player.inv.inventory.get(i) instanceof Consumable) {
							
							Consumable item = (Consumable)player.inv.inventory.get(i);
							
							if(item.stat == ConsumeStat.HEALTH) {
								System.out.println(count + ". " + item.name + " heals " + item.getPower() + " health.");
							}
							
							if(item.stat == ConsumeStat.MANA) {
								System.out.println(count + ". " + item.name + " regenerates " + item.getPower() + " mana.");
							}
							
							count++;
						}
						
					}
					System.out.println("Choose the food to consume. (0 to cancel)");
					
					while (choice > count || choice < 0) {
						try {
							choice = scan.nextInt();
						} catch ( InputMismatchException e) {
							scan.next();
							System.out.print("Must enter a number. Try again: ");
							continue;
						}
					}
					
					if (choice == 0) {
						continue;
					}
					else {
						Consumable item = null;
						count = 0;
						while(count != choice) {
							for (int i = 0; i < player.inv.count; i++) {	
								if(player.inv.inventory.get(i) instanceof Consumable) {
									item = (Consumable)player.inv.inventory.get(i);
									count++;
								}
							}
						}
						
						player.consume(item);
						turn = 0;
					}
					
					
					
				}
				
				if(move == 4) {
					run = rand.nextInt(10) + 1;
					if (run > 5) {
						System.out.println("You successfully run from the " + enemy.name + "!");
						break;
					}
					else {
						System.out.println("You failed to run from the " + enemy.name + ".");
						turn = 0;
					}
				}
				
			}
			
			else if (turn == 0) {
				if (pDefending) {
					int temp = player.getDefence();
					player.setDefence(temp * 2);
					enemy.attack(player);
					player.setDefence(temp);
					turn = 1;
				}
				else {
					enemy.attack(player);
					turn = 1;
				}
				
			}
			
		}
		
	}

}
