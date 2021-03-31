import java.util.*;
class Customer
{
	String food;
	float price,total;
	
	ArrayList<Food> foodItems=new ArrayList<Food>();
	
	Scanner sc= new Scanner(System.in);
	
	Admin a=new Admin();
	
	
	public void menu()
	{
		
		
		a.viewDishes();
		
	}
	//float total;
	int qty,option;
	String repeat;
	float amount=0;
	
	public void makeOrder()
	{
		do{	
		
		
			System.out.println("Select an option :");
			option=sc.nextInt();
			
			if(option<=a.foodItems.size())
			{
					System.out.println("Enter the quantity :");
							qty=sc.nextInt();
						
			
	
			
			}
			System.out.println("Do you want to enter more (yes/no) :");
			repeat=sc.next();
			
			
			amount=amount+ bill();
		
		}
		while(repeat.equals("yes"));
		
		
		System.out.println("Total :"+amount);
		
	}	
			
			
	public float bill()
	{
		int j;
		j=option-1;
		total=qty*a.foodItems.get(j).getPrice();
		return total;
		
		
		
		
	}	
	

	

}