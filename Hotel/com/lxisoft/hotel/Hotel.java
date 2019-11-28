package com.lxisoft.hotel;

public class Hotel
{
	String name,place;
	public FoodProduct[] foodProduct = new FoodProduct[10];
	public Hotel(String name,String place)
	{
	 this.name = name;
	 this.place = place;
	}
	public FoodProduct[] setProductObject(FoodProduct[] foodProduct)
	{
		for(int i = 0;i<10;i++)
		 {
		 	foodProduct[i] = new FoodProduct();
		 }
		 return foodProduct;
	}
	public FoodProduct[] setProduct(FoodProduct[] foodProduct)
	{
		 setProductObject(foodProduct);
		 foodProduct[0].setName("Chicken Biriyani");
		 foodProduct[0].setAmount(110);

		 foodProduct[1].setName("Meals");
		 foodProduct[1].setAmount(60);

		 foodProduct[2].setName("Fried Rice");
		 foodProduct[2].setAmount(130);

		 foodProduct[3].setName("Chapathi");
		 foodProduct[3].setAmount(5);

		 foodProduct[4].setName("Porotta");
		 foodProduct[4].setAmount(10);
		 return foodProduct;
	}
	public void getProduct(FoodProduct[] foodProduct)
	{
		int n=1;
		for(int i=0;i<10;i++)
		{
			if(foodProduct[i].getName()!= null)
			{
				System.out.println(n+"."+foodProduct[i].getName());
				System.out.println("  "+foodProduct[i].getAmount()+" Rs");
				n++;
	        }
	        
		}
	}
}