package Lab7;

import java.util.Random;

public class Codingproblem extends Problem {
	private String programmingLanguage; 
	
	
	public Codingproblem(int input, String output, String algorathim, String programmingLanguage){
		super (input,output, algorathim);
		this.programmingLanguage=programmingLanguage; 
		}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	@Override
	public String toString() {
		return "Codingproblem [programmingLanguage=" + programmingLanguage + ", getProgrammingLanguage()="
				+ getProgrammingLanguage() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 public static void main(String[] args) {
	        // random int from 0 to 100
	        int num = (int)(Math.random()*100);

	        // new instance of the CodingProblem 
	        Problem problem1 = new Codingproblem(num, "Your lucky number is: " + num, "Algorithm 1", "Java");

	        // new instance of the MathProblem class with random input, its square (power of 2) as an output, your algorithm, and random difficultyLevel
	        Problem problem2 = new MathProblem(num, num * num, "Algorithm 2", new Random().nextInt(5) + 1);

	        // Display
	        System.out.println("Problem 1: " + problem1.toString());
	        System.out.println("Problem 2: " + problem2.toString());

	        // getFinalAnswer() method 
	        System.out.println("Problem 1 final answer: " + problem1.getFinalAnswer());
	        System.out.println("Problem 2 final answer: " + problem2.getFinalAnswer());
	    }
	}
	

