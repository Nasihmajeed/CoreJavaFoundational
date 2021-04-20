import java.util.*;
import java.util.ArrayList;

class Food
{

String foodName;
float foodPrice;

ArrayList<Food> food = new ArrayList<Food>();

 public void setFoodName(String foodName)
  {
	  this.foodName=foodName;
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


 {
   for(int i=0;i<5;i++)
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
   System.out.println("...................MENU CARD [Food]........................");
   System.out.println("Food : .......................................................................................Price");
   System.out.println(" 1. "+food.get(0).getFoodName()+" Food Price   :  "+food.get(0).getFoodPrice());
   System.out.println(" 2. "+food.get(1).getFoodName()+" Food Price   :  "+food.get(1).getFoodPrice());
   System.out.println(" 3. "+food.get(2).getFoodName()+" Food Price   :  "+food.get(2).getFoodPrice());
   System.out.println(" 4. "+food.get(3).getFoodName()+" Food Price   :  "+food.get(3).getFoodPrice());
   System.out.println(" 5. "+food.get(4).getFoodName()+" Food Price   :  "+food.get(4).getFoodPrice());
}

}