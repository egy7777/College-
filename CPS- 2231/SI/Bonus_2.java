package SI_Bonus_Questions;

import java.util.Scanner;

public class Bonus_2 {

	public static void main(String[] args) {
		public static void main(String args[]) {
			  // Get an array from the user
		     int[][] m = getArray();
		        
		         // Display array elements
		         System.out.println("You provided the following array " + java.util.Arrays.deepToString(m));
		        
		         // Display array characteristics
		     int[] r = findCharacteristics(m);
		         System.out.println("The minimum value is: " + r[0]);
		         System.out.println("The maximum value is: " + r[1]);
		         System.out.println("The average is: " + r[2] * 1.0/(m.length * m[0].length));
		         }
		        
		         // Create an array from user input
		         public static int[][] getArray() {
		        
		     // Create a Scanner to read user input
		        Scanner input = new Scanner(System.in);
		        
		         // Ask user to input a number, and grab that number with the Scanner
		        System.out.println("Please enter the amount of rows you would like: ");
		        int rowAmount = input.nextInt();
		    
		         System.out.println("Please enter the amount of columns you would like: ");
		         int colAmount = input.nextInt();
		        
		         // Create the array
		         int[][] m = new int[rowAmount][colAmount];
		         System.out.println("With spaces to split the numbers, and shift+enter to start a new row, enter a matrix and press enter.");
		        
		        for(int row = 0; row < m.length; row++)
		         for(int col = 0; col < m[row].length; col++)
		         m[row][col] = input.nextInt();
		        
		         input.close();
		        
		         return m;
		        }
		        
		         // Given an array, this method finds its characteristics and returns an array
		         public static int[] findCharacteristics(int[][] m) {
		         int min = m[0][0];
		         int max = m[0][0];
		         int sum = 0;
		        
		         for(int[] array : m) {
		         for(int element : array) {
		         if(element < min)
		         min = element;
		        
		         if(element > max)
		         max = element;
		        
		         sum += element;
		         }
		         }
		        
		     // Create new array to store characteristics
		         int[] c = new int[3];
		         c[0] = min;
		         c[1] = max;
		         c[2] = sum;
		        
		     return c;
	}

}
