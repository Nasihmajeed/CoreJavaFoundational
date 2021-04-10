import java.util.*;
import java.util.Scanner;
import java.util.Iterator;

class Admin
{	
    String admName="Sai Krishna Prasad";
	
	String username,pwd;
	String fud,drk,newFud,newDrk;
	
	int select,qy,foodOrDrink,num;
    int fudQty,fudNum,drkNum;
	int newFudQty,newDrkQty;
	
	float pr,fudPrc,newFudPrc,newDrkPrc;
	
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
	  System.out.println("---------------------------------------------------------");
	  System.out.println("---------------------------------------------------------");
	  System.out.println("1.Add Food Item/Drinks ");
	  System.out.println("2.Update/Edit");
	  System.out.println("3.Remove/Delete");
	  System.out.println("4.View Food Items/Drinks");
      System.out.println("---------------------------------------------------------");
		
		select=sc.nextInt();

		switch (select)
		        {
			      case 1: 
				              System.out.println("What do you want to add ?..............1.Food item ........... 2.Drink");
				              foodOrDrink=sc.nextInt();
						      if(foodOrDrink==1)
                                 addFoods(food);
				             else
						         addDrinks(drinks);
						     break;
				
			      case 2: 
              				   System.out.println("You are about to Update the List");	
                               updateList(food,drinks);		
		                      break;
			     
				 case 3:  
				             System.out.println("So..... You want to Removean item from the List");
                             removeItems(food,drinks);
                             break;
				
				 case 4: 
              				 System.out.println("...........................................................View the MENU LIST........................................................");				
                             viewList(food,drinks);
				             break;
				}			
   }				

public void addFoods(ArrayList<Food> food)                                         // adding food items to menu
  {
	System.out.println("How many food items do you want to add?");
     num=sc.nextInt();     //number of items to be added
	 int j=food.size();
	 
	 for(int i=0;i<num;i++)
	 {
		 System.out.println("Enter the name of the food item : ");
		 fud=sc.nextLine();
		System.out.println("The food item you just added is :"+fud); 
		food.add(new Food());
		food.get(j).setFoodName(fud);
		
		
		System.out.println("Enter the Quantity of food Item :");
		 qy=sc.nextInt();
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
			   Food fd=itr.next();
			   System.out.println(fd);
		   }		   
}

public void addDrinks(ArrayList<Drink> drinks)                                                      // adding drinks to menu
{
	System.out.println("How many drinks do you want to add?");
     num=sc.nextInt();     //number of drinks to be added
	  int k=drinks.size();
	  
	 for(int i=0;i<num;i++)
	 {
		 System.out.println("Enter the name of the drink : ");
		 drk=sc.nextLine(); 
		drinks.add(new Drink());
		drinks.get(k).setDrinkName(drk);
		
		
		System.out.println("Enter the Quantity of drink to be added:");
		 qy=sc.nextInt();
		 drinks.add(new Drink());
	    drinks.get(k).setDrinkQty(qy);
		
		System.out.println("Enter the price of drink : ");
		 pr=sc.nextFloat();
		 drinks.add(new Drink());
		drinks.get(k).setDrinkPrice(pr);
		
		k++;
	 }
	
	System.out.println("The List after addition of new Drinks is : ");  //menu after adding new drink items
           
		   Iterator itr=drinks.iterator();                       //printing arraylist using Iterator
		   while(itr.hasNext())
		   {
			   Drink dk=itr.next();
			   System.out.println(dk);
		   }		   
}

