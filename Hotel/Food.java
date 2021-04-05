import java.util.*;

public class Food
{

String foodName;
float foodQty,foodPrice;

ArrayList<Food> food = new ArrayList<Food>(5);


  public void setFoodName(String foodName)
  {
	  this.foodName=foodName;
  }
  
  public void setFoodQty(float foodQty)
  {
	  this.foodQty=foodQty;
  }
  
  public void setFoodPrice(float foodPrice)
  {
	  this.foodPrice=foodPrice;
  }
  
  public String getFoodName()
  {
	  return foodName; 
  }

 public float getFoodQty()
 {
	 return foodQty;
 }
 
 public float getFoodPrice()
 {
	 return foodPrice;
 }
 
 
 
public void menuCard(ArrayList<Food>  food)
{
	Food[] fo=new Food(5);  //created an array to store fooditems,price & qty
	for(int i=0 ; i<5 ; i++)
	{
		fo[i]=new Food();
	}
	
	fo[0].setFoodName("Biriyani");
	fo[0].setFoodPrice(130);
	fo[0].setFoodQty(2);
	
	fo[1].setFoodName("Fried Rice");
	fo[1].setFoodPrice(110);
	fo[1].setFoodQty(3);

    fo[2].setFoodName("Chapathi");
	fo[2].setFoodPrice(8);
	fo[2].setFoodQty(4);
	
	fo[3].setFoodName("Dosa");
	fo[3].setFoodPrice(8);
	fo[3].setFoodQty(5);
	
	fo[4].setFoodName("Meals");
	fo[4].setFoodPrice(50);
	fo[4].setFoodQty(6);

   food.add(fo[i]);     //stored the entire array into arraylist
   
}
 
}