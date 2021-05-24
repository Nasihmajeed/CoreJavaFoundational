import java.util.Scanner;
public class Driver{
Scanner input=new Scanner(System.in);
String passangerLicense;
public void inputDetails(){
  System.out.println("Enter whether  car's passanger have licence \n Enter \n  YES OR NO");
  passangerLicense=input.nextLine();

}

public void printDetails()
{
if(passangerLicense.equals("YES"))

System.out.println("Passenger can drive\n***************");

else 

System.out.println("only driver can drive\n***************");

}
}