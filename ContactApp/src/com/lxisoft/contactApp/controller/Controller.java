package com.lxisoft.contactApp.controller;
import java.util.ArrayList;
import com.lxisoft.contactApp.model.Contact;
import com.lxisoft.contactApp.repository.Repository;
public class Controller 
{
	public Repository repo=new Repository();
	private ArrayList<Contact> contacts=new ArrayList<Contact>();
	public void setInitialContacts()
	{
		//contacts.add(new Contact(1,"athulya",9633400720l));
	
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
		int id=0;
		Contact lastContact=null;
		if(contacts.size()<=0)
		{
			id=1;
		}
		if(contacts.size()>=1)
		{
			lastContact=contacts.get(contacts.size()-1);
			id=lastContact.getId()+1;
		}
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
		//repo.writeToFile(contacts);
		System.out.println("file phone book created");
	}
	
	public void fileCreation()
	{
		repo.createPhoneData();

	}

	public void store()
	{
		repo.writeToFile(contacts);
		repo.storeData(contacts);
	}

	public void storeInitial()
	{
		repo.storeData(contacts);

	}
	
}