package com.lxisoft.controller;
import com.lxisoft.model.Contact;
import java.util.*;
public class ContactController
{
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	Contact contact=new Contact();
	public void addContact(String name,long number)
	{
		
		contact.setName(name);
		contact.setNo(number);
		contacts.add(contact);
		
	}
	public void searchContact(String name)
	{
		boolean search=contacts.contains(name);
		System.out.println(search);
		if(search)
		{
			System.out.println(" Contact found..!");
			getContact();
		}
		else
			System.out.println(" There is no such contacts..!");
	}
	public void updateContact(){}
	public void deleteContact(String name)
	{
	
	}
	
	public void getLength()
	{
	
		

	}


	

}