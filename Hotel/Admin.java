import java.util.*;

	

class Admin 
{
	Food  f=new Food();
	
	ArrayList<Food> foodItems=new ArrayList<Food>();

ArrayList<Food> drinks=new ArrayList<Food>();
	
	ArrayList<Food>foodItemsBill =new ArrayList<Food>();
	ArrayList<Food> drinkItemsBill=new ArrayList<Food>();

	Scanner sc=new Scanner(System.in);
	String food,option,drink;
	float price,dPrice;
	int i,n;
	
	{	foodItems.add(new Food());
		foodItems.get(0).setFood("Appam");
		foodItems.get(0).setPrice(10);
		
		
		foodItems.add(new Food());
		foodItems.get(1).setFood("Dosa");
		foodItems.get(1).setPrice(5);
		
		
		foodItems.add(new Food());
		foodItems.get(2).setFood("Porotta");
		foodItems.get(2).setPrice(10);
	
		foodItems.add(new Food());
		foodItems.get(3).setFood("Meals");
		foodItems.get(3).setPrice(40);
		
		
		//*********Drinks//
		
		
			drinks.add(new Food());
			drinks.get(0).setDrinks("Lime");
			drinks.get(0).setDPrice(20);
		
			drinks.add(new Food());
			drinks.get(1).setDrinks("Apple Juice");
			drinks.get(1).setDPrice(40);
		
			drinks.add(new Food());
			drinks.get(2).setDrinks("Milk Shake");
			drinks.get(2).setDPrice(50);
		
			drinks.add(new Food());
			drinks.get(3).setDrinks("Badam Milk");
			drinks.get(3).setDPrice(30);
		
		
		
		
	}	

	//Food f=new Food();
	
	public void viewDishes()
	{
		
	
		
		
		 System.out.println("--------------------------------------------Food----------------------------------------------------------");
		 System.out.println("------------Item ---------------Price ----");
		for(i=0;i<foodItems.size();i++)
		{	
		
		System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
		
		}
	
		// drinks listing 
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------Drinks----------------------------------------------------------");
		
		 System.out.println("------------Item ---------------Price ----");
		for(i=0;i<drinks.size();i++)
		{	
		
		System.out.println(i+1+" "+	drinks.get(i).getDrinks()+"-------------------         ----------- "+	drinks.get(i).getDPrice());
		
		}
		
	}
	
	int update,j,addOption;
	
	public void addFood()
	{	
		System.out.println("Enter the category which you want to add (1.Food 2.Drinks) ");
		addOption=sc.nextInt();
		
		switch(addOption){
		
	
		case 1:	System.out.println("Enter how many items need to be added");
				n=sc.nextInt();
		
				j=foodItems.size();
				for(i=0;i<n;i++)
			
				{ 
				
			
			
				System.out.println("Enter the food");
				food=sc.next();
			
				foodItems.add(new Food());
				foodItems.get(j).setFood(food);		
		
		
		
				System.out.println("Enter the Price for "+food+" :");
				price=sc.nextFloat();
				foodItems.get(j).setPrice(price);		
		
	

				j++;
		
				}viewDishes();
				break;
		
		case 2:	System.out.println("Enter how many items need to be added");
				n=sc.nextInt();
		
				j=drinks.size();
				for(i=0;i<n;i++)
			
				{ 
				
			
			
				System.out.println("Enter the Drink");
				drink=sc.next();
			
				drinks.add(new Food());
				drinks.get(j).setDrinks(drink);		
		
		
		
				System.out.println("Enter the Price for "+drink+" :");
				dPrice=sc.nextFloat();
				drinks.get(j).setDPrice(dPrice);		
		
	

				j++;
			
				}viewDishes();
		
				break;
			}
		
}
	
		
	
	
	
	
	
	
	
	String updateFood,updateDrink;
	float updatePrice,updateDPrice;
	
	int updateOption,m,updateD;
	
	
	
	public void updateDishes()
	{	viewDishes();
		System.out.println("Enter which one to be edited (1.Food  2.Drinks )");
		updateOption=sc.nextInt();
		switch(updateOption)
		{
		case 1:		System.out.println("Enter the number to be edited :");
					update=sc.nextInt();
					j=update-1;
			
			
					System.out.println("Enter the food to be update: ");
					updateFood=sc.next();
			
			
					System.out.println("Enter the price to be update: ");
					updatePrice=sc.nextFloat();
			
					foodItems.get(j).setFood(updateFood);
					foodItems.get(j).setPrice(updatePrice);
					break;
				
		case 2:		System.out.println("Enter the number to be edited :");
					updateD=sc.nextInt();
					m=updateD-1;
			
			
					System.out.println("Enter the drink to be update: ");
					updateDrink=sc.next();
			
			
					System.out.println("Enter the price to be update: ");
					updateDPrice=sc.nextFloat();
			
				drinks.get(m).setDrinks(updateDrink);
					drinks.get(m).setDPrice(updateDPrice);
					break;
				
				
				
				
		
		}
		
		
		viewDishes();
		
	}
	
