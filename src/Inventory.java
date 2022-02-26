import java.util.ArrayList;

/**
 * Class for item storage
 * @author Austin Finell
 *
 */
public class Inventory {
	
	int capacity; //max items in inventory
	int count; //items currently in inventory
	
	private ArrayList<GameObject> inventory; // arrayList of GameObjects representing items in inventory
	
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
	 * Outputs the contents of the inventory to the console
	 */
	public void displayInv() {
		System.out.println("Inventory");
		System.out.println("---------");
		for(int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i));
			if((i + 1) % 5 == 0) {
				System.out.println("------------------------------------------");
			}
		}
	}

}
