//
package SI_Sessions;

public class Pizza extends Food{

	private String sauce; 
	private int slices;

	public Pizza () {
		super ("Pizza");
		this.slices = 0;
		this.sauce = "";
	}
	
	
	public Pizza(String sauce, int slices, double calories) {
		super ("Pizza", calories);
		this.sauce = sauce;
		this.slices = slices; 
	}


	public String getSauce() {
		return sauce;
	}


	public void setSauce(String sauce) {
		this.sauce = sauce;
	}


	public int getSlices() {
		return slices;
	}


	public void setSlices(int slices) {
		this.slices = slices;
	}
	
	@Override
	public String eat() {
		return super.eat()+" with " + sauce + " and slices " + slices;
	}
	
}
