package com.lxisoft.hotelapp;

public class Food
{
	
    private int foodid;
	private String foodname;
	private int price;
	 	
	public int getFoodId()
	{
		return foodid;
	}
	public void setFoodId(int foodid) {
        this.foodid = foodid;
    }
    public String getFoodName() {
        return foodname;
    }
    public void setFoodName(String foodname) {
        this.foodname = foodname;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}