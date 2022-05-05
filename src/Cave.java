
public class Cave {
	
	private Enemy goblin1;
	private Enemy goblin2;
	private Enemy goblin3;
	private Enemy goblinChief;
	
	Cave(Player player){
		goblin1 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblin2 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblin3 = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblinChief = new Enemy("goblin chief", 50, 0, 10, 5, 8, 4, 20);
		
		new Encounter(player, goblin1);
		new Encounter(player, goblin2);
		new Encounter(player, goblin3);
		new Encounter(player, goblinChief);
	}

}
