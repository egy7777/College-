package Lab6;

class Person1 {
public void speak()
{
System.out.println("Person speaks");
}
}
class Teacher1 extends Person1 {
@Override
public void speak()
{
System.out.println("Teacher speaks");
}
}
public class DynamicBinding {
public static void main ( String args[ ])
{
// Reference is of Person type and object is Teacher type
Person1 obj = new Teacher1();
obj.speak();
//Reference and object both are of Person type.
Person1 obj2 = new Person1();
obj2.speak();
}
}