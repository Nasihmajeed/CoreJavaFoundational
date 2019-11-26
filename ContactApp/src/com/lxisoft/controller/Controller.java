package com.lxisoft.controller;
import com.lxisoft.view.*;
import com.lxisoft.model.*;
import com.lxisoft.filerepository.*;
import java.util.*;
import com.lxisoft.test.*;

public class Controller
{
	Contact contact ;
	Filerepository rep = new Filerepository();
	View view = new View();
	public List <Contact> contactList = new ArrayList<Contact>();
	public void choice()
	{
		int n=view.begin();
		switch(n)
		{
			case 1 : view.addContact(); break;
			case 2 : view.search();break;
			case 3 : display(); break;
			case 4 : deleteAll();break;
			default: view.defaultPrint(0);
		}		
	}

	public void addContact(String name,String number)
	{ 
		rep.setId();
		contact = new Contact();
        contact.setName(name);
        contact.setNumber(number);
		//int i = indexOf(contact.getName(name));
		// int i ;
		// if(contact.)
        //contact.setId(i);
        rep.fileWrite(contact,true);
        choice();

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
	public ArrayList<Contact> fileRead()
	{
		contact = new Contact();
		ArrayList <Contact> contactDetail = new ArrayList<Contact>();
		return contactDetail=rep.fileRead();

	}

	public void editContact(int i,int id,String name,String number)
	{	
		//System.out.println("value i ="+i+"   id ="+id );
		
		 contact = new Contact();
		 contactList = rep.fileRead();
		 contact.setName(name);
         contact.setNumber(number);
         contact.setId(id);
         //System.out.println(contact.getId()+"****");
         contactList.set(i,contact);
         rep.clearFile();
		//System.out.println(contact.getId()+"****");
		 for(int j=0; j<contactList.size();j++)
		 {
		 	 rep.fileWrite(contactList.get(j),false);
		 }	
		 choice();
	
	}

	public void deleteContact(int i)
	{
		contact = new Contact();
		contactList = rep.fileRead();
	    contactList.remove(i);	
	    rep.clearFile();
		
		 for(int j=0; j<contactList.size();j++)
		 {
		 	 rep.fileWrite(contactList.get(j),false);
		 }
		 choice();

	}
	public void display()
	{
		int n=view.display();
		//System.out.println("n="+n);
		switch(n)
		{
			case 1 : view.dateDisplay(); break;
		    case 2 : view.sortByname();break;
		    case 3 : view.sortByid(); break;
		}
		
		choice();
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
	public void deleteAll()
	{
		rep.clearFile();
		choice();
	}

}