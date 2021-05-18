import java.util.Scanner;
public class Engine {
Scanner input = new Scanner(System.in);
String enginetype;
int enginemodel;
public void enginedetails(){
  System.out.println("Enter Engine Type ");
enginetype=input.nextLine();
System.out.println("Enter Engine model ");
enginemodel=input.nextInt();
input.nextLine();
}
public void printenginedetails(){
  System.out.println("The Engine Model of the car is :"+enginemodel+"\n The Engine Type of the Car is "+enginetype);
}
}
