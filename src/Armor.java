
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
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}

}
