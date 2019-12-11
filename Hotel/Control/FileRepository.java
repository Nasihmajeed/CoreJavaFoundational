package com.lxisoft.hotelproject;
import com.lxisoft.hotelproject.*;
import java.util.*; 
import java.io.*; 
public class FileRepository
{
	File file=new File("D:\\file.csv");
	File stocks=new File("D:\\stock.csv");
	public void addwriter(ArrayList<Food> food)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<food.size();i++)
			{
				bw.write(food.get(i).getId()+","+food.get(i).getName()+","+food.get(i).getPrice()+"\n");  
				
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
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			while((data=br.readLine())!=null)
			{	
				String	[] dt=data.split(",",3);
				Food foods=new Food();
				foods.setId(Integer.parseInt(dt[0]));
				foods.setName(dt[1]);
				foods.setPrice(Integer.parseInt(dt[2]));
				System.out.println(dt[0] + (dt[1]) + (dt[2]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	public void addToStock(Stock stock,ArrayList<Food> food)
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,true);
			BufferedWriter bwr=new BufferedWriter(fwr);
			for(int j=0;j<food.size();j++)
			{	
				bwr.write(food.get(j).getId()+","+food.get(j).getName()+","+stock.getQuantity()+"\n"); 							
			}
			bwr.flush();
			bwr.close();
				
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}	
	public void readStock(Stock stock,Food foods)
	{	
		try
		{
			FileReader frs=new FileReader(stocks);
			BufferedReader sbr=new BufferedReader(frs);
			String datas=sbr.readLine();
			while((datas=sbr.readLine())!=null)
			{	
				String[] dtr=datas.split(",",3);
				//Food foods=new Food();
				Stock stocks=new Stock();
				foods.setId(Integer.parseInt(dtr[0]));
				foods.setName(dtr[1]);
				stocks.setQuantity(Integer.parseInt(dtr[2]));
				System.out.println(dtr[0] + (dtr[1]) + (dtr[2]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}	
	
}

				










