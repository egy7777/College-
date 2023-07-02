/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
		* Lab: 2 
		* Task 8B  
		* 
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Task8B {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner (System.in);
		//ask for number of values
		System.out.println("Enter number of values: ");
		int num= input.nextInt();
		
		//enter value b
		System.out.println("Enter Value B: ");
		int a = input.nextInt();
		
		//enter value c
		System.out.println("Enter Value c: ");
		int b = input.nextInt();
		
		if(num==3) {
			
			int c = input.nextInt();
			
			input.close();

			System.out.printf("The min of the integers %4d, %4d, and %4d  is %5d\n", a, b, c, min(a, b, c));

		}
		else {
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("The min of the integers %4d and %4d,is %5d\n", a, b, min(a, b));
		}
		
		
	}
	//method 1 to find min of 3 ints
	public static int min(int num1, int num2, int num3){
		int x = Math.min(num1, num2);
		return Math.min(x, num3);
	}//method1
	//method 2 to find min of 2 ints
	static int min(int num1, int num2) {
		return Math.min(num1, num2);
		
	}//method2
	
	

}//class
