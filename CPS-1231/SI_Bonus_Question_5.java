import java.util.Scanner;

public class SI_Bonus_Question_5 {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);

	int choice, firstNumber, secondNumber, problem_1;
	System.out.println("Main menu");
	System.out.println("1: Addition");
	System.out.println("2: Subtraction");
	System.out.println("3: Exit");
	System.out.println("Enter a choice: ");
	choice= input.nextInt();
	
	while (choice !=3) {
	firstNumber = (int)(Math.random()*10);
	secondNumber = (int)(Math.random()*10);
	
	switch(choice) {
	
	case 1 :
		problem_1= firstNumber + secondNumber;
		
		break;

	}

	}

	}

}
