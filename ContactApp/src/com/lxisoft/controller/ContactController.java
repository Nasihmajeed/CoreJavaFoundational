package com.lxisoft.controller;
import com.lxisoft.model.Contact;
import java.util.*;
public class ContactController
{
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	Contact contact;
	public void addContact(String name,long number)
	{
		contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		contacts.add(contact);	
	}
	public void searchContact(int i,String name)
	{
		
		boolean search=contacts.contains(name);
		//if(search)
			if(name.equals(contacts.get(i).getName()))
			{
				System.out.println(" Contact found..!");
				getContactDetails(i);
			}
		
		// else
		// 	System.out.println(" There is no such contacts..!");
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