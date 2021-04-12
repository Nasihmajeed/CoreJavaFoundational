import java.util.*;
import java.util.ArrayList;

class Food
{

String fName;

float fQty,fPrice;

ArrayList<Food> food = new ArrayList<Food>();

  public void setFoodName(String name)
  {
	  this.fName=name;
  }
  
  public void setFoodQty(float Quantity)
  {
	  this.fQty=Quantity;
  }
  
  public void setFoodPrice(float Price)
  {
	  this.fPrice=Price;
  }
  
  public String getFoodName()
  {
	  return fName; 
  }

 public float getFoodQty()
 {
	 return fQty;
 }
 
 public float getFoodPrice()
 {
	 return fPrice;
 }
 
public static void menuCardSetting(ArrayList<Food> food)
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
   food.get(4).setFoodQty(2);
   food.get(4).setFoodPrice(70);
}

public void printMenu(ArrayList<Food> food)
{ 
   System.out.println("..............MENU CARD................");
   System.out.println("ITEMS : ...............................Quantity...........  .............. ...Price");
   System.out.println(" 1 .  :  "+food.get(0).getFoodName()+" Food Qty:"+food.get(0).getFoodQty()+"  Food Price   :  "+food.get(0).getFoodPrice());
   System.out.println(" 2 .  :  "+food.get(1).getFoodName()+" Food Qty:"+food.get(1).getFoodQty()+"  Food Price   :  "+food.get(1).getFoodPrice());
   System.out.println(" 3 .  :  "+food.get(2).getFoodName()+" Food Qty:"+food.get(2).getFoodQty()+"  Food Price   :  "+food.get(2).getFoodPrice());
   System.out.println(" 4 .  :  "+food.get(3).getFoodName()+" Food Qty:"+food.get(3).getFoodQty()+"  Food Price   :  "+food.get(3).getFoodPrice());
   System.out.println(" 5 .  :  "+food.get(4).getFoodName()+" Food Qty:"+food.get(4).getFoodQty()+"  Food Price   :  "+food.get(4).getFoodPrice());
}

}