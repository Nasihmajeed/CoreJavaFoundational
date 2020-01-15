package com.lxisoft.FileRepository;
import com.lxisoft.nivea.*;
import java.io.*;
import java.util.*;
public class FileRepository
{

	public void writeToFile(File file,ArrayList<Ball> ball)
	{
		try
		{
			if(file.length()==0)
			{
				FileWriter fw = new FileWriter(file,false);
				BufferedWriter bw = new BufferedWriter(fw);
				for(Ball b : ball)
				{
					bw.write(b.getName());
					bw.newLine();
					
				}
				bw.flush();
				bw.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ArrayList<Ball> readFromFile(File file,ArrayList<Ball> ball)
	{
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String name;
			int i =0;
			while((name = br.readLine())!= null)
			{
				creatingObject(name,ball);
				ball.get(i).setName(name);
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ball;
	}
	public void creatingObject(String name,ArrayList<Ball> ball)
	{
		if(name.equals("FootBall"))
		{
			ball.add(new FootBall());
		}
		else if(name.equals("VollyBall"))
		{
			ball.add(new VollyBall());
		}
		else if(name.equals("CricketBall"))
		{
			ball.add(new CricketBall());
		}
		else if(name.equals("TennisBall"))
		{
			ball.add(new TennisBall());
		}
	}
	public File ifExists()
	{
		File file = new File("D:\\Program Files\\workspace\\FirstHackethon\\CoreJavaFoundational\\BallManufacturer-hackathon\\src\\com\\lxisoft\\File\\BallStock.txt");
		try
		{
			Boolean isTrue = file.exists();
			if(!isTrue)
			{	
				file.createNewFile();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return file;
	}
}