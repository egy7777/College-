import java.util.Scanner;

public class SiSession4 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);

		int number1; 
		int number2;
		int number3; 


		
		System.out.println("Enter 3 numbers from 0 to 10 to determine which is the biggest ");
		number1=input.nextInt();
		number2=input.nextInt();
		number3=input.nextInt();


		
		
		if (number1 > number2 && number1 > number3) {
		        System.out.println(number1);
		if (number1 < number2 && number2 > number3)
		
	        System.out.println(number2);

			
	     } else {
		        System.out.println(number3);
	    }
		
     	}

}

