//math class

import java.util.Scanner;

public class SI_Session_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String s= "", rev="";
		s=input.nextLine();
		char ch;
                
        for (int i=0; i<s.length(); i++)
        {
        ch= s.charAt(i); //extracts each character
        rev= ch+rev;    //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ rev);
		

	}

}
