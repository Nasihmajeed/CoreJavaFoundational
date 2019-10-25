package com.lxisoft.controllers;
import java.util.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
public class ContactControl
{
	
	public List<Contact> getContactDetails()
	{
		List<Contact>contactList=new ArrayList<Contact>();
		String[] name={"meghu","meharu","ammu"};
		String[] contactNo={"12345","23456","56789"};
		for(int i=0;i<3;i++)
		{
			Contact contact=new Contact();
			contact.setName(name[i]);
			contact.setContactNo(contactNo[i]);
			contactList.add(contact);
		}
		return contactList;
    }
    public void addDetails(String name,String contactNo)
    {
    	List<Contact>contactList=new ArrayList<Contact>();
    	Contact contact=new Contact();
    	contactList.add(contact);
    }
}