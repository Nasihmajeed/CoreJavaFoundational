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
	FileWriter fw=null;
	static int id=0;
	public void createFile(Contact c)
	{
		try
		{
			fw=new FileWriter(file,true);
			count();
			fw.write(id+","+c.getName()+","+c.getContactNo()+"\n");
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
			System.out.println("an error ");
		}	
	}

	public List<Contact> arrayWrite(List<Contact>contactList)
	{
		try
		{
			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null)
			{
				System.out.println(read+"\n");
				String[] str=read.split(",",3);
				Contact c=new Contact();
				c.setName(str[1]);
				c.setContactNo(str[2]);
				contactList.add(c);
			}
		}
		catch(IOException e)
		{
			System.out.println(" error ");
		}	
		return contactList;
	}

	public void count()
	{
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null)
			id++;
		}
		catch(IOException e)
		{
			System.out.println("an error ");
		}	
	}

	public void resetFile()
	{
		try
		{
			FileWriter f=new FileWriter(file);
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
		}
	}
}