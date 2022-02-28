
public class Equipable extends GameObject{
	
	protected EquipSlot slot;
	
	Equipable(){
		super();
		this.slot = null;
	}
	
	Equipable(String name, int value, EquipSlot slot) {
		super(name, value);
		this.slot = slot;
	}
	
}
