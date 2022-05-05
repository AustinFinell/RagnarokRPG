import java.util.Random;
import java.util.Scanner;

/**
 * Class representing the Player Character
 * @author Austin Finell
 *
 */
public class Player extends Character{
	
	private int expRequired;
	private int level;
	private int experience;
	private int strength; 
	private int dexterity;
	private int intelligence;
	private int luck;
	private int attack;
	private int defence;
	private int statChoice;
		
	private Equipable[] equips; //Represents equipped items
	
	/**
	 * Default Constructor
	 */
	public Player(String name){
		super(name, 100, 50);
		level = 1;
		experience = 0;
		expRequired = 100;
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		luck = 5;
		attack = 0;
		defence = 0;
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
	 * returns the defence of the player
	 * @return defence int
	 */
	public int getDefence() {
		return defence;
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
	 * Sets the defence of the player
	 * @param defence int
	 */
	public void setDefence(int defence) {
		this.defence = defence;
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
		if(health > maxHealth) {
			health = maxHealth;
		}
	}
	
	public void regenerate(int value) {
		mana += value;
		if(mana > maxMana) {
			mana = maxMana;
		}
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
				if(equips[0] instanceof Equipable) {
					unequipItem(equips[0]);
				}
				equips[0] = item;
				defence += ((Armor)item).getDefence(); 
				inv.remove(item);
				break;
			case CHEST:
				if(equips[1] instanceof Equipable) {
					unequipItem(equips[1]);
				}
				equips[1] = item;
				defence += ((Armor)item).getDefence(); 
				inv.remove(item);
				break;
			case LEGS:
				if(equips[2] instanceof Equipable) {
					unequipItem(equips[2]);
				}
				equips[2] = item;
				defence += ((Armor)item).getDefence(); 
				inv.remove(item);
				break;
			case FEET:
				if(equips[3] instanceof Equipable) {
					unequipItem(equips[3]);
				}
				equips[3] = item;
				defence += ((Armor)item).getDefence(); 
				inv.remove(item);
				break;
			case HANDS:
				if(equips[4] instanceof Equipable) {
					unequipItem(equips[4]);
				}
				equips[4] = item;
				defence += ((Armor)item).getDefence(); 
				inv.remove(item);
				break;
			case MAINHAND:
				if(equips[5] instanceof Equipable) {
					unequipItem(equips[5]);
				}
				equips[5] = item;
				attack += ((Weapon)item).getAttack();
				inv.remove(item);
				break;
			case OFFHAND:
				if(equips[6] instanceof Equipable) {
					unequipItem(equips[6]);
				}
				equips[6] = item;
				defence += ((Armor)item).getDefence(); 
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
		if (item == null) {
			return;
		}
		
		if (this.inv.count < this.inv.capacity) {
			for(int i = 0; i < equips.length; i++) {
				if (item.equals(equips[i])) {
					equips[i] = null;
					if(item instanceof Armor) {
						defence -= ((Armor)item).getDefence();
					}
					if(item instanceof Weapon) {
						attack -= ((Weapon)item).getAttack();
					}
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
		sb.append("\nAttack: " + attack);
		sb.append("\nDefence: " + defence);
		return sb.toString();
	}
	
	/**
	 * Consumes an item and updates the player stat based on the enum of the consumable item, and removes the item from the inventory.
	 * @param item
	 */
	public void consume(Consumable item) {
		if(inv.contains(item)) {
			switch (item.getStat()) {
			case HEALTH:
				heal(item.getPower());
				break;
			case MANA:
				regenerate(item.getPower());
				break;
			default:
				break;
			}
			inv.remove(item);
			System.out.println(item.name + " was consumed.");
			
		}
	}
	
	
	/**
	 * upon player death, will terminate the game.
	 */
	public void death() {
		if(isDead()) {
			System.out.println("You have died! \n\nGame Over");
			System.exit(0);
		}
	}
	
	public void levelUp() {
		Scanner scan = new Scanner(System.in);
		level++;
		System.out.println("Level up!\nYou are now level: " + level);
		System.out.println("Which stat would you like  to increase?");
		System.out.println("1. Strength"
				+ "\n2. Dexterity"
				+ "\n3. Intelligence"
				+ "\n4. Luck");
		
		statChoice = scan.nextInt();
		while(statChoice != 1 || statChoice != 2 || statChoice != 3 || statChoice != 4) {
			System.out.println("Invalid Input. Please choose a number 1 - 4");
			statChoice = scan.nextInt();
		}
		
		switch(statChoice) {
			case 1:
				strength++;
			case 2:
				dexterity++;
			case 3:
				intelligence++;
			case 4:
				luck++;
		}
		scan.close();
			
	}
	
	public void levelCheck() {
		if(experience > expRequired) {
			experience -= expRequired;
			levelUp();
			expRequired *= level;
		}
	}
	
	public void attack(Enemy target) {
		Random rand = new Random();
		
		int hit = (rand.nextInt(dexterity)+1) - rand.nextInt(target.getEvade());
		int damage = rand.nextInt((strength/2) + attack) - rand.nextInt((int)Math.sqrt(target.getDefence()+1));
		
		if(hit <= 0) {
			System.out.println(name + " missed!\n");
			return;
		}
		
		if (damage < 0) {
			damage = 0;
		}
		
		target.health -= damage;
		
		System.out.println(name + " did " + damage + " damage!");
		System.out.println("The " + target.name + " has " + target.health + " health left.\n");
		
		if(target.isDead()) {
			System.out.println("The " + target.name + " is dead!");
			experience += target.getExp();
			this.inv.coins += target.inv.coins;
			levelCheck();
		}
	}
	
	public void displayInv() {
		inv.displayInv();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-------------------------------\n");
		sb.append(name);
		sb.append("\n-------------------------------");
		sb.append("\nLvl: " + level);
		sb.append("\tExp: " + experience);
		sb.append("\nHealth: " + health + "/" + maxHealth);
		sb.append("\tMana: " + mana + "/" + maxMana);
		sb.append("\nStr: " + strength);
		sb.append("\tDex: " + dexterity);
		sb.append("\tInt: " + intelligence);
		sb.append("\tLuk: " + luck);
		sb.append("\n-------------------------------\n");
		sb.append(getEquips() + "\n");
		return sb.toString();
		
	}
	
	
	

}

