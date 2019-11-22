package com.lxisoft.contactcontroller;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.contactmodel.*;
import com.lxisoft.view.*;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
/**
 *controller class
 */
public class ContactController 
{
	Repository repo=new Repository();
	View view=new View();
	/**
	 *to get all contact
	 */
	public void getAllContacts()
	{
		List <Contact> contactList=repo.readFile();
		ContactListModel listModel=new ContactListModel();
	    for(int i=0;i<contactList.size();i++)
	    {
	    	ContactModel model=new ContactModel();
	    	model.setId(contactList.get(i).getContactId());
	    	model.setName(contactList.get(i).getContactName());
	    	listModel.setContactListModel(model);
	    }
		view.getAllContacts(listModel.getContactListModel());
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
				case 6: sortByName(); break;
				// case 7: sortByNumber(); break;
				// case 8: sortById(); break;
		    }
		}while(a!=9);
	}
	/**
	 *to get contact by using id
	 */
	public void getContactById()
	{
		String n=view.getContactId();
		List <Contact> contactList=repo.readFile();
		Contact contact=new Contact();
		for(int i=0;i<contactList.size();i++)
		{
			if((contactList.get(i).getContactId()).equals(n))
			{
				contact=contactList.get(i);
			}
		}
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
	public void sortByName()
	{
		List <Contact> contactList=repo.sortByName();
		ContactListModel listModel=new ContactListModel();
	    for(int i=0;i<contactList.size();i++)
	    {
	    	ContactModel model=new ContactModel();
	    	model.setId(contactList.get(i).getContactId());
	    	model.setName(contactList.get(i).getContactName());
	    	listModel.setContactListModel(model);
	    }
		view.getAllContacts(listModel.getContactListModel());
	}
	/**
	 *to add contact in to file.
	 */
	public void addContact()
	{
		Contact cont=view.addContact();	
		repo.writeFile(cont);
	}
	/**
	 *to search contact
	 */
	public void searchContact()
	{
		String n=view.getContactId();
		Contact contact=new Contact();
		List <Contact> contactList=repo.readFile();
		for(int i=0;i<contactList.size();i++)
		{
			if(n.equals(contactList.get(i).getContactId()))
			{
				contact=contactList.get(i);
			}
		}
		view.searchContact(contact);
	}
	/**
	 *to delete contact
	 *
	 *@param n contact id to delete
	 */
	public void deleteContact(String n)
	{
		List <Contact> contactList=repo.readFile();
		for(int i=0;i<contactList.size();i++)
		{
			if(n.equals(contactList.get(i).getContactId()))
			{
				contactList.remove(i);
			}	
		}
		repo.resetFile();
		repo.setFile();
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
		view.deleteContact();
	}
	/**
	 *to update contact.
	 *
	 *@param n contact id to update
	 */
	public void updateContact(String n)
	{
		List <Contact> contactList=repo.readFile();
		Contact con=view.updateContact();
		for(int i=0;i<contactList.size();i++)
		{
			if(n.equals(contactList.get(i).getContactId()))
			{
				Contact c=contactList.get(i);
				c.setContactName(con.getContactName());
				c.setContactNumber(con.getContactNumber());
				contactList.set(i,c);
			}	
		}
		repo.resetFile();
		repo.setFile();
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
	}
	/**
	 *to delete all contact
	 */
	public void deleteAllContact()
	{
		repo.resetFile();
		repo.setFile();
		view.deleteAllContact();
	}
	
}