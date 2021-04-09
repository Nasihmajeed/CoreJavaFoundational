import java.util.*;
class Drinks
{	String drinks;
	float price;
	String updateDrinks;
	float updatePrice;
	Scanner sc=new Scanner(System.in);
	
	
	
	
	int qty;
	
	
	public void setDrinks(String drinks)
	{
		this.drinks=drinks;
		/*System.out.println("Enter the food");
	food=sc.nextLine();
	*/
	}
	public void setDPrice(float price)
	{
		this.price=price;
		
		/*System.out.println("Enter the Price for "+food+" :");
	price=sc.nextFloat();*/
		
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
		return price;
		
	}
	
	
	
	
	
	
}