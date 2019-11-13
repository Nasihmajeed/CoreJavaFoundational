package com.lxisoft.contactapp.model;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
public class ContactsListView
{
	public void setAllContacts(ArrayList<Contact> contacts)
	{
		ContactModel contact;
		for(int i=0;i<contacts.size();i++)
		{
			contact=new ContactModel();
			contacts.get(i).getId();
			contacts.get(i).getName();
			contact.add(contacts);
		}
	}
}