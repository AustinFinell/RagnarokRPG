
public class Weapon extends Equipable{
	
	private int attack;
	
	Weapon(){
		super();
		attack = 0;
	}
	
	Weapon(String name, int value, int attack, EquipSlot slot){
		super(name, value, slot);
		this.attack = attack;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}

}
