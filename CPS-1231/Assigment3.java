package assigments;

import java.util.Scanner;

public class Assigment3 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		
		int size; 
		String sizeWaist = "";
		
		System.out.println("Please enter measurement to retrieve size ");
		size=input.nextInt();
		 
	
		switch(size) {
		
		case 29 :
			sizeWaist= ("Small");
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
	               sizeWaist="You're size is unkown";


}
		
		System.out.println("you're size is " +sizeWaist);	
		
		
		
		
		//case 29
		//case 42
		//case 44
		//case 48
		//default unkown
		//print size

		
	
		
//nts:needs.to.be.loop"try again"
	}

}
