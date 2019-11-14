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
				id++;
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
		setContacts();
	}
	public void setContacts()
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);	
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=" ";
			if((str=read.readLine())!=null)
			{
				//id++;
				br.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
				br.flush();
				br.close();
			}
			else
			{
				br.write("ID , NAME , NUMBER \n");
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

	// public ArrayList<Contact> getFileDetails(Contact contact,ArrayList<Contact> contacts)
	// {
	// 	try
	// 	{
	// 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 		String str=read.readLine();
	// 		while((str=read.readLine())!=null) 
	// 		{
	// 			id++;
	// 			String[] st=str.split(",",3);
	// 			contact=new Contact();
	// 			contact.setName(st[1]);
	// 			contact.setNo (st[2]);
	// 			contacts.add(contact);
	// 		}	
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("");
	// 	}
	// 	return contacts;
	// }
	// // public void update(String name)
	// // {
	// // 	try
	// // 	{
	// // 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// // 		BufferedWriter br = new BufferedWriter(new FileWriter(contactFile,true));
	// // 		String str=read.readLine();
	// // 		while((str=read.readLine())!=null)
	// // 		{
	// // 			String[] strln=str.split(",",3);
	// // 			System.out.println(strln[1]+  " "+name);
	// // 			if(strln[1].equals(name))
	// // 				br.write(1+", Name, 9999");
	// // 				br.flush();

	// // 		}
	// // 		br.close();
	// // 	}catch(Exception e)
	// // 	{
	// // 		System.out.println("error");
	// // 	}

			
	// // }
	// public void deleteAllContacts()
	// {
	// 	try
	// 	{
	// 		FileWriter fr= new FileWriter(contactFile);
	// 		id=0;
	// 	}	
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("Exception!!! "+e);
	// 	}
	// }
	// public void setContacts(Contact contacts)
	// {
	// 	try
	// 	{
	// 		FileWriter fw= new FileWriter(contactFile,true);
	// 		BufferedWriter br = new BufferedWriter(fw);	
	// 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 		String str=" ";
	// 		if((str=read.readLine())!=null)
	// 		{
	// 			id++;
	// 			br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
	// 			br.flush();
	// 			br.close();
	// 		}
	// 		else
	// 		{
	// 			br.write("ID , NAME , NUMBER \n");
	// 			id++;
	// 			br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
	// 			br.flush();
	// 			br.close();
	// 		}
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("File exception "+e);
	// 	}
	// }
}