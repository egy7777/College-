/***************************************************************
*
* Kean University
* Spring 2023
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Your Full Name, course, section *
* Homework: 5, task 3
* Program Description:
***************************************************************/
package Assigments;

public class Desktop extends Computer  {
	private int width;
    private int height;

    public Desktop(String manufacturer, String manufacturingDate, int diskSize, int numberOfCores, int width, int height) {
        super(manufacturer, diskSize, manufacturingDate, numberOfCores );
        this.width = width;
        this.height = height;
    }

    public Desktop() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height;
    }
}

