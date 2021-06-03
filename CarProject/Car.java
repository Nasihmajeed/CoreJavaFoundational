import java.util.Scanner;

public class Car{
String name,color;
Scanner input=new Scanner(System.in);


Engine engine;
Driver driver;
//Tyre[] tyres=new Tyre[4];



Tyre tyres0;
Tyre tyres1;
Tyre tyres2;
Tyre tyres3;
public void inputDetails(){

  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter car's color");
color=input.nextLine();
this.engine.inputDetails();
this.driver.inputDetails();
//tyre= new Tyre[4];
}
public void addTyre(){
this.tyres0.inputDetails();
this.tyres1.inputDetails();
this.tyres2.inputDetails();
this.tyres3.inputDetails();
}

public void printDetails(){
  System.out.println("The Car's name is "+name+"\n Car's color is "+color);
 this.engine.printDetails();
this.tyres0.printDetails();
this.tyres2.printDetails();
this.tyres2.printDetails();
this.tyres3.printDetails();
  
this.driver.printDetails();
}
}