package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.repository.*;
import com.lxisoft.view.View;
import com.lxisoft.domain.*;

public class ContactController
{
	View view=new View();
	FileRepository repository=new FileRepository();
	ArrayList<Contact> contactList=new ArrayList<Contact>();

	// public void saveContact()
	// {
	// 	String[] temp=view.scan();
	// 	Contact contact=new Contact();
	// 	contact.setName(temp[0]);
	// 	contact.setNumber(temp[1]);
	// 	repository.save(contact);
	// }

	public void allContacts()
	{
		ViewAllModel viewAllModel=new ViewAllModel();
		contactList=repository.findAll();
		System.out.println(" THE CONTACT LIST IS ");
		for(Contact contact: contactList)
		{
			String name=contact.getName();
			view.findAllContacts(name);
		}
	}

	// public void contactById(int id)
	// {
	// 	ViewSingle viewSingle=new ViewSingle();
		
	// 	viewSingle=
	// }



	// public void saveContact()



	// public void editContact()



	// public void deleteContact()
	
}






























// public void features(int option)
// 	{
// 		switch(option)
// 		{
// 			case 1:saveContact();break;
// 			case 2:contactByName();break;
// 			case 3:deleteContact();break;
// 			case 4:editContact();break;
// 			case 5:allContacts();break;
// 		}
// 	}

	

// 	public void allContacts()
// 	{
// 		contactList=repository.findAll();
// 		view.displayAll(contactList);
// 	}

// 	public void contactByName()
// 	{
// 		String name=view.scanElement(0);
// 		repository.findByName(name);
// 	}

// 	public void deleteContact()
// 	{
// 		String name=view.scanElement(0);
// 		contactList=repository.delete(name);
// 		sync(contactList);
// 	}

// 	public void sync(ArrayList<Contact> contactList)
// 	{
// 		int j=0;
// 		for(Contact contact: contactList)
// 		{
// 			//System.out.print(j+"sync Name- " +contact.getName());
// 			repository.syncFile(contact,j);
// 			j++;
// 		}
// 	}

// 	public void editContact()
// 	{
// 		ArrayList<Contact> contactList=repository.findAll();
// 		String name=view.scanElement(0);
// 		int no=0,i=0;
// 		int u=view.whatToUpdate(); 
// 		String newData=view.scanElement(1);
// 		for(Contact contact:contactList)														
// 		{
// 			if(contact.getName().equals(name))
// 			{
// 				no=1;
// 				if(u==0)
// 				{
// 					contact.setName(newData);
// 					contactList.set(i,contact);
// 				}
// 				else if(u==1)
// 				{
// 					contact.setNumber(newData);
// 					contactList.set(i,contact);
// 				}
// 			}
// 			++i;
// 			System.out.println(contact.getName());
// 		}
// 		sync(contactList);
// 		if(no==0)
// 			view.noContact();
// 	}