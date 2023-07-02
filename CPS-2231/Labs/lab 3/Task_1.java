/***************************************************************
**************** 
* Kean University 
* Semester Spring 23  
* Course: CPS*2231 - Computer Programming 
* Author(s): Ben Abraham, CPS-2231 
* Lab: 3 
* Task 1  
* Program  Description:  
****************************************************************
*********/

package Lab3;

public class Task_1 {

	public static void main(String[] args) {
	    int deck[] = new int[52];
	    //deck
	    String suites[] = { "Spades", "Hearts", "Diamonds", "Club" };
	    String ranks[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack" };
	    //going through each index
	    for (int i = 0; i < deck.length; i++)
	        deck[i] = i;

	    for (int i = 0; i < deck.length; i++) {
	        int index = (int) (Math.random() * deck.length);
	        int temp = deck[i];
	        deck[i] = deck[index];
	        deck[index] = temp;
	    }

	    for (int i = 0; i < 4; i++) {
	        String suite = suites[deck[i] / 13];
	        String rank = ranks[deck[i] % 13];
	        //print card number
	        System.out.print("Card number " + deck[i] + ":" + rank + " of " + suite);
	    }
	}
}//class
