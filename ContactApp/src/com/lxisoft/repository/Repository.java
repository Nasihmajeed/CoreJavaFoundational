package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;

public class Repository implements Filerepository
{
	File file = new File(filename);
	public ArrayList<Contact> array = new ArrayList<Contact>();
	public void fileWrite(Contact contact)
	{ 		
		try
		{
		
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);

	  	bw.write(contact.getName()+", "+contact.getNumber()+"\n");
	  	bw.flush();
	  		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	public void fileRead()
	{
		try
		{
		  	FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  	String a ;
	  		while( (a= br.readLine())!=null)
	  		System.out.println(a +"\n");

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	public void search()
	{
		    FileReader fr = new FileReader(file);
		  	BufferedReader br = new BufferedReader(fr);
		  	String a ;
	  		while( (a= br.readLine())!=null)
	  			{
	  				String[] str = a.split(",",2);
	  				Contact c = new Contact();
	  				c.setName() = str[0];
	  				c.setNumber() = str[1];
	  				contact.array.add(c);
	  		for(String b: str)
	  		{
	  			System.out.println(b);
	  		}
	  	}
	}
	public int getArraySize()
	{
		return array.size();
	}
}