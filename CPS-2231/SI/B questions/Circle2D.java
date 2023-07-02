//Bonus Question 3
package SI_Bonus_Questions;

public class Circle2D {

	private double x,y,radius; 
	
	public Circle2D () {
		
	}
	public Circle2D (double x, double y, double radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	//getter
	public double getX() {
		return x;
	}
	//getter
	public void setX(double x) {
		this.x = x;
	}
	//getter
	public double getY() {
		return y;
	}
	public void setY(double y) {
	     this.y = y;
	}
	//getter
	public double getRadius() {
		return radius;
	}
	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//getter
	public double getArea() {
		return radius * radius ; 
	}
	//getter
	public double getPerimeter() {
		return 2 * radius ; 
	}
	//boolean contains method
	public boolean contains (double x, double y) {
		return x < y; 
	}
	//boolean contains method
	public boolean contains (Circle2D c) {
		return false;
	}
	//boolean contains method
	public boolean overlaps (Circle2D c) {
		return false;	
	}
	  @Override
	 public String toString() {
		  return "Circle2D [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	    }
}
	
	
