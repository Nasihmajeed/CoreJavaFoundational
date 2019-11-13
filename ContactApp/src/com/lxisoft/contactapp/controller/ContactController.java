package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactController
{
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	Repository filerepo=new Repository();
	ContactView1 view=new ContactView1();
	public void getAllcontacts()
	{
		
		contacts=filerepo.getAllContacts(contacts);
		// ArrayList<Contactmodel> contactmodel=new ArrayList<Contactmodel>();
		ArrayList<ContactsListView> contactlist=new ArrayList<ContactsListView>();
		contactlist.setAllcontacts(contacts);
		ContactModel contact=new ContactModel();
		view.showAllContacts(contactlist);
	}
	// public void getContactById(int id)
	// {
	// 	ArrayList<Contact> contact1=new ArrayList<Contact>();
	// 	contact1=filerepo.getContactById(contact1);
	// 	Contact con=new Contact();
	// 	view.getContactById(id,contact1,con);
	// }
	// public void addContact(String name,String number)
	// {
	// 		contact=new Contact();
	// 		contact.setName(name);
	// 		contact.setNo(number);
	// 		contacts.add(contact);	
	// 		filerepo.setContacts(contact);
	// }
	// public int searchContact(int i,String name)
	// {
	// 		int value=0;
	// 		if(name.equals(contacts.get(i).getName()))
	// 		{
	// 			value=1;
	// 			System.out.println(" Contact found..!");
	// 			getContactDetails(i);
	// 		}
	// 		return value;
	// }
	// public void updateContact(int i,String name,String number)
	// {	
	// 	contact=new Contact();
	// 	contact.setName(name);
	// 	contact.setNo(number);
	// 	contacts.set(i,contact);
	// 	//filerepo.update(name);
	// 	filerepo.deleteAllContacts();
	// 	for(int j=0;j<contacts.size();j++)
	// 	{
	// 		filerepo.setContacts(contacts.get(j));
	// 	}
	// }
	// public void deleteContact(int i)
	// {
	// 	contacts.remove(i);
	// 	filerepo.deleteAllContacts();
	// 	for(int j=0;j<contacts.size();j++)
	// 	{
	// 		filerepo.setContacts(contacts.get(j));
	// 	}
	// }
	// public int getLength()
	// {
	// 	return contacts.size();	
	// }
	// public void getContactDetails(int i)
	// {
	// 	System.out.println(contacts.get(i).getName()+" \t "+contacts.get(i).getNo());
	// }
	// public String getName(int i)
	// {
	// 	return contacts.get(i).getName();
	// }
	// public String getNo(int i)
	// {
	// 	return contacts.get(i).getNo();
	// }
	// public void deleteAllContacts()
	// {
	// 	filerepo.deleteAllContacts();
	// 	contacts.clear();
	// }
}