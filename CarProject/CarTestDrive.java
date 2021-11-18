import java.util.Scanner;

class Car 
{

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

public class CarTestDrive 
{

public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);

Car one = new Car();

one.name= "Mercedez Benz";

one.model= "C";

one.Regno= "KL 51 5511";

one.colour= "Black";


Car two = new Car();

two.name= "Maruthi";

two.model= "Swift";

two.Regno= "KL 09 T 2386";

two.colour= "Black";


Car three = new Car();

three.name= "Nissan";

three.model= "Sunny";

three.Regno= "KL 51 J 5455";

three.colour= "Black";


Car four = new Car();

four.name= "Renault";

four.model= "Kwid";

four.Regno= "KL 10 D 8979";

four.colour= "Black";



one.drive();

two.drive();

three.drive();

four.drive();

}
}