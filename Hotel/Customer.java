import java.util.*;
class Customer
{
	String food;
	float price,total;
	
	ArrayList<Food> foodItems=new ArrayList<Food>();
	
	Scanner sc= new Scanner(System.in);
	
	
	public void addFood()
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
	
	public void menu()
	{
		System.out.println(" -----------FOOD------------------Price------");
		for(int i=0;i<foodItems.size();i++){
		System.out.println(i+1+" "+foodItems.get(i).getFood()+"------------- "+foodItems.get(i).getPrice());
		}
		
	}
	//float total;
	int qty,option;
	String repeat;
	
	public void makeOrder()
	{
		do{	
		
			menu();
			
			System.out.println("Select an option :");
			option=sc.nextInt();
			
			if(option<=foodItems.size())
			{
					System.out.println("Enter the quantity :");
							qty=sc.nextInt();
							break;
			
	System.out.println("Do you want to enter more (yes/no) :");
			repeat=sc.nextLine();
			
			}
			
			
			
		
		}
		while(repeat.equals("yes"));
		
		bill();
		
		}	
			
			
	public void bill()
	{
		int j;
		j=option-1;
		total=qty*foodItems.get(j).getPrice();
		
		System.out.println("Total :"+total);
		
		
		
	}	
	

	

}