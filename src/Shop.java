import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class for shops that manages shop control flow and trading with players
 * @author Austin Finell
 *
 */
public class Shop {
	
	protected Inventory inv;
	
	/**
	 * initializes the inventory for the shop
	 */
	Shop(){
		inv = new Inventory();
	}
	
	/**
	 * The control flow for when a player enters a shop.
	 * @param player that enters shop
	 */
	public void enter(Player player) {
		Scanner scan = new Scanner(System.in);
		int buySell = -1;
		int item = -1;
		
		inv.displayInv();
		System.out.println("Welcome to the shop.");
		System.out.println("You have " + player.inv.coins + " coins.");
		System.out.print("0 to exit, 1 to buy, 2 to sell: ");
		
		while (buySell < 0 || buySell > 2) {
			try {
				buySell = scan.nextInt();
				if(buySell < 0 || buySell > 2) {
					System.out.print("\nInvalid input. Try again: ");
				}
			} catch (InputMismatchException e) {
				System.out.print("\nMust enter a number. Try again: ");
				scan.next();
				continue;
			}
		}
		
		if(buySell == 0) {
			return;
		}
		
		if(buySell == 1) {
			int tempCount = 0;
			for (int i = 0; i < inv.count; i++) {
				System.out.println((i+1) + ". " + inv.get(i).name + " Price: " + inv.get(i).value);
				tempCount = i+1;
			}
			System.out.println("Coins: " + player.inv.coins);
			System.out.print("What would you like to buy? (0 to exit) ");
			
			while(item < 0 || item > tempCount) {
				try {
					item = scan.nextInt();
					if(item < 0 || item > tempCount) {
						System.out.print("Number out of range. Try again: ");
					}
				} catch (InputMismatchException e){
					System.out.print("Input must be a number. Try again: ");
					scan.next();
					continue;
				}
			}
			
			if (item == 0) {
				return;
			}
			
			else {
				buy(player, inv.get(item-1));;
			}
		}
		
		if(buySell == 2) {
			int tempCount = 0;
			boolean input = false;
			
			System.out.println();
			for (int i = 0; i < player.inv.count; i++) {
				System.out.println((i+1) + ". " + player.inv.get(i).name + " Price: " + player.inv.get(i).value);
				tempCount = i+1;
			}
			
			System.out.println("\nCoins: " + player.inv.coins);
			System.out.print("What would you like to sell? (0 to exit) ");
			
			while(item < 0 || item > tempCount) {
				try {
					item = scan.nextInt();
					if(item < 0 || item > tempCount) {
						System.out.print("Number out of range. Try again: ");
					}
				} catch (InputMismatchException e){
					System.out.print("Input must be a number. Try again: ");
					scan.next();
					continue;
				}
			}
			
			
			if (item == 0) {
				return;
			}
			else {
				sell(player, player.inv.get(item-1));;
			}
		}
		
	}
	
	/**
	 * Allows the player to buy from the shop.
	 * @param player buying an item
	 * @param item to be bought
	 */
	public void buy(Player player, GameObject item){
		if(this.inv.contains(item) && player.inv.coins >= item.value && player.inv.count < player.inv.capacity) {
			player.inv.coins -= item.value;
			this.inv.coins += item.value;
			this.inv.remove(item);
			player.inv.add(item);
			System.out.println("\nYou have bought " + item.name + " for " + item.value);
		}
		else if (player.inv.coins < item.value) {
			System.out.println("\nNot enough coins.");
		}
		else if (player.inv.count == player.inv.capacity) {
			System.out.println("\nNot enough space.");
		}
		else {
			System.out.println("\nNot an item.");
		}
		
	}
	
	/**
	 * Allows the player to sell items to the shop
	 * @param player selling the item
	 * @param item to be sold
	 */
	public void sell(Player player, GameObject item) {
		Scanner scan = new Scanner(System.in);
		char response;
		
		if(player.inv.contains(item) && this.inv.coins > item.value) {
			System.out.println("Do you really want to sell " + item + " for " + item.value + " coins? (Y/N)");
			response = scan.nextLine().toLowerCase().charAt(0);
			if(response == 'y') {
				player.inv.remove(item);
				player.inv.coins += item.value;
				this.inv.coins -= item.value;
				this.inv.add(item);
				System.out.println("You sold the " + item.name + " for " + item.value + " coins.");
			}
			else {
				System.out.println("You did not sell the " + item.name + ".");
			}
		}
		
	}

}
