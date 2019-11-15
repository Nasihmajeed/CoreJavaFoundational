package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	File contactFile=new File(fileName);
	static int slNo=0;
	Contact contact;
	ArrayList<Contact> contacts=new ArrayList<Contact>();

	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((str=read.readLine())!=null) 
			{
				slNo++;
				String[] st=str.split(",",3);
				contact=new Contact();
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
	public void addContactDetails(String id,String name,String number)
	{
		contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		contacts.add(contact);	
		setContacts(contact);
	}
	public void setContacts(Contact contact)
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);	
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=" ";
			if((str=read.readLine())!=null)
			{
				slNo++;
				br.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
				br.flush();
				br.close();
			}
			else
			{
				br.write(" ID , NAME , NUMBER \n");
				slNo++;
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
	public void deleteContact(String id)
	{
		int k=Integer.parseInt(id);
		System.out.println(k);
		contacts.remove(k);
		for(int i=0;i<contacts.size();i++)
			{
				System.out.println(contacts.get(i).getId());
				System.out.println(contacts.get(i).getName());
				System.out.println(contacts.get(i).getNo());
			}
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				setContacts(contacts.get(j));
			}
	}
	public void updateContact(String id,String name,String num)
	{
		contact=new Contact();
		contact.setName(name);
		contact.setNo(num);
		int i=Integer.valueOf(id);
		contacts.set(i,contact);
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				setContacts(contacts.get(j));
			}
	}
	public String getName(String id)
	{
		int i=Integer.valueOf(id);
		return contacts.get(i).getName();
	}
	public String getNo(String id)
	{
		int i=Integer.valueOf(id);
		return contacts.get(i).getNo(); 
	}
	public void clearRepository()
	{
		try
		{
			FileWriter ff= new FileWriter(contactFile);
			slNo=0;
		}	
		catch(IOException e)
		{
			System.out.println("Exception!!! "+e);
		}
	}

}