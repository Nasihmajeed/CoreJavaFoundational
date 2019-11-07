package com.lxisoft.view;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class View
{
	static Scanner s=new Scanner(System.in);
	public void viewContact()
	{
		ContactController control=new ContactController();
		List <Contact> contactsList=new ArrayList<Contact>();
		int a=0;
		System.out.println("\t <-----CONTACT APP MENU----->\n");
		contactsList=control.getFileInfo();
		do
		{
			System.out.println("<---Enter your choice--->");
			System.out.println("\n 1-Add\t\t 2-Search\t 3-DeleteAll \t4-Exit");
			a=s.nextInt();
			switch(a)
			{
				case 1: addContact(control); break;
				case 2: searchContact(control,contactsList); break;
				case 3: deleteAllContact(control); break;
			}
		}while(a!=4);
		getContact(control);
		displayContacts(contactsList,control);
	}
	public void displayContacts(List <Contact> contactsList,ContactController control)
	{
		System.out.println("\ndisplay all contact-->(1-yes)(2-no)");
		int d=s.nextInt();
		if((d==1))
		{
			if((contactsList.size())!=0)
			{
				System.out.println("\t <-------CONTACT LIST------>\n");
				System.out.println("\t ID \t NAME \t\t NUMBER \n\t-----\t------\t\t--------");
				int i = 1;
				for(Contact c: contactsList)
				{
					System.out.println("\t "+i+"\t"+c.getContactName()+"\t\t"+ c.getContactNumber());
					i++;
				}
			}
			else
			{
				System.out.println(" contact list is empty!!!!!");
			}
		}
	}
	public void getContact(ContactController control)
	{
		Contact contact=new Contact();
		System.out.println("Enter contact id to check");
		int n=s.nextInt();
		contact=control.searchContact(n);
		int a=0;
		if((contact.getContactName()!=null)&(contact.getContactNumber()!=null))
		{
			System.out.println("contact name--->"+contact.getContactName());
			System.out.println("contact no  --->"+contact.getContactNumber());
			do
			{
				System.out.println("\n\n 1-Update\t 2-Delete \t 3-Exit");
				a=s.nextInt();
				switch(a)
				{
					case 1: updateContact(control,contact); break;
					case 2: deleteContact(control,n); break;
				}
			}while(a!=3);
		}
		else
		{
			System.out.println(" contact with id "+n+" is not present");
		}
	}
	public void addContact(ContactController control)
	{
		System.out.println("Enter number of contact to add->");
		int n=s.nextInt();
		
		for(int j=0;j<n;j++)
		{
			System.out.println("Enter contact name");
			String name=s.next();
			System.out.println("Enter contact number");
			String num=s.next();
			control.addContact(name,num);
		}
	}
	public void searchContact(ContactController control,List <Contact> contactsList)
	{
		Contact contact=new Contact();
		System.out.println("Enter contact id--");
		int n=s.nextInt();
		contact=control.searchContact(n);
		if((contact.getContactName()==null)&(contact.getContactNumber()==null))
		{
			System.out.println(" contact is not present");
		}
		else
		{
			System.out.println("contact name--->"+contact.getContactName());
			System.out.println("contact no  --->"+contact.getContactNumber());
		}
	}
	public void deleteContact(ContactController control,int n)
	{
		System.out.println(" deleted successfully");
		control.deleteContact(n);
	}
	public void updateContact(ContactController control,Contact contact)
	{
		System.out.println("Enter new contact number");
		String num=s.next();
		control.updateContact(num,contact);
	}
	public void deleteAllContact(ContactController control)
	{
		control.deleteAllContact();
	}
}