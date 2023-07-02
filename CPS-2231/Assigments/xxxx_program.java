import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

// Required Classes:

class Pet {
}


class DogOrCat extends Pet {
}

class Reptile extends Pet {

}
class Bird extends Pet {

}


class RabbitOrSmallAnimal extends Pet {

}


// public class xxxx_program, you main method is in here
public class xxxx_program {
	
	static Pet [] petArr = new Pet[140];
	public static void main(String[] args) throws Exception {
		arrayPets();
		sort(petArr);
		printArray(petArr);
	}
	
	//Creates an array of pets from the file
	public static void arrayPets() throws IOException, InputMismatchException {
		
	 }
	
	//Sorts the array
	public static void sort(Pet[] petArr) {
	
	}
	
	//Prints the array
	public static void printArray(Pet[] petArr) {
		
	}

}
