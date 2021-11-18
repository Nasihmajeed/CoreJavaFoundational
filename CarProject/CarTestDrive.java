import java.util.Scanner;
class Car {
String name;
String model;
String Regno;
String colour;
void drive()
{
System.out.println(name);
System.out.println(model);
System.out.println(Regno);
System.out.println(colour);
System.out.println("Driving "+name+" "+model+" of colour "+colour+" with registration number "+Regno);
}
}
public class CarTestDrive {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Car one = new Car();
one.name= "Maruthi";
one.model= "Maruthi 800";
one.Regno= "Kl-09-AB-9003";
one.colour= "Red";
Car two = new Car();
two.name= "Honda";
two.model= "Amaze";
two.Regno= "Kl-09-AS-1134";
two.colour= "Black";
Car three = new Car();
three.name= "Fiat";
three.model= "Pundo";
three.Regno= "Kl-09-AS-3245";
three.colour= "Red";
Car four = new Car();
four.name= "Ambassador";
four.model= "Classic";
four.Regno= "Kl-09-AS-666";
four.colour= "Black";

one.drive();
two.drive();
three.drive();
four.drive();
}
}


 




