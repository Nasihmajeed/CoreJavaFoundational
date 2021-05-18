import java.util.Scanner;
public class Driver {
Scanner input=new Scanner(System.in);
String PassangerLicense;
public void driverdetails(){
  System.out.println("Enter whether  car's passanger have licence \n Enter \n  YES OR NO");
  PassangerLicense=input.nextLine();

}

public void printdriverdetails()
{
if(PassangerLicense.equals("YES"))

System.out.println("Passenger can drive\n");

else 

System.out.println("only driver can drive\n");
}
}
