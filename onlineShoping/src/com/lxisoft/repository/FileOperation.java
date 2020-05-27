package com.lxisoft.repository;
import java.util.*;
import java.io.*;
import com.lxisoft.property.Cart;
import com.lxisoft.property.Products;
import com.lxisoft.property.Customer;
import com.lxisoft.property.Purchasedproducts;
public class FileOperation
{
	private ArrayList<Item> items=new ArrayList<Item>();
	private ArrayList<Customer> customerDetails=new ArrayList<Customer>();
	private String[] data;
	private ArrayList<CartDetail>details=new ArrayList<CartDetail>();
	private ArrayList<BuyDetail>details=new ArrayList<BuyDetail>();
	public ArrayList<Item> readProductDetails()throws Exception 
	{

		String csvFile="../Src/com/lxisoft/OnlineShoping/Products.csv";
		
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			Item item=new Item();
			String[] data=s.split(",");
			item.setItemName(data[0]);
			item.setCatogery(data[1]);
			item.setFeature(data[2]);
			int price=Integer.parseInt(data[3]);
			item.setPrice(price);
			items.add(item);
		}
		return items;

	}

	public void addUserId(User user) 
	{
		
		String csvFile="../Src/com/lxisoft/OnlineShoping/User.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(user.getName()+","+user.getPassword()+","+user.getAddress()+","+user.getPincode());
			bw.newLine();



				bw.close();
				fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Customer> readCustomerDetails(Customer customer)throws Exception 
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/Customer.csv";
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
		return userDetails;
	}
	public void cartProduct(Item product,User user)
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/Cart.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(user.getName()+","+product.getItemName());
			bw.newLine();



				bw.close();
				fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public ArrayList<CartDetail> viewCartProduct(User user,CartDetail cd)throws Exception 
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/Cart.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;

		while((s=br.readLine())!=null)
		{
			cd=new CartDetail();
			String[] cartItem=s.split(",");
			if(cartItem[0].equals(user.getName()))
			{
				cd.setCustomer(cartItem[0]);
				cd.setCartItem(cartItem[1]);
			}
			detail.add(cd);
		}
		return detail;
	}
	public ArrayList<BuyDetail> viewBuyDetail(User user,BuyDetail bd)throws Exception 
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/PurchasedProduct.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		String s;
		
		while((s=br.readLine())!=null)
		{
			bd=new BuyDetail();
			String[] buyItem=s.split(",");
			if(buyItem[0].equals(user.getName()))
			{
				bd.setCustomer(buyItem[0]);
				bd.setPurchasedItem(buyItem[1]);
				bd.setCatogery(buyItem[2]);
				bd.setFeature(buyItem[3]);
				int price = Integer.parseInt(buyItem[4]);
				bd.setPrice(price);
				
			}
			details.add(bd);
		}
		return details;
	}
	public void purchasedItemDetail(Item product,User user) 
	{
		
		String csvFile="../Src/com/lxisoft/OnlineShoping/PurchasedProduct.csv";
		String line="";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			

			bw.write(user.getName()+","+product.getItemName()+","+product.getCatogery()+","+product.getFeature()+","+product.getPrice());
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