/**
 * Character class; parent to NPC, Player, and Enemy Classes
 * @author Austin Finell
 * Date Updated: 2/27/2022
 */
public class Character {
	
	protected String name;
	protected int maxHealth;
	protected int health;
	protected int maxMana;
	protected int mana;
	protected Inventory inv;
	
	/**
	 * Default Constructor
	 */
	public Character(){
		name = "Unknown";
		maxHealth = 100;
		health = 100;
		maxMana = 50;
		mana = 50;
		inv = new Inventory();
	}
	
	/**
	 * Specific Constructor
	 * @param name of character
	 * @param health of character
	 */
	public Character(String name, int maxHealth, int maxMana) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.health = maxHealth;
		this.maxMana = maxMana;
		this.mana = maxMana;
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
		if (health > 0 && health < maxHealth) {
			this.health = health;
		}
	}
	
	/**
	 * returns the health of the character
	 * @return health int
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * Returns character mana
	 * @return mana int
	 */
	public int getMana() {
		return mana;
	}
	
	/**
	 * Sets character mana
	 * @param mana
	 */
	public void setMana(int mana) {
		if (mana > 0 && mana < maxMana) {
			this.mana = mana;
		}
	}
	
	/**
	 * Returns character max mana
	 * @return maxMana int
	 */
	public int getMaxMana() {
		return maxMana;
	}
	
	/**
	 * Returns character max health
	 * @return maxHealth int
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
	
	/**
	 * Sets character max health
	 * @param maxHealth int
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	/**
	 * Sets character max mana
	 * @param maxMana int
	 */
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	
	/**
	 * Returns whether the character is dead or not
	 * @return true if dead
	 */
	public boolean isDead() {
		boolean result = false;
		if(health <= 0) {
			result = true;
		}
		return result;
	}
	
	
	/**
	 * Return String Representation of Character
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(name);
		sb.append("\tHealth: ");
		sb.append(health);
		sb.append("\tMax Health: ");
		sb.append(maxHealth);
		sb.append("\tMana: ");
		sb.append(mana);
		sb.append("\tMax Mana: ");
		sb.append(maxMana);
		sb.append("\n");
		sb.append(inv.toString());
		return sb.toString();
	}
	

}
