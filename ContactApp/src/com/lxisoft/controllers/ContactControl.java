package com.lxisoft.controllers;
import java.util.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
public class ContactControl
{
	private List<Contact>contactList=new ArrayList<Contact>();
	public void setContactList(List<Contact>contactList)
	{
		this.contactList=contactList;
	}
	public List<Contact> getContactList()
	{
		return contactList;
	}
	public List<Contact> getContactDetails()
	{
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
    public List<Contact> addDetails(String name,String contactNo)
    {
    	Contact c=new Contact();
    	c.setName(name);
    	c.setContactNo(contactNo);
    	contactList.add(c);
    	return contactList;
    }

  //   public void deleteDetails(String num)
  //   {
  //   	Contact c=new Contact();
  //       contact.setName(name);
		// contact.setContactNo(contactNo);
  //   }
}