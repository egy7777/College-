/***************************************************************
****************
* Kean University
* Semester Spring 23
* Course: CPS*2231 - Computer Programming
* Author(s): Ben Abraham, Freily Garcia, 
* Lab: 4
* Task # 1
****************************************************************
*********/
package Lab4;

enum Color {
	WHITE, YELLOW, RED, GREEN, BLUE, BROWN, BLACK
}
public class Circle {


	public Circle(double radius, Color color) {
		//super();
		this.radius = radius;
		this.color = color;
	}
	
	public Circle() {
		//super();
		// TODO Auto-generated constructor stub
	}

	double radius = 1.0;
	Color color;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	//@Override
	public String toString() {
		return "The Circle characteristics are: radius = " + radius + ", color =  " + color
				+ "\n Diameter is " + this.getDiameter()
				+ "\n Area is " + this.getArea(); 
	}
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}