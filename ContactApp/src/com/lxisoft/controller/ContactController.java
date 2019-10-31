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
	public void addContact(String name,String number)
	{
			contact=new Contact();
			contact.setName(name);
			contact.setNo(number);
			contacts.add(contact);	
			file.saveFile(contacts);
	}
	public int searchContact(int i,String name)
	{
			int value=0;
			if(name.equals(contacts.get(i).getName()))
			{
				value=1;
				System.out.println(" Contact found..!");
				getContactDetails(i);
			}
			return value;
	}
	public void updateContact(int i,String name,String number)
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
	public String getNo(int i)
	{
		return contacts.get(i).getNo();
	}
}