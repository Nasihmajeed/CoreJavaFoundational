public class Car  {

String model;
String brand;
String registerno;
String colour;
String price;
Tyre t1,t2,t3,t4;


public void printDetails()   {

System.out.println("Car Model:" + this.model);
System.out.println("Car Brand:" + this.brand);
System.out.println("Car Register number:" + this.registerno);
System.out.println("Car colour:" + this.colour);
System.out.println("Car price:" + this.price);
System.out.println("\n");
System.out.println("\n");

 t1.brand = "appollo";
t1.position = "Front Right";
t1.radius = "5";

t2.brand = "appollo";
t2.position = "Front Left";
t2.radius = "5";

t3.brand = "appollo";
t3.position = "Back Right";
t3.radius = "5";

t4.brand = "appollo";
t4.position = "Back Left";
t4.radius = "Back Right"; 

}

public Tyre tyreDetails()  {

t1.printDetails();
t2.printDetails();
t3.printDetails();
t4.printDetails();

  
}
}