
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
	private int armor;
	private int mana;
		
	private Equipable[] equips; //Represents equipped items
	
	/**
	 * Default Constructor
	 */
	public Player(){
		super();
		mana = 50;
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		luck = 5;
		armor = 0;
		equips = new Equipable[7]; 
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return experience;
	}
	
	public int getStr() {
		return strength;
	}
	
	public int getDex() {
		return dexterity;
	}
	
	public int getInt() {
		return intelligence;
	}
	
	public int getLuck() {
		return luck;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public int getMana() {
		return mana;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setExp(int experience) {
		this.experience = experience;
	}
	
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public void setStr(int strength) {
		this.strength = strength;
	}
	
	public void setDex(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public void setInt(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void equipItem(Equipable item, int slot) {
		equips[slot] = item;
	}
	
	public Equipable[] getEquips() {
		return equips;
	}
	
	public String toString() {
		return "";
	}
	
	
	

}
