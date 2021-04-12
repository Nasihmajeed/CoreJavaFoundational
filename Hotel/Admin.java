import java.util.*;

	

class Admin 
{
	Food  f=new Food();
	
	ArrayList<Items> foodItems=new ArrayList<Items>();


	
	ArrayList<Items>foodItemsBill =new ArrayList<Items>();
	ArrayList<Items> drinkItemsBill=new ArrayList<Items>();

	Scanner sc=new Scanner(System.in);
	String food,option,drink;
	float price,dPrice;
	int i,n;
	
	{	foodItems.add(new Food());
			foodItems.get(0).setItem("Appam");
			foodItems.get(0).setPrice(10);
		
		
			
			foodItems.add(new Food());
			foodItems.get(1).setItem("Dosa");
			foodItems.get(1).setPrice(5);
	
		
		
		foodItems.add(new Food());
		
			foodItems.get(2).setItem("Porotta");
			foodItems.get(2).setPrice(10);
		
	
	foodItems.add(new Food());
		
			foodItems.get(3).setItem("Meals");
			foodItems.get(3).setPrice(40);
		
		
		//*********Drinks//
		
		
			foodItems.add(new Drinks());
			
			foodItems.get(4).setItem("Lime");
			foodItems.get(4).setPrice(20);
		
			foodItems.add(new Drinks());
		
			foodItems.get(5).setItem("Apple Juice");
			foodItems.get(5).setPrice(40);
		
			foodItems.add(new Drinks());
		
			foodItems.get(6).setItem("Milk Shake");
			foodItems.get(6).setPrice(50);
	
			foodItems.add(new Drinks());
			
			foodItems.get(7).setItem("Badam Milk");
			foodItems.get(7).setPrice(30);
		
		
		
		
	}	

	//Food f=new Food();
	
	public void viewDishes()
	{
		
	
		
		
		 System.out.println("--------------------------------------------Food----------------------------------------------------------");
		 System.out.println("------------Item ---------------Price ----");
		for(i=0;i<foodItems.size();i++)
		{	
				if(foodItems.get(i) instanceof Food){
		System.out.println(i+1+" "+foodItems.get(i).getItem()+"-------------------         ----------- "+foodItems.get(i).getPrice());
			}
		}
	
		// drinks listing 
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------Drinks----------------------------------------------------------");
		
		 System.out.println("------------Item ---------------Price ----");
		for(i=0;i<foodItems.size();i++)
		{	
		if(foodItems.get(i) instanceof Drinks){
		System.out.println(i+1+" "+foodItems.get(i).getItem()+"-------------------         ----------- "+	foodItems.get(i).getPrice());
		}
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
				
				foodItems.get(j).setItem(food);		
				
		
		
				System.out.println("Enter the Price for "+food+" :");
				price=sc.nextFloat();
				
					foodItems.get(j).setPrice(price);		
				
	

				j++;
		
				}viewDishes();
				break;
		
		case 2:	System.out.println("Enter how many items need to be added");
				n=sc.nextInt();
		
				j=foodItems.size();
				for(i=0;i<n;i++)
			
				{ 
				
			
			
				System.out.println("Enter the Drink");
				drink=sc.next();
			
			foodItems.add(new Drinks());
				
				foodItems.get(j).setItem(drink);		
				
		
		
				System.out.println("Enter the Price for "+drink+" :");
				dPrice=sc.nextFloat();
				
				foodItems.get(j).setPrice(dPrice);		
				

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
			
					foodItems.get(j).setItem(updateFood);
					foodItems.get(j).setPrice(updatePrice);
			
					break;
				
		case 2:		System.out.println("Enter the number to be edited :");
					updateD=sc.nextInt();
					m=updateD-1;
			
			
					System.out.println("Enter the drink to be update: ");
					updateDrink=sc.next();
			
			
					System.out.println("Enter the price to be update: ");
					updateDPrice=sc.nextFloat();
			
					
					foodItems.get(m).setItem(updateDrink);
					foodItems.get(m).setPrice(updateDPrice);
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
					
					foodItems.remove(m);
				
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
					if(foodItems.get(i) instanceof Food)
						{
						System.out.println(i+1+" "+foodItems.get(i).getItem()+"-------------------         ----------- "+foodItems.get(i).getPrice());
						}
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
					for(i=0;i<foodItems.size();i++)
					{	
					if(foodItems.get(i) instanceof Drinks)
						{
					System.out.println(i+1+" "+foodItems.get(i).getItem()+"-------------------         ----------- "+foodItems.get(i).getPrice());
						}
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
	
		foodItemsBill.add(foodItems.get(k));
						
		return  totalBillFood;	
		
		
		
		
	}	
		
		
		public float drinksBill()
		{
		l=optionUserDrinks-1;
		
			totalBillDrinks=qtyDrinks*foodItems.get(l).getPrice();
				drinkItemsBill.add(foodItems.get(l));
				
		return totalBillDrinks;	
		}	
	


	public void viewFoodBill()
	{
			for(i=0;i<foodItemsBill.size();i++)
				{
					
				if(foodItems.get(i) instanceof Food)
						{
					System.out.println(foodItemsBill.get(i).getItem()+" \t\t\t "+foodItemsBill.get(i).getPrice()+"\t\t\t");
						}
				}	
	}
	public void viewDrinksBill()
	{
			
			for(i=0;i<drinkItemsBill.size();i++)
				{
				if(foodItems.get(i) instanceof Drinks)
						{	
	
				System.out.println(drinkItemsBill.get(i).getItem()+" \t \t\t\t "+drinkItemsBill.get(i).getPrice()+"\t\t\t");
						}
	
				}	
	}

	
	
}



	
	
	
	

	

