package com.lxisoft.View;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import java.util.*;

public class View
{
		static ContactControl control=new ContactControl();

	
	
	public void start() 
	{
		Scanner sc=new Scanner(System.in);
		
		int loop=0;
		int repeat=0; 
		do
		{
			repeat=0;
			loop=0;
			System.out.println("enter 1 add  2 search 3 view all Arraylist 4 view all File Contacts  5 clear all");
			int select=sc.nextInt();
			switch(select)
			{
				case 1: setNewContact(control);break;
				case 2: searchContact(control);break;
				case 3: getAllContacts(control);break;
				case 4: viewAllContacts();break;
				case 5: clearAllContacts(control);break;
				default:System.out.println("enter the correct option");
						repeat=1;
			}
			System.out.println("do u want to continue: 1 y or 0 no");
			loop=sc.nextInt();
		}while(loop==1|repeat==1);
	}
	public void setNewContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contact name: ");
		String name=sc.next();
		System.out.println("Enter the phone nmbr: ");
		String no=sc.next();
		control.setNewContact(name,no);
						
	}
	public void getAllContacts(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getContactsLength();
		if(length==0)
		{
			System.out.println("No contacts has been added...!");
		}
		else
		{	
			for(int i=0;i<length;i++)
			{
				System.out.print(i +" ");
				Contact contact= control.getContactDetail(i);
				System.out.println("Name : "+contact.getName());
			}
			int loop=0;
			int select=0;
			do
			{
				System.out.println("select a contact by no :");
				select=sc.nextInt();
			}while(select+1>length);
			Contact contact= control.getContactDetail(select);
			System.out.print("Name : "+contact.getName());
			System.out.println(" \t No : "+contact.getNo());
			int repeat=0;
			do
			{
				System.out.println(" 1 edit 2 delete 3 back to main");
				int choice=sc.nextInt();
				String[] array=new String[5];
				switch(choice)
				{
					case 1 : modifyContact(control,select);break;
					case 2 : deleteContact(control,select);break; 
					case 3 : start();break; 
					default : repeat=1;
				}
			}while(repeat==1);
		}

	}
	public void searchContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getContactsLength();
		System.out.println("enter name to search");
		String search=sc.next();
		Contact contact=null;
		for(int i=0;i<length;i++)
		{
			contact=control.getContactDetail(i,search);
		}
		if(contact!=null)
		{
			System.out.print("Contact found ! \n Name : "+contact.getName());
			System.out.println(" \t No : "+contact.getNo());
		}

		else	System.out.println("Contact not found..! ");

	}
	public void modifyContact(ContactControl control, int search)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new contact name: ");
		String name=sc.next();
		System.out.println("Enter new phone nmbr: ");
		String no=sc.next();
		control.updateContact(search,name,no);
		System.out.println("contact modified Succesfully....!");
		control.resetRepo();

	}
	public void deleteContact(ContactControl control,int location)
	{
		control.deleteContact(location);
		System.out.println("contact deleted Succesfully....!");
		control.resetRepo();

	}
	public void clearAllContacts(ContactControl control)
	{
		control.clearAllContacts();
		System.out.println("All contacts has been deleted...$$$");
	}
	public void viewAllContacts()
	{
		boolean add=control.viewAllContacts();
		if(add)System.out.println("No contacts has been added...!");
	}
}
