import java.util.Random;

/**
 * Class for cave instance in the game
 * @author Austin Finell
 *
 */
public class Cave {
	
	private Enemy goblin1;
	private Enemy goblin2;
	private Enemy goblin3;
	private Enemy goblinChief;
	Random rand;
	
	/**
	 * Initializes the enemies in the cave and the coins they reward
	 * @param player to enter the cave
	 */
	Cave(Player player){
		rand = new Random();
		goblin1 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblin2 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblin3 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblinChief = new Enemy("goblin chief", 50, 0, 10, 5, 8, 4, 20);
		
		goblin1.inv.coins += rand.nextInt(16);
		goblin2.inv.coins += rand.nextInt(16);
		goblin3.inv.coins += rand.nextInt(16);
		goblinChief.inv.coins += rand.nextInt(26);
		
		
		new Encounter(player, goblin1);
		new Encounter(player, goblin2);
		new Encounter(player, goblin3);
		new Encounter(player, goblinChief);
	}

}
