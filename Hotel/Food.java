import java.util.*;
class Food
{	String food;
	float price;
	String updateFood,updatePrice;
	Scanner sc=new Scanner(System.in);
	public void setFood()
	{
		System.out.println("Enter the food");
	food=sc.nextLine();
	
	}
	public void setPrice()
	{
		System.out.println("Enter the Price for "+food+" :");
	price=sc.nextFloat();
		
	}
	
	
	public void updateFoodPrice(String updateFood,float updatePrice)
	{
		this.updateFood=updateFood;
		this.updatePrice=updatePrice;
		
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