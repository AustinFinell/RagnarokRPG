
/**
 * Class representing the Player Character
 * @author Austin Finell
 *
 */
public class Player extends Character{
	
	private Equipable[] equips; //Represents equipped items
	
	/**
	 * Default Constructor
	 */
	Player(){
		super();
		equips = new Equipable[7]; 
	}
	
	public void equipItem(Equipable item, int slot) {
		equips[slot] = item;
	}
	
	public Equipable[] getEquips() {
		return equips;
	}
	
	public void attack() {
		
	}
	
	
	
	

}
