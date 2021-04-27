import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class Admin
{
String admName="Sai Krishna",uname,pwd;
Scanner sc=new Scanner(System.in);
int sel,admOption,num,j;

ArrayList<Food> foodItems=new ArrayList<Food>();
ArrayList<Drinks> drinkList=new ArrayList<Drinks>();
ArrayList bill=new ArrayList();

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
	System.out.println("=======================================MENU=====================================");
	System.out.println("================================================================================");
    System.out.println("----------------------------------------------FOOD ITEMS----------------------------------------------");
    System.out.println("Food name : ......................."+foodItems.get(0).getFname()+"....................... Food price : ......................."+foodItems.get(0).getFprice());
	System.out.println("Food name : ......................."+foodItems.get(1).getFname()+"....................... Food price : ......................."+foodItems.get(1).getFprice());
	System.out.println("Food name : ...................... "+foodItems.get(2).getFname()+"....................... Food price : ......................."+foodItems.get(2).getFprice());
	System.out.println("Food name : ......................."+foodItems.get(3).getFname()+"....................... Food price : ......................."+foodItems.get(3).getFprice());
	System.out.println("Food name : ......................."+foodItems.get(4).getFname()+"....................... Food price : ......................."+foodItems.get(4).getFprice());
	System.out.println("================================================================================");
	System.out.println("================================================================================");
	
	System.out.println("=======================================MENU=====================================");
	System.out.println("================================================================================");
    System.out.println("----------------------------------------------DRINK ITEMS---------------------------------------------");
    System.out.println("Food name : ......................."+drinkList.get(0).getDname()+"....................... Food price : ......................."+drinkList.get(0).getDprice());
	System.out.println("Food name : ......................."+drinkList.get(1).getDname()+"....................... Food price : ......................."+drinkList.get(1).getDprice());
	System.out.println("Food name : ......................."+drinkList.get(2).getDname()+"....................... Food price : ......................."+drinkList.get(2).getDprice());
	System.out.println("Food name : ......................."+drinkList.get(3).getDname()+"....................... Food price : ......................."+drinkList.get(3).getDprice());
	System.out.println("Food name : ......................."+drinkList.get(4).getDname()+"....................... Food price : ......................."+drinkList.get(4).getDprice());
	System.out.println("================================================================================");
	System.out.println("================================================================================");
}

public void viewFoods()                      //a function to print food list whenever needed
{
	for(int i=0;i<foodItems.size();i++)
	{
		System.out.println(i+1+"  "+" Food name : ......................."+foodItems.get(i).getFname()+"....................... Food price : ......................."+foodItems.get(i).getFprice());
	}
}

public void viewDrinks()                    //a function to print drink list whenever needed
{
	for(int i=0;i<drinkList.size();i++)
	{
		System.out.println(i+1+"  "+" Drink name : ......................."+drinkList.get(i).getDname()+"....................... Drink price : ......................."+drinkList.get(i).getDprice());
	}
}


//Customer ordering items

int item,qy,i=0,fnum,dnum,fdOrdr,drOrdr;
String repeat;
float total;
public void customerOrder()
{
	printMenu();
	System.out.println("Enter the item you want to order...............1.Food Item..........2.Drink.............");
	item=sc.nextInt();
	switch(item)
	                  {
						  case 1:                          viewFoods();
						                             do{    
						                               System.out.println("Please place your order number for the corresponding Food Item :");
													   fnum=sc.nextInt();
													   System.out.println("===========================================");
													   if(fnum<=foodItems.size())
													   {
														System.out.println("===========================================");
														System.out.println("Order accepted!!!");  
														System.out.println("===========================================");
														fdOrdr=fnum-1;
														System.out.println("===========================================");
						System.out.println("You have ordered "+foodItems.get(fdOrdr).getFname()+" with price of Rs."+foodItems.get(fdOrdr).getFprice());
						                                System.out.println("===========================================");
													    System.out.println("Enter the quantity of food item you want :");
                                                            qy=sc.nextInt();
														System.out.println("===========================================");
														System.out.println("You have ordered "+qy+" quantity of "+foodItems.get(fdOrdr).getFname());
															total=qy*foodItems.get(fdOrdr).getFprice();
                                                            bill.add(total);
													                   
													   }
													   
													   System.out.println("===========================================");
													   System.out.println("Do you want to order more food ?.................yes.................no.................");
													   System.out.println("===========================================");
													   repeat=sc.next();
													   
													}while(repeat.equals("yes"));
													billPrint(bill);
                                                       break;
							                           
						  case 2:                    viewDrinks();
						                             do{    
						                               System.out.println("Please place your order number for the corresponding Drink :");
													   dnum=sc.nextInt();
													   System.out.println("===========================================");
													   if(dnum<=drinkList.size())
													   {
														System.out.println("===========================================");
														System.out.println("Order accepted!!!");
														System.out.println("===========================================");
														drOrdr=dnum-1;
						System.out.println("You have ordered "+drinkList.get(drOrdr).getDname()+" with price of Rs."+drinkList.get(drOrdr).getDprice());
						                                System.out.println("===========================================");
													    System.out.println("Enter the quantity of drink you want :");
                                                            qy=sc.nextInt();
															System.out.println("===========================================");
															System.out.println("You have ordered "+qy+" quantity of "+drinkList.get(drOrdr).getDname());
															total=qy*drinkList.get(drOrdr).getDprice();
                                                          	 bill.add(total);       															
													   }
													   
													   System.out.println("===========================================");
													   System.out.println("Do you want to order more Drink ?.................yes.................no.................");
													   System.out.println("===========================================");
													   repeat=sc.next();
													   
													}while(repeat.equals("yes"));
													billPrint(bill);
                                                    break;
					  }
}

