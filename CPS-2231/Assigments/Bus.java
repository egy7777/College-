package Assigments;

enum Color {
WHITE, YELLOW;
}
public class Bus {
public Color getColor(){
return Color.WHITE;
}
public static void main(String args[]){
Bus number1 = new Bus();
Bus number11 = new SchoolBus();
SchoolBus number111 = new SchoolBus();
System.out.println("The colors of my Buses are: \n" +
number1.getColor() + ", " + number11.getColor() + ", " +
number111.getColor());
SchoolBus myBus = (SchoolBus)(number1);
}
}
class SchoolBus extends Bus {
public Color getColor(){
return Color.YELLOW;
}
}