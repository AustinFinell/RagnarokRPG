import java.util.Random;

public class Enemy extends Character {
	
	private int attack;
	private int defence;
	private int accuracy;
	private int evade;
	private int exp;
	
	Enemy(String name){
		super();
		this.name = name;
		this.exp = 5;
		this.attack = 5;
		this.defence = 0;
		this.accuracy = 10;
		this.evade = 3;
	}
	
	Enemy(String name, int maxHealth, int maxMana, int attack, int defence, int accuracy, int evade, int exp){
		super(name, maxHealth, maxMana);
		this.attack = attack;
		this.defence = defence;
		this.accuracy = accuracy;
		this.evade = evade;
		this.exp = exp;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public int getEvade() {
		return evade;
	}
	
	public void setEvade(int evade) {
		this.evade = evade;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void attack(Player target) {
		Random rand = new Random();
		int hit = (rand.nextInt(accuracy)+1) - rand.nextInt(target.getLuck()/2);
		if(hit <= 0) {
			System.out.println("The " + name + " missed!\n");
			return;
		}
		
		int damage = rand.nextInt(attack) - rand.nextInt((int)Math.sqrt(target.getDefence()+1));
		
		if (damage < 0) {
			damage = 0;
		}
		
		target.health -= damage;
		System.out.println("The " + name + " did " + damage + " damage!");
		System.out.println(target.name + " has " + target.health + " health left.\n");
		
		if(target.isDead()) {
			System.out.println(name + " is dead!");
			target.death();
		}
	}
	

}
