import java.util.*;
class Food
{	String food;
	float price;
	String updateFood;
	float updatePrice;
	Scanner sc=new Scanner(System.in);
	
	int qty;
	
	
	public void setFood(String food)
	{
		this.food=food;
		
	}
	public void setPrice(float price)
	{
		this.price=price;
		
		
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