package com.lxisoft.onlineshoping;
import com.lxisoft.FileOperation;
public class Sale
{
	FileOperation fo=new FileOperation();
	ArrayList<BuyDetail> purchasedItems;
	Purchase_Item item
	public void buyProduct(Item product,User user)
	{
		
		fo.purchasedItemDetail(product,user);
	}

	public void vewPurchasedDetail(User user)throws Exception 
	{
		

		purchasedItems= fo.viewBuyDetail(user,bd);

		System.out.println("Customer : "+purchasedItems.get(0).getCustomer());
		int j=1;
		for (int i=0;i<purchasedItems.size();i++) 
		{
			
				System.out.println("Customer : "+purchasedItems.get(i).getCustomer());
				System.out.println("product "+j+" : "+purchasedItems.get(i).getPurchasedItem());
				System.out.println("Catogery : "+purchasedItems.get(i).getCatogery());
				System.out.println("Price : "+purchasedItems.get(i).getPrice());
			j++;
		}
		
	}
}