package com.lxisoft.Repository;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.io.*;
import java.util.*;

public class Repository implements FileRepository
{
	File file=new File(fileName);
	ArrayList<Contact> contacts =new ArrayList<Contact>();
	static int id;
	
	public void writeNewContact(Contact contact,boolean write)
	{
		try
		{
			FileWriter bf=new FileWriter(file,true);
			if(write)
			{
				id=getId();
				bf.write(id+","+contact.getName()+","+contact.getNo()+"\n");
			}
			else
			{
				bf.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
			}
			bf.flush();
		}
		catch(Exception e)
		{
			System.out.println("error1");
		}
	}
	public void viewAllContacts()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			FileWriter d=new FileWriter(file,true);
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			Contact contact=null;
			contacts.clear();
			while((str=bf.readLine())!=null)
			{
				contact=new Contact();
				String[] strln=str.split(",",3);
				
				contact.setId((Integer.parseInt(strln[0])));
				contact.setName(strln[1]);
				contact.setNo(strln[2]);
				contacts.add(contact);
				// System.out.println("test Repository"+strln[1]);
					
				
			}
		}
		catch(Exception e)
		{
			System.out.println("error2");
		}
		return contacts;
	}

	public int getId()
	{
		try
		{
			BufferedReader bf=new BufferedReader(new FileReader(file));
			String str=null;
			while((str=bf.readLine())!=null)
			{
				String[] strln=str.split(",",2);
				id=Integer.parseInt(strln[0]);				
				
			}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		return ++id;
	}
	public void editFile(Contact contact, int i)
	{
		contacts=getAllContacts();
		contacts.set(i,contact);
		clearFile();
		resetFile();
		
	}
	public void resetFile()
	{ for(int i=0;i<contacts.size();i++)
		{
			writeNewContact(contacts.get(i),false);
		}
	}
	public void deleteContact(int i)
	{
		contacts=getAllContacts();
		contacts.remove(i);
		clearFile();
		resetFile();
	}
	public void clearFile()
	{
		try
		{
			id=0;
			FileWriter fi=new FileWriter(file);
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}

}