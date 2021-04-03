import java.util.*;
class Drinks
{	String drinks;
	float price;
	String updateDrinks;
	float updatePrice;
	Scanner sc=new Scanner(System.in);
	
	
	Food f=new Food();
	
	
	public void setDrinks(String drinks)
	{
		this.drinks=drinks;
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
		Drinks()
		{
			
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
	public float getPrice()
	{
		return price;
		
	}
	
	
	
	
	
	
}