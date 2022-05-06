
/**
 * Class that is an equipable object and provides defence to the player
 * @author Austin Finell
 *
 */
public class Armor extends Equipable{
	
	private int defence;
	
	Armor(String name, int value, int defence, EquipSlot slot){
		super(name, value, slot);
		this.defence = defence;
	}
	
	/**
	 * returns the defence the armor provides
	 * @return defence the armor provides
	 */
	public int getDefence() {
		return defence;
	}
	
	/**
	 * sets the defence the armor provides
	 * @param defence the armor provides
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	/**
	 * Return string representation of the Armor
	 */
	public String toString() {
		return super.toString();
	}

}
