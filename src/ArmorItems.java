
public class ArmorItems {
	
	protected Armor leatherHelmet;
	protected Armor scaleHelmet;
	
	protected Armor bronzeHelmet;
	protected Armor ironHelmet;
	protected Armor steelHelmet;
	
	
	protected Armor leatherChest;
	protected Armor scaleChest;
	
	protected Armor bronzeChest;
	protected Armor ironChest;
	protected Armor steelChest;
	
	
	protected Armor leatherPants;
	protected Armor scalePants;
	
	protected Armor bronzePlatelegs;
	protected Armor ironPlatelegs;
	protected Armor steelPlatelegs;
	
	
	protected Armor leatherGloves;
	protected Armor scaleGloves;
	
	protected Armor bronzeGauntlets;
	protected Armor ironGauntlets;
	protected Armor steelGauntlets;
	
	
	protected Armor leatherBoots;
	protected Armor scaleBoots;
	
	protected Armor bronzeBoots;
	protected Armor ironBoots;
	protected Armor steelBoots;
	
	
	protected Armor woodenShield;
	protected Armor bronzeShield;
	protected Armor ironShield;
	protected Armor steelShield;
	
	ArmorItems(){
		leatherHelmet = new Armor("Leather Helmet", 10, 1, EquipSlot.HEAD);
		scaleHelmet = new Armor("Scale Helmet", 20, 2, EquipSlot.HEAD);
		
		bronzeHelmet = new Armor("Bronze Helmet", 20, 2, EquipSlot.HEAD);
		ironHelmet = new Armor("Iron Helmet", 30, 3, EquipSlot.HEAD);
		steelHelmet = new Armor("Steel Helmet", 40, 4, EquipSlot.HEAD);
		
		
		leatherChest = new Armor("Leather Chest", 30, 3, EquipSlot.CHEST);
		scaleChest = new Armor("Scale Chest", 45, 4, EquipSlot.CHEST);
		
		bronzeChest = new Armor("Bronze Chest", 30, 3, EquipSlot.CHEST);
		ironChest = new Armor("Iron Chest", 50, 4, EquipSlot.CHEST);
		steelChest = new Armor("Steel Chest", 100, 5, EquipSlot.CHEST);
		
		leatherPants = new Armor("Leather Pants", 20, 2, EquipSlot.LEGS);
		scalePants = new Armor("Scale Pants", 30, 3, EquipSlot.LEGS);
		
		bronzePlatelegs = new Armor("Bronze Platelegs", 25, 2, EquipSlot.LEGS);
		ironPlatelegs = new Armor("Iron Platelegs", 40, 3, EquipSlot.LEGS);
		steelPlatelegs = new Armor("Steel Platelegs", 80, 4, EquipSlot.LEGS);
		
		leatherGloves = new Armor("Leather Gloves", 5, 1, EquipSlot.HANDS);
		scaleGloves = new Armor("Scale Gloves", 15, 2, EquipSlot.HANDS);
		
		bronzeGauntlets = new Armor("Bronze Gauntlets", 20, 2, EquipSlot.HANDS);
		ironGauntlets = new Armor("Iron Gauntlets", 30, 3, EquipSlot.HANDS);
		steelGauntlets = new Armor("Steel Gauntlets", 40, 4, EquipSlot.HANDS);
		
		leatherBoots = new Armor("Leather Boots", 5, 1, EquipSlot.FEET);
		scaleBoots = new Armor("Scale Boots", 15, 2, EquipSlot.FEET);
		
		bronzeBoots = new Armor("Bronze Boots", 20, 2, EquipSlot.FEET);
		ironBoots = new Armor("Iron Boots", 30, 3, EquipSlot.FEET);
		steelBoots = new Armor("Steel Boots", 40, 4, EquipSlot.FEET);
		
		woodenShield = new Armor("Wooden Shield", 15, 2, EquipSlot.OFFHAND);
		bronzeShield = new Armor("Wooden Shield", 15, 2, EquipSlot.OFFHAND);
		ironShield = new Armor("Wooden Shield", 15, 2, EquipSlot.OFFHAND);
		steelShield = new Armor("Wooden Shield", 15, 2, EquipSlot.OFFHAND);
	}
	
}
