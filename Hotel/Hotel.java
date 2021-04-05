import java.util.*;

public class Hotel
{
	
int sel;

Admin adm=new Admin();

Food fd=new Food();

ArrayList<Food> food = new ArrayList<Food>(); 

Scanner sc=new Scanner(System.in);

public void hotelDetails()
{
	System.out.println("........................................................................................................................................................");
    System.out.println("...................................................Hotel NallaBakshanam .........................................................");
	System.out.println(".................................................................................................Palakkad......................................");
    
	System.out.println("Are you the Admin or a Customer ? ");
	System.out.println("1.Admin");
	System.out.println("2.Customer");
     sel=sc.nextInt();

   if(sel==1)
   {
	   System.out.println("Welcome Sir!!!!!!!!!!!!You are the Admin!!!!!!!!!!");
	   
	   adm.admAuthenticate();
   }
   else
   {
	   System.out.println("Hi Sir/Madam!!!!!!!!!!!!!Welcome to Hotel Nalla Bakshanam!!!!!");
        System.out.println("We are happy to serve you......Please make your Order from the menu given below : ");
		
		fd.menuCard(food);
   }
}

}