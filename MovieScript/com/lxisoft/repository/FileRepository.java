package com.lxisoft.repository;
import java.io.*;
public class FileRepository
{
	public void createRepository()
	{
		try
		{
			File file = new File("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//Script.csv");
			file.createNewFile();	
		}
		catch(IOException e)
		{
			System.out.println("File Can't be created");
		}
	}

	public void readFromFile()
	{
		try
		{
			FileReader fr = new FileReader("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//Script.csv");
			BufferedReader br = new BufferedReader(fr);
			String conversation;
			while((conversation = br.readLine())!= null)
			{
				System.out.println(conversation);
			}
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");
		}
	}
	public void writeToFile()
	{
		try
		{
			FileWriter fw = new FileWriter("C://Users//rahul//Desktop//Java Projects//MovieScript//v1//com//lxisoft//repository//Script.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Access File");	
		}	
	}



}