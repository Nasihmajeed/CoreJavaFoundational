public class Hotel
{
	private String name,place;
	FoodProduct[] foodProduct = new FoodProduct[10];
	
	public void setName(String newName)
		{
			this.name = newName;
		}
	public String getName()
		{
			return name;
		}
	public void setPlace(String newPlace)
		{
			this.place = newPlace;
		}
	public String getPlace()
		{
			return place;
		}
	FoodProduct[] setProductObject(FoodProduct[] foodProduct)
	{
		for(int i = 0;i<10;i++)
		 {
		 	foodProduct[i] = new FoodProduct();
		 }
		 return foodProduct;
	}
	 FoodProduct[] setProduct(FoodProduct[] foodProduct)
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
	void getProduct()
	{
		int n=1;
		for(int i=0;i<10;i++)
		{
			if(foodProduct[i].getName()!= null)
			{
				System.out.println(n+"."+foodProduct[i].getName());
				System.out.println("  "+foodProduct[i].getAmount()+" Rs");
	        }
	        n++;
		}
	}
}