package com.lxisoft.contactcontroller;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
public class ContactController
{
	List <Contact> contactList=new ArrayList<Contact>();
	public List<Contact> getContacts()
	{
		
		String[] name={"mehar","ninu","megha","amirtha","meharu"};
		long[] number={90456372,95396006,90481532,96569884,98466423};
		for(int j=0;j<5;j++)
		{
			Contact contact=new Contact();
			contact.setContactName(name[j]);
			contact.setContactNumber(number[j]);
			contactList.add(contact);
		}
		return contactList;
	}
	public void addContact(String name,long number)
	{
		Contact cont=new Contact();
		cont.setContactName(name);
		cont.setContactNumber(number);
		contactList.add(cont);
	}
	public void deleteContact(String name)
	{
		for(int i=0;i<contactList.size();i++)
		{
			if(name.equals(contactList.get(i).getContactName()))
			{
				contactList.remove(i);
			}	
		}
	}
	public void updateContact(String name,long num)
	{
		for(int i=0;i<contactList.size();i++)
		{
			if(name.equals(contactList.get(i).getContactName()))
			{
				long number=contactList.get(i).getContactNumber();
				number=num;
				// contactList.add();
			}	
		}
	}
}