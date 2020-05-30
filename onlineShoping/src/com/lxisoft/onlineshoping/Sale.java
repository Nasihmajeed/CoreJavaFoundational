package com.lxisoft.onlineshoping;
import com.lxisoft.repository.Fileoperation;
import java.util.*;
import com.lxisoft.onlineshoping.Purchase_item;
public class Sale
{
	private Fileoperation fileoperation=new Fileoperation();
	private List<Purchase_item> purchasedItems;
	private Purchase_item purItem;
	private int num;
	public void buyProduct(Item item,Customer customer)
	{
		
		fileoperation.purchasedItemDetail(item,customer,num+1);
		num++;
	}

	public void vewPurchasedDetail(Customer customer)throws Exception 
	{
		

		purchasedItems= fileoperation.viewPurchaseDetails(customer,purItem);

		System.out.println("Customer : "+purchasedItems.get(0).getCustomer());
		int j=1;
		for (int i=0;i<purchasedItems.size();i++) 
		{
			if (customer.getName().equals(purchasedItems.get(0).getCustomer())) 
			{
				System.out.println("Item No : "+i+1);
				/*System.out.println("Customer : "+purchasedItems.get(i).getCustomer());*/
				System.out.println("product "+j+" : "+purchasedItems.get(i).getPurchasedItem());
				System.out.println("Catogery : "+purchasedItems.get(i).getCatogery());
				System.out.println("Price : "+purchasedItems.get(i).getPrice());
				


			}
			System.out.println("\n");
			j++;
		}
		
	}
}