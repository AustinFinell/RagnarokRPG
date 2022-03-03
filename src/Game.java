import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		HealthItems hpItem = new HealthItems();
		EquipItems eqps = new EquipItems();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to RagnarokRPG!");
		
		System.out.print("Enter Name: ");
		String playerName = scan.nextLine();
		Player player1 = new Player(playerName);
		
		player1.inv.add(eqps.ironSword);
		player1.inv.add(eqps.woodenShield);
		player1.inv.add(eqps.leatherHelmet);
		player1.inv.add(eqps.leatherChest);
		player1.inv.add(eqps.leatherPants);
		player1.inv.add(eqps.leatherBoots);
		player1.inv.add(eqps.leatherGloves);
		player1.inv.setCoins(15);
		
		player1.inv.displayInv();
		
		player1.equipItem(eqps.ironSword);
		
		System.out.println(player1.getEquips());
		player1.inv.displayInv();
		
		player1.unequipItem(eqps.ironSword);
		
		System.out.println(player1.getEquips());
		player1.inv.displayInv();
		
		player1.inv.sort();
		
		player1.inv.displayInv();
		
	}
	

}
