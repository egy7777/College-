package Assigment_7;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Pet {
	private String name, species;
	private double price;
	private java.time.LocalDate birthday;
	
	//default constructor
	public Pet() {}
	
	//constructor 
	public Pet(String name, String species, LocalDate birthday, double price) {
		this.name = name;
		this.species = species;
		this.birthday = birthday;
		this.price = price;
	}
	//getters
	public String getName() {
		return name;
	}
	//getters
	public java.time.LocalDate getBirthday(){
		return birthday;
	}
	//getters
	public double getPrice() {
		return price;
	}
	//getters
	public String getSpecies() {
		return species;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	//setters
	public void setBirthday(java.time.LocalDate birthday) {
		this.birthday = birthday;
	}
	//setters
	public void setPrice(double price) {
		this.price = price;
	}
	//setters
	public void setSpecies(String species) {
		this.species = species;
	}
	//ToString
	public String toString() {
		return "Pet name: " + name + "\nBirthday: " + birthday + "\nPrice: " + price + "\nSpecies: " + species;
	}
}




//Dog or Cat class (subclass)
class DogOrCat extends Pet {
	private String breed;

	public DogOrCat(String name, java.time.LocalDate birthday, double price, String species, String breed) {
		super(name, birthday, price, species, breed);
		this.breed = breed;
	}
	//getter
	public String getBreed() {
		return breed;
	}
	// setter
	public void setBreed() {
		this.breed = breed;
	}
	//toString
	public String toString() {
		return breed;
	}
}




//Reptile class (subclass)
class Reptile extends Pet {
	private String bloodType;

	public Reptile(String name, java.time.LocalDate birthday, double price, String species, String bloodType) {
		super(name, birthday, price, species);
		this.bloodType = bloodType;
	}
	//getter
	public String getBloodType() {
		return bloodType;
	}
	
	// setter
	public void setBloodType() {
		this.bloodType = bloodType;
	}
	
	//toString
	public String toString() {
		return bloodType;
	}
}




//Bird class (subclass)
class Bird extends Pet {
	private String MovementType;

	public Bird(String name, java.time.LocalDate birthday, double price, String species, String MovementType) {
		super(name, birthday, price, species);
		this.MovementType = MovementType;
	}
	//getter
	public String getMovementType() {
		return MovementType;
	}
	
	// setter
	public void setMovementType() {
		this.MovementType = MovementType;
	}
	
	//toString
	public String toString() {
		return MovementType;
	}
}



//Rabbit or small animal class
class RabbitOrSmallAnimal extends Pet {
	private boolean itBites;

	public RabbitOrSmallAnimal(String name, java.time.LocalDate birthday, double price, String species, boolean itBites) {
		super(name, birthday, price, species);
		this.itBites = itBites;
	}
	//getter
	public boolean getItBites() {
		return false;
	}
	
	// setter
	public void setItBites() {
		this.itBites = itBites;
	}
	
	//toString
	public String toString() {
		return ""+itBites;
	}
}




// public class xxxx_program, you main method is in here
public class garcifre_program {
	
	static Pet [] petArr = new Pet[140];
	public static void main(String[] args) throws Exception {
		arrayPets();
		sort(petArr);
		printArray(petArr);
	}
	
	//Creates an array of pets from the file
	public static void arrayPets() throws IOException, InputMismatchException {
		Scanner input = new Scanner(new File("C:\\Users\\freil\\OneDrive\\Documents\\JAVA\\Assignment7\\input.csv"));
		input.useDelimiter(",");
		int num = Integer.parseInt(input.next());
		int i = 0;
		while(input.hasNext()) {
			String name = input.next();
			
			//Birthday
			String Birthday = input.next();
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
			LocalDate bd = LocalDate.parse(Birthday, formatter);
			
			//price
			double price = input.nextDouble();
			
			//Species
			String species = input.next();
			
			//Special Feature
			String specialFeature = input.next();
			
			switch(species) {
			case "Bird": petArr[i] =  new Bird(name, bd, price, species, specialFeature);break;
			
			case "Reptile": petArr[i] =  new Reptile(name, bd, price, species, specialFeature);break;
			
			case "Rabbit": petArr[i] =  new RabbitOrSmallAnimal(name, bd, price, species, Boolean.getBoolean(specialFeature));break;
			
			case "Small Animal": petArr[i] =  new RabbitOrSmallAnimal(name, bd, price, species, Boolean.getBoolean(specialFeature));break;
			
			case "Dog": petArr[i] =  new DogOrCat(name, bd, price, species, specialFeature);break;
			
			default: petArr[i] =  new DogOrCat(name, bd, price, species, specialFeature);
			}
			i++;
		}
	}
	
	//Sorts the array
	public static void sort(Pet[] petArr) {

	   for(int i = 0; i < petArr.length; i++){

         double minPrice = petArr[i].getPrice();
         
         int minPriceIndex = i;

         for(int j = i; j < petArr.length; j++){   

            if(minPrice > petArr[j].getPrice()){
               minPrice = petArr[j].getPrice();
               minPriceIndex = j;
            }
         }
         // swap
         if (minPriceIndex != i) {
            Pet temp = petArr[minPriceIndex];
            petArr[minPriceIndex] = petArr[i];
            petArr[i] = temp;
            
         }
      }
	}
	
	//Print
	public static void printArray(Pet[] petArr) {
      for(int i = 0; i < petArr.length; i++){
         if (i % 40 == 0){
            System.out.println("Number of animals: " + petArr.length);
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Pet name", "Birthday", "Price", "Species Type", "Special Feature");
            System.out.println("...............................................................................................");
         }
         
         System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", petArr[i].getName(), petArr[i].getBirthday(), petArr[i].getPrice(), petArr[i].getSpecies(), petArr[i].toString());
      }
	}

}