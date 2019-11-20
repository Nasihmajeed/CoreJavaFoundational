package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;


public class Repository implements Filerepository
{
	static int id;
	File file = new File(filename);
	public ArrayList<Contact> array = new ArrayList<Contact>();
	public void fileWrite(Contact contact)
	{ 		
		try
		{
		         
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);
	  	bw.write(id+","+contact.getName()+", "+contact.getNumber()+"\n");
	  	bw.flush();

	  	}
		catch (IOException e)
		{
			System.out.println(e);
		}
		// System.out.println(id++);
	}
	public void setId()
	{
		try
		{
		FileReader f = new FileReader(file);
		BufferedReader buf = new BufferedReader(f);
		String ss;
		while((ss= buf.readLine())!=null)
		{
			String[] str =  ss.split(",",3);
			id=(Integer.parseInt(str[0])) ;

		}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		id++;
	}
	public List <Contact> fileRead()
	{
		
		try
		{
			array.clear();
			String contacts;
		  	FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  		while( (contacts= br.readLine())!=null)
	  		{
	  				String[] str = contacts.split(",",3);
	  				Contact c = new Contact();
	  				c.setId(Integer.parseInt(str[0]));
	  				c.setName(str[1]);
	  				c.setNumber(str[2]);
	  				array.add(c);
	  		}

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return array;
	}
	public void search()
	{
		try
		{
		    FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  	String a ;
	  		while( (a= br.readLine())!=null)
	  			{
	  				String[] str = a.split(",",2);
	  				Contact c = new Contact();
	  				c.setName(str[0]);
	  				c.setNumber(str[1]);
	  				array.add(c);
	  		for(String b: str)
	  		{
	  			System.out.println(b);
	  		}
	  	}
	  }
	  catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public int getArraySize()
	{
		return array.size();
	}
	public void clearFile()
	{
		try
		{
			FileWriter fw = new FileWriter(file);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	public void editContact()
	{

	}
}