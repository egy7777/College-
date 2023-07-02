/***************************************************************
**************** 
* Kean University 
* Semester Spring 23  
* Course: CPS*2231 - Computer Programming 
* Author(s): Ben Abraham, CPS-2231 
* Lab: 3 
* Task 5  
* Program  Description:  Finding the Median
****************************************************************
*********/
package Lab3;

import java.util.Arrays;

public class Task_5 {

	public static void main(String[] args) {

		int array[] = {10,20,15,25,30};
		double median = median(array); 
		System.out.println("Median= " + median); 
		
	}
	
public static int median(int [] array) {
//finding mid
	Arrays.sort(array);
    double median = 0;
    
    if (array.length % 2 == 1)
        return (int) (median = array[array.length/2]);
    else {
        int a = (array.length + 1)/2;
        int rightMid = (array[a]);
        int leftMid = array[a - 1];
        return (int) (median = (rightMid + leftMid) / 2);
    }

}//class

}