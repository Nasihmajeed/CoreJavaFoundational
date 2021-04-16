import java.util.*;
import java.util.ArrayList;

class Drink

{
String dName;
float dPrice;

public void setDrinkName(String dname)
  {
	  this.dName=dname;
  }
  
  public void setDrinkPrice(float Price)
  {
	  this.dPrice=Price;
  }
  
  public String getDrinkName()
  {
	  return dName; 
  }

 public float getDrinkPrice()
 {
	 return dPrice;
 }

public static void setDrinks(ArrayList<Drink> drinks)
{
	for(int i=0;i<5;i++)
	{
	drinks.add(new Drink());   	
	}
	
   drinks.get(0).setDrinkName("Pepsi");
   drinks.get(0).setDrinkPrice(55);
   
   drinks.get(1).setDrinkName("COCA-COLA");
   drinks.get(1).setDrinkPrice(50);

   drinks.get(2).setDrinkName("Mirinda");
   drinks.get(2).setDrinkPrice(35);
 
   drinks.get(3).setDrinkName("Sprite");
   drinks.get(3).setDrinkPrice(30);
     
   drinks.get(4).setDrinkName("Maa");
   drinks.get(4).setDrinkPrice(70);
}
 
public void printMenuDrinks()
{ 
   System.out.println("...................MENU CARD [Drinks]........................");
   System.out.println("DRINKS : .........................................................Quantity...............................Price");
   System.out.println(" 1. "+drinks.get(0).getDrinkName()+" Drink Qty:"+drinks.get(0).getDrinkQty()+" Drink Price   :  "+drinks.get(0).getDrinkPrice());
   System.out.println(" 2. "+drinks.get(1).getDrinkName()+" Drink Qty:"+drinks.get(1).getDrinkQty()+" Drink Price   :  "+drinks.get(1).getDrinkPrice());
   System.out.println(" 3. "+drinks.get(2).getDrinkName()+" Drink Qty:"+drinks.get(2).getDrinkQty()+" Drink Price   :  "+drinks.get(2).getDrinkPrice());
   System.out.println(" 4. "+drinks.get(3).getDrinkName()+" Drink Qty:"+drinks.get(3).getDrinkQty()+" Drink Price   :  "+drinks.get(3).getDrinkPrice());
   System.out.println(" 5. "+drinks.get(4).getDrinkName()+" Drink Qty:"+drinks.get(4).getDrinkQty()+" Drink Price   :  "+drinks.get(4).getDrinkPrice());
}
}