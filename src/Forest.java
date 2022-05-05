import java.util.Random;

public class Forest {
	
	Random rand;
	protected Enemy rat;
	protected Enemy bat;
	protected Enemy giantRat;
	
	Forest(Player player){
		rand = new Random();
		rat = new Enemy("rat", 10, 0, 2, 0, 2, 2, 5);
		bat = new Enemy("bat", 15, 0, 3, 0, 3, 3, 5);
		giantRat = new Enemy("giant rat", 20, 0, 4, 0, 4, 2, 10);
		
		
		rat.inv.coins += rand.nextInt(6);
		bat.inv.coins += rand.nextInt(11);
		giantRat.inv.coins += rand.nextInt(16);
		
		
		new Encounter(player, rat);
		new Encounter(player, bat);
		new Encounter(player, giantRat);
		
	
	}

}
