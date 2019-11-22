package com.lxisoft.Controllers;

import com.lxisoft.Models.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
import com.lxisoft.View.*;
import java.io.*;
import java.util.*;
/**
*controler class
*/
public class ContactControl
{
	Repository repo=new Repository();
	/**
	*start method to select the repective view as per the user selection
	*/
	public void start()
	{
		repo.setId();
		View view=new View();
		view.viewAllContacts();
		int loop=0;
		int repeat=0; 
		do
		{
			int select=view.getUserOption();
			repeat=0;
			loop=0;
			switch(select)
			{
				case 0: view.selectContact(0);break;
				case 1: view.setNewContact();break;
				case 2: view.selectContact(2);break;
				case 3: view.sortContact();break;
				case 4: view.viewAllContacts();break;
				case 5: view.clearAllContacts();break;
				default:view.invalidOption();
			}
			repeat=view.isContinue();
		}while(loop==1|repeat==1);
	}
	/**
	*@param name contact name
	*@param number contact number
	*create new contact with the name and number
	*/
	public void createNewContact(String name, String number)
	{
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNo(number);
		repo.writeNewContact(contact,true);
		// repso.sorting(repo.getAllContacts());
	}
	/**
	*get all contact details from repository and get viewListModel array
	*@return return viewlist model array
	*/
	public ArrayList<ViewListModel> viewAllContacts()
	{
		// System.out.println("test controller");
		ViewList view=new ViewList();
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();
		ArrayList<ViewListModel> listView=null;
		if(contacts!=null)
		{
			view.clearArray();
			for(int i=0;i<contacts.size();i++)
			{
				view.setContact(contacts.get(i));
			}
			listView=view.getAllContacts();
		}
		return listView;
	}
	/**
	*@param name name to search
	*search the given name in contacts
	*@return return the contact
	*/
	public Contact searchContact(String name)
	{
		ArrayList<Contact> contacts= new ArrayList<Contact>(); 
		contacts=repo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			String s=contacts.get(i).getName();
			if(s.equals(name)) 
			{
				contact=contacts.get(i);								
			}
		}
		
		return contact;
	}
	/**
	*method to select the contact by id
	*@param id id to seach the contact
	*@return return selected contact
	*/
	public Contact searchContact(int id)
	{
		ArrayList<Contact> contacts= new ArrayList<Contact>(); 
		contacts=repo.getAllContacts();
		Contact contact=new Contact();
		for(int i=0;i<contacts.size();i++)
		{
			int s=contacts.get(i).getId();
			if(s==id) 
			{
				contact=contacts.get(i);								
			}
		}
		
		return contact;
	}
	/**
	*@param contact 
	*method to find the index of the given contact
	*@return return index of the contact
	*/
	public int getIndex(Contact contact)
	{
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();
		int index =50;
		for(int i=0; i<contacts.size();i++)
		{
			if(contact.equals(contacts.get(i)))
				{
					index=i;
				}
		}

		return index;
	}
	/**
	*method to edit the contact
	*@param name new name
	*@param number new number
	*@param i index number 
	*/
	public void editContact(int id,String name, String number, int i)
	{
		Contact contact=new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNo(number);
		repo.editFile(contact,i);
		// repo.sorting(repo.getAllContacts());
	}
	/**
	*method to delete a contact
	*@param i index of contact to delete
	*/
	public void deleteContact(int i)
	{
		repo.deleteContact(i);
		// repo.sorting(repo.getAllContacts());
	}
	/**
	*method to clear all contact
	*/
	public void clearAllContacts()
	{
		repo.clearFile();
	}
	/**
	*method to check whether the contact name already used
	*@param name inputed name
	*@return return booelean
	*/
	public boolean checkName(String name)
	{
		ArrayList<Contact> contacts=new ArrayList<Contact>();
		contacts=repo.getAllContacts();

		boolean exist=false;
		for(Contact a : contacts)
		{
			if(a.getName().equals(name))
				exist=true;
		}return exist;
	}
	public void sortByName()
	{
		repo.sortByName();
	}
	public void sortById()
	{
		repo.sortById();
	}
	public void sortByNumber()
	{
		repo.sortByNumber();
	}
}