package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.Contact;
import java.util.*;
public class ContactView
{
	static ContactController control=new ContactController();
	public void getFileInfo()
	{
		control.getFileInfo();
	}
	public void displayContactInfo()
	{
		Scanner sc=new Scanner(System.in);
		int default_option=0;
		char continueOpt='\0';
		do
		{  
			System.out.println(" \n<---Contact App Menu--->");
			System.out.println(" 1:Add  \n 2:Search  \n 3:View \n 4:DeleteAll \n 5:Exit ");
			System.out.println(" select your option	");
			int option=sc.nextInt();
			switch(option)
			{
				case 1:		createNewContact(control);break;
				case 2:		searchContact(control);break;
				case 3:		viewContact(control);break;
				case 4:		deleteAllContacts(control);break;
				case 5:		continueOpt='n';break;
				default:	System.out.println("Enter the correct option!");
							default_option=1;break;
			}
			System.out.println("Do you want to continue ? Y/N");
			continueOpt=sc.next().charAt(0);
		}while(default_option==1|(continueOpt=='Y'|continueOpt=='y'));
	}
	public void viewContact(ContactController control)
	{	
		int i;
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		if(length==0)
		{
			System.out.println("contact List is empty");
		}
		else
		{
			System.out.println("contact List \n.................");
			System.out.println("  Name \t ContactNo");
			for( i=0;i<length;i++)
			{
				System.out.print((i)+" ");
				control.getContactDetails(i);
			}
			System.out.println("Select an option to continue \n 1:search \n2:Back to menu");
			int option=sc.nextInt();
			int val=0;
			//String[] array=new String[5];
			switch(option)
			{
				case 1:searchContact(control);val=1;break;
				case 2:val=1;break;
			}
			if(val==1)
				System.out.println("Do you want to exit ? 1-yes 0-No  ");
				int opt=sc.nextInt();
				displayContactInfo();
		}
	}
	public void updateContact(ContactController control,int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an option to continue \n1:Edit \n2:Delete \n3:Main menu");
		int select=sc.nextInt();
		switch(select)
		{
			case 1: editContact(control,i);break;
			case 2: deleteContact(control,i);break;
			case 3: displayContactInfo();break; 
		}
	}
	public void createNewContact(ContactController control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("contact Name:	");
		String name=sc.next();
		System.out.println("number ");
		String number=sc.next();
		control.addContact(name,number);
	}
	public void searchContact(ContactController control)
	{ 
		Scanner sc=new Scanner(System.in);
		int length=control.getLength();
		if(length==0)
		{
			System.out.println("contact list is empty");
		}
		else
		{
			System.out.println(" Enter the name to search:");
			String name=sc.next();
			int value=0,val=0;
			for(int i=0;i<length;i++)
			{	
				value=control.searchContact(i,name);
				if(value==1)
				{
					updateContact(control,i);
					val=1;
					break;
				}
			}
		     if(val==0)
					contactNotFound();
		}
	}
	public void contactNotFound()
	{
		System.out.println(" There is no such contacts..! ");
		displayContactInfo();	
	}
	public void editContact(ContactController control,int i)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Edit Name \n2:Edit ContactNo \n3:Main menu ");
		int select=sc.nextInt();
		String name;String num;
		switch(select)
		{
			case 1:	System.out.println("Enter the new name");name=sc.next();
					num=control.getNo(i);control.updateContact(i,name,num);System.out.println("updated!");break;
			case 2: System.out.println("Enter the new number");num=sc.next();
					name=control.getName(i);control.updateContact(i,name,num);System.out.println("updated!");break;	
			case 3:	displayContactInfo();break;	
		}		
	}
	public void deleteContact(ContactController control,int i)
	{
		control.deleteContact(i);
		System.out.println("contact Deleted!");
	}
	public void deleteAllContacts(ContactController control)
	{
		control.deleteAllContacts();
	}
}