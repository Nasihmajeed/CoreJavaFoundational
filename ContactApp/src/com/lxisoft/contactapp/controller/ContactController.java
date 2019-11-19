package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.util.*;
/**
 * Contactcontroller class to control All the views.
 */
public class ContactController
{
	/**
	 * instance variables filerepo and view.
	 */
	private Repository filerepo=new Repository();
	private ContactView view=new ContactView();
	/**
	 * getAllContactInfo to get the contact details from repository and displaying in view.
	   @return null.
	 */
	public void getAllcontactInfo()
	{
		view.displayContactInfo();
	}
	/**
	 *  getAllContacts (id and name only) from file to arraylist.
	    @return contact Arraylist.
	 */
	public ArrayList<ContactModel> getAllcontacts()
	{
		ArrayList<ContactModel> contactlist=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		ContactsListModel contact=new ContactsListModel();
		if(contacts!=null)
		{
			for(int i=0;i<contacts.size();i++)
			{
				ContactModel contactmodel=new ContactModel();
				contactmodel.setId(contacts.get(i).getId());
				contactmodel.setName(contacts.get(i).getName());
				contact.setAllContacts(contactmodel);
			}
			contactlist=contact.getAllContacts();
			//view.showAllContacts(contactlist);
		}return contactlist;
	}
	/**
	 *  getAllContacts (all contact details) from file to arraylist.
	    @return contact Arraylist based on domain.
	 */
	public ArrayList<Contact> getAllContact()
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		return contacts;
	}
	/**
	 *  get contact by id from repository.
	 	@param id.
	    @return contact entity based on domain.
	 */
	public Contact getContactById(String id)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(id.equals(contacts.get(i).getId()))
			{
				contact=contacts.get(i);
			}
		}return contact;
	}
	/**
	 *  get contact by name from repository.
	 	@param name.
	    @return contact entity based on domain.
	 */
	public Contact getContactByName(String name)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(name.equals(contacts.get(i).getName()))
			{
				contact=contacts.get(i);
			}
		}return contact;  
	}
	/**
	 *  get contact index from repository.
	 	@param contact.
	    @return index
	 */
	public int getIndex(Contact contact)
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		int index=0;
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				index=i;
				System.out.println("index==="+index);
			}
		}return index;
	}
	/**
	 *  update contact based on name and number.
	 	@param index,id,name,number.
	    @return null
	 */
	public void updateContact(int i,String id,String name,String number)
	{
		Contact contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		filerepo.updateFile(i,contact);
	}
	/**
	 *  add contact details.
	 	@param name,number.
	    @return null
	 */
	public void addContactDetails(String name,String number)
	{
		Contact contact=new Contact();
		//contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		filerepo.addContactDetails(contact);
	}
	/**
	 *  delete contact details.
	    @return null
	 */
	public void deleteContact(int i)
	{
		filerepo.deleteContact(i);
	}
	/**
	 *  getname of the corresponding contact.
	 	@param contact
	    @return name
	 */
	public String getName(Contact contact)
	{
		String name=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				name=contact.getName();
			}
		}
		return name;
	}
	/**
	 *  getnumber of the corresponding contact.
	 	@param contact.
	    @return num.
	 */
	public String getNo(Contact contact)
	{
		String num=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				num=contact.getNo();
			}
		}
		return num;
	}

	public String getId(Contact contact)
	{
		String id=null;
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				id=contact.getId();
			}
		}
		return id;
	}
	public void deleteAllContacts()
	{
		filerepo.clearRepository();
	}
}