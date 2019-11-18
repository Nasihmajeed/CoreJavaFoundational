package com.lxisoft.contactapp.model;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.io.*;
import java.util.*;
public class ContactsListModel
{
	public ArrayList<ContactModel> contact=new ArrayList<ContactModel>();
	public void setAllContacts(ArrayList<Contact> contacts)
	{
		
		for(int i=0;i<contacts.size();i++)
		{
			ContactModel contactmodel=new ContactModel();
			contactmodel.setId(contacts.get(i).getId());
			contactmodel.setName(contacts.get(i).getName());
			contact.add(contactmodel);
		}
	}
	public ArrayList<ContactModel> getAllContacts()
	{
		return contact;
	}
}