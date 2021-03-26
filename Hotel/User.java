import java.util.*;
class User
{
	ArrayList<String> dishes=new ArrayList<String>();
	ArrayList prices=new ArrayList<>();
	float total;
	
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Food> foodItems=new ArrayList<Food>();
	
	
	
	public void addDishes()
	{
			foodItems.add(new Food());
		foodItems.get(0).setFood("Dosa",10); 
		foodItems.add(new Food());
		foodItems.get(1).setFood("idly",12); 
		foodItems.add(new Food());
		foodItems.get(2).setFood("Appam",15); 
		foodItems.add(new Food());
		foodItems.get(3).setFood("Puri",15); 
		
		
		
		
		
	}
	int ch;
	
	
	
	public void displayDishes()
	{
		
			System.out.println("------------------------------------------");	
	
	/*System.out.println(" "+foodItems.get(0).getFood()+" "+foodItems.get(0).getPrice()); 
	
	
	
	System.out.println(" "+foodItems.get(1).getFood()+" "+foodItems.get(1).getPrice());
	*/
	for(int i=0;i<foodItems.size();i++)
	{
	
	System.out.println(i+1+" "+foodItems.get(i).getFood()+" "+foodItems.get(i).getPrice()); 
	}
	}
	
	
	
	//--------------------remove----------------------------
	public void removeDishes()
	{
		dishes.remove(2);
		
	}	
	
	
	int item,nos;
String option ;
boolean control;
	public void menu()
	{
		
		do
		{
			addDishes();
			displayDishes();
			
			System.out.println("Select the item :");
			item=sc.nextInt();
			System.out.println("Select the number of items :");
			nos=sc.nextInt();
		System.out.println("Do you want to select more items :(yes/no)");
		option=sc.next();
		
		}while(option=="yes");
	}
	
	
	
		
		
	

	
}