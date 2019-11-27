package com.lxisoft.contactcontroller;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.contactmodel.*;
import com.lxisoft.view.*;
import java.io.*;
import java.util.*;
/**
 *controller class
 */
public class ContactController 
{
	// Repository repo=new FileRepository();
	Repository repo=new MysqlRepository();
	View view=new View();
	/**
	 *to get all contact
	 */
	public void getAllContacts()
	{
		List <Contact> contactList=repo.findAllContact();
		ContactListModel listModel=new ContactListModel();
	    for(int i=0;i<contactList.size();i++)
	    {
	    	ContactModel model=new ContactModel();
	    	model.setId(contactList.get(i).getContactId());
	    	model.setName(contactList.get(i).getContactName());
	    	listModel.setContactListModel(model);
	    }
        getChoice();
	}
	/**
	 *to choose contact operation
	 */
	public void getChoice()
	{
		int a=0;
		do
		{
			a=view.getChoice();
			switch(a)
		    {
		    	case 1: getContactById(); break;
		    	case 2: addContact(); break;
				case 3: searchContact(); break;
				case 4: deleteAllContact(); break;
				case 5: getAllContacts(); break;
				case 6: sortContact(); break;
		    }
		}while(a!=7);
	}
	/**
	 *to get contact by using id
	 */
	public void getContactById()
	{
		int n=view.getContactId();
		Contact contact=repo.findContactById(n);
		view.getContactById(contact);
		int a=0;
		do
		{
			a=view.getContactOperation();
			switch(a)
			{
				case 1: updateContact(n); break;
				case 2: deleteContact(n); break;
			}
		}while(a!=3);
	}
	/**
	 *to sort contact
	 */
	public void sortContact()
	{
		int a=0;
		List <Contact> contactList=null;
		do
		{
			a=view.getSortOption();
			switch(a)
			{
				case 1: contactList=repo.sortByName(); break;
				case 2: contactList=repo.sortByNumber(); break;
				case 3: contactList=repo.sortById(); break;
			}
		}while(a!=4);
		view.getSortedContacts(contactList);
	}
	/**
	 *to add contact in to file.
	 */
	public void addContact()
	{
		Contact cont=view.addContact();	
		repo.saveContact(cont);
	}
	/**
	 *to search contact
	 */
	public void searchContact()
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		List<String>contact=new ArrayList<String>();
		List <Contact> contactList=repo.findAllContact();
		for(int i=0;i<contactList.size();i++)
		{
			if(contactList.get(i).getContactName().contains(name))
			{
				contact.add(contactList.get(i).getContactName());
			}
		}
		view.searchContact(contact);
	}
	/**
	 *to delete contact
	 *
	 *@param n contact id to delete
	 */
	public void deleteContact(int n)
	{
		repo.deleteContact(n);
		view.deleteContact();
	}
	/**
	 *to update contact.
	 *
	 *@param n contact id to update
	 */
	public void updateContact(int n)
	{
		Contact con=view.updateContact();
		repo.updateContact(n,con);
	}
	/**
	 *to delete all contact
	 */
	public void deleteAllContact()
	{
		repo.deleteAllContact();
		view.deleteAllContact();
	}
	
}