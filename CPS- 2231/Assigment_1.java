package Assigments;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
/***************************************************************
**************** 
* 
* Kean University 
* Spring 2023 
* Course: CPS2231 - Computer Programming 
*  
* Author: Ben Abraham, *02 
*  
* Homework 1 
* Program Description: Kean Email Generator (x5)
****************************************************************
*********/
public class Assigment_1 {

	public static void main(String[] args) {
		//scanner to allow input
		Scanner input = new Scanner (System.in);
		
		//for loop to ask info x5
		for(int i = 1; i<=5; i++) {
			System.out.println("Enter your first name:");
			String firstname = input.next();
			
			System.out.println("Enter your last name: ");
			String lastname = input.next();
			//calling the methods back as "email" and "Password"
			String email = generateEmail(firstname); 
			int  password = generatePassword();
			
			//displaying as a table 
			System.out.println("Full name                 " + " Kean Email                         " + "Password");
			System.out.println(firstname + " " + lastname + "              "  + email + lastname.toLowerCase() + "@kean.edu" + "      "   +"               "  + password);

		}//loop
		

	}//main
	
	//email method
	static String generateEmail(String firstname) {
		
		//taking the first letter and passing it as "email"
		String email = firstname.substring(0,1).toLowerCase();
		return email;
		
	}//method1
	
	//password method
	static int generatePassword() {
		
		//temprary password, random int 
		int password = (int)(100000 + (Math.random() *900000));
		
		//return to main method
		return password;
		 
	}//method2

}//class
