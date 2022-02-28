
public class Game {
	
	public static void main(String[] args) {
		
		Player lais = new Player();
		lais.setName("Lais");
		
		lais.inv.add(new Food("Fish", 10, 15));
		lais.inv.add(new Food("Bread", 2, 5));
		lais.inv.add(new Food("Cheese", 5, 10));
		lais.inv.add(new Food("Fish", 10, 15));
		lais.inv.add(new Food("Bread", 2, 5));
		lais.inv.add(new Food("Cheese", 5, 10));
		lais.inv.add(new Food("Fish", 10, 15));
		lais.inv.add(new Food("Bread", 2, 5));
		lais.inv.add(new Food("Cheese", 5, 10));
		
		
		
		System.out.println(lais.toString());
		System.out.println();
		lais.inv.displayInv();
		
		
	}
	

}
