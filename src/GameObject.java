
/**
 * Class representing all GameObjects
 * @author Austin Finell
 *
 */
public abstract class GameObject implements Comparable<GameObject>{
	
	protected String name;
	protected int value;
	
	/**
	 * Default Constructor
	 */
	GameObject(){
		name = "unknown";
		value = 0;	
	}
	
	/**
	 * Constructor
	 * @param name of the object
	 * @param value object is worth
	 */
	GameObject(String name, int value){
		this.name = name;
		this.value = value;	
	}
	
	
	/**
	 * Sets name of the object
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the name of the Object
	 * @return name String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the value of the object
	 * @param value integer
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Returns the value of the object
	 * @return value integer
	 */
	public int getValue() {
		return value;
	}
	
	
	
	public int compareTo(GameObject item) {
		int result = this.value - item.value;

		if (this.value == item.value) {
			result = this.name.compareTo(item.name);
		}
		
		return result;
	}
	
	/**
	 * Returns representation of object as a String
	 */
	public String toString() {
		return 	"Name: " + name +
				"\tValue: " + value;
	}

}
