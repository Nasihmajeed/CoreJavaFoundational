package com.lxisoft.contactcontroller;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.contactmodel.*;
import com.lxisoft.view.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ContactController
{
	Repository repo=new Repository();
	View view=new View();
	static int v=0;
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
        display();
	}
	public void display()
	{
		int a=0;
		do
		{
			a=view.display();
			switch(a)
		    {
		    	case 1: getContactById(); break;
		    	case 2: addContact(); break;
				case 3: searchContact(); break;
				case 4: deleteAllContact(); break;
		    }
		}while(a!=5);
	}
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
	// public void setFile()
	// {
	// 	// v=repo.checkFile(v);
	// 	v=repo.setFile(v);
	// }
	public void addContact()
	{
		// setFile();
		Contact cont=view.addContact();	
		repo.writeFile(cont);
	}
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
		// int v=1;
		repo.setFile();
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
		view.deleteContact();
	}
	public void updateContact(String n)
	{
		List <Contact> contactList=repo.readFile();
		String num=view.updateContact();
		for(int i=0;i<contactList.size();i++)
		{
			if(n.equals(contactList.get(i).getContactId()))
			{
				Contact c=contactList.get(i);
				c.setContactNumber(num);
				contactList.set(i,c);
			}	
		}
		repo.resetFile();
		// int v=1;
		repo.setFile();
		for(int j=0;j<contactList.size();j++)
		{
			repo.rewriteFile(contactList.get(j));
		}
	}
	public void deleteAllContact()
	{
		repo.resetFile();
		view.deleteAllContact();
	}
	
}