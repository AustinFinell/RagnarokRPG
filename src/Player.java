
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
		
	private Equipable[] equips; //Represents equipped items
	
	/**
	 * Default Constructor
	 */
	public Player(String name){
		super(name, 100, 50);
		level = 1;
		experience = 0;
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		luck = 5;
		attack = strength;
		armor = 0;
		equips = new Equipable[7]; 
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
	
	public void heal(int value) {
		health += value;
	}
	
	
	/**
	 * Equips the item in the correct slot
	 * @param item Equipable
	 * Slot array example [HEAD, CHEST, LEGS, FEET, HANDS, MAINHAND, OFFHAND]
	 */
	public void equipItem(Equipable item) {
		if(inv.contains(item)) {
			switch (item.slot) {
			case HEAD:
				equips[0] = item;
				inv.remove(item);
				break;
			case CHEST:
				equips[1] = item;
				inv.remove(item);
				break;
			case LEGS:
				equips[2] = item;
				inv.remove(item);
				break;
			case FEET:
				equips[3] = item;
				inv.remove(item);
				break;
			case HANDS:
				equips[4] = item;
				inv.remove(item);
				break;
			case MAINHAND:
				equips[5] = item;
				inv.remove(item);
				break;
			case OFFHAND:
				equips[6] = item;
				inv.remove(item);
				break;
			
			}
		}
	}
	
	/**
	 * Unequips the item and puts it back in the inventory.
	 * @param item
	 */
	public void unequipItem(Equipable item) {
		if (this.inv.count < this.inv.capacity) {
			for(int i = 0; i < equips.length; i++) {
				if (equips[i] == null) {
					continue;
				}
				else if (equips[i].equals(item)) {
					equips[i] = null;
					inv.add(item);
				}
				
			}
			
		}
		
	}
	
	/**
	 * Returns a string of the currently equipped items
	 * @return String representation of equips array
	 */
	public String getEquips() {
		StringBuilder sb = new StringBuilder();
		sb.append("Equipment Slots:");
		sb.append("[Head, Chest, Legs, Feet, Gloves, Mainhand, Offhand]");
		sb.append("\nCurrently Equipped:[");
		for (int i = 0; i < equips.length; i++) {
			if(equips[i] == null) {
				sb.append("None");
			}else {
				sb.append(equips[i].name);
			}
			if (i < equips.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	public void consume(Consumable item) {
		if(inv.contains(item)) {
			switch (item.getStat()) {
			case HEALTH:
				heal(item.getPower());
				break;
			case MANA:
				setMana(getMana() + item.getPower());
				break;
			default:
				break;
			}
			inv.remove(item);
			System.out.println(item.name + " was consumed.");
			
		}
	}
	
	
	public String toString() {
		return super.toString();
	}
	
	
	

}
