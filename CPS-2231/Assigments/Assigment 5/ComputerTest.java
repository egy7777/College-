/***************************************************************
*
* Dean University
* Spring 2023
* Course: CPS*2231 - Computer Organization &Programming *
* Author: Your Full Name, course, section *
* Homework: 5, task 2
* Program Description: ComputerTest class
***************************************************************/
package Assigments;

public class ComputerTest {

	public static void main(String[] args) {

		  	Computer dellComputer = new Computer("Dell", 1189, "4,1,2020", 2);
		  	

	        Computer computer2 = new Computer();
	        computer2.setManufacturer("Apple Inc");
	        computer2.setDiskSize(512);
	        computer2.setManufacturingDate("3,31,2020");
	        computer2.setNumberOfCores(4);

	        Computer computer3 = new Computer();
	        computer3.setManufacturer("MSI");
	        computer3.setDiskSize(512);
	        computer3.setManufacturingDate("4,18,2021");
	        computer3.setNumberOfCores(16);
	        
	        // Laptops
	        Laptop laptop1 = new Laptop("HP",("2,5,2020"), 512, 4, 2);
	        Laptop laptop2 = new Laptop("Lenovo",("4,9,2021"), 1000, 2, 4);
	        
	        // Desktops
	        Desktop desktop1 = new Desktop("Asus",("2021, 6, 1"), 1000, 8,  20, 40);
	        Desktop desktop2 = new Desktop("Acer",("2021, 7, 1"), 512, 6, 15, 30);
	        
	        System.out.println("Dell Computer:");
	        System.out.println(dellComputer.toString());

	        System.out.println("Apple Computer:");
	        System.out.println(computer2.toString());

	        System.out.println("Personal Computer:");
	        System.out.println(computer3.toString());
	        
	        System.out.println("Laptop 1:");
	        System.out.println(laptop1.toString());
	        
	        System.out.println("Laptop 2:");
	        System.out.println(laptop2.toString());
	        
	        System.out.println("Desktop 1:");
	        System.out.println(desktop1.toString());
	        
	        System.out.println("Desktop 2:");
	        System.out.println(desktop2.toString());
	}

}
