package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
public class ContactView
{
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
				System.out.println(contact.get(i).getId()+"\t"+contact.get(i).getName()+"\n");
			}
		}
	}
	public int displayContactInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n<---Contact App Menu--->");
		System.out.println(" 1:Add  \n 2:Search  \n 3:view \n 4:DeleteAll \n");
		System.out.println(" select your option	");
		int option=sc.nextInt();
		return option;
	}
	public void showAllContactDetails(ArrayList<Contact> contacts)
	{
		if(contacts.size()==0)
		{
			System.out.println("Your Contact List empty ");
		}
		else
		{
			System.out.println(" \n<----Contact List---->");
			System.out.println("ID\tNAME\tNUMBER\n");
			for(int i=0;i<contacts.size();i++)
			{
				System.out.println(contacts.get(i).getId()+"\t"+contacts.get(i).getName()+"\t"+contacts.get(i).getNo()+"\n");
			}
		}
	}
	public String[] addNewContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("contact Name:	");
		String name=sc.next();
		System.out.println("number ");
		String number=sc.next();
		String []contact=new String[2];
		contact[0]=name;
		contact[1]=number;
		System.out.println("contact Added!");
		return contact;
	}
	public int searchContact()
	{
		System.out.println("Contact Search ");
		System.out.println("1.select by Id 2.select by Name");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		return option;
	}
	public String viewContactById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to Search");
		String id=sc.next();
		return id;
	}
	public String viewContactByName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to Search");
		String name=sc.next();
		return name;
	}
	public int updateContactInfo(Contact contact)
	{
		Scanner sc=new Scanner(System.in);int select=0;
		if((contact.getName())==null)
		{
			System.out.println("no contact found..!");
		}
		else
		{
			System.out.println("ID: "+contact.getId()+"\nNAME: "+contact.getName()+"\nPhno: "+contact.getNo()+"\n");
			System.out.println("\n1:Edit \n2:Delete \n3:Back to Main");
			select=sc.nextInt();
		}
		return select;
	}
	public int editContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Edit Name \n2:Edit ContactNo \n3:Back to Main");
		int select=sc.nextInt();
		return select;	
	}
	public String editContactName(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new name");
		String name=sc.next();
		System.out.println("updated!");
		return name;
	}
	public String editContactNumber(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new number");
		String num=sc.next();
		System.out.println("updated!");
		return num;
	}
	public void deleteContact(Contact contact)
	{
		System.out.println("contact Deleted!");
	}
}
