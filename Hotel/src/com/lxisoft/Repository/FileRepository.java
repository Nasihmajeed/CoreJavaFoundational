package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.HotelControl;
import com.lxisoft.Model.HotelModel;
public class FileRepository
{

	File file=new File("D:\\file.csv");
	//File stocks=new File("D:\\stock.csv");
	public void addwriter(HotelModel mhotel)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<foodList.getFoodList().size();i++)
			{
				
				bw.write(foodList.getFoodList().get(i).getId()+","+foodList.getFoodList().get(i).getFoodType()+","+foodList.getFoodList().get(i).getFoodPrice()+"\n");  
				
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

	public void addToStock()
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,true);
			BufferedWriter bwr=new BufferedWriter(fwr);
			for(int j=0;j<foodList.getFoodList().size();j++)
			{	
				bwr.write(foodList.getFoodList().get(i).getId()+","+foodList.getFoodList().get(i).getFoodType()+","+getStockList().get(k).getQuantity()+"\n"); 							
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
	public void readStock()
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






	