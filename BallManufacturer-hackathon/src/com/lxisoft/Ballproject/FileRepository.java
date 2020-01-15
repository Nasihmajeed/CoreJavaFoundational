package com.lxisoft.Ballproject;
import com.lxisoft.Ballproject.*;
import java.util.*; 
import java.io.*;
public class FileRepository
{
	File file=new File("E:\\ball.csv");
	public void writeFile(ArrayList<Ball> ball)
	{
		try
		{					
			FileWriter fw=new FileWriter(file,false);
			BufferedWriter bw=new BufferedWriter(fw);				
			for(int i=0;i<ball.size();i++)
			{
				bw.write(ball.get(i).getType()+","+ball.get(i).getPrice()+","+ball.get(i).getQuantity()+"\n");  				
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
				Ball balls=new Ball();
				balls.setType(dt[0]);
				balls.setPrice(Integer.parseInt(dt[1]));
				balls.setQuantity(Integer.parseInt(dt[2]));
				System.out.println(dt[0] + (dt[1]) + (dt[2]));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	
}

				










