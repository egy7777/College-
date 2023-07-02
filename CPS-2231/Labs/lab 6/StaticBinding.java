/*********************************************************************
* Kean University
* Semester Spring 23
* Course: CPS*2231 - Computer Programming
* Author: Ben Abraham
* Lab: 6
* Program Description: Test Java polymorphism
*********************************************************************/

package Lab6;


	class Person {
	public static void speak() {
	System.out.println("Person speaks");
	
	}
}
	class Teacher extends Person {
		public static void speak()
{
			System.out.println("Teacher speaks");
	}
}
	public class StaticBinding {
		public static void main ( String args[ ])
{
			// Reference is of Person type and object is Teacher type
			Person obj = new Teacher();
			obj.speak();
			
			//Reference and object both are of Person type.
			Person obj2 = new Person();
			obj2.speak();
	}
}