public class Town {
	
	protected HealthItems hpItem;
	protected WeaponItems weap;
	protected ArmorItems arm;
	
	protected Shop bladeSmith;
	protected Shop armorer;
	protected Shop leatherWorker;
	protected Shop food;
	
	
	Town(){
		hpItem = new HealthItems();
		weap = new WeaponItems();
		arm = new ArmorItems();
		
		bladeSmith = new Shop();
		armorer = new Shop();
		leatherWorker = new Shop();
		food = new Shop();
		
		bladeSmith.inv.add(weap.ironAxe);
		bladeSmith.inv.add(weap.ironSword);
		bladeSmith.inv.add(weap.mythicAxe);
		bladeSmith.inv.add(weap.mythicSword);
		bladeSmith.inv.add(weap.steelAxe);
		bladeSmith.inv.add(weap.steelSword);
		bladeSmith.inv.add(weap.woodenSword);
		bladeSmith.inv.sort();
		
		
		armorer.inv.add(arm.bronzeBoots);
		armorer.inv.add(arm.bronzeChest);
		armorer.inv.add(arm.bronzeGauntlets);
		armorer.inv.add(arm.bronzeHelmet);
		armorer.inv.add(arm.bronzePlatelegs);
		armorer.inv.add(arm.bronzeShield);
		armorer.inv.add(arm.ironBoots);
		armorer.inv.add(arm.ironChest);
		armorer.inv.add(arm.ironGauntlets);
		armorer.inv.add(arm.ironHelmet);
		armorer.inv.add(arm.ironPlatelegs);
		armorer.inv.add(arm.ironShield);
		armorer.inv.add(arm.steelBoots);
		armorer.inv.add(arm.steelChest);
		armorer.inv.add(arm.steelGauntlets);
		armorer.inv.add(arm.steelHelmet);
		armorer.inv.add(arm.steelPlatelegs);
		armorer.inv.add(arm.steelShield);
		armorer.inv.add(arm.woodenShield);
		armorer.inv.sort();
		
		
		leatherWorker.inv.add(arm.leatherBoots);
		leatherWorker.inv.add(arm.leatherChest);
		leatherWorker.inv.add(arm.leatherGloves);
		leatherWorker.inv.add(arm.leatherHelmet);
		leatherWorker.inv.add(arm.leatherPants);
		leatherWorker.inv.add(arm.scaleBoots);
		leatherWorker.inv.add(arm.scaleChest);
		leatherWorker.inv.add(arm.scaleGloves);
		leatherWorker.inv.add(arm.scaleHelmet);
		leatherWorker.inv.add(arm.scalePants);
		leatherWorker.inv.sort();
		
		
		food.inv.add(hpItem.bread);
		food.inv.add(hpItem.bread);
		food.inv.add(hpItem.bread);
		food.inv.add(hpItem.cheese);
		food.inv.add(hpItem.cheese);
		food.inv.add(hpItem.cheese);
		food.inv.add(hpItem.fish);
		food.inv.add(hpItem.fish);
		food.inv.add(hpItem.fish);
		food.inv.add(hpItem.healthPotion);
		food.inv.add(hpItem.healthPotion);
		food.inv.add(hpItem.healthPotion);
		food.inv.sort();
		
		
	}

}
