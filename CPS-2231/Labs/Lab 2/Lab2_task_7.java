/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Each team member’s Full Name, course, section 
		* Lab: 2 
		* Task 7  
		*  
		****************************************************************
		*********/
package lab2;

public class Lab2_task_7 {

	public static void main(String[] args) {
		
		sum(34,3);
		sum(34,3,3); 
		sum(34,3,3,2);
		sum(34,3,3,2,56);
		sum(34,3,3,2,56,5);
		sum(34,3,3,2,56,55,990);
		
		
	}
	
	 static void sum(int...numbers) {
		int sum = 0;
		
		for (int i : numbers)
			sum += i; 
		
		System.out.println("The sum of numbers is " + sum);
		
	}

}
