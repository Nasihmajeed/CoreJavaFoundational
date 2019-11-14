package com.lxisoft.contactcontroller;
import com.lxisoft.contactmodel.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ContactController
{
	private List <Contact> contactList=new ArrayList<Contact>();
	Repository repo=new Repository();
	static int v=0;
	public void setContactList(List <Contact> contactList)
	{
		this.contactList=contactList;
	}
	public List <Contact> getContactList()
	{
		return contactList;
	}
	public int getListSize()
	{
		return contactList.size();
	}
	public Contact getFileInfo(int j)
	{
	    contactList=repo.readFile();
		return contactList.get(j);
	}
	public void setFile()
	{
		v=repo.checkFile(v);
		repo.setFile(v);
	}
	public void addContact(String name,String number)
	{
		Contact cont=new Contact();
		cont.setContactName(name);
		cont.setContactNumber(number);
		repo.writeFile(cont);
	}
	public Contact searchContact(int n)
	{
		Contact contact=new Contact();
		contactList=repo.readFile();
		int index=0;
		for(int i=0;i<contactList.size();i++)
		{
			index=contactList.indexOf(contactList.get(i));
			if((n-1)==(index))
			{
				contact=contactList.get((index));
			}
		}
		return contact;
	}
	public void deleteContact(int n)
	{
		contactList=repo.readFile();
		System.out.println(" ab  "+contactList.size());
		for(int i=0;i<contactList.size();i++)
		{
			int index=contactList.indexOf(contactList.get(i));
			if(n==(index+1))
			{
				contactList.remove(i);
			}	
		}
		repo.resetFile();
		int v=1;
		repo.setFile(v);
		System.out.println(" a l "+contactList.size());
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
	}
	public void updateContact(String num,int n)
	{
		contactList=repo.readFile();
		System.out.println(" read file=  "+contactList.size());
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(n).getContactName().equals(contactList.get(i).getContactName()))
			{
				Contact c=contactList.get(i);
				c.setContactNumber(num);
				contactList.set(i,c);
			}	
		}
		repo.resetFile();
		System.out.println(" list size "+contactList.size());
		int v=1;
		repo.setFile(v);
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
	}
	public void deleteAllContact()
	{
		repo.resetFile();
		contactList.clear();
	}
	
}