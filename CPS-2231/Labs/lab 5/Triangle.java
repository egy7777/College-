/*********************************************************************
* Kean University
* Semester Spring 23
* Course: CPS*2231 - Computer Programming
* Author: Ben Abraham
* Lab: 5
* Program Description: Triangle object class that extends the
SimpleGeometricObject class.
*********************************************************************/
package Lab5;

import cps2231.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {
	
	//data fields
	public double base = 5;
	public double height = 10;
	
	//default constructor 
	public Triangle(){
		
	}
	//constructor
	public Triangle(double newBase, double newHeight) {
		this.base = newBase; 
		this.height = newHeight; 
	}
	//getter
	public double getArea() {
		return 1/2 * base * height;
	}
	//getter base
		public double getBase() {
			return base;
		}
	//setter base
	public void setBase(double base) {
		this.base = base; 
	}
	//setter height 
	public void setHeight(double hegiht) {
		this.height=height; 
	}
	//getter height 
		public double getHeight() {
			return height;
		}
	//override method 1
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	//override method 2 
	@Override	
	public void testOverriding() {
			System.out.println("This is the overridden testOverriding() method");
	}
}

