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
	private List<Contact>contactList=new ArrayList<Contact>();
	public void setContactList(List<Contact>contactList)
	{
		this.contactList=contactList;
	}
	public List<Contact> getContactList()
	{
		return contactList;
	}

	public int getContactListSize()
	{
		return contactList.size();
	}


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
	public List<Contact> arrayWrite()
	{
		try
		{
			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String read;
			System.out.println("\nCONTACT LIST\n************");
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
			id=0;
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
			id=0;
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
		}
	}
}