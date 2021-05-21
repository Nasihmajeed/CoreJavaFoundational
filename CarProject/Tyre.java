import java.util.Scanner;
public class Tyre {
Scanner input=new Scanner(System.in);
String tyreType;
public void inputDetails(){
  System.out.println("Enter Tyre Type");
  tyreType=input.nextLine();
}
public void printDetails(){
  System.out.println("4 Tyre Type of "+tyreType+"is fixed to car \n Tyre is Rolling");
  }
}