public void updateList(ArrayList<Food> food, ArrayList<Drink> drinks)                                                                           //updating the menu list 
{

System.out.println("Which List do you want to update ?........1.Food Or 2.Drinks");
select=sc.nextInt();

switch(select)
                 {         //Food list update
				     case 1: 
				              System.out.println("Enter the food item number you want to update");      
				              fudNum=sc.nextInt();
							  int w=fudNum-1;
							  
							  System.out.println("Enter the name of new Food item :");
							  newFud=sc.nextLine();
							  System.out.println("New Food Item : "+newFud);

                              System.out.println("Enter the Quantity of new Food item :");
							  newFudQty=sc.nextInt();
							  System.out.println("New Food Quantity : "+newFudQty);							  
							  
							  System.out.println("Enter the price of new Food item :");
							  newFudprc=sc.nextFloat();
							  System.out.println("New Food Item : "+newFudprc);
							  
							  food.get(w).setFoodName(newFud);
							  food.get(w).setFoodQty(newFudQty);
							  food.get(w).setFoodPrice(newFudPrc);
							  
							  System.out.println("-------.........................................Updated List.....................................-------");
							        Iterator itr=food.iterator();
		                            while(itr.hasNext())
		                                   {
			                                 Food fd=itr.next();
			                                 System.out.println(fd);
		                                   }
				//Drinks list update	  
			     case 2:  
				              System.out.println("Enter the existing drink you want to replace");
				              drkNum=sc.nextInt();
							  int w=drkNum-1;
							  
							  System.out.println("Enter the name of new Drink :");
							  newDrk=sc.nextLine();
							  System.out.println("New Drink : "+newDrk);

                              System.out.println("Enter the Quantity of new Drink :");
							  newDrkQty=sc.nextInt();
							  System.out.println("New Drink Quantity : "+newDrkQty);							  
							  
							  System.out.println("Enter the price of new Drink :");
							  newDrkprc=sc.nextFloat();
							  System.out.println("New Drink Price : "+newFudprc);
							  
							  drinks.get(w).setDrinkName(newDrk);
							  drinks.get(w).setDrinkQty(newDrkQty);
							  drinks.get(w).setDrinkPrice(newDrkPrc);
							  
							  System.out.println(".........................................Updated List...............................");
							        Iterator itr=drinks.iterator();
		                            while(itr.hasNext())
		                                   {
			                                 Drink dk=itr.next();
			                                 System.out.println(dk);
		                                   }	
				        }
		}
							   
public void removeItems(ArrayList<Food> food, ArrayList<Drink> drinks)
 {
	System.out.println("Which item do you want to remove from Menu List?............... 1.Food..........2.Drink");
    select=sc.nextInt();
	
	switch(select)
	{
		case 1:
		           System.out.println("Enter the name of food item you want to remove");
		           fud=sc.nextLine();
		           if(food.contains(fud))
		           {
			         int index=food.indexOf(fud);
			         food.remove(index);
					System.out.println("List after removal of the Food Item is :"); 
					 Iterator itr=food.iterator();
		                            while(itr.hasNext())
		                                   {
			                                 Food fd=itr.next();
			                                 System.out.println(fd);
		                                   }
				    }
		          else
				  {
					System.out.println("The List does not contain the item to remove");  
				  }
		          	
	     case 2:
	               System.out.println("Enter the name of the drink you want to remove");
		           drk=sc.nextLine();
		           if(drinks.contains(drk))
		           {
			         int index=drinks.indexOf(drk);
			         drinks.remove(index);
					 System.out.println("List after removal of the the drink is :"); 
					 Iterator itr=drinks.iterator();
		                            while(itr.hasNext())
		                                   {
			                                 Drink dk=itr.next();
			                                 System.out.println(dk);
		                                   }
				   }
		         else
				 {
		            System.out.println("The List does not contain the drink to remove");			 
				 }		 
		 
	}
}

public void viewList(ArrayList<Food> food, ArrayList<Drink> drinks)
{
	System.out.println("..................................................Food List.................................................");
	                               Iterator it=food.iterator();
		                            while(it.hasNext())
		                                   {
			                                 Food fd=it.next();
			                                 System.out.println(fd);
		                                   }
		System.out.println("------------------------------------------------------------------------");
	
    System.out.println("..................................................Drinks List.................................................");	
	 Iterator iter=drinks.iterator();
		                            while(iter.hasNext())
		                                   {
			                                 Drink dk=iter.next();
			                                 System.out.println(dk);
		                                   }
	System.out.println("------------------------------------------------------------------------");						   
}
}

	

