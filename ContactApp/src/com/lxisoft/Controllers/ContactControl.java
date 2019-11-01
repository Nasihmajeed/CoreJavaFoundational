package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import java.io.*;
import java.util.*;

public class ContactControl
{
	private ArrayList<Contact> contacts =new ArrayList<Contact>();
	Repository repo=new Repository();	

	public  void initialization()
	{
		Contact contact=new Contact();
		contacts=repo.initialization(contacts,contact);
	}

	



	public void updateContact(int i,String name, String no)
	{
		contacts.get(i).setName(name);
		contacts.get(i).setNo(no);
		System.out.println("Done..");
	}
	public void setNewContact(String name, String no)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(no);
		contacts.add(contact);
		repo.updateFile(contact);
		repo.restoreContacts();

	}
	public void clearAllContacts()
	{
		contacts.clear();
		repo.clearAll();
	}
	public void getContactDetail(int i)
	{
		System.out.print("Name : "+contacts.get(i).getName());
		System.out.println(" \t No : "+contacts.get(i).getNo());

	}
	public void getContactName(int i)
	{
		System.out.println("Name : "+contacts.get(i).getName()+"\t");
	}
	public int getContactDetail(int i,String search)
	{
		int value=0;
		if(search.equals(contacts.get(i).getName()))
		{
			System.out.print("Contact found ! \n Name : "+contacts.get(i).getName());
			System.out.println(" \t No : "+contacts.get(i).getNo());
			value=1;
		}
		return value;
	}
	public int getContactsLength()
	{
		return contacts.size();
	}
	public void deleteContact(int i)
	{
		contacts.remove(i);
	}
}
