package assigments;

import java.util.Scanner;

/* Ben Abraham
 * Assigment 1
 * 9-13-22 10:30
 */ 

//scanner grade

public class Assigment1 {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		
		System.out.println("My name is Ben");
		System.out.println("My major is I.T and Cyber Security ");
		System.out.println("I am a big car/motorcycle and aviation enthusiast");
		
		System.out.println(); 
		
		System.out.println("***************************");
		
		System.out.println();
		
		System.out.println("5 keywords in java are:public, class, void, int, Double ");
		
		System.out.println();
		
		System.out.println("***************************");
		
		System.out.println();


		
/*question 3: True or False
 * 1- $word1 = is a valid name
 * 2- wrd# = invalid because invalid character
 * 3- -word = invalid syntax "-"
 * 4- word+word2 = invalid syntax "
 * 5- _sale = valid
 * 6- 2sale = invalid (can't start with number)
 * 7- Sale2 = valid
 * 8- ~x = invalid not a $ or _
 * 9- void = invalid reserve word
 * 10- Void= valid (uppercase V)
 */
		
//question 4: examples of 
		
//runtime error {
		//System.out.println(1/0);
		//can't divide by "0"
//	}

//syntax error {
    //String txt = new String -hello;
	// no "" or ()
//	}
		
//logical error { 
		//int x= 4;
		//int y= 4;
		//System.out.println("the sum is" x+y);
		//not the actual sum, 
		
//	}

//question 5: 
		
//ask for input
 	System.out.println("Please enter grade 1:");
 	Double student1 = grade.nextDouble();
 	System.out.println("Please enter grade 2:");
 	Double student2 = grade.nextDouble();
 	System.out.println("Please enter grade 3:");
 	Double student3 = grade.nextDouble();
 	
//average of= grade 1 + grade 2 + grade 3 divided by 3	
 	
 	Double gradeAverage= (student1 + student2 + student3) / 3;
 
//formula >>

Double FinalExamPercentage1= (0.30* student1 + 100)/ gradeAverage;
Double FinalExamPercentage2= (0.30* student2 + 100)/ gradeAverage;
Double FinalExamPercentage3= (0.30* student3 + 100)/ gradeAverage;

	System.out.println("The final average for student 1 is %"+ FinalExamPercentage1);
 	System.out.println("The final average for student 2 is %"+ FinalExamPercentage2);
 	System.out.println("The final average for student 3 is %"+ FinalExamPercentage3);



		
		
		
		
		
//nts:q.4.not.done
	}

}
