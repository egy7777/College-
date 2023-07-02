/***************************************************************
**************** 
* Kean University 
* Semester Spring 23  
* Course: CPS*2231 - Computer Programming 
* Author(s): Ben Abraham, CPS-2231 
* Lab: 3 
* Task 4 
* Program  Description:  BinarySearch in descending order 
****************************************************************
*********/
package Lab3;


public class Task_4 {

	public static void main(String[] args) {

				//array
				int [] myList = {20, 12, 10, 7, 5, 3, 2};
				int result= binarysearch(myList,20);
				if (result==-1) 
					System.out.println("not found");//if not found
				else 
				System. out. println("The index of the input key is " + result + ".");//print the index of the input
		
	}
	//binary search method
	static int binarysearch(int[] list, int key) {
		int low = 0;
	    int high = list.length - 1; //high equals lenght - 1 
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (list[mid] == key) {
	            return mid;
	        } else if (list[mid] > key) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	
					
					
				}

}//class
