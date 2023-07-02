/***************************************************************
**************** 
* Kean University 
* Semester Spring 23  
* Course: CPS*2231 - Computer Programming 
* Author(s): Ben Abraham, CPS-2231 
* Lab: 3 
* Task 3 
* Program  Description:  BinarySearch
****************************************************************
*********/
package Lab3;

public class Task_3 {

	public static void main(String[] args) {
		
		//array
		int [] myList = {1, 2, 3, 7, 10, 12, 20};
		int result= binarysearch(myList,20);
		//
		if (result==-1) 
			System.out.println("not found");
		else 
		System. out. println("The index of the input key is " + result + ".");

}
	//binary search method
	static int binarysearch(int[] list, int key) {
	    int low = 0;
	    int high = list.length - 1;
	    while (low <= high) {//while low less than or equal to high
	        int mid = (low + high) / 2;
	        
	     //going through midans
	    if (list[mid] == key) {
	            return mid;
	        } else if (list[mid] < key) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	
	}


}//class 
