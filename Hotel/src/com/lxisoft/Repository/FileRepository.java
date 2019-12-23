package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.HotelControl;
import com.lxisoft.Model.HotelModel;
import com.lxisoft.Model.FoodModel;
public class FileRepository
{

	File file=new File("D:\\file.csv");
	File stocks=new File("D:\\stock.csv");
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
	public void addToStock(HotelModel mhotel)
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,false);
			BufferedWriter bwr=new BufferedWriter(fwr);
			for(int j=0;j<mhotel.getFoodList().size();j++)
			{	
				bwr.write(mhotel.getFoodList().get(j).getId()+","+mhotel.getFoodList().get(j).getFoodType()+","+mhotel.getStockList().get(j).getQuantity()+"\n");
				
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
	// public void readToStock(Stock stock,FoodModel food)
	// {	
	// 	try
	// 	{
	// 		FileReader frs=new FileReader(stocks);
	// 		BufferedReader sbr=new BufferedReader(frs);
	// 		while((String datas=sbr.readLine())!=null)
	// 		{	
	// 			String[] dtr=datas.split(",",3);
	// 			Stock stocks=new Stock();
	// 			foods.setId(Integer.parseInt(dtr[0]));
	// 			foods.setFoodName(dtr[1]);
	// 			stocks.setFoodQuantity(Integer.parseInt(dtr[2]));
	// 			System.out.println(dtr[0] + (dtr[1]) + (dtr[2]));
	// 		}
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		System.out.println("Error");
	// 		e.printStackTrace();
	// 	}
	// }	
}






	