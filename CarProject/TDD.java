import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);


for(int i = 1; i <=3; i++) {

Car c = new Car();

System.out.println("car : " +i); 
System.out.println("Enter the Brand" + i + ":");
c.B = sc.nextLine();
System.out.println("Enter the Model" + i + " :");
c.M = sc.nextLine();
System.out.println("Enter the Register number" + i + " :");
c.RN = sc.nextLine();
System.out.println("Enter the Colour " + i + ": ");
c.C = sc.nextLine();
System.out.println("Enter the Price " + i + ":");
c.P = sc.nextLine();
System.out.println("*************************");

Tyre tyre = new Tyre();

c.T1 = tyre;
Tyre tyre2 = new Tyre();
c.T2 = tyre2;
Tyre tyre3 = new Tyre();
c.T3 = tyre3;
Tyre tyre4 = new Tyre();
c.T4 = tyre4;



c.printDetails();



System.out.println("_________________________");
}
}
}


