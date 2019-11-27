package com.lxisoft.contactapp.controller;

import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import com.lxisoft.contactapp.repository.*;
import com.lxisoft.contactapp.view.*;
import java.io.*;
import java.sql.*;
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
	public void getDBConnection()
	{
		try
		{
		filerepo.dB_Connection();
		}catch(Exception e)
		{
			System.out.println("error "+e);
		}
	}
	/**
	 * getAllContactInfo to get the contact details from repository and displaying in view.
	 */
	public void getAllcontactInfo()
	{
		Scanner sc=new Scanner(System.in);
		int default_option=0,option=0;
		char continueOpt='\0';
		boolean cont=false;
		String userChoice=null;
		try
		{
			do
			{	
				userChoice=view.viewUserOption();
				//if(option!=option){ throw new NumberFormatException ("");}
				if(option>5) {throw new NullPointerException ("");}
				switch((option=Integer.parseInt(userChoice)))
					{
						case 1:		addNewContact();break;
						case 2:		searchContact();break;	
						// case 3:		getAllContactDetails();break;
						// case 4:		sortContactDetails();break;
						// case 5:		deleteAllContacts();break;
						default:	System.out.println("Enter the correct option!");
									default_option=1;break;
					}cont=isContinue();
					// System.out.println("Do you want to continue ? Y/N");
					// continueOpt=sc.next().charAt(0);
			}while(default_option==1|cont);
		}
		catch(NullPointerException |NumberFormatException e)
		{
			// Contact contact=getContactByName(userChoice);
			// if(contact.getName()!=null)updateContact(contact);
			// else moderateSearch(userChoice);
			////System.out.println("exception occured " +e +sc.nextLine());
		}
	}
	/**
	 *  getAllContacts (id and name only) from file to arraylist.
	 */
	public void getAllcontacts()
	{
		ArrayList<ContactModel> contactlist=null;
		ArrayList<Contact> contacts=null;
		getDBConnection();
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException  e)
		{
			e.printStackTrace();
		}
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
	 */
	public void addNewContact()
	{
		String []contacts=view.addNewContact();
		Contact contact=new Contact();
		contact.setName(contacts[0]);
		contact.setNo(contacts[1]);
		try
		{
		filerepo.addContactDetails(contact);
		}catch(SQLException e)
		{
			System.out.println("error"+e);
		}
	}
	/**
	 *  To search contact details.
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
	// /**
	//  *  getAllContacts on the basis of contain Alphabets that we are enter
	//  */
	// public void moderateSearch(String name)
	// {
	// 	ArrayList<Contact> contacts=filerepo.getAllContacts();
	// 	ArrayList<Contact>searchList= new ArrayList<Contact>();
	// 	for(Contact contact:contacts)
	// 	{
	// 		if((contact.getName()).contains(name))
	// 		{
	// 			searchList.add(contact);
	// 		}
	// 	}
	// 	if(searchList!=null)
	// 	{
	// 		view.moderateSearchDisplay(searchList);
	// 		searchContact();
	// 		isContinue(); 
	// 	}
	// 	// else{ view.noSuchContacts();isContinue();
	// 	// }
	// }
	// /**
	//  *  getAllContacts (all contact details) from file to arraylist.
	//  */
	// public void getAllContactDetails()
	// {
	// 	ArrayList<Contact> contacts=filerepo.getAllContacts();
	// 	view.showAllContactDetails(contacts);
	// }
	// /**
	//  *  sort contacts .
	//  */
	
	// public void sortContactDetails()
	// {
	// 	int option=view.viewSortedDetails();
	// 	switch(option)
	// 	{
	// 		case 1: sortByName();break;
	// 		case 2: sortByNumber();break;
	// 		case 3:	sortById();break;
	// 	}
	// }
	// /**
	//  *  sort contacts ByName.
	//  */
	// public void sortByName()
	// {
	// 	ArrayList<Contact> contacts=filerepo.sortContactByName();
	// 	view.sortByName(contacts);
	// }
	// /**
	//  *  sort contacts ByNumber.
	//  */
	// public void sortByNumber()
	// {
	// 	ArrayList<Contact> contacts=filerepo.sortContactByNumber();
	// 	view.sortByNumber(contacts);
	// }
	// /**
	//  *  sort contacts id.
	//  */
	// public void sortById()
	// {
	// 	ArrayList<Contact> contacts=filerepo.sortContactByNumber();
	// 	view.sortByNumber(contacts);
	// }

	// /**
	//  *  get contact by id from repository.
	//  */
	public void getContactById()
	{
		int id=view.viewContactById();
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		Contact contact=new Contact();
		int val=1;
		for(int i=0;i<contacts.size();i++)
		{
			if(id==(contacts.get(i).getId()))
			{
				contact=contacts.get(i);
			}
			else val=0;
		}
		if(val==0){ view.noSuchContacts();}
		updateContact(contact);
	}
	/**
	 *  update contactdetails
	 * @param contact contact
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
	 * @param contact entity
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
	 * @param contact contact
	 */
	public void editContactName(Contact contact)
	{
		int index=getIndex(contact);
		System.out.println("ind"+index);
		String name=view.editContactName(contact);
		String num=getNo(contact);
		int id=getId(contact);
		updateContact(index,id,name,num);
	}
	/**
	 *  Edit contactNumber.
	 *@param contact contact
	 */
	public void editContactNumber(Contact contact)
	{
		int index=getIndex(contact);
		System.out.println("ind"+index);
		String num=view.editContactNumber(contact);
		String name=getName(contact);
		int id=getId(contact);
		updateContact(index,id,name,num);
	}

	/**
	 *  get contact by name from repository
	 * @param name contact name
	 */
	
	public Contact getContactByName(String name)
	{
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		Contact contact=new Contact(); int val=1;
		for(int i=0;i<contacts.size();i++)
		{
			if(name.equals(contacts.get(i).getName()))
			{
				contact=contacts.get(i);
			}
			else val=0;
		}
		if(val==0)
		{
			view.noSuchContacts();
		}return contact;
	}

	/**
	 *  get contact by name from repository.
	 */
	public void getContactByName()
	{
		String name=view.viewContactByName();
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		Contact contact=new Contact(); int val=1;
		for(int i=0;i<contacts.size();i++)
		{
			if(name.equals(contacts.get(i).getName()))
			{
				contact=contacts.get(i);
			}
			else val=0;
		}
		if(val==0)
		{
			view.noSuchContacts();
		}updateContact(contact);
	}
	/**
	 *  get contact index from repository.
	 *@param contact contact.
	 *@return index
	 */
	public int getIndex(Contact contact)
	{
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		int index=0;
		for(int i=0;i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
			{
				index=i;
			}
		}return index;
	}
	/**
	 *  update contact based on name and number.
	 * @param  i index
	 * @param id contact id
	 * @param name contact name
	 * @param number contact number
	 */
	public void updateContact(int i,int id,String name,String number)
	{
		Contact contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		try
		{
			filerepo.updateRepo(i,contact);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}	
	/**
	 *  delete contact details.
	 * @param contact contact
	 */
	public void deleteContact(Contact contact)
	{
		view.deleteContact(contact);
		int index=getIndex(contact);
		try
		{
			filerepo.deleteContact(index);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  getname of the corresponding contact.
	 * @param  contact contact
	 * @return name
	 */
	public String getName(Contact contact)
	{
		String name=null;
		ArrayList<Contact> contacts=null;
		try
		{
			contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
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
	 * @param contact contact
	 * @return num.
	 */
	public String getNo(Contact contact)
	{
		String num=null;
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
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
	 * @param contact contact.
	 * @return id.
	 */
	public int getId(Contact contact)
	{
		int id=0;
		ArrayList<Contact> contacts=null;
		try
		{
		contacts=filerepo.getAllContacts();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
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
		try
		{
			filerepo.clearRepository();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}
	public boolean isContinue()
	{
		boolean cont=view.isContinue();
		return cont;
	}
}