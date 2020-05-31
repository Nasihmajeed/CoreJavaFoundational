package com.lxisoft.onlineshoping;
import java.util.*;
import com.lxisoft.repository.FileRepository;
import com.lxisoft.onlineshoping.PurchasedItem;
public class Sale
{
	private FileRepository fileRepository;
	private List<PurchasedItem> purchasedItems;
	private PurchasedItem purItem;
	private int num;
	public void buyProduct(Item item,Customer customer)
	{
		fileRepository=new FileRepository();
		fileRepository.purchasedItemDetail(item,customer,num+1);
		num++;
	}
	public void vewPurchasedDetail(Customer customer)throws Exception 
	{
		fileRepository=new FileRepository();
		System.out.println("   PURCHASED products");
		System.out.println(" ======================");
		purchasedItems= fileRepository.viewPurchaseDetails(customer,purItem);
		System.out.println("Customer : "+purchasedItems.get(0).getCustomer());
		int j=1;

		for (int i=0;i<purchasedItems.size();i++) 
		{
			if (customer.getName().equals(purchasedItems.get(0).getCustomer())) 
			{
				System.out.println("Item No : "+i+1);
				System.out.println("product "+j+" : "+purchasedItems.get(i).getPurchasedItem());
				System.out.println("Catogery : "+purchasedItems.get(i).getCatogery());
				System.out.println("Price : "+purchasedItems.get(i).getPrice());
			}
			System.out.println("\n");
			j++;
		}
		
	}
}