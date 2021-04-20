import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Hotel
{	
int sel;
static Scanner sc=new Scanner(System.in);

Admin a=new Admin();
User u=new User();

ArrayList<Drink> drinks = new ArrayList<Drink>();
ArrayList<Food> food = new ArrayList<Food>();

public void hotelDetails()
{
	System.out.println("..................................................................");
    System.out.println("........................Hotel NallaBakshanam .....................");
	System.out.println("..................................................Palakkad........");
    
	System.out.println("Are you Admin or the Customer ? ");
	System.out.println("1.Admin");
	System.out.println("2.Customer");
     sel=sc.nextInt();
     details();   
}

public void details()
{
	if(sel==1)
   {
	   System.out.println("Welcome Sir ! Please Enter Admin Credentials !!!");
	   a.authenticate();
   }
   else
   {
	u.customer();
   // o.customerOrder();	
   }
}

}