package SI_Sessions;

public class Food {
	
	private String name;
	private double calories; 
	
	public Food() {
		this.name = "Food" ; 
	}
	
	public Food(String name) {
		this.name=name; 
	}
	
	public Food(String name, double calories) {
		this.name=name;
		this.calories=calories; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public String eat() {
		return "Eating " + name + " with " + calories + "calories";

	}
	
}
