import java.util.Scanner;
public class Tyre {
Scanner input=new Scanner(System.in);
String tyreType;
public void tyreDetails(){
  System.out.println("Enter Tyre Type");
  tyreType=input.nextLine();
}
public void printTyreDetails(){
  System.out.println("car's Tyre Type is: "+tyreType+"\n Tyre is Rolling");
  }
}