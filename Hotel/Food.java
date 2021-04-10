import java.util.*;
class Food
{	String food;
	float price;
	String updateFood;
	//float updatePrice;
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
	
	String drinks;
	float dprice;
	String updateDrinks;
	float updatePrice;
	//Scanner sc=new Scanner(System.in);
	
	
	
	
	
	
	
	public void setDrinks(String drinks)
	{
		this.drinks=drinks;
		
	
	}
	public void setDPrice(float dprice)
	{
		this.dprice=dprice;
		
		
		
	}
		
	
	public void updateDrinks(String updateDrinks,float updatePrice)
	{
		this.drinks=updateDrinks;
		this.price=updatePrice;
		
	}
	
	public String getDrinks()
	{
		return drinks;
	}
	public float getDPrice()
	{
		return dprice;
		
	}
	
	
	
	
	
}