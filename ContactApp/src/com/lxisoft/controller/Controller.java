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
		return rep.getArraySize();
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
		for(int i= 0;i<contactList.size();i++)
		{
			if(name.equals(contactList.get(i).getName()))
			{	
				contact = contactList.get(i);
			}
		}
		return contact;
	}
	public void editContact(int i,String name,String number)
	{	
		 contact = new Contact();
		 contactList = rep.fileRead();
		 contact.setName(name);
         contact.setNumber(number);
         contactList.set(i,contact);
         rep.clearFile();
		 // contactList.add(contact);
		 for(int j=0; j<contactList.size();j++)
		 {
		 	 rep.fileWrite(contactList.get(j));
		 }
		
	}
	public void deleteContact(int i)
	{
		contact = new Contact();
		contactList = rep.fileRead();
	    contactList.remove(i);	
	    rep.clearFile();
		//contactList.add(contact);
		 for(int j=0; j<contactList.size();j++)
		 {
		 	 rep.fileWrite(contactList.get(j));
		 }
	}
	public void display()
	{
		contact = new Contact();
		List <Contact> contactDetail = new ArrayList<Contact>();
		contactDetail=rep.fileRead();
		// contact.setName(name);
  //       contact.setNumber(number);
		for(int i=0; i < contactDetail.size();i++)
		{
			 System.out.println("\n NAME : "+contactDetail.get(i).getName() +"\t NUMBER : "+contactDetail.get(i).getNumber());
		}
	}

}