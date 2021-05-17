import java.util.Scanner;
public class Car {
Scanner input=new Scanner(System.in);
String carname,doortype,tyretype;
Engine e1= new Engine();
Driver d1= new Driver();
public void data(){

 System.out.println("Enter name of the Car");
 carname=input.nextLine();
System.out.println("Enter the door type of the car");
 doortype=input.nextLine();
System.out.println("Enter the tyre type of the car");
tyretype=input.nextLine();
}
public void features(){
System.out.println("Enter the Engine type");
  e1.enginetype =input.nextLine();
  System.out.println("Enter the fuel type");
  e1.fueltype =input.nextLine();
  }
  public void license1(){
      System.out.println("Enter whether  car's passanger have licence \n Enter \n  YES OR NO");
  d1.PassangerLicense=input.nextLine();

  }
public void vehicle(){
  System.out.println("The Name of the car is "+carname);
  }
  public void door(){
    System.out.println("The door type of the car is "+doortype);
  }
  public void tyre(){
    System.out.println("The tyre type of the car is "+tyretype);
  }
public void features1(){
e1.engn();
d1.license();
System.out.println("**************************************");

  }
}
