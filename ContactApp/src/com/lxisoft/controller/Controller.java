package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.util.*;
import com.lxisoft.test.*;

public class Controller
{
	Contact contact ;
	Repository rep = new Repository();
	public List <Contact> contactList = new ArrayList<Contact>();
	public void addContact(String name,String number)
	{ 
		contact = new Contact();
        contact.setName(name);
        contact.setNumber(number);
        rep.fileWrite(contact);
	}
	public void setContactList(List <Contact> contactList)
	{
		this.contactList = contactList;
	}
	public List <Contact> getContactList()
	{
		return contactList;
	}
	public int getArraySize()
	{
		rep.getArraySize();
	}
	public String getName()
	{
		return contact.getName();
	}
	public String getNumber()
	{
		return contact.getNumber();
	}
	public Contact search(String name)
	{
		contact = new Contact();
		contactList = rep.fileRead();
		int index = 0;
		for(int i= 0;i<=contactList.size();i++)
		{
			if(name.equals(rep.array.get(i).getName()))
			{	
				rep.array.indexOf(con.search(name));
				// int n=i;
				// contact = contactList.get((index));
			}
		}
		return contact;
	}
	public void editContact(String name,String number)
	{	
		 contact = new Contact();
		 contact.setName(name);
         contact.setNumber(number);
         //array.remove(i);
		 contactList.add(contact);
	}
	public void deleteContact()
	{
	    contactList.remove(contact);	
	}
	public void display()
	{
		rep.fileRead();
	}
	// public int arraySearch(String name)
	// { 
		
	// 	for(int i=0;i<rep.getArraySize();i++)
	// 	{
	// 		if(name.equals(rep.array.get(i).getName()))
	// 		 {
	// 		 	rep.array.get(i).getNumber();
	// 		 }
	// 		 else 
	// 		 {
			 	
	// 		 }
	// 	}
	// 		return i ;
	// }
 
}