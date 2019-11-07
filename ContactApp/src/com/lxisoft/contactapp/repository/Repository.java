package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.Contact;
import java.util.*;
import java.io.*;
public class Repository implements FileStorage
{  
	File contactFile=new File(fileName);
	static int id=0;
	public ArrayList<Contact> getFileDetails(Contact contact,ArrayList<Contact> contacts)
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
				contact.setName(st[1]);
				contact.setNo (st[2]);
				contacts.add(contact);
			}	
		}
		catch(IOException e)
		{
			System.out.println("");
		}
		return contacts;
	}
	// public void updateFileData(Contact contact,int i)
	// {
	// 	try
	// 	{
	// 		BufferedReader read=new BufferedReader(new FileReader(contactFile));
	// 		FileWriter fw= new FileWriter(contactFile,true);
	// 		BufferedWriter br = new BufferedWriter(fw);
	// 		String str=read.readLine();
	// 		while((str=read.readLine())!=null) 
	// 		{
	// 			String[] st=str.split(",",3);
	// 			String index=String.valueOf(i);
	// 			if(st[0].equals(index));
	// 			{
	// 				br.write(id+","+contact.getName()+","+contact.getNo()+"\n");
	// 			}
	// 		}
			//br.flush();
	// 		br.close();	
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println("File exception "+e);
	// 	}
	// }
	public void deleteAllContacts()
	{
		try
		{
			FileWriter fr= new FileWriter(contactFile);
			id=0;
		}	
		catch(IOException e)
		{
			System.out.println("Exception!!! "+e);
		}
	}
	public void setContacts(Contact contacts)
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);	
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=" ";
			if((str=read.readLine())!=null)
			{
				id++;
				br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
				br.flush();
				br.close();
			}
			else
			{
				br.write("ID , NAME , NUMBER \n");
				id++;
				br.write(id+","+contacts.getName()+","+contacts.getNo()+"\n");
				br.flush();
				br.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}
}