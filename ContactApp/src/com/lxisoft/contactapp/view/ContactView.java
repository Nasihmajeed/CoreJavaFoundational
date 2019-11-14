package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
public class ContactView
{
	ContactController control;
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
		do
		{  
			System.out.println(" \n<---Contact App Menu--->");
			System.out.println(" 1:Add  \n 2:Search  \n 3:View \n 4:DeleteAll \n");
			System.out.println(" select your option	");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		addNewContact();break;
				case 2:		searchContact();break;
				// case 3:		viewContact(control);break;
				// case 4:		deleteAllContacts(control);break;
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
		System.out.println("select a contact by Id");
		Scanner sc=new Scanner(System.in);
		String id=sc.next();
		control=new ContactController();
		control.getContactById(id);
	}
	public void getContactById(Contact contact)
	{
		System.out.println(contact.getName());
		System.out.println(contact.getNo());		
	}

}