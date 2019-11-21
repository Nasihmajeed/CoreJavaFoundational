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
	View view = new View();
	public List <Contact> contactList = new ArrayList<Contact>();
	
	public void choice()
	{

		int n=view.begin();
		
			switch(n)
			{
				case 1 : view.addContact(); break;
				case 2 : view.search();break;
				case 3 : view.display(); break;
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

	public void editContact(int i,String name,String number)
	{	
		 contact = new Contact();
		 contactList = rep.fileRead();
		 contact.setName(name);
         contact.setNumber(number);
         System.out.println("value i ="+i+"   id ="+contact.getId());

         contactList.set(i,contact);
         rep.clearFile();
		
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
		contact = new Contact();
		List <Contact> contactDetail = new ArrayList<Contact>();
		contactDetail=rep.fileRead();

		for(int i=0; i < contactDetail.size();i++)
		{
			 System.out.println("\n ID:"+contactDetail.get(i).getId()+" NAME:"+contactDetail.get(i).getName()+" NUMBER:"+contactDetail.get(i).getNumber());
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

}