package com.lxisoft.user;
import java.util.*;
public class Buyer
{
	String buyerName;
	String buyingItem;

	public void createBuyer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Buyer Name:");
		buyerName = sc.nextLine();
	}

	public void displayBuyerDetails()
	{
		System.out.println("*****Buyer Details*****");
		System.out.println(buyerName);
	}

}