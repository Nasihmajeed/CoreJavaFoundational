import java.util.Scanner;
public class Tyre {
Scanner input=new Scanner(System.in);
String rearTyreLeft,rearTyreRight,frontTyreLeft,frontTyreRight;
public void inputDetails(){
  System.out.println("Enter Rear Tyre Left Type");
  rearTyreLeft=input.nextLine();
  System.out.println("Enter Rear Tyre Right Type");
  rearTyreRight=input.nextLine();
  System.out.println("Enter front Tyre left Type");
  frontTyreLeft=input.nextLine();
  System.out.println("Enter front Tyre right Type");
  frontTyreRight=input.nextLine();
}
public void printDetails(){
  System.out.println("Rear  Tyre left Type  is "+rearTyreLeft+"\nRear Tyre right Type is "+rearTyreRight+"\nFront Tyre Left type is "+frontTyreLeft+"\nFront Tyre Right type is "+frontTyreRight+"\n Tyres are Rolling");
  }
}