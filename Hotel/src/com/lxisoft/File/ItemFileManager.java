package com.lxisoft.File;
import com.lxisoft.Hotel.*;
import com.lxisoft.Person.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Date;
public class ItemFileManager
{

	public File loadFile()
	{
		Hotel hotel = new Hotel();
		File file = new File("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\itemlist.csv");
		try
		{
			Boolean tf = file.exists();
			if(!tf)
			{	
				file.createNewFile();
				throw new fileNotFound();

			}
		}
		catch(fileNotFound e)
		{
			
			System.out.println("File created - Now add new items \n Enter admin password and log on to admin password");
			hotel.ad.checkAdmin(hotel.adminCount);
			hotel.adminCount++;
			System.out.println("Now enter the Customer details Sorry for the wait\n\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return file;
	}

	int rowCount=1;
	int i;
	public int readFromFile(Item[] item,int ind)
	{
		File file = loadFile();
		int rowCount=1;
		String details;
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while((details=br.readLine())!=null)
			{
				if(rowCount==1)
				{
					details=br.readLine();
					rowCount++;
				}
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
		File file = loadFile();
		int counter=1;
		try
		{
			FileWriter fw = new FileWriter(file,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.flush();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<ind;i++)
		{
			
			String na = item[i].getItemName();
			int p = item[i].getItemPrice();
			int q = item[i].getTotalAvailable();
			try
			{
				FileWriter f = new FileWriter(file,true);
				BufferedWriter b = new BufferedWriter(f);
				if(counter==1)
				{
					b.write("Item Name");b.write(',');b.write("Item Price");b.write(',');b.write("Item Stock");b.newLine();counter++;
				}
				b.write(na);b.write(',');b.write(Integer.toString(p));b.write(',');b.write(Integer.toString(q));b.newLine();b.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}

		}
		
	}
	public void storeToFile(OrderDetails[] od,int ind)
	{
		
			String date = od[ind].date;
			String na = od[ind].name;
			int p = od[ind].total;
			int rat = od[ind].ratings;
			try
			{
				FileWriter fw = new FileWriter("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\OrderDetails.csv",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(date);bw.write(',');bw.write(na);bw.write(',');bw.write(Integer.toString(p));bw.write(',');bw.write(Integer.toString(rat));bw.newLine();bw.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();			
			}

		
		
	}  
	public int readOrderDetails(OrderDetails[] od,int ind)
	{
		int rowCount=1,i;
		Date date = new Date();  
    	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
    	String today= formatter.format(date);
    	String details;
    	try
    	{
    		FileReader fr = new FileReader("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\OrderDetails.csv");
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while(( details= br.readLine())!=null)
			{

				if(rowCount==1)
				{
					details=br.readLine();
					rowCount++;
				}
				String[] st =details.split(",");
				if(st[0].equals(today))
				{
					od[i].date=st[0];
					od[i].name=st[1];
					od[i].total=Integer.parseInt(st[2]);
					od[i].ratings=Integer.parseInt(st[3]);
					i++;
				}

				
				ind=i;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		return ind;
    	
	}

public int readOrderDetails(OrderDetails[] od,int ind,String date)
	{
		int rowCount=1,i;
		// Date date = new Date();  
  //   	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
  //   	String today= formatter.format(date);
    	String details;
    	try
    	{
    		FileReader fr = new FileReader("E:\\prgmfiles\\CoreJavaFoundational\\Hotel\\src\\com\\lxisoft\\File\\OrderDetails.csv");
			BufferedReader br = new BufferedReader(fr);
			i=0;
			while(( details= br.readLine())!=null)
			{

				if(rowCount==1)
				{
					details=br.readLine();
					rowCount++;
				}
				String[] st =details.split(",");
				if(st[0].equals(date))
				{
					od[i].date=st[0];
					od[i].name=st[1];
					od[i].total=Integer.parseInt(st[2]);
					od[i].ratings=Integer.parseInt(st[3]);
					i++;
				}

				
				ind=i;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		return ind;
    	
	}
}
class fileNotFound extends Exception
{
	public fileNotFound()
	{
		System.out.println("Please initialize the Menu first - file missing");
	}
}