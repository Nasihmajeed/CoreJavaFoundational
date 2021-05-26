import java.util.Scanner;

public class Car{
String name,color;
Scanner input=new Scanner(System.in);


Engine engine;
Driver driver;
Tyre[] tyres=new Tyre[4];




public void inputDetails(){

  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter car's color");
color=input.nextLine();
this.engine.inputDetails();
//tyre= new Tyre[4];
for(int num=0;num<=3;num++){
this.tyres[num].inputDetails();
}
this.driver.inputDetails();


           }
public void printDetails(){
  System.out.println("The Car's name is "+name+"\n Car's color is "+color);
 this.engine.printDetails();
 for(int num=0;num<=3;num++){
  this.tyres[num].printDetails();
  }
this.driver.printDetails();
}
}