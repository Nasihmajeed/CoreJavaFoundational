package com.lxisoft.controllers;
import java.util.*;
import com.lxisoft.models.*;
import com.lxisoft.view.*;
import com.lxisoft.repository.*;
public class ContactControl
{
	private List<Contact>contactList=new ArrayList<Contact>();
    Repository repository=new Repository();
	public void setContactList(List<Contact>contactList)
	{
		this.contactList=contactList;
	}

	public int getContactList()
	{
		return contactList.size();
	}

	public void getContactDetails()
	{
        contactList=repository.arrayWrite(contactList);
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
        repository.createFile(c);
        repository.readFile();
    }

    public void selectDetails(int no)
    {
        for(int i=0;i<contactList.size();i++)
        {
            contactList.get(i);
        }
    }

    public void deleteDetails(int no)
    {
        for(int i=0;i<contactList.size();i++)
    	{
    		int index=contactList.indexOf(contactList.get(i));
            if(no==index)
    		{
         		contactList.remove(i);
         	}
    	}
        repository.resetFile();
        for(int i=0;i<contactList.size();i++)
        {
            repository.createFile(contactList.get(i));
        }
    }

    public void updateDetails(String contactNo,int no)
    {
        Contact c=new Contact();
  		for(int i=0;i<contactList.size();i++)
    	{
    		int index=contactList.indexOf(contactList.get(i));
            if(no==index)
    		{
         		c=contactList.get(i);
                c.setContactNo(contactNo);
                contactList.set(i,c);     
         	}
    	}
        repository.resetFile();
        for(int i=0;i<contactList.size();i++)
        {
            repository.createFile(contactList.get(i));
        }
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
