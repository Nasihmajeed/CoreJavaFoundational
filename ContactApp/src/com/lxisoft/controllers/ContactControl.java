package com.lxisoft.controllers;
import java.util.List;
import java.util.ArrayList;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
public class ContactControl
{
	List<Contact>contactList=new ArrayList<Contact>();
	String[] name={"meghu","meharu","ammu"};
	String[] contactNo={"12345","23456","56789"};
	public List<Contact> getContactDetails()
	{
		for(int i=0;i<3;i++)
		{
			Contact contact=new Contact();
			contact.setName(name[i]);
			contact.setContactNo(contactNo[i]);

		}
		return contactList;
    }
}