/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel.
		* Lab: 2 
		* Task 3  
		* Console Input and Output 
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Lab2_task_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	

	// prompt user to enter first integer
	System.out.print("Eneter the value for a and press Enter ");
	int a = input.nextInt();
	
	// prompt user to enter second integer
	System.out.print("Eneter the value for a and press Enter ");
	int b = input.nextInt();
	
	//close scanner
	input.close();
	
	//print result
	System.out.printf("Provided Integers: %4d and %4d, the total is: %5d\n", a, b, (a+b));
	
	
    }//main
}//class