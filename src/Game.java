
public class Game {
	
	public static void main(String[] args) {
		
		Player lais = new Player();
		lais.setName("Lais");
		
		Consumable fish = new Consumable("Fish", 10, 15, ConsumeStat.HEALTH);
		Consumable bread = new Consumable("Bread", 2, 5, ConsumeStat.HEALTH);
		Consumable cheese = new Consumable("Cheese", 5, 10, ConsumeStat.HEALTH);
		
		lais.inv.add(fish);
		lais.inv.add(bread);
		lais.inv.add(cheese);
		
		lais.inv.displayInv();
		
		lais.consume(fish);
		
		lais.inv.displayInv();
	}
	

}
