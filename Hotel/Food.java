import java.util.*;
class Food
{	String food;
	float price;
	String updateFood;
	float updatePrice;
	Scanner sc=new Scanner(System.in);
	
	
	
	
	
	public void setFood(String food)
	{
		this.food=food;
		/*System.out.println("Enter the food");
	food=sc.nextLine();
	*/
	}
	public void setPrice(float price)
	{
		this.price=price;
		
		/*System.out.println("Enter the Price for "+food+" :");
	price=sc.nextFloat();*/
		
	}
		Food()
		{
			
		}
	
	public void updateFood(String updateFood,float updatePrice)
	{
		this.food=updateFood;
		this.price=updatePrice;
		
	}
	
	public String getFood()
	{
		return food;
	}
	public float getPrice()
	{
		return price;
		
	}
	
	
	
	
	
	
}