/***************************************************************
* Kean University
* Spring 2023
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Your Full Name, course, section *
* Homework: 5, task 1
* Program Description: Computer parent class
***************************************************************/
package Assigments;

public class Computer {

    private String manufacturer;
    private String manufacturingDate;
    private int diskSize;
    private int numberOfCores;

    //default
    public Computer() {
    }

    public Computer(String manufacturer, int diskSize, String string, int numberOfCores) {
        this.manufacturer = manufacturer;
        this.manufacturingDate = string;
        this.diskSize = diskSize;
        this.numberOfCores = numberOfCores;
    }
    //getter
    public String getManufacturer() {
        return manufacturer;
    }
    //setter
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    //getter
    public long getDiskSize() {
        return diskSize;
    }
    //setter
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }
    //getter
    public String getManufacturingDate() {
        return manufacturingDate;
    }
    //setter
    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    //getter
    public int getNumberOfCores() {
        return numberOfCores;
    }
    //setter
    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Computer [manufacturer=" + manufacturer + ", diskSize=" + diskSize + ", manufacturingDate="
                + manufacturingDate + ", numberOfCores=" + numberOfCores + "]";
    }

}
