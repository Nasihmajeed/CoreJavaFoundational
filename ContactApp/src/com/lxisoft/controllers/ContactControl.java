package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import com.lxisoft.view.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class ContactControl
{
    /**
 * class controller
 */
    Repository repository=new Repository();
    ContactView view=new ContactView();
   /**
 * to get all contacts
 */
	public void getContactDetails()
	{     
        List<Contact>contactList=repository.arrayWrite();
        ContactListModel listModel=new ContactListModel();
        for(int i=0;i<contactList.size();i++)
        {
            ContactModel model=new ContactModel();
            model.setId(contactList.get(i).getId());
            model.setName(contactList.get(i).getName());
            listModel.setContactsList(model);
       }
        view.getAllContacts(listModel.getContactsList());
        display();
    }
    /**
 * to select choices
 */
    public void display()
    {
        int ch;
        do
        {
            ch=view.display();
            switch(ch)
            {
                case 1:ContactByIdDetails();break;     
                case 2:addDetails();break; 
                case 3:searchDetails();break;
                case 4:getContactDetails();break;
            } 
        }while(ch!=5);
        
    }
    /**
 * contact select by id and operations delete and update
 */
    public void ContactByIdDetails()
    {
        List<Contact>contactList=repository.arrayWrite();
        String d=view.getContactId();
        Contact c=new Contact();
        for(int i=0;i<contactList.size();i++)
        {
            if((contactList.get(i).getId()).equals(d))
            {
                c=contactList.get(i);
            }
        }
        view.getContactById(c);
        int ch=0;
        ch=view.getOperations();
        switch(ch)
        {
            case 1: updateDetails(d); break;
            case 2: deleteDetails(d); break;
        }
    }
    /**
 * add contact
 */
    public void addDetails()
    {
    	Contact c=new Contact();
    	c=view.addContact();
        repository.createFile(c);
    }
     /**
 * delete contact
 */
    public void deleteDetails(String d)
    {
        List<Contact>contactList=repository.arrayWrite();
        for(int i=0;i<contactList.size();i++)
    	{
            if(d.equals(contactList.get(i).getId()))
            {
                contactList.remove(i);
            }
    	}
        repository.resetFile();
        for(int i=0;i<contactList.size();i++)
        {
            repository.rewriteFile(contactList.get(i));
        }
        view.deleteContact();
    }
     /**
 * update contact
 */
      /**
 * @param d selected id
 */
    public void updateDetails(String d)
    {
        List<Contact>contactList=repository.arrayWrite();
        String contactNo=view.updateContact();
  		for(int i=0;i<contactList.size();i++)
    	{
            if(d.equals(contactList.get(i).getId()))
            {
                Contact c=contactList.get(i);
                c.setContactNo(contactNo);
                contactList.set(i,c);
            }   
    	}
        repository.resetFile();
        for(int i=0;i<contactList.size();i++)
        {
            repository.rewriteFile(contactList.get(i));
        }
    }
     /**
 * search a contact by id
 */
    public void searchDetails()
    {
        String d=view.getContactId();
        Contact c=new Contact();
        List<Contact>contactList=repository.arrayWrite();
        for(int i=0;i<contactList.size();i++)
        {
            if(d.equals(contactList.get(i).getId()))
            {
                c=contactList.get(i);
            }
        }
        view.searchContact(c);
    }
 } 
