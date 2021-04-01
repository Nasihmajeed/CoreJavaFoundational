import java.util.*;
class Admin
{
Food [] f=new Food[4];
ArrayList<Food> foodItems=new ArrayList<Food>();

ArrayList<Food> foodItemsAdd=new ArrayList<Food>();


//Iterator itr=foodItems.iterator();

Scanner sc=new Scanner(System.in);
String food,option;
float price;
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
	}	

	//Food f=new Food();
	
	public void viewDishes()
	{
		
	
		
		 System.out.println("------------Food ---------------Price of the food----");
		for(i=0;i<foodItems.size();i++)
		{	

		System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
		}
		
	}
	
	int update,j;
	
	public void addFood()
	{	
		
		
		
		
	
		System.out.println("Enter how many items need to be added");
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
		
		
}
	
	
	
	
	
	
	
	
	
	String updateFood;
	float updatePrice;
	
	public void updateDishes()
	{	viewDishes();
		System.out.println("Enter the number to be edited :");
		update=sc.nextInt();
		j=update-1;
			
			
			System.out.println("Enter the food to be update: ");
			updateFood=sc.next();
			
		
			System.out.println("Enter the price to be update: ");
			updatePrice=sc.nextFloat();
			
			foodItems.get(j).setFood(updateFood);
			foodItems.get(j).setPrice(updatePrice);
		
		
		
		
		
		viewDishes();
		
	}
	
	int remove;
	public void removeDishes()
	{
		System.out.println("Enter the item to be remove: ");
		remove=sc.nextInt();
		j=remove-1;
		foodItems.remove(j);
		viewDishes();
	}
	
	
	
	
	
	
	
	
		
		
		
		

	//float total;
	int qty,optionUser;
	String repeat;
	float amount=0;
	float totalBill;
	
	public void makeOrder()
	{
		do{	
			for(i=0;i<foodItems.size();i++)
		{	

		System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
		}
		
			System.out.println("Select an option :");
			optionUser=sc.nextInt();
			
			
					System.out.println("Enter the quantity :");
							qty=sc.nextInt();
						
			
	
			
			
			System.out.println("Do you want to enter more (yes/no) :");
			repeat=sc.next();
			
			
			amount=amount+ bill();
		
		}while(repeat.equals("yes"));
		
		
		System.out.println("Total :"+amount);
		
		
		
		
	}	
			
			
	public float bill()
	{
		int k;
		k=optionUser-1;
		totalBill=qty*foodItems.get(k).getPrice();
		return totalBill;
		
		
		
		
	}	
	
	
	
	
	

	
	
}



	
	
	
	

	

