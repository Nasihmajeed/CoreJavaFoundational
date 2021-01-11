package com.LxiSoft.HotelDetails;
import java.util.*;

enum Type
{
  FISH,MEAT;
}

public class Rice implements Food
{
  String foodName;
  int price;
    
  public void setName(String food)
  {
	  this.foodName = food;
  }
  
  public String getName()
  {
		return foodName;
  }
	
  public void setPrice(int price)
  {
  	this.price = price;
  }
    
  public int getPrice()
  {
		return price;
  }

  Type type;

  public void foodType(Type type)
  {
    Menu menu = new Menu();
    Scanner s =new Scanner(System.in);
    switch(type)
    {
      case FISH:
      menu.printFishMenu();
      int more;
      do
      {			        
        System.out.println("\nEnter Sl.No. ");
        int ordr = s.nextInt();

        System.out.println("More specials? \n1.Yes \n0.No");
        more = s.nextInt();
      }
      while(more != 0);
      break;

      case MEAT:
      menu.printMeatMenu();
      int moree;
      do
      {			                
        System.out.println("\nEnter Sl.No. ");          
        int ordr = s.nextInt();

        System.out.println("Order more? \n1.Yes \n0.No");
        moree = s.nextInt();
      }
      while(moree != 0);
      break;

      default:
      System.out.println("Invalid");
      break;
    }
  }
}
