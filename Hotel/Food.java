import java.util.*;
import java.util.ArrayList;
class Food
{

String foodName;

float foodQty,foodPrice;

ArrayList<Food> food = new ArrayList<Food>();

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
 
public static void menuCardDisplay(ArrayList<Food> food)
{
   food.add(new Food());   
   food.get(0).setFoodName("Biriyani");
   food.get(0).setFoodQty(2);
   food.get(0).setFoodPrice(260);

   food.add(new Food());   
   food.get(1).setFoodName("Fried Rice");
   food.get(1).setFoodQty(3);
   food.get(1).setFoodPrice(300);

   food.add(new Food());   
   food.get(2).setFoodName("Chapathi");
   food.get(2).setFoodQty(5);
   food.get(2).setFoodPrice(50);

   food.add(new Food());   
   food.get(3).setFoodName("Dosa");
   food.get(3).setFoodQty(5);
   food.get(3).setFoodPrice(40);
   
   food.add(new Food());   
   food.get(4).setFoodName("Meals");
   food.get(4).setFoodQty(1);
   food.get(4).setFoodPrice(35);

  
   System.out.println("..........................................................................MENU CARD : ......................................................................................");
   System.out.println("ITEMS : .........................................................Quantity..........................................................Price........................................................");
   System.out.println(" 1 .  :  "+food.get[0].getFoodName()+"     Food Qty    :  "+food.get[0].getFoodQty()+"       Food Price   :  "+food.get[0].getFoodPrice());
   System.out.println(" 2 .  :  "+food.get[1].getFoodName()+"     Food Qty    :  "+food.get[1].getFoodQty()+"       Food Price   :  "+food.get[1].getFoodPrice());
   System.out.println(" 3 .  :  "+food.get[2].getFoodName()+"     Food Qty    :  "+food.get[2].getFoodQty()+"       Food Price   :  "+food.get[2].getFoodPrice());
   System.out.println(" 4 .  :  "+food.get[3].getFoodName()+"     Food Qty    :  "+food.get[3].getFoodQty()+"       Food Price   :  "+food.get[3].getFoodPrice());
   System.out.println(" 5 .  :  "+food.get[4].getFoodName()+"     Food Qty    :  "+food.get[4].getFoodQty()+"       Food Price   :  "+food.get[4].getFoodPrice());
}
}