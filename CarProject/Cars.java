import java.util.Scanner;
public class Cars {
String name,tyre,color;
Scanner input=new Scanner(System.in);
Engine enginenumber=new Engine();
Driver drivertype=new Driver();
public void cardetails(){
  System.out.println("Enter Car's name");
name=input.nextLine();
System.out.println("Enter Car's tyre type");
tyre=input.nextLine();
System.out.println("Enter Car's color ");
color=input.nextLine();
enginenumber.enginedetails();
drivertype.driverdetails();
}
public void printcardetails(){
  System.out.println("The Car's name is "+name+"\nThe Car's tyre type is "+tyre+"The Car's Color is "+color);
  enginenumber.printenginedetails();
  drivertype.printdriverdetails();
  System.out.println("**********************************");
}
}

