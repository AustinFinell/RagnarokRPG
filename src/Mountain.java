import java.util.Random;


public class Mountain {
	
	private Enemy ogre;
	private Enemy ogreChief;
	private Enemy dragon;
	Random rand;
	
	Mountain(Player player){
		rand = new Random();
		ogre = new Enemy("ogre", 50, 0, 6, 4, 5, 2, 15);
		ogreChief = new Enemy("ogre chief", 75, 0, 8, 6, 6, 4, 25);
		dragon = new Enemy("dragon", 100, 0, 10, 8, 8, 8, 50);
		
		ogre.inv.coins += rand.nextInt(31);
		ogreChief.inv.coins += rand.nextInt(51);
		dragon.inv.coins += rand.nextInt(101);
		
		new Encounter(player, ogre);
		new Encounter(player, ogreChief);
		new Encounter(player, dragon);
	}

}
