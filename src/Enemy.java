import java.util.Random;


/**
 * Class for enemies
 * @author Austin Finell
 *
 */
public class Enemy extends Character {
	
	private int attack;
	private int defence;
	private int accuracy;
	private int evade;
	private int exp;
	
	/**
	 * Name only constructor
	 * @param name of the enemy
	 */
	Enemy(String name){
		super();
		this.name = name;
		this.exp = 5;
		this.attack = 5;
		this.defence = 0;
		this.accuracy = 10;
		this.evade = 3;
	}
	
	/**
	 * Constructor for an enemy
	 * @param name of the enemy
	 * @param maxHealth of the enemy
	 * @param maxMana of the enemy
	 * @param attack of the enemy
	 * @param defence of the enemy
	 * @param accuracy of the enemy
	 * @param evade of the enemy
	 * @param exp the enemy provides on kill
	 */
	Enemy(String name, int maxHealth, int maxMana, int attack, int defence, int accuracy, int evade, int exp){
		super(name, maxHealth, maxMana);
		this.attack = attack;
		this.defence = defence;
		this.accuracy = accuracy;
		this.evade = evade;
		this.exp = exp;
	}
	
	/**
	 * returns the attack of the enemy
	 * @return attack of the enemy
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * sets the attack of the enemy
	 * @param attack of the enemy
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * returns the defence of the enemy
	 * @return defence of the enemy
	 */
	public int getDefence() {
		return defence;
	}
	
	/**
	 * sets the defence of the enemy
	 * @param defence of the enemy
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	/**
	 * returns the evade of the enemy
	 * @return evade of the enemy
	 */
	public int getEvade() {
		return evade;
	}
	
	
	/**
	 * sets the evade of the enemy
	 * @param evade of the enemy
	 */
	public void setEvade(int evade) {
		this.evade = evade;
	}
	
	/**
	 * returns the experience the enemy provides on kill
	 * @return experience the enemy provides on kill
	 */
	public int getExp() {
		return exp;
	}
	
	/**
	 * sets the experience the enemy provides on kill
	 * @param exp - experience the enemy provides on kill
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	/**
	 * Attacks the player
	 * @param target - Player to be attacked
	 */
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
			System.out.println(target.name + " is dead!");
			target.death();
		}
	}
	

}
