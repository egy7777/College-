package assigments;

import java.util.Scanner;

public class Assigment3 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		
		int size; 
		
		
		System.out.println("Please enter measurement to retrieve size ");
		size=input.nextInt();
		 
	String sizeWaist = "";
		
		switch(size) {
		
		case 29 :
			sizeWaist= ("small");
			break;
	
	
		case 42 :
			sizeWaist= ("Medium");

			break; 
	
	
		case 44 :
			sizeWaist=("Large");

			break;
	
	
		case 48 :
			sizeWaist=("Extra Large");

			break;

	
default:
	sizeWaist="unkown";


}
		
		System.out.println("you're size is "+sizeWaist);	
		
		
		
		
		//case 29
		//case 42
		//case 44
		//case 48
		//default unkown
		//print size

	}

}
