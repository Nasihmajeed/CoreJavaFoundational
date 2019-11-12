package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import java.io.*;
import java.util.*;

public class ContactControl
{
	Repository repo=new Repository();
	public void createNewContact(String name, String number)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		repo.writeNewContact(contact);

	}
	public void viewAllContacts()
	{
		ViewAllContact view=new ViewAllContact();
		view.viewAllContacts();
	}
}