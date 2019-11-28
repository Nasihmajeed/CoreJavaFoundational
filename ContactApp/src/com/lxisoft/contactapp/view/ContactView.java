package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
/**
* class ContactView to interact with user.
	 
	 */
public class ContactView
{
	/**
	 * showAllcontacts name and number 
	 * @param Arraylist contact
	 */
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
	/**
	 * displayContactInfo to user
	 * @return option
	 */
	public String viewUserOption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n<---Contact App Menu--->");
		System.out.println(" 1:Add  \n 2:Search  \n 3:view \n 4:sort \n 5:DeleteAll \n");
		System.out.println(" select your option	");
		String option=sc.next();
		return option;
	}
	/**
	 * view sorted contactlist
	 * @return option
	 */
	public int viewSortedDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n<---contact sort--->");
		System.out.println(" 1:by name  \n 2:by number \n 3:by Id ");
		System.out.println(" select your option	");
		int option=sc.nextInt();
		return option;
	}
	// /**
	//  * view sortByname in contactlist.
	//  */
	// public void sortByName(ArrayList<Contact> contactlist)
	// {
	// 	System.out.println(" ID \t NAME \t NUMBER");
	// 	for(int i=0;i<contactlist.size();i++)
	// 	{
	// 		System.out.println(contactlist.get(i).getId()+"\t"+contactlist.get(i).getName()+"\t"+contactlist.get(i).getNo()+"\n");
	// 	}
	// }
	// public void sortByNumber(ArrayList<Contact> contactlist)
	// {
	// 	System.out.println(" ID \t NAME \t NUMBER");
	// 	for(int i=0;i<contactlist.size();i++)
	// 	{
	// 		System.out.println(contactlist.get(i).getId()+"\t"+contactlist.get(i).getName()+"\t"+contactlist.get(i).getNo()+"\n");
	// 	}
	// }
	// public void sortById(ArrayList<Contact> contactlist)
	// {
	// 	System.out.println(" ID \t NAME \t NUMBER");
	// 	for(int i=0;i<contactlist.size();i++)
	// 	{
	// 		System.out.println(contactlist.get(i).getId()+"\t"+contactlist.get(i).getName()+"\t"+contactlist.get(i).getNo()+"\n");
	// 	}
	// }
	/**
	 * show All ContactDetails 
	 * @param contacts
	 */
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
	/**
	 * Add new contacts 
	 * @return contact
	 */
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
	public String getByAlphabets()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("search here..");
		String name=sc.next();
		return name;
	}
	/**
	 * search contact 
	 * @return option
	 */
	public int searchContact()
	{
		System.out.println("Contact Search ");
		System.out.println("1.select by Id 2.select by Name ");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		return option;
	}
	public void noSuchContacts()
	{
		System.out.println(" no such contacts!");
	}
	/**
	 * view contact by id 
	 * @return id
	 */
	public int viewContactById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to Search");
		int id=sc.nextInt();
		return id;
	}
	/**
	 * view contact by name 
	 * @return name
	 */
	public String viewContactByName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to Search");
		String name=sc.next();
		return name;
	}
	/**
	 * update contact Info
	 * @param contact 
	 * @return select
	 */
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
	/**
	 * edit contact details
	 * @param contact
	 * @return select
	 */
	public int editContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Edit Name \n2:Edit ContactNo \n3:Back to Main");
		int select=sc.nextInt();
		return select;	
	}
	/**
	 * edit contact name
	 * @param contact
	 * @return name
	 */
	public String editContactName(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new name");
		String name=sc.next();
		System.out.println("updated!");
		return name;
	}
	/**
	 * edit contact number
	 * @param contact
	 * @return num
	 */
	public String editContactNumber(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new number");
		String num=sc.next();
		System.out.println("updated!");
		return num;
	}
	/**
	 * delete contact details
	 * @param contact
	 */
	public void deleteContact(Contact contact)
	{
		System.out.println("contact Deleted!");
	}
	public void moderateSearchDisplay(ArrayList<Contact> contacts)
	{
		System.out.println(" \n<----Contact List---->");
		System.out.println("ID\tNAME\tNUMBER\n");
		for(int i=0;i<contacts.size();i++)
		{
			System.out.println(contacts.get(i).getId()+"\t"+contacts.get(i).getName()+"\t"+contacts.get(i).getNo()+"\n");
		}
	}
	public boolean isContinue()
	{
		Scanner sc=new Scanner(System.in);boolean cont=false;
		System.out.println("Continue? y:Yes n:No");
		char c=sc.next().charAt(0);
		if(c=='y'|c=='Y') cont=true;
		return cont;
	}
}
