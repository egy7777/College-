import java.util.Scanner;

public class Class7$9_27_NumberTest {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		
		int number; 
		System.out.println("Please enter a number");

	    number=input.nextInt();

		
		
		
			System.out.println("Is " + number + " divisible by 2 and 3? " + ((number % 2 == 0) && (number % 3 == 0)));
			System.out.println("Is " + number + " divisible by 2 or 3? " + ((number % 2 == 0) || (number % 3 == 0)));
			System.out.println("Is " + number + " divisible by 2 or 3, but not both? " + ((number % 2 == 0) ^ (number % 3 == 0)));
	}

}
