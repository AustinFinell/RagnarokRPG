import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
	
	
	public void equipFlow(Player player) {
		Scanner scan = new Scanner(System.in);
		char yesNo = 'n';
		int choice = -1;
		int limit = 0;
		
		
		
		System.out.println("Would you like to equip an item? (Y/N)");
		yesNo = scan.nextLine().toLowerCase().charAt(0);
		
		while(yesNo != 'y' && yesNo != 'n') {
			System.out.println("Invalid input. Try again. ");
			yesNo = scan.nextLine().toLowerCase().charAt(0);
		}
		
		if(yesNo == 'y') {
			for(int i = 0; i < count; i++) {
				System.out.println((i + 1) + ". " + inventory.get(i).name);
				limit = i;
			}
			
			System.out.println("Which item would you like to equip? (0 to exit)");
			while(choice < 0 || choice > limit + 1) {
				try {
					choice = scan.nextInt();
					if(choice < 0 || choice > limit + 1) {
						System.out.print("Invalid input. Try again: ");
					}
				} catch (InputMismatchException e){
					scan.next();
					System.out.print("Must enter a number. Try again: ");
					continue;
				}
			}
			
			
			if (choice == 0) {
				return;
			}
			else if(inventory.get(choice - 1) instanceof Equipable) {
				System.out.println("You have equiped the " + inventory.get(choice -1).name);
				player.equipItem((Equipable)inventory.get(choice - 1));
			}
			else {
				System.out.println("Can't equip that item.");
			}	
			
		}
		
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
