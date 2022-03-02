
public class Armor extends Equipable{
	
	private int armor;
	
	Armor(String name, int value, int armor, EquipSlot slot){
		super(name, value, slot);
		this.armor = armor;
	}
	
	public int getAttack() {
		return armor;
	}
	
	public void setAttack(int armor) {
		this.armor = armor;
	}

}
