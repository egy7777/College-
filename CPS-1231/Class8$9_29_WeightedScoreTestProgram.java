import java.util.Scanner;

public class Class8$9_29_WeightedScoreTestProgram {

	public static void main(String[] args) {
Scanner input= new Scanner (System.in);
		
		
		int testNumber,score;
		double weightedScore; 
		
		
		System.out.println("please enter test scores");
		testNumber=input.nextInt();
		score=input.nextInt();
		
		
			switch(testNumber) {
		
				case 1 :
					weightedScore=score*0.10;
					break;
			
			
				case 2 :
					weightedScore=score*0.2;

					break; 
			
			
				case 3 :
					weightedScore=score*0.2;

					break;
			
			
				case 4 :
					weightedScore=score*0.15;

					break;
			
			
				case 5 :
					weightedScore=score*0.15;

					break;
			
			
				case 6 :
					weightedScore=score*0.2;

					break;
	
			
		default:
			weightedScore=0;
		
		
		}// end of switch
			
			if (weightedScore==0)
				System.out.println("Score is not valid");
			else
				System.out.println("a score of "+score+testNumber+"gives a weighted score of "+weightedScore);

		
			
			
				
	}

}
