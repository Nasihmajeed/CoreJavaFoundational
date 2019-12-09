package com.lxisoft.hotel;
import java.util.ArrayList;
import com.lxisoft.hotel.*;
public class FoodList
{
	public ArrayList<FoodItem> foodItemList = new ArrayList<FoodItem>();

	public void setFoodItem()
	{
		FoodItem biriyani = new Biriyani();
		((Biriyani)biriyani).setBiriyani();
		 foodItemList.add(biriyani);

		 foodItemList.add(new FoodItem());
		 foodItemList.get(1).setName("Meals");
		 foodItemList.get(1).setPrice(60);

         foodItemList.add(new FoodItem());
		 foodItemList.get(2).setName("Chappathi");
		 foodItemList.get(2).setPrice(10);

         foodItemList.add(new FoodItem());
		 foodItemList.get(3).setName("Porotta");
		 foodItemList.get(3).setPrice(20);

		 foodItemList.add(new FoodItem());
		 foodItemList.get(4).setName("Fried Rice");
		 foodItemList.get(4).setPrice(130);
	}
	public void getFoodItem()
	{
		int n=1;
		System.out.println("*********Menu*********");
		for(int i=0;i<foodItemList.size();i++)
		{
			if(foodItemList.get(i).getName()!= null)
			{
				System.out.println(n+"."+foodItemList.get(i).getName());
				System.out.println("  "+foodItemList.get(i).getPrice()+" Rs");
				n++;
	        }
	        
		}
	}
}