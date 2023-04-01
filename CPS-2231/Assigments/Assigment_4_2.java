/***************************************************************
	**************** 
	* Kean University 
	* Spring 2023 
	* Course: CPS*2231 - Computer Programming 
	* Author: Ben Abraham 
	* Homework: 4, part 2
	* Program Description: String v.s StringBuilder Experiment (StringBuilder)
	**************************************************************
	***********/ 
package Assigments;

public class Assigment_4_2 {

	public static void main(String[] args) {

		long begin, end, time; // we will measure time it took
		begin = System.nanoTime(); //we measure in nanoseconds.
		
		
		//1d array
		int arr[]= new int[5000]; 
		
		//storing 0-49 into arr
		for (int i= 0; i<arr.length; i++) {
			arr[i]=i;
		}
		
		//string object with no constructor 
		StringBuilder obj = new StringBuilder(); 
		
		//adding array elements one by one to the String
		for (int j = 0; j<arr.length; j++) {
			obj.append(arr[j]);
		}
		//print object
		System.out.println(obj);
		
		end = System.nanoTime();
		time = end - begin;
		
		//print time it took
		System.out.println("it took " + time + " nanoseconds to append 50 integres to the StringBuilder" );

	}

}
