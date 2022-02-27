
public class Game {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		
		player.inv.displayInv();
		
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		player.inv.add(new Food("fish", 5, 10));
		
		player.inv.displayInv();
		
		
	}
	

}
