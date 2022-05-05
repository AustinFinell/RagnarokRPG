
public class WeaponItems {
	
	protected Weapon woodenSword;
	protected Weapon ironSword;
	protected Weapon steelSword;
	protected Weapon mythicSword;
	
	protected Weapon ironAxe;
	protected Weapon steelAxe;
	protected Weapon mythicAxe;
	
	
	WeaponItems(){
		woodenSword = new Weapon("Wooden Sword", 10, 2, EquipSlot.MAINHAND);
		ironSword = new Weapon("Iron Sword", 50, 5, EquipSlot.MAINHAND);
		steelSword = new Weapon("Steel Sword", 75, 7, EquipSlot.MAINHAND);
		mythicSword = new Weapon("Mythic Sword", 200, 12, EquipSlot.MAINHAND);
		
		ironAxe = new Weapon("Iron Battleaxe", 50, 5, EquipSlot.MAINHAND);
		steelAxe = new Weapon("Steel Battleaxe", 75, 7, EquipSlot.MAINHAND);
		mythicAxe = new Weapon("Mythic Battleaxe", 200, 12, EquipSlot.MAINHAND);	
	}
	
	

}
