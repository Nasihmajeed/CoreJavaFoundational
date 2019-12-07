package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
public class FoodList
{
	public FoodItem[] foodItemList = new FoodItem[10];


	/*public FoodItem[] setFoodObject(FoodItem[] foodItemList)
	{
		for(int i = 0;i<10;i++)
		 {
		 	foodItemList[i] = new FoodItem();
		 }
		 return foodItemList;
	}*/
	public FoodItem[] setFoodItem(FoodItem[] foodItemList)
	{
		Biriyani biriyani = new Biriyani();
		 /*setFoodObject(foodItemList);*/
		 biriyani.setBiriyani();
		 foodItemList[0] = biriyani;
		 /*foodItemList[0].setPrice(110);*/

		 foodItemList[1] = new FoodItem();
		 foodItemList[1].setName("Meals");
		 foodItemList[1].setPrice(60);

         foodItemList[2] = new FoodItem();
		 foodItemList[2].setName("Fried Rice");
		 foodItemList[2].setPrice(130);

         foodItemList[3] = new FoodItem();
		 foodItemList[3].setName("Chapathi");
		 foodItemList[3].setPrice(5);

		 foodItemList[4] = new FoodItem();
		 foodItemList[4].setName("Porotta");
		 foodItemList[4].setPrice(10);
		 return foodItemList;
	}
	public void getFoodItem()
	{
		int n=1;
		System.out.println("*********Menu*********");
		for(int i=0;i<10;i++)
		{
			if(foodItemList[i].getName()!= null)
			{
				System.out.println(n+"."+foodItemList[i].getName());
				System.out.println("  "+foodItemList[i].getPrice()+" Rs");
				n++;
	        }
	        
		}
	}
}