package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import java.io.*;
import java.util.*;

public class ContactControl
{
	Repository repo=new Repository();
	
	public void start()
	{
		
		View view=new View();
		view.printAll();
	}
	public void createNewContact(String name, String number)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		repo.writeNewContact(contact,true);

	}
	public ArrayList<ViewListModel> viewAllContacts()
	{
		// System.out.println("test controller");
		ViewList view=new ViewList();
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();
		ArrayList<ViewListModel> listView=null;
		if(contacts!=null)
		{
			view.clearArray();
			for(int i=0;i<contacts.size();i++)
			{
				view.setContact(contacts.get(i));
			}
			listView=view.getAllContacts();
		}
		return listView;
	}
	public Contact searchContact(String name)
	{
		ArrayList<Contact> contacts= new ArrayList<Contact>(); 
		contacts=repo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			String s=contacts.get(i).getName();
			if(s.equals(name)) 
			{
				contact=contacts.get(i);								
			}
		}
		
		return contact;
	}
	public Contact searchContact(int id)
	{
		ArrayList<Contact> contacts= new ArrayList<Contact>(); 
		contacts=repo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			int s=contacts.get(i).getId();
			if(s==id) 
			{
				contact=contacts.get(i);								
			}
		}
		
		return contact;
	}
	public int getIndex(Contact contact)
	{
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();
		int index =50;
		for(int i=0; i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
				{
					index=i;
				}
		}

		return index;
	}
	public void editContact(String name, String number, int i)
	{
		Contact contact=new Contact();
		contact.setId(i);
		contact.setName(name);
		contact.setNo(number);
		repo.editFile(contact,i);
	}
	public void deleteContact(int i)
	{
		repo.deleteContact(i);
	}
	public void clearAllContacts()
	{
		repo.clearFile();
	}
}