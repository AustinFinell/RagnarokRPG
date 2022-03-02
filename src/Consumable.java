
public class Consumable extends GameObject{
	
	protected ConsumeStat stat;
	private int power;
	
	public Consumable(String name, int value, int power, ConsumeStat stat) {
		super(name, value);
		this.stat = stat;
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public ConsumeStat getStat() {
		return stat;
	}
	
	@Override
	public String toString() {
		return  super.toString() +
				"\tPower: " + power +
				"\tType: " + stat;
	}
	
	

}
