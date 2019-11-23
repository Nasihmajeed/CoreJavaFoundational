package com.lxisoft.contactapp.repository;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
import java.util.Collections;
import java.io.*;
/**
 * class Repository is created to do file operations that implements filestorage
 */
public class Repository implements FileStorage
{  
/**
 * instance variable Arraylist based on domain and entity id ,a File name to store the path of the file specified.
 */
	File contactFile=new File(file);
	static int id;
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	/**
	 * getAllContacts from file.
	 * @return contacts.
	 */
	public ArrayList<Contact> getAllContacts()
	{
		try
		{
			contacts.clear();
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((str=read.readLine())!=null) 
			{
				String[] st=str.split(",",3);
				Contact	contact=new Contact();
				contact.setId(Integer.parseInt(st[0]));
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
	/**
	 * getId of the contact from file.
	 * @return id.
	 */
	public int getId()
	{
		try
		{
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=read.readLine();
			while((str=read.readLine())!=null) 
			{
				String[] st=str.split(",",3);
				id=Integer.parseInt(st[0]);
			}	id++;
		}
		catch(IOException e)
		{
			System.out.println("");
		}
		return id;
	}
	/**
	 * Add contact details from file.
	 * @param contact.
	 */
	public void addContactDetails(Contact contact)
	{
		contacts.add(contact);	
		boolean val=false;
		contactWriteIntoFile(contact,val);
	}
	/**
	 * writting data to file.
	 * @param contact single contact 
	 */
	public void contactWriteIntoFile(Contact contact,boolean fileExist)
	{
		try
		{
			FileWriter fw= new FileWriter(contactFile,true);
			BufferedWriter br = new BufferedWriter(fw);	
			BufferedReader read=new BufferedReader(new FileReader(contactFile));
			String str=" ";
			if((str=read.readLine())!=null)
			{
				if(fileExist==false)
				{
					id=getId();
					br.write(id+","+contact.getName()+","+contact.getNo()+"\n");
				}
				else
				br.write(contact.getId()+","+contact.getName()+","+contact.getNo()+"\n");
			}
			else
			{
				id=getId();
				br.write(" ID , NAME , NUMBER \n");
				br.write(id+","+contact.getName()+","+contact.getNo()+"\n");
			}
			br.flush();
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("File exception "+e);
		}
	}
	/**
	 * delete Contact from file.
	 * @param index
	 */
	public void deleteContact(int i)
	{
		contacts=getAllContacts();
		contacts.remove(i);
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				boolean value=true;
				contactWriteIntoFile(contacts.get(j),value);
			}
	}
	/**
	 * update data of file.
	 * @param contact,index.

	 */
	public void updateFile(int i,Contact contact)
	{
		contacts=getAllContacts();
		contacts.set(i,contact);
		clearRepository();
		for(int j=0;j<contacts.size();j++)
			{
				boolean val=true;
				contactWriteIntoFile(contacts.get(j),val);
			}
	}
	public ArrayList<Contact> sortContactByName()
	{
		// Set<Contact> contactlist = new TreeSet<Contact>();
		// contactlist.addAll(contacts);
		// contacts.clear();
		// contacts.addAll(contactlist);
		Collections.sort(contacts,new SortByName());
		clearRepository();
	 		for(Contact contact : contacts)
			{
				boolean val=true;
				contactWriteIntoFile(contact,val);
			}	
		return contacts;
	}
	public ArrayList<Contact> searchStartsWith(String name)
	{
		//name.startsWith(name);
		return contacts;
	}
	public ArrayList<Contact> sortContactByNumber()
	{
		Collections.sort(contacts,new SortByNumber());
		clearRepository();
	 		for(Contact contact : contacts)
			{
				boolean val=true;
				contactWriteIntoFile(contact,val);
			}	
		return contacts;
	}
	public ArrayList<Contact> sortContactById()
	{
		Collections.sort(contacts,new SortById());
		clearRepository();
	 		for(Contact contact : contacts)
			{
				boolean val=true;
				contactWriteIntoFile(contact,val);
			}	
		return contacts;
	}
	/**
	 * Reset the file.
	 */
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