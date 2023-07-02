/***************************************************************
**************** 
* Kean University 
* Semester Spring 23  
* Course: CPS*2231 - Computer Programming 
* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
* Lab: 2 
* Task 6#  
* Methods Overloading
****************************************************************
*********/
package lab2;

import java.util.Scanner;


public class Lab2_task_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of intergers you will provide: ");
		int num = input.nextInt();
		
		// Prompt the user to enter the first integer 
		System.out.println("Enter the values for 'a' and press Enter: ");
		int a = input.nextInt();
						
		// Prompt the user to enter the second integer 
		System.out.println("Enter the values for 'b' and press Enter: ");
		int b = input.nextInt();
		
		if (num == 4) {
			//Prompt user to enter the third integer
			System.out.println("Enter the values for 'c' and press Enter: ");
			int c = input.nextInt();
			
			//Prompt user to enter the fourth integer
			System.out.println("Enter the values for 'd' and press Enter: ");
			int d = input.nextInt();
			
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("Provide Integers: %4d, %4d, %4d, and %4d the total is %5d\n", a, b, c, d, sum(a, b, c, d));
		}
		else if(num == 3) {
			//Prompt user to enter the third integer
			System.out.println("Enter the values for 'c' and press Enter: ");
			int c = input.nextInt();
			
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("Provide Integers: %4d, %4d, and %4d the total is %5d\n", a, b, c, sum(a, b, c));
		}
		else {
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("Provide Integers: %4d and %4d, the total is %5d\n", a, b, sum(a, b));
		}
		
	}//main
	
	//method 1 	//method 2 to add and return num1 + num2 + num3 
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//method 2 to add and return num1 + num2 + num3
	static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;

}
	//method 2 to add and return num1 + num2 + num3 + num4
	static int sum(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4; 
	}

}