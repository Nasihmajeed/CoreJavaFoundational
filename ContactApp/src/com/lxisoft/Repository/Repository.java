package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class Repository implements FileRepository
{
	static File file=new File(fileName);
	static FileWriter fw=null;

	public void clearAll()
	{
		try
		{
			FileWriter fy=new FileWriter(file);
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public ArrayList<Contact> initialization(ArrayList<Contact> contacts, Contact contact)
	{
		try
		{

			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String str=br.readLine();
			while((str=br.readLine())!=null)
			{
				String[] strln=str.split(",",2);
				contact=new Contact();
				contact.setName(strln[0]);
				contact.setNo (strln[1]) ;
				contacts.add(contact);

			}
		}catch(Exception e)
		{
			System.out.println("error");
		}
		
		return contacts;
	} 





	public void updateFile(Contact contact)
	{
		try
		{
			fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String str=null;
			if((str=br.readLine())==null)
			{
				fw=new FileWriter(file);
				fw.write("Name ,");
				fw.flush();
				fw.write("number \n");
				fw.flush();
			}

			
			
				fw.write(contact.getName());
				fw.write(",");
				fw.write((String.valueOf( contact.getNo())));
				fw.write("\n");
				fw.flush();

			
		}catch(Exception e)
		{
			System.out.println("error occure : "+e);
		}
	}
	public void viewAllContacts()
	{
		try
		{
			FileReader fr=new FileReader( file);
			BufferedReader br =new BufferedReader(fr);
			String str=null;
			while((str=br.readLine())!=null)
			{
				System.out.println("-----------"+ 	str);
			}
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}
}