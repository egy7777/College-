/*************************************************************** 
* 
* Kean University 
* Spring 2023 
* Course: CPS*2231*2 - Computer Programming * 
* Author: Ben Abraham
* Homework: 2, task 2 
* Program Description: Generate a 5x5  matrix and sum of each row 
***************************************************************/
package Assigments;
import java.util.*;
public class Assigment_2_2 {

	public static void main(String[] args) {

		 //initializng initial and new matrix 
        int [][] arr = new int [5][5];
        int [][] arr2 = new int [5][5];
    
        //assigmning each index a random value
        System.out.println("Initial matrix: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                int  a = (int)(Math.random() * 101);
                arr[i][j] = a;
            }
        }
        
        //multiplying even numbers by 10
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%6d", arr[i][j]);
                if (arr[i][j] % 2 == 0) {
                    arr2[i][j] = arr[i][j] * 10;
                } else {
                    arr2[i][j] = arr[i][j];
                }
            }
            System.out.println("");
        }
    
        //printing new matrix 
        System.out.println("\nNew matrix: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%6d", arr2[i][j]);
            }
            System.out.println("");
        }


        //prining the sum of each row
        System.out.println("Sum of each row is: ");
        for (int i = 0; i < 5; i++){
            int sum = 0;
        for (int j = 0; j < 5; j++){
        
        sum +=arr2[i][j];
    }
    System.out.println("Row " + i + " sum: " + sum); 
    }
}
    
}
    
    
