import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i<= 3; i++)  {
Car c = new Car();

System.out.println("car : " +i); 
System.out.println("Enter the Brand" + i + ":");
c.brand = sc.nextLine();
System.out.println("Enter the Model" + i + " :");
c.model = sc.nextLine();
System.out.println("Enter the Register number" + i + " :");
c.registerno = sc.nextLine();
System.out.println("Enter the Colour " + i + ": ");
c.colour = sc.nextLine();
System.out.println("Enter the Price " + i + ":");
c.price = sc.nextLine();
System.out.println("*************************");

Tyre tyre = new Tyre();

c.t1 = tyre;
Tyre tyre2 = new Tyre();
c.t2 = tyre2;
Tyre tyre3 = new Tyre();
c.t3 = tyre3;
Tyre tyre4 = new Tyre();
c.t4 = tyre4;



c.printDetails();
tyre.printDetails();
tyre2.printDetails();
tyre3.printDetails();
tyre4.printDetails();


System.out.println("_________________________");
}
}
}