//Billing
float totalAmount=0,amount;
public void billPrint(ArrayList totalBill)
{
	System.out.println("-----------...........Total Bill : ............----------");
	
	for(int i=0;i<totalBill.size();i++)
	{   
	    amount=(Float)totalBill.get(i);
	    System.out.println(i+1+"----------"+totalBill.get(i)+"-------------");
	    totalAmount = totalAmount + amount;                                                                                                      	                                                                              
	}
System.out.println("===========================================");
System.out.println("You have to Pay a total amount of : : "+totalAmount);
System.out.println("===========================================");

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
		                   case 1: addItem();
						               break;
						   case 2: updateItems();
						                break;
						   case 3: removeItem();
						                break;
						   case 4: viewList();
	                                     break;
                                  	default : System.out.println("Enter a valid Option!!!!");
	             }
}

//addition of food item/drink

String newFud,newDrk;
float newPrc,newDpr;

public void addItem()
{
	System.out.println("Select the list into which you want to add.......................1.Food.......................2.Drink.......................");
	sel=sc.nextInt();
	
                             switch(sel)
							 {
								 case 1: 
								         viewFoods();
								         j=foodItems.size();
								 System.out.println("Enter the number  of food items you want to add :");
								 num=sc.nextInt();	 
								 
								 for(int i=0;i<num;i++)
								 {
								     System.out.println("Enter the name of the new Food Item : ");
                                     newFud=sc.nextLine();
									 System.out.println("Enter the price of the new Food Item : ");
                                     newPrc=sc.nextFloat();
									 foodItems.add(new Food());
									 foodItems.get(j).setFname(newFud);
									 foodItems.get(j).setFprice(newPrc);
								 }
								 System.out.println("Item added Successfully");
								 viewFoods();
								 break;
								 
								 case 2: 
								            viewDrinks();
								             j=drinkList.size();
								 System.out.println("Enter the number  of drinks you want to add :");
								 num=sc.nextInt();	 
								 
								 for(int i=0;i<num;i++)
								 {
								     System.out.println("Enter the name of the new Drink : ");
                                     newDrk=sc.nextLine();
									 System.out.println("Enter the price of the new Drink : ");
                                     newDpr=sc.nextFloat();
									 drinkList.add(new Drinks());
									 drinkList.get(j).setDname(newDrk);
									 drinkList.get(j).setDprice(newDpr);
								 }
								 System.out.println("Drink added Successfully");
								viewDrinks();
								 break;
							 }

}

//update menu list of food and drinks

String updateFud,updateDrk;
float updFudPrc,updDrkPrc;

public void updateItems()
{
	System.out.println("Select the list which you want to update.......................1.Food.......................2.Drink.......................");
	sel=sc.nextInt();
	
	switch(sel)
	              {
		               case 1:  viewFoods();
					                System.out.println("Enter the number of food item to be updated or edited :");
					                 num=sc.nextInt();
									 j=num-1;
									 
									 System.out.println("Enter the new food with which the list is to be updated :");
									 updateFud=sc.nextLine();
									 
									 System.out.println("Enter the Food price to be updated :");
									 updFudPrc=sc.nextFloat();
									 
									 foodItems.get(j).setFname(updateFud);
									 foodItems.get(j).setFprice(updFudPrc);
									 
					                 System.out.println("Food updated Successfully !!!");
                                     viewFoods();
									 break;									  
					   case 2: 
	                                   viewDrinks();
									   System.out.println("Enter the number of drink item to be updated or edited :");
					                 num=sc.nextInt();
									 j=num-1;
									 
									 System.out.println("Enter the new drink with which the list is to be updated :");
									 updateDrk=sc.nextLine();
									 
									 System.out.println("Enter the drink price to be updated :");
									 updDrkPrc=sc.nextFloat();
									 
									 drinkList.get(j).setDname(updateDrk);
									 drinkList.get(j).setDprice(updDrkPrc);
					                 
									 System.out.println("Drink updated successfully !!!");
				                     viewDrinks();
									 
									 break;
				  }
}

//remove items from menu list

int delete;

public void removeItem()
{
	System.out.println("Enter the list from which you want to remove.......................1.Food List.......................2.Drinks List.......................");
	sel=sc.nextInt();
	switch(sel)
	                {
						case 1 : 
						              viewFoods();
						              System.out.println("Enter the number of the food item you want to remove :");
									  num=sc.nextInt();
									  delete=num-1;
						              foodItems.remove(delete);
									  System.out.println("Food item removed Successfully !!!");
									  viewFoods();
									  break;
						case 2 :
						              viewDrinks();
						              System.out.println("Enter the number of the Drink you want to remove :");
									  num=sc.nextInt();
									  delete=num-1;
						              drinkList.remove(delete);
									  System.out.println("Drink removed Successfully !!!");
									  viewDrinks();
					                   break;
					}
					
}


//admin wants to view the list
public void viewList()
{
	System.out.println("Which list do you want to view ?");
	System.out.println("1.Food List");
	System.out.println("2.Drinks List");
	sel=sc.nextInt();
	switch(sel)
	            {
					case 1 : viewFoods();
					              break;
					case 2 : viewDrinks();
				                  break;
				}
	
}


}