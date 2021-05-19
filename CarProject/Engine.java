import java.util.Scanner;
public class Engine {
Scanner input = new Scanner(System.in);
String engineType;
int engineModel;
public void engineDetails(){
  System.out.println("Enter Engine Type ");
engineType=input.nextLine();
System.out.println("Enter Engine model ");
engineModel=input.nextInt();
input.nextLine();
}
public void printEngineDetails(){
  System.out.println("The Engine Model of the car is :"+engineModel+"\n The Engine Type of the Car is "+engineType);
}
}

