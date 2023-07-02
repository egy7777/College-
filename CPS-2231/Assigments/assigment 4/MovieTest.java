/***************************************************************
	**************** 
	* Kean University 
	* Spring 2023 
	* Course: CPS*2231 - Computer Programming 
	* Author: Ben Abraham 
	* Homework: 4, part 4
	* Program Description: 
	**************************************************************
	***********/ 
package Assigments;

public class MovieTest {

	public static void main(String[] args) {

		Movie movie1 = new Movie();
        Movie movie2 = new Movie("tank", 2001, "Tim Robbins", "Frank senatra");

        	movie1.setName("Shrek");
	        movie1.setYear(0);
	        movie1.setLeadActor("Martin Lawrence");
	        movie1.setDirector("Tom Cruise");

	        // print both objects
	        System.out.println("Movie 1: " + movie1);
	        System.out.println("Movie 2: " + movie2);
			
	}

}
