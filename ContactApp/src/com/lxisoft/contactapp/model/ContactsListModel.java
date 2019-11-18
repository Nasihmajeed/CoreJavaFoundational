package com.lxisoft.contactapp.model;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.io.*;
import java.util.*;
public class ContactsListModel
{
	public ArrayList<ContactModel> contact=new ArrayList<ContactModel>();
	public void setAllContacts(ContactModel contactmodel)
	{
			contact.add(contactmodel);
	}
	public ArrayList<ContactModel> getAllContacts()
	{
		return contact;
	}
}