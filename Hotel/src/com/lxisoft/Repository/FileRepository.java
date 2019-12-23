package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.HotelControl;
import com.lxisoft.Model.HotelModel;
import com.lxisoft.Model.FoodModel;
import com.lxisoft.Model.StockModel;
public class FileRepository
{

	File file=new File("D:\\file.csv");
	File stocks=new File("D:\\stockfile.csv");
	public void addwriter(HotelModel mhotel)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<mhotel.getFoodList().size();i++)
			{
				bw.write(mhotel.getFoodList().get(i).getId()+","+mhotel.getFoodList().get(i).getFoodType()+","+mhotel.getFoodList().get(i).getFoodPrice()+"\n");  		
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
			String str;
			while((str=br.readLine())!=null)
			{	
				String[] s=str.split(",",3);
				FoodModel foods=new FoodModel();
				foods.setId(Integer.parseInt(s[0]));
				foods.setFoodType(s[1]);
				foods.setFoodPrice(Integer.parseInt(s[2]));
				System.out.println(s[0] + (s[1]) + (s[2]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
	 	}
	}		
	public void addToStock(HotelModel mhotel,StockModel stock)
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,false);
			BufferedWriter bwr=new BufferedWriter(fwr);
			for(int j=0;j<mhotel.getStockList().size();j++)
			{	
				bwr.write(mhotel.getFoodList().get(j).getId()+","+mhotel.getFoodList().get(j).getFoodType()+","+mhotel.getStockList().get(j).getQuantity()+"\n");
			}
			bwr.flush();
			bwr.close();
				
		}
		catch(Exception e)
		{
			System.out.println(e+"Error");
			e.printStackTrace();
		}
	}	
	public void readToStock(StockModel stock,HotelModel mhotel,FoodModel foods)
	{	
		try
		{
			FileReader frs=new FileReader(stocks);
			BufferedReader bfr=new BufferedReader(frs);
			String string;
			while((string=bfr.readLine())!=null)
			{	
				String[] ss=string.split(",",3);
				StockModel stocks=new StockModel();
				foods.setId(Integer.parseInt(ss[0]));
				foods.setFoodType(ss[1]);
				stocks.setQuantity(Integer.parseInt(ss[2]));
				System.out.println(ss[0] + (ss[1]) + (ss[2]));	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}	
}


		
			



	