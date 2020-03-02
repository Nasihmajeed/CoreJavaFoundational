package com.lxisoft.game;
import java.io.*;
public class FileRepository
{
	public void createFile()
	{
		File file = new File("WinnerList.txt");
		try
		{
			file.createNewFile();
			System.out.println("File created");
		}
		catch(IOException e)
		{
			System.out.println("Can't create File");
		}
	}

	public void writeToFile(String name)
	{	
		try
		{
			FileWriter fw = new FileWriter("WinnerList.txt",true);
			fw.write(name+ " Wins \n"); 
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public void readFromFile()
	{
		try
		{
			FileReader fr = new FileReader("WinnerList.txt");
			BufferedReader br = new BufferedReader(fr);
			String winner;
			while((winner = br.readLine())!=null)
			{
				System.out.println(winner);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	
}