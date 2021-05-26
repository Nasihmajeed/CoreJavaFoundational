import java.util.Scanner;

public class Car{
String name,color;
Scanner input=new Scanner(System.in);


Engine engine;
Driver driver;
Tyre[] tyres=new Tyre[4];



//Tyre rearTyreRight;
//Tyre frontTyreLeft;
//Tyre frontTyreRight;
public void inputDetails(){

  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter car's color");
color=input.nextLine();
this.engine.inputDetails();
//tyre= new Tyre[4];
this.tyres[0].inputDetails();
this.tyres[1].inputDetails();
this.tyres[2].inputDetails();
this.tyres[3].inputDetails();
this.driver.inputDetails();


           }
public void printDetails(){
  System.out.println("The Car's name is "+name+"\n Car's color is "+color);
 this.engine.printDetails();
this.tyres[0].printDetails();
this.tyres[1].printDetails();
this.tyres[2].printDetails();
this.tyres[3].printDetails();
this.driver.printDetails();
}
}