package com.lxisoft.View;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import com.lxisoft.Domain.*;
import java.util.*;
/*
user interface view
*/
public class View
{
	
	public ContactControl control =new ContactControl();
	/**
	*to get the user option for the further process
	*@return return user input
	*/
	static int select=1;
	public String getUserOption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter any option / Contact  : \n1 add a contact  \n2 search contact \n3 sorting \n4 view all contacts \n5 delete all");
	 	return sc.next();
	}
	/**
	*to indicate the wrong selection
	*/
	public void invalidOption() 
	{
		System.out.println("enter the correct option");
	}
	/**
	*get input to continue program
	*@return return user input 0 or 1
	*/
	public int isContinue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("do u want to continue: 1 y or 0 no");
		return sc.nextInt();
	}
	/**
	*get the name and number for the new contact
	*/
	public void setNewContact()
	{
		Scanner sc=new Scanner(System.in);
		boolean exist=false;
		String name;
		do
		{
			System.out.println("enter the name: ");
			name=sc.next();
			if(exist)System.out.println("contact name already found , try another :");
		}while(exist);
		System.out.println("enter the number: ");
		String number=sc.next();
		control.createNewContact(name,number);
	}
	/**
	*print name and ID of all contacts
	*@return the exixtance of contact  
	*/
	public boolean viewAllContacts()
	{
		sorting(select);
		ArrayList<ViewListModel>listView=control.viewAllContacts();
		boolean contactsExist=false;
		if(listView.size()==0)
			System.out.println("no contacts to show");
		else
		{
			for(int i=0;i<listView.size();i++)
			{
				System.out.print("ID: "+listView.get(i).getId());
				System.out.println("\t  Name: "+listView.get(i).getName());
			}
			contactsExist=true;
		}return contactsExist;
	}
	/**
	*@param selection indication for search / select
	*shows the options for the selected contact , like edit, delete
	*print respective selection notification for the search and select option
	*/
	public void selectContact(int selection)
	{
		Scanner sc=new Scanner(System.in);
		boolean contactsExist=viewAllContacts();
		if(contactsExist)
		{	int repeat=0,loop=0;
			do
			{
				repeat=0;
				loop=0;
				if (selection==2)System.out.println(" enter : 0 search by ID   \t 1 search by Name \t 2 back to main");
				if (selection==0)System.out.println(" enter : 0 select by ID   \t 1 select by Name \t 2 back to main");
				int select=sc.nextInt();
				switch(select)
				{
					case 0: selectById();break;
					case 1: selectByName();break;
					case 2: control.start();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				
			}while(loop==1|repeat==1);
		}
	}
	/**
	select a contact by name from the contacts
	*/
	public void selectByName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.next();
		Contact contact=new Contact(); 
		contact=control.searchContact(name);
		selectedContact(contact);
	}
	/**
	*select a contact by id from the contacts
	*/
	public void selectById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ID :");
		int id=sc.nextInt();
		Contact contact=new Contact(); 
		contact=control.searchContact(id);
		selectedContact(contact);
	}
	public void moderateDisplay(ArrayList<Contact> selectedContacts)
	{
		for(Contact a: selectedContacts)
		 System.out.println("ID : "+a.getId()+"\tNAME: "+a.getName()+"\n");


		Scanner sc=new Scanner(System.in);
		System.out.println("enter full name to continue");
		String name=sc.next();
		Contact contact=new Contact(); 
		contact=control.searchContact(name);
		selectedContact(contact);
	}
	/**
	*@param contact selected contact
	*select option for the selected or searched contact
	*/	
	public void selectedContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		if((contact.getName())==null)
		{
			System.out.println("no contact found..!");
		}
		else
		{
			System.out.println("ID : "+contact.getId()+"\tNAME: "+contact.getName()+"\tNUMBER: "+contact.getNo()+"\n");
			int repeat=0,loop=0;
			do
			{
				repeat=0;
				System.out.println(" enter : \t0 edit  \t1 delete  \t2 back to main menu");
				int select=sc.nextInt();
				switch(select)
				{
					case 0: editContact(contact);break;
					case 1: deleteContact(contact);break;
					case 2: control.start();break;
					// case 4: clearAllContacts();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				
			}while(repeat==1);
		}	
	}
	/**
	*get new name and number to edit contact
	*@param contact selected contact
	*/
	public void editContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		boolean exist=false;
		String name;
		do
		{
			System.out.println("enter new name: ");
			exist=control.checkName((name=sc.next()));
			if(exist)System.out.println("contact name already found , try another :");
		}while(exist);
		System.out.println("enter number");
		String number=sc.next();
		int id=contact.getId();
		control.editContact(id,name,number,index);
		System.out.println("contact modified succesfully \n");			
	}
	/**
	*@param contact selected contact
	*pass the index of given contact to control to get deleted
	*/
	public void deleteContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		control.deleteContact(index);
		System.out.println("contact deleted succesfully \n");	
	}
	/**
	*command to clear all the contacts in file
	*/
	public void clearAllContacts()
	{
		control.clearAllContacts();
		System.out.println(" All contacts deleted succesfully \n");
	}
	
	public void sortContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter : \t0 sort by Name  \t1 sort by ID  \t2 Sort by Number \t3 back to main ");
				select=sc.nextInt();
			
		sorting(select);
	}
	public void sorting(int select)		
	{	
			int repeat=0,loop=0;
			do
			{
				repeat=0;
				
				switch(select)
				{
					case 0: sortByName();break;
					case 1: sortById();break;
					case 2: sortByNumber();break;
					case 3: control.start();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				
			}while(repeat==1);
		
	}
	public void sortByName()
	{
		control.sortByName();
		// System.out.println("sorted by name ");
	}
	public void sortById()
	{
		control.sortById();
		// System.out.println("sorted by ID ");
	}
	public void sortByNumber()
	{
		control.sortByNumber();
		// System.out.println("sorted by number");
	}
}
