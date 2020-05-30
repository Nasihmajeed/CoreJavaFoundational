package com.lxisoft.hotelapp; 
public class Bill
{
	private int billno;
	private String customername;
	private String foodname;
	private int quantity;
	private int amount;


	public int getBillNo() 
	{
        return billno;
    }

    public void setBillNo(int billno) 
    {
        this.billno = billno;
    }

    public String getCustomerName() 
    {
        return customername;
    }

    public void setCustomerName(String customername) 
    {
        this.customername = customername;
    }

    public String getFoodName()
    {
        return foodname;
    }

    public void setFoodName(String foodname) {
        this.foodname = foodname;

    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) 
    {
        this.amount = amount;
    }

}