	int removeF,removeD,removeOption;
	public void removeDishes()
	{
		
		
		
		
		
		
		
		System.out.println("Enter which one to be removed (1.Food  2.Drinks )");
		removeOption=sc.nextInt();
		switch(removeOption)
		{
		case 1:		System.out.println("Enter the item to be remove: ");
					removeF=sc.nextInt();
					j=removeF-1;
					foodItems.remove(j);
					viewDishes();
					break;
				
		case 2:		System.out.println("Enter the item to be remove: ");
					removeD=sc.nextInt();
					m=removeD-1;
					drinks.remove(m);
					viewDishes();
					break;
				
				
				
				
		
		}
		
		
		viewDishes();
		
	}
	
	
	
	
	
	
	
	
	
	
		
		
		
		

	//float total;
	int qty,optionUser,orderOption,optionUserDrinks,qtyDrinks;
	String repeatF,repeatD,repeat;
	float amount=0;
	float totalBill,foodBill,drinksBill;
	
	ArrayList<Bill> bill=new ArrayList<Bill>();
	
	
		int l;
		//k=optionUser-1;
		
		
		
		int count=0;
		int k,orderCount;
		
	public void makeOrder()
	{
		do
		{	System.out.println("Enter the Menu items (1.Food-------2.Drinks)");
			orderOption=sc.nextInt();
			if(orderOption==1)
			{		
			
		
				do
					{
			
					for(i=0;i<foodItems.size();i++)
					{	
				
					System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
				
					}
		
		
			
				
						System.out.println("Select an option :");
						optionUser=sc.nextInt();
					
			
				
						System.out.println("Enter the quantity :");
						qty=sc.nextInt();
					
					
						foodBill=foodBill+foodBill();
						k=optionUser-1;
					
					
					
					System.out.println("Do you want to enter more (yes/no)  :");
			
					repeatF=sc.next();
			
				
	
			
			
					}while(repeatF.equals("yes"));
				
			
				
				 	
					
			
				
			
		}	
	
		if(orderOption==2)
		{
			do{
					for(i=0;i<drinks.size();i++)
					{	
			
					System.out.println(i+1+" "+drinks.get(i).getDrinks()+"-------------------         ----------- "+drinks.get(i).getDPrice());
				
					}
		
					System.out.println("Select an option :");
					optionUserDrinks=sc.nextInt();
			
			
					System.out.println("Enter the quantity :");
					qtyDrinks=sc.nextInt();
						
				
	
					drinksBill=drinksBill+drinksBill();
			
				l=optionUserDrinks-1;
			
			
				System.out.println("Do you want to enter more (yes/no) :");
				repeatD=sc.next();
			
			
			
			
				}while(repeatD.equals("yes"));
				


		}
		amount=foodBill+drinksBill;
		System.out.println("Do you want to add Food/Drinks again:");
		repeat=sc.next();
		
		}while(repeat.equals("yes"));
		
		System.out.println("------------Order---------------");
		System.out.println("food \t\t\t price\t\t\t  ");
		
			viewFoodBill();
			viewDrinksBill();	
		System.out.println("Total :"+amount);
		
		
		
		
	}	
				float totalBillFood,totalBillDrinks;	
			
			
			
			
	public float foodBill()
	{
		k=optionUser-1;
	
	
	totalBillFood=qty*foodItems.get(k).getPrice();
	
		//foodItems.get(i).setQty(qty);
		
		foodItemsBill.add(foodItems.get(k));
		return  totalBillFood;	
		
		
		
		
	}	
		
		
		public float drinksBill()
		{
		l=optionUserDrinks-1;
		totalBillDrinks=qtyDrinks*drinks.get(l).getDPrice();
	
		
			drinkItemsBill.add(drinks.get(l));
		return totalBillDrinks;	
		}	
	


	public void viewFoodBill()
	{
			for(i=0;i<foodItemsBill.size();i++)
				{
					
	
					System.out.println(foodItemsBill.get(i).getFood()+" \t\t\t "+foodItemsBill.get(i).getPrice()+"\t\t\t");
	
				}	
	}
	public void viewDrinksBill()
	{
			
			for(i=0;i<drinkItemsBill.size();i++)
				{
					
	
				System.out.println(drinkItemsBill.get(i).getDrinks()+" \t \t\t\t "+drinkItemsBill.get(i).getDPrice()+"\t\t\t");
	
				}	
	}

	
	
}



	
	
	
	

	

