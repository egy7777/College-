/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
		* Lab: 2 
		* Task 8A  
		* Description: Given two integers, the program displays their min  
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Task8A {

	public static void main(String[] args) {
		
		
		//Scanner
		Scanner input = new Scanner (System.in);
		//enter value a
		System.out.println("Enter Value A: ");
		int a= input.nextInt();
		//enter value b
		System.out.println("Enter Value B: ");
		int b= input.nextInt();
		
		//print the min method 
		System.out.println("Minimum value: " + min(a,b));
		
	}
	//math.min method 
	static int min (int num1, int num2) {
		return Math.min(num1, num2);
		
	}

}
