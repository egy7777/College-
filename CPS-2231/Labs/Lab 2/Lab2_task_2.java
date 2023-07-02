/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
		* Lab: 2 
		* Task 2 #  
		* String Formatting. 
		****************************************************************
		*********/
package lab2;

public class Lab2_task_2 {

	public static void main(String[] args) {
		
		//assume we have 2 numbers a and b, a = 2, b = 5
		int a= 2 ;
	    int b= 5 ; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d/n" , a , b, (a+b));
		
		//assume we have 2 numbers a and b, a = 4, b = 4
		a = 4; 
		b = 4; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a , b, (a+b));
		
		//assume we have 2 numbers a and b, a = 1000, b = 2000
		a = 1000; 
		b = 2000; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a , b, (a+b));
		
		//assume we have 2 numbers a and b, a = 100, b = 101
		a = 100; 
		b = 101; 
		System.out.printf("Provided Integers: %4d and %4d, the total is %5d\n", a , b, (a+b));
		
		
	}

}
