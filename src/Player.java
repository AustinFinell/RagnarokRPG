
/**
 * Class representing the Player Character
 * @author Austin Finell
 *
 */
public class Player extends Character{
	
	private int level;
	private int experience;
	private int strength; 
	private int dexterity;
	private int intelligence;
	private int luck;
	private int attack;
	private int armor;
		
	private Equip[] equips; //Represents equipped items
	
	/**
	 * Default Constructor
	 */
	public Player(){
		super();
		level = 1;
		experience = 0;
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		luck = 5;
		attack = strength;
		armor = 0;
		equips = new Equip[7]; 
	}
	
	/**
	 * Returns player level
	 * @return level int
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * Returns experience of the player
	 * @return experience int
	 */
	public int getExp() {
		return experience;
	}
	
	/**
	 * Returns strength of the player
	 * @return strength int
	 */
	public int getStr() {
		return strength;
	}
	
	/**
	 * returns the dexterity of the player
	 * @return dexterity int
	 */
	public int getDex() {
		return dexterity;
	}
	
	/**
	 * returns the intelligence of the player
	 * @return intelligence int
	 */
	public int getInt() {
		return intelligence;
	}
	
	/**
	 * returns the luck of the player
	 * @return luck int
	 */
	public int getLuck() {
		return luck;
	}
	
	/**
	 * Returns attack of the character
	 * @return attack int
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * returns the armor of the player
	 * @return armor int
	 */
	public int getArmor() {
		return armor;
	}
	
	/**
	 * Sets the level of the player
	 * @param level int
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * Sets the experience of the player
	 * @param experience int
	 */
	public void setExp(int experience) {
		this.experience = experience;
	}

	/**
	 * Sets the strength of the player
	 * @param strength int
	 */
	public void setStr(int strength) {
		this.strength = strength;
	}
	
	/**
	 * sets dexterity of the player
	 * @param dexterity int
	 */
	public void setDex(int dexterity) {
		this.dexterity = dexterity;
	}
	
	/**
	 * sets the intelligence of the player
	 * @param intelligence int
	 */
	public void setInt(int intelligence) {
		this.intelligence = intelligence;
	}
	
	/**
	 * sets the luck of the player
	 * @param luck int
	 */
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	/**
	 * Sets the armor of the player
	 * @param armor int
	 */
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	/**
	 * Sets the attack of the character
	 * @param attack int
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Equips the item in the specified slot
	 * @param item
	 */
	public void equipItem(Equip item, int slot) {
		equips[slot] = item;
	}
	
	/**
	 * Returns the currently equipped items
	 * @return equips Equip[]
	 */
	public Equip[] getEquips() {
		return equips;
	}
	
	
	public String toString() {
		return super.toString();
	}
	
	
	

}
