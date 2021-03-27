import java.util.*;
class Test
{
Food f=new Food();
ArrayList<Food> foodItems=new ArrayList<Food>();

Scanner sc=new Scanner(System.in);
String food;
float price;
int i;
	public void addDishes()
	{

		for(i=0;i<3;i++)
		{	
		foodItems.add(new Food());
	
	
	
		foodItems.get(i).setFood();
		foodItems.get(i).setPrice();
		}

	

	
	}
	
	public void viewDishes()
	{
		System.out.println("------------Food ---------------Price of the food----");
		for(i=0;i<3;i++)
		{	

		System.out.println(i+1+" "+foodItems.get(i).getFood()+"-------------------         ----------- "+foodItems.get(i).getPrice());
		}
		
	}
	
	int update,j;
	String updateFood,updatePrice;
	public void updateDishes()
	{
		System.out.println("Enter the number to be edited :");
		update=sc.nextInt();
		j=update-1;
		
		foodItems.get(j).setFood();
		foodItems.get(j).setPrice();
		
		
		/*System.out.println("Enter the food");
		updateFood=sc.nextLine();
		foodItems.set(j,f.setupdateFood(updateFood));
		System.out.println("Enter the price");
		updatePrice=sc.nextLine();
		foodItems.set(j,f.setupdatePrice(updatePrice));
		*/
		viewDishes();
		
	}
	
	public void removeDishes()
	{
		
	}
	
	
}