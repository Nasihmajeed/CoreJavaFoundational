package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import com.lxisoft.onlineshoping.Cart;
import com.lxisoft.onlineshoping.Item;
import com.lxisoft.onlineshoping.Carted_item;
import com.lxisoft.onlineshoping.Purchase_item;

/*import com.lxisoft.properties.Products;
import com.lxisoft.properties.Products;
import com.lxisoft.properties.cart;*/
import com.lxisoft.onlineshoping.Customer;
//import com.lxisoft.properties.Purchasedproducts;
public class Fileoperation
{
	private List<Item> items=new ArrayList<Item>();
	private List<Customer> customerDetails=new ArrayList<Customer>();
	private String[] data;
	private Item item;
	private Map<String,String> carteddetails=new HashMap<String,String>();
	//private List<Carted_item>carteddetails=new ArrayList<Carted_item>();
	private List<Purchase_item>purchaseddetails=new ArrayList<Purchase_item>();


	public List<Item> readProductDetails(Item item)throws Exception 
	{

		String csvFile="../src/com/lxisoft/properties/Products.csv";
		
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
		
		String csvFile="../src/com/lxisoft/properties/Customer.csv";
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
		String csvFile="../src/com/lxisoft/properties/Customer.csv";
		BufferedReader br=new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			customer=new Customer();
			String[] data=s.split(",");
			customer.setName(data[0]);
			customer.setPassword(data[1]);
			customer.setAddress(data[2]);
			int pincode = Integer.parseInt(data[3]);
			customer.setPincode(pincode);
			customerDetails.add(customer);
			
		}
		return customerDetails;
	}
	public void cartProduct(Item product,Customer customer,int id)
	{
		String csvFile="../src/com/lxisoft/properties/Cart.csv";
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



	public Map viewCartProduct(Customer customer,Carted_item cd)throws Exception 
	{
		String csvFile="../src/com/lxisoft/properties/Cart.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;

		while((s=br.readLine())!=null)
		{
			cd=new Carted_item();
			String[] cartItem=s.split(",");


			carteddetails.put(cartItem[0],cartItem[1]);


			/*if(cartItem[0].equals(customer.getName()))
			{
				cd.setCustomer(cartItem[0]);
				cd.setCartItem(cartItem[1]);
			}
			carteddetails.add(cd);*/
		}
		return carteddetails;
	}



	public List<Purchase_item> viewPurchaseDetails(Customer customer,Purchase_item purItem)throws Exception 
	{
		String csvFile="../src/com/lxisoft/properties/PurchasedProduct.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;
		
		while((s=br.readLine())!=null)
		{
			purItem=new Purchase_item();
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
		
		String csvFile="../src/com/lxisoft/properties/PurchasedProduct.csv";
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