package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	File contactFile=new File(fileName);
	static int id=0;
	ArrayList<Contact> contacts=new ArrayList<Contact>();

	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((str=read.readLine())!=null) 
			{
				id++;
				String[] st=str.split(",",3);
				Contact	contact=new Contact();
				contact.setId(st[0]);
				contact.setName(st[1]);
				contact.setNo(st[2]);
				contacts.add(contact);
			}	
		}
		catch(IOException e)
		{
			System.out.println("");
		}
		return contacts;

	}
	// public int getId()
	// {
	// 	try
	// 	{
	// 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 		String str=read.readLine();
	// 		while((str=read.readLine())!=null) 
	// 		{
	// 			String[] st=str.split(",",3);
	// 			id=Integer.parseInt(st[0]);
	// 		}	
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("");
	// 	}
	// 	System.out.println(id);
	// 	return id;
	// }
	public void addContactDetails(Contact contact)
	{
		contacts.add(contact);	
		contactWriteIntoFile(contact);
	}
	public void contactWriteIntoFile(Contact contact)
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);	
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=" ";
			if((str=read.readLine())!=null)
			{
				br.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
				br.flush();
				br.close();
			}
			else
			{
				br.write(" ID , NAME , NUMBER \n");
				id++;
				br.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
				br.flush();
				br.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}
	public void deleteContact(int i)
	{
		contacts=getAllContacts();
		contacts.remove(i);
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				contactWriteIntoFile(contacts.get(j));
			}
	}
	public void updateFile(int i,Contact contact)
	{
		contacts=getAllContacts();
		contacts.set(i,contact);
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				contactWriteIntoFile(contacts.get(j));
			}
	}
	public void clearRepository()
	{
		try
		{
			id=0;
			FileWriter ff= new FileWriter(contactFile);
		}	
		catch(IOException e)
		{
			System.out.println("Exception!!! "+e);
		}
	}

}