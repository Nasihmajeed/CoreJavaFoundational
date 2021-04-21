import java.util.*;
import java.util.Scanner;

class Admin
{
String admName="Sai Krishna",uname,pwd;
Scanner sc=new Scanner(System.in);
int admOption;

ArrayList<Food> foodItems=new ArrayList<Food>();
ArrayList<Drinks> drinkList=new ArrayList<Drinks>();
ArrayList orders=new ArrayList();

            //setting food and drink items into arraylists
{
	foodItems.add(new Food());
	foodItems.get(0).setFname("Dosa");
	foodItems.get(0).setFprice(8);
	
	foodItems.add(new Food());
	foodItems.get(1).setFname("Chapathi");
	foodItems.get(1).setFprice(10);
	
	foodItems.add(new Food());
	foodItems.get(2).setFname("Biriyani");
	foodItems.get(2).setFprice(120);
	
	foodItems.add(new Food());
	foodItems.get(3).setFname("Fried-Rice");
	foodItems.get(3).setFprice(75);
	
	foodItems.add(new Food());
	foodItems.get(4).setFname("Veg-Burger");
	foodItems.get(4).setFprice(45);

    drinkList.add(new Drinks());
	drinkList.get(0).setDname("Pepsi");
	drinkList.get(0).setDprice(50);
	
	drinkList.add(new Drinks());
	drinkList.get(1).setDname("Maa");
	drinkList.get(1).setDprice(70);
	
	drinkList.add(new Drinks());
	drinkList.get(2).setDname("Chocolate-Shake");
	drinkList.get(2).setDprice(80);
	
	drinkList.add(new Drinks());
	drinkList.get(3).setDname("Italian Coffee");
	drinkList.get(3).setDprice(60);
	
	drinkList.add(new Drinks());
	drinkList.get(4).setDname("Mirinda");
	drinkList.get(4).setDprice(45);
}
                                                                                               //printing those items
public void printMenu()
{
	System.out.println("===============================MENU========================");
	System.out.println("===========================================================");
    System.out.println("----------------------------------------------FOOD ITEMS----------------------------------------------");
    System.out.println("Food name : "+foodItems.get(0).getFname()+" Food price : "+foodItems.get(0).getFprice());
	System.out.println("Food name : "+foodItems.get(1).getFname()+" Food price : "+foodItems.get(1).getFprice());
	System.out.println("Food name : "+foodItems.get(2).getFname()+" Food price : "+foodItems.get(2).getFprice());
	System.out.println("Food name : "+foodItems.get(3).getFname()+" Food price : "+foodItems.get(3).getFprice());
	System.out.println("Food name : "+foodItems.get(4).getFname()+" Food price : "+foodItems.get(4).getFprice());
	System.out.println("===========================================================");
	System.out.println("===========================================================");
	
	System.out.println("===============================MENU========================");
	System.out.println("===========================================================");
    System.out.println("----------------------------------------------DRINK ITEMS---------------------------------------------");
    System.out.println("Food name : "+drinkList.get(0).getDname()+" Food price : "+drinkList.get(0).getDprice());
	System.out.println("Food name : "+drinkList.get(1).getDname()+" Food price : "+drinkList.get(1).getDprice());
	System.out.println("Food name : "+drinkList.get(2).getDname()+" Food price : "+drinkList.get(2).getDprice());
	System.out.println("Food name : "+drinkList.get(3).getDname()+" Food price : "+drinkList.get(3).getDprice());
	System.out.println("Food name : "+drinkList.get(4).getDname()+" Food price : "+drinkList.get(4).getDprice());
	System.out.println("===========================================================");
	System.out.println("===========================================================");
}



int ordr,qty,dqty,in;
String fud,drk,x;

public void customerOrder()
{
	System.out.println("Enter the item you want to order...............1.Food Item..........2.Drink.............");
	ordr=sc.nextInt();
	switch(ordr)
	                  {
						  case 1:       do{
											           System.out.println("Enter the name of food item you are ordering :");
						                               fud=sc.next();
													   System.out.println("Enter the quantity of food item you are ordering :");
											           qty=sc.nextInt();
														
														if(foodItems.contains(fud))
											             {  
														     in=indexOf(fud);
												             orders.add(foodItems.get(in));
											              }			
														  else
														  {
															System.out.println("Sorry......You have selected the wrong item");  
														  }
														  System.out.println("Do you want to order more food ?..........yes.........no.......");
														  x=sc.next();
													}while(x.equals("yes"));
						                     
						  case 2:         do{
											           System.out.println("Enter the name of the drink you are ordering :");
						                               drk=sc.next();
													   System.out.println("Enter the quantity of drink you are ordering :");
											           dqty=sc.nextInt();
														
														if(drinkList.contains(drk))
											             {  
														     in=indexOf(drk);
												             orders.add(drinkList.get(in));
											              }			
														  else
														  {
															System.out.println("Sorry......You have selected the wrong item");  
														  }
														  System.out.println("Do you want to order more drink ?..........yes.........no.......");
														  x=sc.next();
													}while(x.equals("yes"));  
					  }
}


//admin part


public void adminAuthenticate()
{
	System.out.println("Enter the Username of the Admin");
		uname=sc.nextLine();
		if(uname.equals("saiskp"))
		{
			System.out.println("Username Authenticated!!!");
			System.out.println("Enter the Admin Password");
			pwd=sc.nextLine();

			if(pwd.equals("sai"))
			{
				System.out.println("Password Perfect !!! Admin name is : "+admName);
			    adminOperations();
			}
			else
			{
				System.out.println("Incorrect Password !!! ");
			}
		}
		else
		{
			System.out.println("Username Invalid !!! Try Again !!!");
		}
}

public void adminOperations()
{
	System.out.println("Welcome Sai Krishna!!!!");
	System.out.println("You may ");
	System.out.println("1.Add Items to Menu");
	System.out.println("2.Update/Edit Existing menu");
	System.out.println("3.Delete Items from Menu");
	System.out.println("4.View Menu");
	admOption=sc.nextInt();
	switch(admOption)
	            {
		                   case 1:System.out.println("add");
						   case 2:System.out.println("update");
						   case 3: System.out.println("remove");
						   case 4: System.out.println("view");
						   default : System.out.println("Enter a valid Option!!!!");
	             }
}


}