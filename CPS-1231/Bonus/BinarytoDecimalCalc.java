//binary to decimal calc
import java.util.Scanner;

public class SI_Bonus_Question_4 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);


		String binary;
		int decimal;
		
		
		System.out.println("Enter Binary:");
		binary= input.nextLine();

		decimal=Integer.parseInt(binary,2);
		System.out.println(decimal);
	

		
	}

}
