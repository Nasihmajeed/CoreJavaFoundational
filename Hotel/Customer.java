import java.util.*;
import java.util.Scanner;

class Customer
{
Scanner sc=new Scanner(System.in);
String cname;


public void customerName()
{
	System.out.println("Enter your name :");
	cname=sc.nextLine();
	System.out.println("Welcome to Arabian Grills mr/mrs. : "+cname);
}

}