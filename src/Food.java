
public class Food extends GameObject{
	
	int heals;
	
	public Food(){
		super();
		heals = 5;
	}
	
	public Food(String name, int value, int heals) {
		super(name, value);
		this.heals = heals;
	}
	
	public void setHeals(int heals) {
		this.heals = heals;
	}
	
	public int getHeals(int heals) {
		return heals;
	}
	
	@Override
	public String toString() {
		return  super.toString() +
				"\tHeals: " + heals;
	}


}
