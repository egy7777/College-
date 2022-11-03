//word comparer		
import java.util.Scanner;
public class Class_11_3 {

	public static void main(String[] args) {	
	Scanner input = new Scanner (System.in);

	System.out.println("please enter word1>>word2");
	String word1=input.next();
	String word2=input.next();

	if(word1.compareTo(word2)>0) {
	System.out.println(word1+">"+word2);
	System.out.println("The result= "+word1.compareTo(word2));
	}
		
	else if (word1.compareTo(word2)<0) {
	System.out.println(word1+"<"+word2);
	System.out.println("The result= "+word1.compareTo(word2));

	}
	else {
	System.out.println(word1 +"=="+ word2 );
	System.out.println("The result= "+word1.compareTo(word2));
	}


		
	}
	
	

}
