import java.util.Scanner;

public class Car{
String name,tyre,color;
Scanner input=new Scanner(System.in);

//Engine enginenumber=new Engine();
Engine engine;

//Driver drivertype=new Driver();
Driver drive;

public void carDetails(){
  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter Car's tyre type");
tyre=input.nextLine();
System.out.println("Enter Car's color ");
color=input.nextLine();

engine = new Engine();
engine.engineDetails();

drive = new Driver();
drive.driverDetails();
           }
public void printCarDetails(){
  System.out.println("The Car's name is "+name+"\nThe Car's tyre type is "+tyre+"The Car's Color is "+color);
  engine.printEngineDetails();
drive.printDriverDetails();
}
}

