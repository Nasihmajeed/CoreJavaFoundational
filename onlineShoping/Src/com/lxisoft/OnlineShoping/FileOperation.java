package com.lxisoft.OnlineShoping;
import java.util.*;
import java.io.*;
public class FileOperation
{
	ArrayList<Item> product=new ArrayList<Item>();
	ArrayList<User> userDetail=new ArrayList<User>();
	String[] cartItems;
	public ArrayList<Item> readProductDetails(Item item)throws Exception 
	{

		String csvFile="../Src/com/lxisoft/OnlineShoping/Products.csv";
		
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
			product.add(item);
		}
		return product;

	}


	public ArrayList<User> readUserDetails(User user)throws Exception 
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/User.csv";
		BufferedReader br=new BufferedReader(new FileReader(csvFile));
		String s;
		while((s=br.readLine())!=null)
		{
			user=new User();
			String[] data=s.split(",");
			user.setName(data[0]);
			user.setPassword(data[1]);
			user.setAddress(data[2]);
			int pincode = Integer.parseInt(data[3]);
			user.setPincode(pincode);
			userDetail.add(user);
			
		}
		return userDetail;
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
	public String[] viewCartProduct(Item product)
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/Cart.csv";
		FileReader fr=new FileReader();
		BufferedReader br=new BufferedReader(fr);
		String s;
		while(s=br.readLine()!=null)
		{
			String[] cartItem=s.split(",");
			if(cartItem[0].equals(product.getName()))
			{
				String[] item=cartItem
			}
			
			
		}
		return cartItems;
	}
}