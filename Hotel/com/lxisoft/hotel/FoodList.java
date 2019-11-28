package com.lxisoft.hotel;
import com.lxisoft.hotel.FoodItem;
public class FoodList
{
	public FoodItem[] foodItem = new FoodItem[10];

	public FoodItem[] setFoodObject(FoodItem[] foodItem)
	{
		for(int i = 0;i<10;i++)
		 {
		 	foodItem[i] = new FoodItem();
		 }
		 return foodItem;
	}
	public FoodItem[] setFoodItem(FoodItem[] foodItem)
	{
		 setFoodObject(foodItem);
		 foodItem[0].setName("Chicken Biriyani");
		 foodItem[0].setPrice(110);

		 foodItem[1].setName("Meals");
		 foodItem[1].setPrice(60);

		 foodItem[2].setName("Fried Rice");
		 foodItem[2].setPrice(130);

		 foodItem[3].setName("Chapathi");
		 foodItem[3].setPrice(5);

		 foodItem[4].setName("Porotta");
		 foodItem[4].setPrice(10);
		 return foodItem;
	}
	public void getFoodItem(FoodItem[] foodItem)
	{
		int n=1;
		for(int i=0;i<10;i++)
		{
			if(foodItem[i].getName()!= null)
			{
				System.out.println(n+"."+foodItem[i].getName());
				System.out.println("  "+foodItem[i].getPrice()+" Rs");
				n++;
	        }
	        
		}
	}
}