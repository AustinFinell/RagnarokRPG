
public class EnemyTypes {
	public Enemy goblin;
	public Enemy goblinChief;
	public Enemy bat;
	public Enemy giantRat;
	
	EnemyTypes(){
		goblin = new Enemy("goblin", 30, 0, 5, 2, 5, 3, 10);
		goblinChief = new Enemy("goblin chief", 50, 0, 10, 5, 8, 4, 20);
		bat = new Enemy("bat", 15, 0, 3, 0, 3, 3, 5);
		giantRat = new Enemy("giant rat", 20, 0, 4, 0, 4, 2, 10);
	}
	
	
}
