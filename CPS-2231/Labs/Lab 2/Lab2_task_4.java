/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Each team member’s Full Name, course, section 
		* Lab: 2 
		* Task 4  
		* Intro to methods 
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Lab2_task_4 {

	public static void main(String[] args) {
		
		//scanner
		Scanner input = new Scanner (System.in);
			
		//Enter first int
		System.out.print("Enter value 'a' and press enter");
		int a = input.nextInt();
		
		//Enter second int
		System.out.print("Enter value 'b' and press enter");
		int b = input.nextInt();
		
		//display result 
		System.out.printf("provided integers: %d %d sum: %d" ,a,b, sum(a,b));
		

	}
	
	static int sum(int num1, int num2) {
		
		//return to main
		return num1+num2;
		
		
	}

}
