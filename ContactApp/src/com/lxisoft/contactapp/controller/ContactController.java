package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactController
{
	
	Repository filerepo=new Repository();
	ContactView1 view=new ContactView1();
	public void displayAllcontacts()
	{
		ArrayList<ContactModel> contacts=new ArrayList<ContactModel>();
		contacts=filerepo.showAllContacts(contacts);
		ContactModel contact=new ContactModel();
		view.showAllContacts(contacts,contact);
		System.out.println("select a contact by Id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		getContactById(id);
	}
	public void getContactById(int id)
	{
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=filerepo.getContactById(contacts);
		Contact con=new Contact();
		view.getContactById(id,contacts,con);
	}
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