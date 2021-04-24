import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel
{
String hotelName="!!!!!!!!!!!!Arabian Grills!!!!!!!!!!!!!";
int select;
Scanner sc=new Scanner(System.in);

Admin a=new Admin();
Customer c=new Customer();

public void hotelDetails()
{
	System.out.println("-------------------------------------------------------------");
	System.out.println("==================================");
	System.out.println("-----------Welcome to"+hotelName+"------------------");
	System.out.println("==================================");
	System.out.println("-------------------------------------------------------------");
	System.out.println("Please enter 1. if you are the Admin");
	System.out.println("==================================");
	System.out.println("Please enter 2. if you are a Customer");
	System.out.println("==================================");
	select=sc.nextInt();
	switch(select)
	{
		case 1 : a.adminAuthenticate();
		case 2 : c.customerName();
		             a.customerOrder();
	}
}

}