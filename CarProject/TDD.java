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
System.out.println("\n");




Tyre tyre1 = new Tyre();

c.T1 = tyre1;
Tyre tyre2 = new Tyre();
c.T2 = tyre2;
Tyre tyre3 = new Tyre();
c.T3 = tyre3;
Tyre tyre4 = new Tyre();
c.T4 = tyre4;

System.out.println("Enter the Tyre Brand" + i + "-1:");
tyre1.Br = sc.nextLine();
System.out.println("Enter the Tyre Position" + i + "-1:");
tyre1.Po = sc.nextLine();
System.out.println("Enter the Tyre Radius" + i + "-1:");
tyre1.R = sc.nextLine();
System.out.println("\n");

System.out.println("Enter the Tyre Brand" + i + "-2:");
tyre2.Br = sc.nextLine();
System.out.println("Enter the Tyre Position" + i + "-2:");
tyre2.Po = sc.nextLine();
System.out.println("Enter the Tyre Radius" + i + "-2:");
tyre2.R = sc.nextLine();
System.out.println("\n");

System.out.println("Enter the Tyre Brand" + i + "-3:");
tyre3.Br = sc.nextLine();
System.out.println("Enter the Tyre Position" + i + "-3:");
tyre3.Po = sc.nextLine();
System.out.println("Enter the Tyre Radius" + i + "-3:");
tyre3.R = sc.nextLine();
System.out.println("\n");

System.out.println("Enter the Tyre Brand" + i + "-4:");
tyre4.Br = sc.nextLine();
System.out.println("Enter the Tyre Position" + i + "-4:");
tyre4.Po = sc.nextLine();
System.out.println("Enter the Tyre Radius" + i + "-4:");
tyre4.R = sc.nextLine();
System.out.println("\n");




System.out.println("*************************");



c.printDetails();



System.out.println("_________________________");
}
}
}


