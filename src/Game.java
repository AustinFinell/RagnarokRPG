import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		HealthItems hpItem = new HealthItems();
		EquipItems eqps = new EquipItems();
		EnemyTypes enmy = new EnemyTypes();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to RagnarokRPG!");
		Player player = new Player("Austin");
		
		System.out.println(player.toString());
		
		player.inv.add(eqps.ironSword);
		player.inv.add(eqps.leatherBoots);
		player.inv.add(eqps.leatherChest);
		player.inv.add(eqps.leatherGloves);
		player.inv.add(eqps.leatherHelmet);
		player.inv.add(eqps.woodenShield);
		player.inv.add(eqps.leatherPants);
		
		player.displayInv();
		
		player.equipItem(eqps.ironSword);
		player.equipItem(eqps.leatherBoots);
		player.equipItem(eqps.leatherChest);
		player.equipItem(eqps.leatherGloves);
		player.equipItem(eqps.leatherHelmet);
		player.equipItem(eqps.woodenShield);
		player.equipItem(eqps.leatherPants);
		
		System.out.println(player.toString());
		
		new Encounter(player, enmy.bat);
		new Encounter(player, enmy.bat);
	}
	

}
