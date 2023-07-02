/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Each team member’s Full Name, course, section 
		* Lab: 2 
		* Task 5  
		* sums of their 2 or 3 integers 
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Lab2_task_5 {

	public static void main(String[] args) {
		
		
		//scanner
		Scanner input = new Scanner (System.in);
		//ask for number if ints
		System.out.print("Enter number of integers you will provide ");
		int num = input.nextInt();
		//ask for int a
		System.out.print("Enter value 'a' and press enter");
		int a = input.nextInt();
		//ask for int b
		System.out.print("Enter value 'b' and press enter");
		int b = input.nextInt();
		//if num = 3 ask for third int
		if (num == 3) {
			System.out.print("Enter value 'c' and press enter");
			int c = input.nextInt();
			
			System.out.printf("Provided integers:  %4d and %4d, total is %5d\n" ,a,b,c, sum(a,b,c));

			}
		else {
			System.out.printf("Provided integers:  %4d and %4d, total is %5d\n" ,a,b, sum(a,b));

		}
		
		
			
		}
			
	
static int sum(int num1, int num2) {
	return num1 + num2;
	
	
}
static int sum (int  num1, int num2, int num3) {
	return num1+num2+num3;
	

}

}
