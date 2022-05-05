import java.util.Scanner;

public class Shop {
	
	protected Inventory inv;
	
	Shop(){
		inv = new Inventory();
	}
	
	public void enter(Player player) {
		Scanner scan = new Scanner(System.in);
		int buySell = 0;
		int item = 0;
		
		inv.displayInv();
		System.out.println("Welcome to the shop.");
		System.out.println("You have " + player.inv.coins + " coins.");
		System.out.print("0 to exit, 1 to buy, 2 to sell: ");
		
		buySell = scan.nextInt();
		
		while (buySell < 0 || buySell > 2) {
			System.out.print("\nInvalid input. Try again: ");
			buySell = scan.nextInt();
		}
		
		if(buySell == 0) {
			return;
		}
		
		if(buySell == 1) {
			int tempCount = 0;
			for (int i = 0; i < inv.count; i++) {
				System.out.println((i+1) + ". " + inv.get(i).name + " Price: " + inv.get(i).value);
				tempCount = i;
			}
			System.out.println("Coins: " + player.inv.coins);
			System.out.print("What would you like to buy? (0 to exit) ");
			item = scan.nextInt();
			
			if (item <0 || item > tempCount) {
				System.out.print("\nInvalid input. Try again: ");
				item = scan.nextInt();
			}
			
			if (item == 0) {
			}
			
			else {
				buy(player, inv.get(item-1));;
			}
		}
		
	}
	
	public void buy(Player player, GameObject item){
		if(this.inv.contains(item) && player.inv.coins >= item.value && player.inv.count < player.inv.capacity) {
			player.inv.coins -= item.value;
			this.inv.coins += item.value;
			this.inv.remove(item);
			player.inv.add(item);
		}
		else if (player.inv.coins < item.value) {
			System.out.println("Not enough coins.");
		}
		else if (player.inv.count == player.inv.capacity) {
			System.out.println("Not enough space.");
		}
		else {
			System.out.println("Not an item.");
		}
		
	}
	
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
