package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactController
{
	private Repository filerepo=new Repository();
	ContactView view=new ContactView();
	public void getAllcontacts()
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		ContactsListModel contact=new ContactsListModel();
		if(contacts!=null)
		{
			contact.setAllContacts(contacts);
			ArrayList<ContactModel> contactlist=contact.getAllContacts();
			view.showAllContacts(contactlist);
		}
	}
	public Contact getContactById(String id)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(id.equals(contacts.get(i).getId()))
			{
				contact=contacts.get(i);
			}
		}return contact;
	}
	public Contact getContactByName(String name)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(name.equals(contacts.get(i).getName()))
			{
				contact=contacts.get(i);
			}
		}return contact;
	}
	public int getIndex(Contact contact)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		int index=0;
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				index=i;
				System.out.println("index==="+index);
			}
		}return index;
	}
	public void updateContact(int i,String id,String name,String number)
	{
		Contact contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		filerepo.updateFile(i,contact);
	}
	public void addContactDetails(String id,String name,String number)
	{
		Contact contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		filerepo.addContactDetails(contact);
	}
	public void deleteContact(int i)
	{
		filerepo.deleteContact(i);
	}
	public String getName(Contact contact)
	{
		String name=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				name=contact.getName();
			}
		}
		return name;
	}
	public String getNo(Contact contact)
	{
		String num=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				num=contact.getNo();
			}
		}
		return num;
	}
	public String getId(Contact contact)
	{
		String id=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				id=contact.getId();
			}
		}
		return id;
	}
	public void deleteAllContacts()
	{
		filerepo.clearRepository();
	}
}