/***************************************************************
		**************** 
		* Kean University 
		* Semester Spring 23  
		* Course: CPS*2231 - Computer Programming 
		* Author(s): Ben abraham, freily Garcia, joselyn carvajel. 
		* Lab: 2 
		* Task 8D   
		* String Formatting. 
		****************************************************************
		*********/
package lab2;

public class Task8D {

	public static void main(String[] args) {

		min(1, 3);
		min(34, 3, 5);
		min(10, -6, 20, 20);
		min(30, 3, 3, 2, 56);
		min(34, 3, 3, -2, 56, 5);
		min(34, 3, 3, 2, 1, 55, 990);
		
	}
	

	//This method will take integers and store them in a 1d array
public static void min(int... numbers) {
	int minimum = numbers[0];
		
		for(int i: numbers) {
			if (i < minimum) {
				 minimum = i;
		}
}
		//print the smallest number from all the input given
		System.out.println("The minimum number is " + minimum);
	}

}


