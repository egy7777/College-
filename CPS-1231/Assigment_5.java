package assigments;

import java.util.Scanner;

public class Assigment_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
			String firstName, lastName, carMaker, passWord, fullName;
			int birthYear;
		
			System.out.println("Enter First Name: ");
			firstName=input.nextLine();
		
			System.out.println("Enter Last Name: ");
			lastName=input.nextLine();
			
			System.out.println("(Security Question) Favorite Car Maker: ");
			carMaker=input.nextLine();
			
			System.out.println("Enter Birth Year: ");
			birthYear=input.nextInt();

			System.out.println("==============================================");
			
			fullName= firstName.substring(0,1).toUpperCase() +firstName.substring(1) + " "+  lastName.substring(0,1).toUpperCase() +lastName.substring(1);
			System.out.println(fullName);

			System.out.println("Kean Email: " + firstName.charAt(0) + "." + lastName + "@kean.edu");
			
			passWord = firstName.substring(0,3)+ birthYear + carMaker.substring(0,3); 
			System.out.println("Kean Password: " +passWord.toUpperCase());

			System.out.println("==============================================");

			

	}

}
