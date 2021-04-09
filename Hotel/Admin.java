import java.util.*;
import java.util.Scanner;
import java.util.Iterator;

class Admin
{	
    String admName="Sai Krishna Prasad";
	
	String username,pwd,fud,drk;
	
	int foodOrDrink,num,select,j;
	
	float qy,pr;
	
	Scanner sc=new Scanner(System.in);
	
	Food fd=new Food();
	Drink dk=new Drink(); 
	
	ArrayList<Food> food = new ArrayList<Food>();
	ArrayList<Drink> drinks = new ArrayList<Drink>();
	
	
	//Admin authentication
	
	public void admAuthenticate()
	{
	System.out.println("You are the Admin with Name : "+admName);	
	System.out.println("Please Enter your UserName");
	username=sc.nextLine();
	
	if(username.equals("SaiSKP"))
	 {
		System.out.println("Username is Correct............Enter your Password");
		pwd=sc.nextLine();
		if(pwd.equals("skp@7"))
		       {
				   System.out.println("UserName and Password Verified......Welcome Sai krishna");
				  
				   admOperations();
			   
			   }
			   else
			   {
				   System.out.println("Incorrect Password ! Please try again");
			   }
	 }
	else
	{
		System.out.println("Sorry..................Username Invalid ! Enter valid Username");
	}
    }
		
//Admin can do CRUD operations		

  public void admOperations()
  {
	  System.out.println("SELECT THE OPERATION U WANT TO PERFORM");
	  System.out.println("1.Add Food Item/Drinks ");
	  System.out.println("2.Update/Edit");
	  System.out.println("3.Remove/Delete");
	  System.out.println("4.View Food Items/Drinks");

		select=sc.nextInt();

		switch (select)
		        {
			      case 1: System.out.println("You want to add a 1.Food item OR 2.Drink");
				              foodOrDrink=sc.nextInt();
						   if(foodOrDrink==1)
                                 addFoodToMenuCard(food);
				           else
						         addDrinkToMenucard(drinks);
						   break;
				
			      case 2:  System.out.println("You are about to Update the List");	
                          
						  updateTheList();		
		                   break;
			      }
				
				/*
				case 3:  System.out.println("So..... You want to Remove from the List");
                             removeItems();
                           break;
                  case 4:  System.out.println("So....You want to View the List");				
                                 viewList();
				           break;
				*/
  }
				
				
  public void addFoodToMenuCard(ArrayList<Food> food)
 {
	System.out.println("How many food items do you want to add?");
     num=sc.nextInt();     //number of items to be added
	 j=food.size();     // size of arraylist
	 
	 for(int i=0;i<num;i++)
	 {
		 System.out.println("Enter the name of the food item : ");
		 fud=sc.nextLine();
		System.out.println("The food item you just added is :"+fud); 
		food.add(new Food());
		food.get(j).setFoodName(fud);
		
		
		System.out.println("Enter the Quantity of food Item :");
		 qy=sc.nextFloat();
		 System.out.println("You want to enter "+qy+" items to the List");
	    food.get(j).setFoodQty(qy);
		
		System.out.println("Enter the price of food item : ");
		 pr=sc.nextFloat();
		System.out.println("Price of the food Item is :"+pr);
		food.get(j).setFoodPrice(pr);
		
		j++;
	 }
	
	System.out.println("The List after addition of new Items is : ");  //menu after adding new food items
           
		   Iterator itr=food.iterator();                       //printing arraylist using Iterator
		   while(itr.hasNext())
		   {
			   Object obj=itr.next();
			   System.out.println(obj);
		   }		   

}

public void addDrinkToMenucard(ArrayList<Drink> drinks)
{
	System.out.println("How many drinks do you want to add?");
     num=sc.nextInt();     //number of drinks to be added
	 j=drinks.size();     // size of arraylist
	 
	 for(int i=0;i<num;i++)
	 {
		 System.out.println("Enter the name of the drink : ");
		 drk=sc.nextLine();
		System.out.println("The drink you just added is :"+drk); 
		drinks.add(new Drinks());
		drinks.get(j).setDrinkName(drk);
		
		
		System.out.println("Enter the Quantity of Drinks :");
		 qy=sc.nextFloat();
		 System.out.println("You want to enter "+qy+" drinks to the List");
	    drinks.get(j).setDrinkQty(qy);
		
		System.out.println("Enter the price of drink : ");
		 pr=sc.nextFloat();
		System.out.println("Price of the drink is :"+pr);
		drinks.get(j).setDrinkPrice(pr);
		
		j++;
	 }
	
	System.out.println("The List after addition of new Drinks is : ");  //menu after adding new food items
           
		   Iterator itr=drinks.iterator();                       //printing arraylist using Iterator
		   while(itr.hasNext())
		   {
			   Object obj=itr.next();
			   System.out.println(obj);
		   }		   
}


public void updateTheList()
{
System.out.println("Which List do you want to update ?........1.Food Or 2.Drinks");
select=sc.nextInt();

switch(select)
             {
				 case 1: System.out.println("Enter the food item you want to replace");
				              fud=sc.nextLine();
							  
							  System.out.println("Enter the food Qty for the newly updated food");
							  fudQty=sc.nextInt();
							  
							  System.out.println("Enter the reversed food price");
							  fudPrc=sc.nextFloat();
							  
							  int index=food.indexOf(fud);
							  System.out.println("Enter the item with which you want to replace");
							  
							  
			     case 2: System.out.println("Enter the drink you want to replace");
				              drk=sc.nextLine();
			 }
}


}
/*
public void removeItems()
{
	
}

public void viewList()
{
	
}

*/
	

