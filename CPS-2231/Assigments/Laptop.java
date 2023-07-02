/***************************************************************
*
* Kean University
* Spring 2023
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Your Full Name, course, section *
* Homework: 5, task 4
* Program Description:
***************************************************************/
package Assigments;
public class Laptop extends Computer{

	private double weight;

    public Laptop(String manufacturer, String manufacturingDate, int diskSize, int numberOfCores, double weight) {
        super(manufacturer, diskSize, manufacturingDate, numberOfCores);
        this.weight = weight;
    }

    public Laptop() {
        super();
        this.weight = 0;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight;
    }
}
	

