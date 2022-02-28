
public class Equip extends GameObject{
	
	protected EquipSlot slot;
	
	Equip(){
		super();
		this.slot = null;
	}
	
	Equip(String name, int value, EquipSlot slot) {
		super(name, value);
		this.slot = slot;
	}
	
}
