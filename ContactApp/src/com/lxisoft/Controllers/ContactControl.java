package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import java.io.*;
import java.util.*;

public class ContactControl
{
	Repository repo=new Repository();
	
	public void start()
	{
		
		View view=new View();
		view.printAll();
	}
	public void createNewContact(String name, String number)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		repo.writeNewContact(contact);

	}
	public ArrayList<ViewListModel> viewAllContacts()
	{
		// System.out.println("test controller");
		ViewList view=new ViewList();
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();
		// System.out.println("test controller1");
		view.setAllContacts(contacts);
		ArrayList<ViewListModel> listView=view.getAllContacts();
		return listView;
	}
}