package com.lxisoft.repository;
import java.util.*;
import com.lxisoft.filerepository.*;
import java.io.*;
import com.lxisoft.test.*;
import com.lxisoft.model.*;
import com.lxisoft.view.*;


public class Repository implements Filerepository
{
	static int id=1;
	File file = new File(filename);
	public ArrayList<Contact> array = new ArrayList<Contact>();

	public void fileWrite(Contact contact,boolean isTrue)
	{ 		
		
		try
		{		         
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw= new BufferedWriter(fw);
		if(isTrue == true)
		{
		  	bw.write(id+","+contact.getName()+", "+contact.getNumber()+"\n");
		  	bw.flush();
	    }
	     else if(isTrue== false)
	    {
		    bw.write(contact.getId()+","+contact.getName()+", "+contact.getNumber()+"\n");
		  	bw.flush();
	  	}
	    }
		catch (IOException e)
		{
			System.out.println(e);
		}
		
	  
    }
	public int setId()
	{

		try
		{
		FileReader f = new FileReader(file);
		BufferedReader buf = new BufferedReader(f);
		String ss;
		while((ss = buf.readLine())!=null)
		{
			
			String[] str =  ss.split(",",3);
			id=(Integer.parseInt(str[0])) ;
			id++;
		}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		return id;
	}
	public ArrayList <Contact> fileRead()
	{
		// TreeSet <Contact> ts = new TreeSet <Contact> (); 
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

	  		//array.addAll(ts);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return array;
	}
	public void sortByname()
	{
		array=fileRead();
		Collections.sort(array, new SortName()); 
		for(int i=0; i <array.size();i++)
		{
		   System.out.println( "NAME:"+array.get(i).getName()+" NUMBER:"+array.get(i).getNumber());
		}
		
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