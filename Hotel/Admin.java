import java.util.*;
class Admin
{
Food f=new Food();
ArrayList<Food> foodItems=new ArrayList<Food>();

ArrayList<Food> foodItemsAdd=new ArrayList<Food>();

Scanner sc=new Scanner(System.in);
String food,option;
float price;
int i;
	
	
	public void foodList()
	{
		foodItems.add(new Food());
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
		
		
		/*System.out.println("---------------Food----------------------------Price");
		for( i=0;i<foodItems.size();i++){
		System.out.println(i+1+" "+foodItems.get(i).getFood()+"---------------"+foodItems.get(i).getPrice());
		
		}*/
	}
	
	public void addFood()
	{	
	
	 Iterator<Food> iterator =  foodItems.iterator();
        while (iterator.hasNext()) {
            
            if (iterator.next()==null) {
                iterator.remove();
                break;
            }  
		}
		viewDishes();
		do
		{	
			int k=0;
			
		foodItemsAdd.add(new Food());
		System.out.println("Enter the food");
		food=sc.next();
		foodItemsAdd.get(k).setFood(food);
		
	
	
		System.out.println("Enter the Price for "+food+" :");
		price=sc.nextFloat();
		foodItemsAdd.get(k).setPrice(price);
		
		
		foodItems.add(new Food());
		foodItems.add(foodItemsAdd.get(k));
		
		
		
		
		
		System.out.println("Do you want to enter more (yes/no)");
		option=sc.next();
		k++;
		//foodItems.add(new Food());
		}while(option.equals("yes"));
		
		
		
		
	}
	
	
	
	
	
	
	int update,j;
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
	
	
	public void viewDishes()
	{
		foodList();
		System.out.println("------------Food ---------------Price of the food----");
		for(i=0;i<foodItems.size();i++)
		{	

		System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
		}
		
	}

	
	
}