import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class Hotel
{	
int sel;

ArrayList<Food> food = new ArrayList<Food>();
ArrayList<Drink> drinks = new ArrayList<Drink>();

Admin a=new Admin();
User u=new User();

Food f=new Food();
Drink d=new Drink();

Scanner sc=new Scanner(System.in);

public void hotelDetails()
{
	System.out.println("..................................................................");
    System.out.println("........................Hotel NallaBakshanam .....................");
	System.out.println("..................................................Palakkad........");
    
	System.out.println("Are you the Admin or the Customer ? ");
	System.out.println("1.Admin");
	System.out.println("2.Customer");
     sel=sc.nextInt();

   if(sel==1)
   {
	   System.out.println("Welcome Sir ! Please Enter Admin Credentials !!!");
	   
	   a.authenticate();
   }
   else if(sel==2)
   {
		u.authenticate();
   }
   else
   {
	System.out.println("Something went Wrong !!!!!");   
   }
}

}