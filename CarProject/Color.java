import java.util.Scanner;
public class Color {
Scanner input=new Scanner(System.in);
String carColor;
public void colorDetails(){
  System.out.println("Enter car's color");
  carColor=input.nextLine();
}
public void printColorDetails(){
  System.out.println("car's color is: "+carColor);
  }
}
