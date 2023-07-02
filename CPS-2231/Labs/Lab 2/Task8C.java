/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
		* Lab: 2 
		* Task 8c  
		* 
		****************************************************************
		*********/
package lab2;

import java.util.Scanner;

public class Task8C {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the number of ints
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
			System.out.printf("The min of the integers: %4d, %4d, %4d, and %4d is %5d\n", a, b, c, d, min(a, b, c, d));
		}
		else if(num == 3) {
			//Prompt user to enter the third integer
			System.out.println("Enter the values for 'c' and press Enter: ");
			int c = input.nextInt();
			
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("The min of the integers %4d, %4d, and %4d is %5d\n", a, b, c, min(a, b, c));
		}
		else {
			//Close Scanner
			input.close();
			
			//Display the result
			System.out.printf("The min of the integers %4d and %4d, is %5d\n", a, b, min(a, b));
		}
}
	
	
	//find min of num1 and num2 
	public static int min(int num1, int num2) {
		return Math.min(num1, num2);
}
	
	//num between num1, num2, num3
	public static int min(int num1, int num2, int num3){
		int x = Math.min(num1, num2);
		return Math.min(x, num3);
}
	
	//min between num1, num2, num3, num4
	public static int min(int num1, int num2, int num3, int num4){
		int x = Math.min(num1, num2);
		int y = Math.min(x, num3);
		return Math.min(y, num4);
	}//

}//class


