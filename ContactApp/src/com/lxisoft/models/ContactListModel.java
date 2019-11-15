package com.lxisoft.models;
import java.util.*;
import java.io.*;
import com.lxisoft.view.*;
import com.lxisoft.models.*;
import com.lxisoft.controllers.*;

public class ContactListModel
{
	Contact c=new Contact();
	private ArrayList<ContactModel>contacts=new ArrayList<ContactModel>();
	public void setContacts(List<ContactModel>contacts)
	{
		this.contacts=contacts;
	}
	public List<Contact> getContacts()
	{
		return contacts;
	}
}