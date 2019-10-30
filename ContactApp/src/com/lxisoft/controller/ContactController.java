package com.lxisoft.controller;
import com.lxisoft.model.Contact;
import com.lxisoft.repository.Repository;
import java.io.*;
import java.util.*;
public class ContactController
{
	private ArrayList<Contact> contacts=new ArrayList<Contact>();
	Contact contact;
	Repository file=new Repository();
	public void addContact(String name,long number)
	{
		//try
		//{
			// file=new File("C:\\Users\\PUSHKALA\\Desktop\\MVC\\src\\com\\lxisoft\\MyContactList.csv");
			// fw= new FileWriter(file);
			// fr=new FileReader(file);
			// fw.write("ashiq"+876543);
			// //String.split(fw);
			// fw.close();
			contact=new Contact();
			contact.setName(name);
			contact.setNo(number);
			contacts.add(contact);	
			file.createNewFile(contacts);
		//}
		// catch(IOException e)
		// {
		// 	System.out.println("Exception "+e);
		// }
	}
	public int searchContact(int i,String name)
	{
		//boolean search=contacts.contains(name);
			int value=0;
			if(name.equals(contacts.get(i).getName()))
			{
				value=1;
				System.out.println(" Contact found..!");
				getContactDetails(i);
			}
			return value;
	}
	public void updateContact(int i,String name,long number)
	{	
		contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		contacts.set(i,contact);
	}
	public void deleteContact(int i)
	{
		contacts.remove(i);
		System.out.println("contact Deleted!");
	}
	public int getLength()
	{
		return contacts.size();	
	}
	public void getContactDetails(int i)
	{
		System.out.println(contacts.get(i).getName()+" \t "+contacts.get(i).getNo());
	}
	public String getName(int i)
	{
		return contacts.get(i).getName();
	}
	public long getNo(int i)
	{
		return contacts.get(i).getNo();
	}
}