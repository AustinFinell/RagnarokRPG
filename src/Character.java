
public class Character {
	
	protected String name;
	protected int health;
	protected Inventory inv;
	
	public Character(){
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
	
	public void addInv(GameObject item) {
		inv.add(item);
	}
	
	

}
