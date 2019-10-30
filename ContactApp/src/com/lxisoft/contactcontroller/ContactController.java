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
	public void setContactList(List <Contact> contactList)
	{
		this.contactList=contactList;
	}
	public List <Contact> getContactList()
	{
		return contactList;
	}
	public List<Contact> readContacts()
	{
		String[] name={"mehar","ninu","megha","amirtha","meharu"};
		String[] number={"90456372","95396006","90481532","96569884","98466423"};
		for(int j=0;j<5;j++)
		{
			Contact contact=new Contact();
			contact.setContactName(name[j]);
			contact.setContactNumber(number[j]);
			contactList.add(contact);
		}	
		return contactList;
	}
	public void addContact(String name,String number)
	{
		Contact cont=new Contact();
		cont.setContactName(name);
		cont.setContactNumber(number);
		contactList.add(cont);
	}
	public Contact searchContact(int n)
	{
		Contact contact=new Contact();
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
		for(int i=0;i<contactList.size();i++)
		{
			int index=contactList.indexOf(contactList.get(i));
			if(n==(index+1))
			{
				contactList.remove(i);
			}	
		}
	}
	public void updateContact(String num,Contact contact)
	{
		for(int i=0;i<contactList.size();i++)
		{
			if(contact.getContactName().equals(contactList.get(i).getContactName()))
			{
				Contact c=contactList.get(i);
				c.setContactNumber(num);
				contactList.set(i,c);
			}	
		}
	}
	public void file()
	{
		repo.createFile(contactList);
	}
	
}