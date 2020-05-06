package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
public class Bill
{
	Order order;
	public void createBill(FoodMenu foodmenu,Adress adress)
	{
		 order = new Order();
		//System.out.println("*****"+hotel.hotelName+"*****");
		System.out.print("Address:"+adress.getAdress());
		System.out.print("__________________________\n");
		System.out.println("Thank U for Coming.We again Expecting Ur presence ");

		System.out.println("Name :"+foodmenu.foodStore[order.itemId].foodName);
		System.out.println("Rate :"+ foodmenu.foodStore[order.itemId].foodRate);
		System.out.println("Quantity :"+order.qty);
		System.out.println("_____________________");
		System.out.print("Total:");System.out.print(order.totalBill);



	}



	public void displayBill()
	{

	}
}