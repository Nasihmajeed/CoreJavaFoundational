package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
public class ContactView
{
	ContactController control;;
	public void showAllContacts(ArrayList<ContactModel> contact)
	{
		if(contact.size()==0)
		{
			System.out.println("Your Contact List empty ");
		}
		else
		{
			System.out.println(" \n<----Contact List---->");
			System.out.println("ID\tNAME\n");
			for(int i=0;i<contact.size();i++)
			{
				System.out.print(contact.get(i).getId()+"\t");
				System.out.println(contact.get(i).getName());
			}
		
		}
		displayContactInfo();
	}
	public void displayContactInfo()
	{
		Scanner sc=new Scanner(System.in);
		int default_option=0;
		char continueOpt='\0';
		ArrayList<ContactModel> contact=null;

		do
		{  
			System.out.println(" \n<---Contact App Menu--->");
			System.out.println(" 1:Add  \n 2:Search  \n 3:DeleteAll \n");
			System.out.println(" select your option	");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		addNewContact();break;
				case 2:		searchContact();break;
				case 3:		deleteAllContacts();break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
	}
	public void addNewContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("contact Id:	");
		String id=sc.next();
		System.out.println("contact Name:	");
		String name=sc.next();
		System.out.println("number ");
		String number=sc.next();
		control=new ContactController();
		control.addContactDetails(id,name,number);
	}
	public void searchContact()
	{
		System.out.println("Contact Search ");
		System.out.println("1.select by Id 2.select by Name");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
			case 1: getContactById();break;
			case 2: getContactByName();break;
		}
	}
	public void getContactById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to Search");
		String id=sc.next();
		control=new ContactController();
		Contact contact=control.getContactById(id);
		updateContactInfo(contact);
	}
	public void getContactByName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to Search");
		String name=sc.next();
		control=new ContactController();
		Contact contact=control.getContactByName(name);
		updateContactInfo(contact);
	}
	public void updateContactInfo(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		if((contact.getName())==null)
		{
			System.out.println("no contact found..!");
		}
		else
		{
			System.out.println("ID: "+contact.getId()+"\nNAME: "+contact.getName()+"\nPhno: "+contact.getNo()+"\n");
			System.out.println("\n1:Edit \n2:Delete \n3:Back to Main");
			int select=sc.nextInt();
			switch(select)
			{
				case 1: editContact(contact);break;
				case 2: deleteContact(contact);break;
				case 3:	displayContactInfo();break;
			}
		}
	}
	public void editContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Edit Name \n2:Edit ContactNo \n3:Back to Main");
		int select=sc.nextInt();
		switch(select)
		{
			case 1:	editContactName(contact);break;
			case 2: editContactNumber(contact);break;
			case 3:	displayContactInfo();break;
		}		
	}
	public void editContactName(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		System.out.println("Enter the new name");
		String name=sc.next();
		String num=control.getNo(contact);
		String id=control.getId(contact);
		control=new ContactController();
		control.updateContact(index,id,name,num);
		System.out.println("updated!");
	}
	public void editContactNumber(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		System.out.println("Enter the new number");
		String num=sc.next();
		String name=control.getName(contact);
		String id=control.getId(contact);
		control=new ContactController();
		control.updateContact(index,id,name,num);
		System.out.println("updated!");
	}
	public void deleteContact(Contact contact)
	{
		int index=control.getIndex(contact);
		control=new ContactController();
		control.deleteContact(index);
		System.out.println("contact Deleted!");
	}
	public void deleteAllContacts()
	{
		control=new ContactController();
		control.deleteAllContacts();
	}

}
