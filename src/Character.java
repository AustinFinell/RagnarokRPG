/**
 * Character class; parent to NPC, Player, and Enemy Classes
 * @author Austin Finell
 * Date Updated: 2/27/2022
 */
public class Character {
	
	protected String name;
	protected int health;
	protected Inventory inv;
	
	/**
	 * Default Constructor
	 */
	public Character(){
		name = "Unknown";
		health = 100;
		inv = new Inventory();
	}
	
	/**
	 * Specific Constructor
	 * @param name of character
	 * @param health of character
	 */
	public Character(String name, int health) {
		this.name = name;
		this.health = health;
		inv = new Inventory();
	}
	
	/**
	 * Sets name of the character
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns name of the character
	 * @return name String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the health of the character
	 * @param health int
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * returns the health of the character
	 * @return health int
	 */
	public int getHealth() {
		return health;
	}
	
	
	

}
