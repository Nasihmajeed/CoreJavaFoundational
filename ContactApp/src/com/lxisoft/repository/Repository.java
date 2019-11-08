package com.lxisoft.repository;
import com.lxisoft.controllers.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import java.util.*;
import java.io.*;

public class Repository implements FileRepository
{
	File file=new File(fileName);
	static int id=1;
	public void createFile(Contact c)
	{
		try
		{
			FileWriter fw=new FileWriter(file,true);
			fw.write(id+","+c.getName()+","+c.getContactNo()+"\n");
			id++;
			fw.flush();
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
		}	
		readFile();
	}

	public void readFile()
	{
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null)
			System.out.println(read+"\n");
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
		}	
	}

	// public void arrayWrite()
	// {
	// 	try
	// 	{
	// 		FileWriter fw=new FileWriter(file);
	// 		BufferedReader br=new BufferedReader(fr);
	// 		String read;
	// 		while((read=br.readLine())!=null)
	// 		System.out.println(read+"\n");
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("an error occured");
	// 	}	
	// 	readFile();
	// }

}