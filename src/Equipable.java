
/**
 * Class for equipable items
 * @author Austin Finell
 *
 */
public class Equipable extends GameObject{
	
	protected EquipSlot slot;
	
	/**
	 * Constructor for equipable item
	 * @param name of the item
	 * @param value of the item
	 * @param slot the item is equiped in
	 */
	Equipable(String name, int value, EquipSlot slot) {
		super(name, value);
		this.slot = slot;
		
	}
	
	/**
	 * String representation of the equipable item
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\tEquip Slot: ");
		sb.append(slot.toString().toLowerCase());
		return sb.toString();
	}
	
}
