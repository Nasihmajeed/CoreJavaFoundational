package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.CartedItem;
import com.lxisoft.onlineshoping.PurchasedItem;
import com.lxisoft.onlineshoping.Customer;

public class FileRepository
{
	private List<Item> items;
	private List<Customer> customerDetails;
	private String[] data;
	private Item item;
	private List<CartedItem> carteddetails;
	private Map<String,String> logindetails;
	//private Map<String,String> carteddetails;
	private List<PurchasedItem>purchaseddetails;


	public List<Item> readProductDetails(Item item)throws Exception 
	{

		items=new ArrayList<Item>();
		String csvFile="../properties/Products.csv";
		
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			item=new Item();
			String[] data=s.split(",");
			item.setItemName(data[0]);
			item.setCatogery(data[1]);
			item.setFeature(data[2]);
			int price=Integer.parseInt(data[3]);
			item.setPrice(price);
			int id=Integer.parseInt(data[4]);
			item.setId(id);
			items.add(item);
		}
		return items;

	}

	public void addCustomerId(Customer customer) 
	{
		
		String csvFile="../properties/Customer.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(customer.getName()+","+customer.getPassword()+","+customer.getAddress()+","+customer.getPincode());
			bw.newLine();



				bw.close();
				fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public List<Customer> readCustomerDetails(Customer customer)throws Exception 
	{
		
		customerDetails=new ArrayList<Customer>();
		String csvFile="../properties/Customer.csv";
		BufferedReader br=new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			customer=new Customer();
			String[] data=s.split(",");
			customer.setName(data[0]);
			customer.setAddress(data[2]);
			int pincode = Integer.parseInt(data[3]);
			customer.setPincode(pincode);
			customerDetails.add(customer);
			
			

		}
		return customerDetails;
	}
	public Map readLoginDetails(Customer customer)throws Exception 
	{
		logindetails=new HashMap<String,String>();
		String csvFile="../properties/Customer.csv";
		BufferedReader br=new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			
			String[] data=s.split(",");	
			logindetails.put(data[0],data[1]);
			

		}
		
		return logindetails;
	}
	public void cartProduct(Item product,Customer customer,int id)
	{
		String csvFile="../properties/Cart.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(id+","+customer.getName()+","+product.getItemName());
			bw.newLine();



				bw.close();
				fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}



	/*public Map viewCartProduct(Customer customer,CartedItem cd)throws Exception 
	{
		carteddetails=new HashMap<String,String>();
		String csvFile="../properties/Cart.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;

		while((s=br.readLine())!=null)
		{
			cd=new CartedItem();
			String[] cartItem=s.split(",");


			carteddetails.put(cartItem[1],cartItem[2]);
		}
		return carteddetails;
	}*/

	public List<CartedItem> viewCartProduct(Customer customer,CartedItem cd)throws Exception 
	{
		carteddetails=new ArrayList<CartedItem>();
		String csvFile="../properties/Cart.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;

		while((s=br.readLine())!=null)
		{
			cd=new CartedItem();
			String[] cartItem=s.split(",");
			if(cartItem[1].equals(customer.getName()))
			{
				cd.setCustomer(cartItem[1]);
				cd.setCartItem(cartItem[2]);
			}
			carteddetails.add(cd);
		}
		return carteddetails;
	}

	public List<PurchasedItem> viewPurchaseDetails(Customer customer,PurchasedItem purItem)throws Exception 
	{
		purchaseddetails=new ArrayList<PurchasedItem>();
		String csvFile="../properties/PurchasedProduct.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;
		
		while((s=br.readLine())!=null)
		{
			purItem=new PurchasedItem();
			String[] buyItem=s.split(",");
			if(buyItem[0].equals(customer.getName()))
			{
				purItem.setCustomer(buyItem[0]);
				purItem.setPurchasedItem(buyItem[1]);
				purItem.setCatogery(buyItem[2]);
				purItem.setFeature(buyItem[3]);
				int price = Integer.parseInt(buyItem[4]);
				purItem.setPrice(price);
				int number = Integer.parseInt(buyItem[5]);
				purItem.setItemNumber(number);
				
			}
			purchaseddetails.add(purItem);
		}
		return purchaseddetails;
	}
	public void purchasedItemDetail(Item item,Customer customer,int num) 
	{
		
		String csvFile="../properties/PurchasedProduct.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(customer.getName()+","+item.getItemName()+","+item.getCatogery()+","+item.getFeature()+","+item.getPrice()+","+num);
			bw.newLine();

			

				bw.close();
				fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}