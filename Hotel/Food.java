import java.util.*;
import java.util.ArrayList;

class Food
{

String foodName;

float foodPrice;


 public void setFoodName(String foodName)
  {
	  this.foodName=name;
  }
  
  public void setFoodPrice(float foodPrice)
  {
	  this.foodPrice=foodPrice;
  }
  
  public String getFoodName()
  {
	  return foodName; 
  }

 public float getFoodPrice()
 {
	 return foodPrice;
 }

public  void setFood()
 {
   for(int i=o;i<5;i++)
   {
	food.add(new Food());    
   }
   food.get(0).setFoodName("Biriyani");
   food.get(0).setFoodPrice(130);

  
   food.get(1).setFoodName("Fried Rice");
   food.get(1).setFoodPrice(100);

   
   food.get(2).setFoodName("Chapathi");
   food.get(2).setFoodPrice(10);

   
   food.get(3).setFoodName("Dosa");
   food.get(3).setFoodPrice(8);
   
  
   food.get(4).setFoodName("Meals");
   food.get(4).setFoodPrice(50);
}

public void printMenuFood()
{ 
   System.out.println("..............MENU CARD................");
   System.out.printf("%4s,%15s,%8s","Id,ITEMS,Price");
   System.out.printf("%4s,%15s,%8s"," 1 "+food.get(0).getFoodName(),food.get(0).getFoodPrice());
  System.out.printf("%4s,%15s,%8s"," 2 "+food.get(1).getFoodName(),food.get(1).getFoodPrice());
  System.out.printf("%4s,%15s,%8s"," 3 "+food.get(2).getFoodName(),food.get(2).getFoodPrice());
  System.out.printf("%4s,%15s,%8s"," 4 "+food.get(3).getFoodName(),food.get(3).getFoodPrice());
  System.out.printf("%4s,%15s,%8s"," 5 "+food.get(4).getFoodName(),food.get(4).getFoodPrice());
}

}