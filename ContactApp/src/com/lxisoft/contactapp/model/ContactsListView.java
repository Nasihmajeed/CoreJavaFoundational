package com.lxisoft.contactapp.model;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactsListView
{
	private ArrayList<ContactModel> contact=new ArrayList<ContactModel>();
	public void setAllContacts(ArrayList<Contact> contacts)
	{
		ContactModel contactmodel;
		for(int i=0;i<contacts.size();i++)
		{
			contactmodel=new ContactModel();
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