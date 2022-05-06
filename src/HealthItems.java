

/**
 * Instantiates health items for separate management
 * @author Austin Finell
 *
 */
public class HealthItems {
	
	public Consumable bread;
	public Consumable cheese;
	public Consumable fish;
	public Consumable healthPotion;	
	
	/**
	 * Instantiates health items
	 */
	HealthItems(){
		bread = new Consumable("Bread", 2, 5, ConsumeStat.HEALTH);
		cheese = new Consumable("Cheese", 5, 10, ConsumeStat.HEALTH);
		fish = new Consumable("Fish", 10, 15, ConsumeStat.HEALTH);
		healthPotion = new Consumable("Health Potion", 20, 50, ConsumeStat.HEALTH);	
	}
	
}
