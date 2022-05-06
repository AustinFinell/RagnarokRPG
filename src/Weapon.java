
/**
 * Class for weapons in the game
 * @author austi
 *
 */
public class Weapon extends Equipable{
	
	private int attack;
	
	/**
	 * Creates the weapon in the game
	 * @param name of the weapon
	 * @param value of the weapon
	 * @param attack that weapon provides
	 * @param slot the weapon will be equiped in
	 */
	Weapon(String name, int value, int attack, EquipSlot slot){
		super(name, value, slot);
		this.attack = attack;
	}
	

	/**
	 * returns the attack of the weapon
	 * @return attack of the weapon
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * sets the attack of the weapon
	 * @param attack of the weapon
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

}
