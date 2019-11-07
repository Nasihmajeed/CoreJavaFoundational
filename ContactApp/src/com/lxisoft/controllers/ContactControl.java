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
	public int getContactList()
	{
		return contactList.size();
	}
	public List<Contact> getContactDetails()
	{
		String[] name={"meghu","meharu","ammu"};
		String[] contactNo={"9961048108","9744310194","7356801940"};
		for(int i=0;i<3;i++)
		{
			Contact contact=new Contact();
			contact.setName(name[i]);
			contact.setContactNo(contactNo[i]);
			contactList.add(contact);
		}
		return contactList;
    }
    public Contact viewDetails(int i)
    {
        return contactList.get(i);
    }
    public void addDetails(String name,String contactNo)
    {
    	Contact c=new Contact();
    	c.setName(name);
    	c.setContactNo(contactNo);
    	contactList.add(c);
    }
    public void selectDetails(int no)
    {
        for(int i=0;i<contactList.size();i++)
        {
            contactList.get(i);
        }
    }
    

    public void deleteDetails(String name)
    {
    	for(int i=0;i<contactList.size();i++)
    	{
    		if(name.equals(contactList.get(i).getName()))
    		{
         		contactList.remove(i);
         	}
    	}
    }
    public void updateDetails(String name,String contactNo)
    {
    	Contact c=new Contact();
  		for(int i=0;i<contactList.size();i++)
    	{
    		if(name.equals(contactList.get(i).getName()))
    		{
         		contactList.remove(i);
         	}
    	}
    	c.setName(name);
    	c.setContactNo(contactNo);
    	contactList.add(c);
    }

    public Contact searchDetails(String name)
    {
        Contact c=new Contact();
        for(int i=0;i<contactList.size();i++)
        {
            if(name.equals(contactList.get(i).getName()))
            {
                c=contactList.get(i);
            }
        }
        return c;
    }
} 
