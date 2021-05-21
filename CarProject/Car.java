import java.util.Scanner;

public class Car{
String name,color;
Scanner input=new Scanner(System.in);


Engine engine;
Driver driver;
Tyre tyre;
public void inputDetails(){
  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter car's color");
color=input.nextLine();
this.engine.inputDetails();
this.tyre.inputDetails();
this.driver.inputDetails();


           }
public void printDetails(){
  System.out.println("The Car's name is "+name+"\n Car's color is "+color);
 this.engine.printDetails();
 this.tyre.printDetails();
this.driver.printDetails();
}
}