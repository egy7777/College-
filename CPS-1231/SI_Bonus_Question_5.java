//calc
import java.util.Scanner;

public class SI_Bonus_Question_5 {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);

	int choice=0, firstNumber, secondNumber, problem_1, answer;
	System.out.println("Main menu");
	System.out.println("1: Addition");
	System.out.println("2: Subtraction");
	System.out.println("3: Exit");
	System.out.println("Enter a choice: ");
	choice= input.nextInt();
	
	while  (choice!=3) {
	firstNumber = (int)(Math.random()*10);
	secondNumber = (int)(Math.random()*10);
	
	switch(choice) {
	
	case 1 :
		
		System.out.println("What is " + firstNumber+ "+" + secondNumber +"?");
		answer= input.nextInt();
		problem_1= firstNumber + secondNumber;

		if (answer == problem_1) 			
		System.out.println("Correct!");
		else  	
		System.out.println("Incorrect! its " +problem_1 + " try again" );
		break;

	case 2 : 
		problem_1= firstNumber - secondNumber;
		System.out.println("What is " + firstNumber+ "-" + secondNumber +"?");
		answer= input.nextInt();
		
		if (answer == problem_1) 			
		System.out.println("Correct!");
		else  	
		System.out.println("Incorrect! its " + problem_1 + " try again");
		break; 
		
	case 3: 

		default: 
			System.out.print("Not a choice");
			System.exit(0);
		}
	System.out.print("Enter choice");
	choice= input.nextInt();


	}
	System.out.print("Thank You for using our calculator! ");

}

}

