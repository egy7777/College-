/*************************************************************** 
* 
* Kean University 
* Spring 2023 
* Course: CPS*2231*2 - Computer Programming * 
* Author: Ben Abraham
* Homework: 2, task 1 
* Program Description:  
***************************************************************/
package Assigments;
import java.util.*;
public class Assigment_2 {

	public static void main(String[] args) {


	    //1d array
	    int [] arr = new int [10];
	 
	    //assigmning each index a random value
	    for(int i = 0; i<(arr.length); i++){
	    int  a = (int)(Math.random() * 101 * (Math.random() > 0.5 ? 1 : -1));
	    arr[i]= a; 
	        }

	        System.out.println("The array is" + Arrays.toString(arr));

	      
	        //setting the stop watch 
	        long startTime = System.nanoTime();
	        int max = max(arr);
	        long endTime = System.nanoTime();
	        long  executiontime = endTime - startTime;

	        //System.out.println("Current Time in milliseconds = " + System.currentTimeMillis() % 1000);

	        System.out.println("It took " + executiontime + " nanoseconds to find a maximum in the array of 10 elements. The maximum is: " + max); 

	        
	    }// main
	    
	    //finding max method
	    public static int max(int arr[]){

	        int max = arr[0];
	        for (int i = 0; i < arr.length; i++)
	            if(arr[i]>max)
	            max = arr[i];
	            
	        //returnign max
	        return max;

	        }

	  

	        }



