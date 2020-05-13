package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.market.*;
import java.util.*; 
import java.io.*; 
public class FileRepository
{
	File market=new File("D:\\Stationary.csv");
	public void writeFile(List<Item> items)
	{
		try
		{					
			FileWriter fw=new FileWriter(market,true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<items.size();i++)
			{
				bw.write(items.get(i).getName()+","+items.get(i).getId()+","+items.get(i).getPrice()+","+items.get(i).getQuantity()+"\n");  
				
			}	
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}	
	public void readFile()
	{	
		try
		{
			FileReader fr=new FileReader(market);
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			while((data=br.readLine())!=null)
			{	
				String[] dt=data.split(",",4);
				Item item=new Item();
				item.setName(dt[0]);
				item.setId(Integer.parseInt(dt[1]));
				item.setPrice(Integer.parseInt(dt[2]));
				item.setQuantity(Integer.parseInt(dt[3]));
				System.out.println(dt[0] + (dt[1]) + (dt[2]) + (dt[3]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
}

				










