package com.lxisoft.OnlineShoping;
import java.util.*;
import java.io.*;
public class FileOperation
{
	ArrayList<Item> product=new ArrayList<Item>();
	ArrayList<User> userDetail=new ArrayList<User>();

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
	public void cartProduct(Item product,String name)
	{
		String csvFile="../Src/com/lxisoft/OnlineShoping/Cart.csv";
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter(csvFile,true);
			bw=new BufferedWriter(fw);

			bw.write(name+","+product.getItemName()+"\n");

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.close();
				fw.close();
			}
			
		
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}