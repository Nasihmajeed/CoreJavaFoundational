package com.lxisoft.repository;
import com.lxisoft.repository.*;
import com.lxisoft.market.*;
import java.util.*; 
import java.io.*; 
public class FileRepository
{
	public File file = new File("D:\\EverGreen.csv");
	public boolean fileExist(File file)
	{
		boolean isCheck=file.exists();
		return isCheck;
	}
	public void writeToFile(List<Item> items)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<items.size();i++)
			{
				bw.write(items.get(i).getName()+","+items.get(i).getId()+","+items.get(i).getPrice()+"\n");  	
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
	public void readFromFile()
	{	
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			while((data=br.readLine())!=null)
			{	
				String[] dt=data.split(",",4);
				Item item=new Item();
				item.setName(dt[0]);
				item.setId(Integer.parseInt(dt[1]));
				item.setPrice(Integer.parseInt(dt[2]));
				System.out.println(dt[0] + (dt[1]) + (dt[2]) );
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
}

				










