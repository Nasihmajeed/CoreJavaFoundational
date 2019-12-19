package com.lxisoft.Repository;
import java.util.*;
import java.io.*;
import com.lxisoft.View.HotelView;
import com.lxisoft.Control.HotelControl;
import com.lxisoft.Model.HotelModel;
public class FileRepository
{

	File file=new File("D:\\file.csv");
	File stocks=new File("D:\\stock.csv");
	public void addwriter(HotelModel mhotel)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			BufferedReader br=new BufferedReader(fr);
			
			for(int i=0;i<mhotel.getFoodList().size();i++)
			{
				if(String data=br.read()==null)
				{
				bw.write(mhotel.getFoodList().get(i).getId()+","+mhotel.getFoodList().get(i).getFoodType()+","+mhotel.getFoodList().get(i).getFoodPrice()+"\n");  
				}		
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
			while((String data=br.read())!=null)
			{	
				String[] dt=data.split(",",3);
				FoodModel foods=new FoodModel();
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
	public void addToStock(HotelModel mhotel)
	{
		try
		{					
			FileWriter fwr=new FileWriter(stocks,true);
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
	public void readToStock()
	{	
		try
		{
			FileReader frs=new FileReader(stocks);
			BufferedReader sbr=new BufferedReader(frs);
			while((String datas=sbr.readLine())!=null)
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






	