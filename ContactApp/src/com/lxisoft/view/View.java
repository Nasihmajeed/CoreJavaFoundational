package com.lxisoft.view;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.domain.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class View
{
	static Scanner s=new Scanner(System.in);
	// public void viewContact()
	// {
	// 	ContactController control=new ContactController();
	// 	int a=0;
	// 	System.out.println("\t <-----CONTACT APP MENU----->\n");
		
	// 	do
	// 	{
	// 		System.out.println("<---Enter your choice--->");
	// 		System.out.println("\n 1-Add\t\t 2-Search\t 3-DeleteAll \t4-Exit");
	// 		a=s.nextInt();
	// 		switch(a)
	// 		{
	// 			case 1: addContact(control); break;
	// 			case 2: searchContact(control); break;
	// 			case 3: deleteAllContact(control); break;
	// 		}
	// 	}while(a!=4);
	// 	getContact(control);
	// 	displayContacts(control);
	// }
	public void displayContacts(ContactController control)
	{
		System.out.println("\ndisplay all contact-->(1-yes)(2-no)");
		int d=s.nextInt();
		if((d==1))
		{
			if((control.getListSize())!=0)
			{
				System.out.println("\t <-------CONTACT LIST------>\n");
				System.out.println("\t ID \t NAME \t\t NUMBER \n\t-----\t------\t\t--------");
				int i = 1;
				for(int j=0;j<control.getListSize();j++)
				{
					System.out.println("\t "+i+"\t"+control.getFileInfo(j).getContactName()+"\t\t"+ control.getFileInfo(j).getContactNumber());
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
		System.out.println("Enter contact id to check");
		int n=s.nextInt();
		int a=0;
		if((control.searchContact(n).getContactName()!=null)&(control.searchContact(n).getContactNumber()!=null))
		{
			System.out.println("contact name--->"+control.searchContact(n).getContactName());
			System.out.println("contact no  --->"+control.searchContact(n).getContactNumber());
			do
			{
				System.out.println("\n\n 1-Update\t 2-Delete \t 3-Exit");
				a=s.nextInt();
				switch(a)
				{
					case 1: updateContact(control,n); break;
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
		control.setFile();
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
	public void searchContact(ContactController control)
	{
		System.out.println("Enter contact id--");
		int n=s.nextInt();
		if((control.searchContact(n).getContactName()==null)&(control.searchContact(n).getContactNumber()==null))
		{
			System.out.println(" contact is not present");
		}
		else
		{
			System.out.println("contact name--->"+control.searchContact(n).getContactName());
			System.out.println("contact no  --->"+control.searchContact(n).getContactNumber());
		}
	}
	public void deleteContact(ContactController control,int n)
	{
		System.out.println(" deleted successfully");
		control.deleteContact(n);
	}
	public void updateContact(ContactController control,int n)
	{
		System.out.println("Enter new contact number");
		String num=s.next();
		control.updateContact(num,n);
	}
	public void deleteAllContact(ContactController control)
	{
		control.deleteAllContact();
	}
}