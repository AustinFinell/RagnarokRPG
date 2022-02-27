
public class Character {
	
	String name;
	int health;
	Inventory inv;
	
	Character(){
		name = "Unknown";
		health = 100;
		inv = new Inventory();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	

}
