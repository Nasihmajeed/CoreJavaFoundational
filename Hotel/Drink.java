import java.util.*;
import java.util.ArrayList;

class Drink
{

String drinkName;
float drinkPrice;

ArrayList<Drink> drinks = new ArrayList<Drink>();

public void setDrinkName(String drinkName)
  {
	  this.drinkName=drinkName;
  }
  
  public void setDrinkPrice(float drinkPrice)
  {
	  this.drinkPrice=drinkPrice;
  }
  
  public String getDrinkName()
  {
	  return drinkName; 
  }

 public float getDrinkPrice()
 {
	 return drinkPrice;
 }

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
   System.out.println("DRINKS : .......................................................................................Price");
   System.out.println(" 1. "+drinks.get(0).getDrinkName()+" Drink Price   :  "+drinks.get(0).getDrinkPrice());
   System.out.println(" 2. "+drinks.get(1).getDrinkName()+" Drink Price   :  "+drinks.get(1).getDrinkPrice());
   System.out.println(" 3. "+drinks.get(2).getDrinkName()+" Drink Price   :  "+drinks.get(2).getDrinkPrice());
   System.out.println(" 4. "+drinks.get(3).getDrinkName()+" Drink Price   :  "+drinks.get(3).getDrinkPrice());
   System.out.println(" 5. "+drinks.get(4).getDrinkName()+" Drink Price   :  "+drinks.get(4).getDrinkPrice());
}
}