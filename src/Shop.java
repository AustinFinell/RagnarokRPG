import java.util.Scanner;

public class Shop {
	
	protected Inventory inv;
	
	Shop(){
		inv = new Inventory();
	}
	
	public void buy(Player player, GameObject item){
		if(this.inv.contains(item) && player.inv.coins >= item.value && player.inv.count < player.inv.capacity) {
			player.inv.coins -= item.value;
			player.inv.add(item);
		}
		
	}
	
	public void sell(Player player, GameObject item) {
		Scanner scan = new Scanner(System.in);
		char response;
		
		if(player.inv.contains(item)) {
			System.out.println("Do you really want to sell " + item + " for " + item.value + " coins? (Y/N)");
			response = scan.nextLine().toLowerCase().charAt(0);
			if(response == 'y') {
				player.inv.remove(item);
				player.inv.coins += item.value;
				this.inv.add(item);
			}
		}
	}

}
