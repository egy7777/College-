//decimal to binary calc
import java.util.Scanner;

public class SI_Bonus_Question_4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int decimle;
		String s;
		
		System.out.println("Hello!");
		System.out.println("Enter decimle number: ");
		decimle = input.nextInt();
		
		s = Integer.toBinaryString(decimle);
		
		System.out.println(s);

		
	}

}
