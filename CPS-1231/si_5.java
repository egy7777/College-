//age program
//1 or less "infant" more than 1, less than 13 "child" 13 and less than 20 "teen" 20 and older "adult"
//make sure they are alla checked wihtoutputting them on the same line 
import java.util.Scanner;

public class si_5 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		
		int age; 
		
		
		System.out.println ("please enter age ");
		age=input.nextInt();
		
		if (age <=1) {
			
		System.out.println("infant " +age );
		}
		
		
		else if (age > 1 && age < 13) {
			System.out.println("child " +age);
			}
	
		else if (age == 13 && age < 20) {
			System.out.println ("teen " +age);
		}
		
		else {
			System.out.println ("adult " +age);
		}
	
}
}