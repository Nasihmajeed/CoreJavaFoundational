package com.lxisoft.File;
import com.lxisoft.Hotel.*;
import java.io.*;
public class FileManager
{
	int i;
	public int readFromFile(Item[] item,int ind)
	{

		String details;
		try
		{
			FileReader fr = new FileReader("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\itemlist.csv");
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while((details=br.readLine())!=null)
			{
				
				String[] st =details.split(",");
				item[i].setItem(st[0],(Integer.parseInt(st[1])),(Integer.parseInt(st[2])));
				i++;
				ind=i;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return ind;

	}

	public void updateFile(Item[] item,int ind)
	{
		try
		{
			FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\itemlist.csv",false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<ind;i++)
		{
			String na = item[i].itemName;
			int p = item[i].itemPrice;
			int q = item[i].totalAvailable;
			try
			{
				FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\itemlist.csv",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(na);
				bw.write(',');
				bw.write(Integer.toString(p));
				bw.write(',');
				bw.write(Integer.toString(q));
				bw.newLine();
				bw.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}

		}
		
	}
	public void storeToFile(OrderDetails[] od,int ind)
	{
	
			String na = od[ind].name;
			int p = od[ind].total;
			try
			{
				FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\OrderDetails.csv",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(na);
				bw.write(',');
				bw.write(Integer.toString(p));
				bw.newLine();
				bw.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}

		
		
	}  
}