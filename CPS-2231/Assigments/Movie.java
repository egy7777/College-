/***************************************************************
	**************** 
	* Kean University 
	* Spring 2023 
	* Course: CPS*2231 - Computer Programming 
	* Author: Ben Abraham 
	* Homework: 4, part 3
	* Program Description: Movie
	**************************************************************
	***********/ 
package Assigments;

public class Movie {
	//data fields
	private String name,LeadActor, director;  
	private int year;
	
	public Movie() {
	}
	//object
	public  Movie(String name, int year,String LeadActor, String director ) {
		this.name= name;
		this.year=year;
		this.LeadActor=LeadActor; 
		this.director=director; 
		
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getLeadActor() {
		return LeadActor;
	}
	//setter
	public void setLeadActor(String leadActor) {
		LeadActor = leadActor;
	}
	//getter
	public String getDirector() {
		return director;
	}
	//setter
	public void setDirector(String director) {
		this.director = director;
	}
	//getter
	public int getYear() {
		return year;
	}
	//setter
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", LeadActor=" + LeadActor + ", director=" + director + ", year=" + year + "]";
	}


}
