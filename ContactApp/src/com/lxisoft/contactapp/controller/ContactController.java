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
		Scanner sc=new Scanner(System.in);
		int default_option=0,option=0;
		char continueOpt='\0';
		do
		{
		option=view.displayContactInfo();
		switch(option)
			{
				case 1:		addNewContact();break;
				case 2:		searchContact();break;	
				case 3:		getAllContactDetails();break;
				case 4:		deleteAllContacts();break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
	}
	/**
	 *  getAllContacts (id and name only) from file to arraylist.
	    @return contact Arraylist.
	 */
	public void getAllcontacts()
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
			view.showAllContacts(contactlist);
		}
	}
	/**
	 *  add contact details.
	    @return null
	 */
	public void addNewContact()
	{
		String []contacts=view.addNewContact();
		Contact contact=new Contact();
		contact.setName(contacts[0]);
		contact.setNo(contacts[1]);
		filerepo.addContactDetails(contact);
	}
	/**
	 *  To search contact details.
	    @return null
	 */
	public void searchContact()
	{
		int option=view.searchContact();
		switch(option)
		{
			case 1: getContactById();break;
			case 2: getContactByName();break;
		}
	}
	/**
	 *  getAllContacts (all contact details) from file to arraylist.
	 */
	public void getAllContactDetails()
	{
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		view.showAllContactDetails(contacts);
	}
	/**
	 *  get contact by id from repository.
	 */
	public void getContactById()
	{
		String id=view.viewContactById();
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(id.equals(contacts.get(i).getId()))
			{
				contact=contacts.get(i);
			}
		}
		updateContact(contact);
	}
	/**
	 *  update contactdetails
	 @param contact
	 */
	public void updateContact(Contact contact)
	{
		int option=view.updateContactInfo(contact);
		switch(option)

			{
				case 1: editContact(contact);break;
				case 2: deleteContact(contact);break;
				case 3:	getAllcontactInfo();break;
			}
	}
	/**
	 *  Edit contact details.
	 @param contact
	 */
	public void editContact(Contact contact)
	{
		int option=view.editContact(contact);
		switch(option)
		{
			case 1:	editContactName(contact);break;
			case 2: editContactNumber(contact);break;
			case 3:	getAllcontactInfo();break;
		}	
	}
	/**
	 *  Edit contactName details.
	 @param contact
	 */
	public void editContactName(Contact contact)
	{
		int index=getIndex(contact);
		System.out.println("ind"+index);
		String name=view.editContactName(contact);
		String num=getNo(contact);
		String id=getId(contact);
		System.out.println("num"+num);
		updateContact(index,id,name,num);
	}
	/**
	 *  Edit contactNumber.
	 @param contact
	 */
	public void editContactNumber(Contact contact)
	{
		int index=getIndex(contact);
		System.out.println("ind"+index);
		String num=view.editContactNumber(contact);
		String name=getName(contact);
		String id=getId(contact);
		System.out.println("name"+name);
		updateContact(index,id,name,num);
	}

	/**
	 *  get contact by name from repository.
	 */
	public void getContactByName()
	{
		String name=view.viewContactByName();
		ArrayList<Contact> contacts=filerepo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			if(name.equals(contacts.get(i).getName()))
			{
				contact=contacts.get(i);
			}
		}updateContact(contact);
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
	 *  delete contact details.
	    @return null
	 */
	public void deleteContact(Contact contact)
	{
		view.deleteContact(contact);
		int index=getIndex(contact);
		System.out.println("ind"+index);
		filerepo.deleteContact(index);
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
	/**
	 *  getid of the corresponding contact.
	 	@param contact.
	    @return id.
	 */
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
	/**
	 *  delete all contacts from repository.
	 */
	public void deleteAllContacts()
	{
		filerepo.clearRepository();
	}
}