package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import java.io.*;
import java.util.*;

public class ContactControl
{
	private ArrayList<Contact> contacts =new ArrayList<Contact>();
	Repository repo=new Repository();	

	public  boolean initialization()
	{
		boolean backup=false;
		Contact contact=new Contact();
		contacts=repo.initialization(contacts,contact);
		if (contacts.size()!=0)backup=true;
		return backup;
	}
	public void resetRepo()
	{
		repo.clearAll();
		for(int i=0;i<contacts.size();i++)
		{
			repo.updateFile(contacts.get(i));
		}
	}

	public void updateContact(int i,String name, String no)
	{
		contacts.get(i).setName(name);
		contacts.get(i).setNo(no);
	}
	public void setNewContact(String name, String no)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(no);
		contacts.add(contact);
		repo.updateFile(contact);
	}
	public boolean viewAllContacts()
	{
		boolean add=repo.viewAllContacts();
		return add;
	}
	public void clearAllContacts()
	{
		contacts.clear();
		repo.clearAll();
	}
	public Contact getContactDetail(int i)
	{
		return contacts.get(i);
	}
	
	public Contact getContactDetail(int i,String search)
	{
		Contact contact=null;
		if(search.equals(contacts.get(i).getName()))
		{
			contact=contacts.get(i);
		}
		return contact;
	}
	public int getContactsLength()
	{
		return contacts.size();
	}
	public void deleteContact(int i)
	{
		contacts.remove(i);
	}
}
