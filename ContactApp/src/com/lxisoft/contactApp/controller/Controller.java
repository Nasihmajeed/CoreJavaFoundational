package com.lxisoft.contactApp.controller;
import java.util.ArrayList;

import com.lxisoft.contactApp.model.Contact;
import com.lxisoft.contactApp.repository.Repository;
public class Controller 
{
	static Repository repo=new Repository();
	private ArrayList<Contact> contacts=new ArrayList<Contact>();
	public void setInitialContacts()
	{
		contacts.add(new Contact(1,"athulya",9633400720l));
		contacts.add(new Contact(2,"josemon",9633400720l));
		contacts.add(new Contact(3,"ruhail",9633400720l));
	}

	public void setContacts(ArrayList<Contact> contacts)
	{
		this.contacts=contacts;
	}
	public ArrayList<Contact> getContacts()
	{
		return contacts;
	}

	public void newContact(String name,long number)
	{
		Contact lastContact=null;
		lastContact=contacts.get(contacts.size()-1);
		int id=lastContact.getId()+1;
		contacts.add(new Contact(id,name,number));

	}

	public void updateContact(int upId,String name)
	{
		contacts.get(upId-1).setName(name);
	}

	public void updateContact(int upId,long number)
	{
		contacts.get(upId-1).setNumber(number);
	}

	public void deleteContact(int delId)
	{
		contacts.remove(delId-1);
	}

	public void fileFunctions()
	{
		repo.writeToFile(contacts);
		System.out.println("file phone book created");
	}
	
	public void fileCreation()
	{
		repo.createPhoneData();

	}

	public void store()
	{
		repo.storeData();
	}
	
}