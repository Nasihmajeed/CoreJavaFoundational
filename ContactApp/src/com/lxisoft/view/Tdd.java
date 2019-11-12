package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		ContactControl control=new ContactControl();
		System.out.println("        CONTACT APP\n        ***************");
		control.getContactDetails();
		viewContact(control);
		do
		{
			c=0;
			System.out.println("\nDo you want to perform any operations?\n0-Add\n1-Select\n2-Search");
			int x=sc.nextInt();
			switch(x)
			{
				case 0:addContact(control);break;
				case 1:selectContact(control);break;
				case 2:searchContact(control);break;
				default:System.out.println("Invalid Selection");
			}
			System.out.println("Continue...?\n0-No   1-Yes");
			c=sc.nextInt();
	    }while(c==1);
	    viewContact(control);
	}
    public static void viewContact(ContactControl control)
    {
		System.out.println("Contact List\n----------------");
		for(int i=0;i<control.getContactList();i++)
		{
			System.out.println(i+" Name= "+control.viewDetails(i).getName());
			System.out.println("Number= "+control.viewDetails(i).getContactNo()+"\n");
		}
	}
	public static void viewName(ContactControl control)
    {
		for(int i=0;i<control.getContactList();i++)
		{
			System.out.println(i+" Name= "+control.viewDetails(i).getName());
		}
	}
	public static void addContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Contact name:");
		String name=sc.next();
		System.out.println("\nEnter contact number:");
		String contactNo=sc.next();
		control.addDetails(name,contactNo);
		viewContact(control);
	}
	public static void selectContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		viewName(control);
		System.out.println("Select a contact by number");
		int no=sc.nextInt();
		control.selectDetails(no);
		System.out.println("0-delete     1-Edit");
		int y=sc.nextInt();
		switch(y)
		{
			case 0:deleteContact(control,no);break;
			case 1:updateContact(control,no);break;
			default:System.out.println("Invalid selection");
		}
	}
	public static void deleteContact(ContactControl control,int no)
	{
		control.deleteDetails(no);
		viewContact(control);
	}
	public static void updateContact(ContactControl control,int no)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter new contact number:");
		String contactNo=sc.next();
		control.updateDetails(contactNo,no);
		viewContact(control);	
	}
	public static void searchContact(ContactControl control)
	{
		Contact contact;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Name to search");
		String name=sc.next();
		contact=control.searchDetails(name);
		System.out.println("\n Name="+contact.getName());
		System.out.println(" Number="+contact.getContactNo());		
	}
} 
