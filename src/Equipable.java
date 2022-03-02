

public class Equipable extends GameObject{
	
	protected EquipSlot slot;
	
	Equipable(String name, int value, EquipSlot slot) {
		super(name, value);
		this.slot = slot;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\tEquip Slot: ");
		sb.append(slot.toString().toLowerCase());
		return sb.toString();
	}
	
}
