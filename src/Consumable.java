
/**
 * Class for consumable items
 * @author Austin Finell
 *
 */
public class Consumable extends GameObject{
	
	protected ConsumeStat stat;
	private int power;
	
	/**
	 * Initializes a consumable item
	 * @param name of the item
	 * @param value of the item
	 * @param power of the item
	 * @param stat the item changes 
	 */
	public Consumable(String name, int value, int power, ConsumeStat stat) {
		super(name, value);
		this.stat = stat;
		this.power = power;
	}
	
	/**
	 * return the power of the consumable
	 * @return power of the item
	 */
	public int getPower() {
		return power;
	}

	/**
	 * Sets the power of the consumable
	 * @param power of the item
	 */
	public void setPower(int power) {
		this.power = power;
	}
	
	/**
	 * returns which stat the item affects
	 * @return the stat the item affects
	 */
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
