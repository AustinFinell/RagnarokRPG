
public class Tester {

	public static void main(String[] args) {
		
		Inventory inv = new Inventory();
		Food bread = new Food("Bread", 2, 5);
		Food salmon = new Food("Salmon", 5, 10);
		
		salmon.setHeals(15);
		
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		inv.add(bread);
		inv.add(salmon);
		
		
		inv.displayInv();
		
	}

}
