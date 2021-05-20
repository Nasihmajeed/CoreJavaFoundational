import java.util.Scanner;

public class Car{
String name;
Scanner input=new Scanner(System.in);


Engine firstCarEngine;
Engine secondCarEngine;


Driver firstCarDriver;
Driver secondCarDriver;
Tyre firstCarTyreType;
Tyre secondCarTyreType;
Color firstCarColor;
Color secondCarColor;

public void carDetails(){
  System.out.println("Enter Car's name");
name=input.nextLine();



           }
public void printCarDetails(){
  System.out.println("The Car's name is "+name);

}
}

