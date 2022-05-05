import java.util.ArrayList;

/**
 * Class for item storage
 * @author Austin Finell
 *
 */
public class Inventory {
	
	protected int capacity; //max items in inventory
	protected int count; //items currently in inventory
	protected int coins; //number of coins in inventory
	
	protected ArrayList<GameObject> inventory; // arrayList of GameObjects representing items in inventory
	
	/**
	 * Default Constructor
	 */
	public Inventory(){
		capacity = 30;
		count = 0;
		inventory = new ArrayList<>();
	}
	
	/**
	 * Sets the maximum items able to be stored in inventory
	 * @param capacity integer
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * Sets the number of items currently in inventory
	 * @param count integer
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * Returns the inventory capacity
	 * @return capacity integer
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * returns number of items currently in inventory
	 * @return count integer
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * Returns the number of coins in inventory
	 * @return coins int
	 */
	public int getCoins() {
		return coins;
	}
	
	
	/**
	 * Sets the new number of coins in inventory
	 * @param coins int
	 */
	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	
	
	/**
	 * Adds an item to the inventory
	 * @param item GameObject
	 */
	public void add(GameObject item) {
		if(count < capacity) {
			inventory.add(item);
			count++;
		}
	}
	
	/**
	 * Removes an item from the inventory
	 * @param item GameObject
	 */
	public void remove(GameObject item) {
		if (inventory.contains(item)) {
			inventory.remove(item);
			count--;
		}
	}
	
	/**
	 * Checks if an item is in the inventory
	 * @param item GameObject
	 * @return true if item is in the inventory
	 */
	public boolean contains(GameObject item) {
		boolean result = false;
		if (inventory.contains(item)) {
			result = true;
		}
		return result;
	}
	
	public GameObject get(int i) {
		return inventory.get(i);
	}
	
	/**
	 * Outputs the contents of the inventory to the console
	 */
	public void displayInv() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----------------------------------------------\n");
		sb.append("Inventory\tCoins: ");
		sb.append(coins);
		sb.append("\tCapacity: ");
		sb.append(count);
		sb.append("/");
		sb.append(capacity);
		sb.append("\n-----------------------------------------------\n");
		
		for(int i = 0; i < inventory.size(); i++) {
			sb.append(inventory.get(i));
			sb.append("\n");
			if((i + 1) % 5 == 0) {
				sb.append("-----------------------------------------------\n");
			}
		}
		System.out.println(sb.toString());
	}
	
	public void sort() {
		inventory.sort(null);
	}
	
	
	/**
	 * Return String representation of inventory
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Inventory\tCoins: ");
		sb.append(coins);
		sb.append("\tCount: ");
		sb.append(count);
		sb.append("\tCapacity: ");
		sb.append(capacity);
		sb.append("\n");
		sb.append("Contents: ");
		sb.append(inventory.toString());
		return sb.toString();
	}

}
