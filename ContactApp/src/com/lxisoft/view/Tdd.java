package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import java.util.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ContactControl control=new ContactControl();
		List<Contact>contactList=new ArrayList<Contact>();
		System.out.println("CONTACT APP\n***************");
		contactList=control.getContactDetails();
		System.out.println("\nDo you want to perform any operations?");
		System.out.println("\n0-Add\n1-Remove\n2-Edit\n3-Search\n4-Exit");
		int x=sc.nextInt();
		switch(x)
		{
			case 0:addContact(control,contactList);break;
			case 1:deleteContact(control);break;
			case 2:updateContact(control);break;
			case 3:searchContact(control);break;
			case 4:break;
			default:System.out.println("Invalid Selection");
		}
		System.out.println("Contact List\n----------------");
		for(int i=0;i<contactList.size();i++)
		{
			System.out.println("\nName= "+contactList.get(i).getName());
			System.out.println("Number= "+contactList.get(i).getContactNo()+"\n");
		}
	}
	public static void addContact(ContactControl control,List<Contact>contactList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Contact name:");
		String name=sc.next();
		System.out.println("\nEnter contact number:");
		String contactNo=sc.next();
		contactList=control.addDetails(name,contactNo);
	}

	public static void deleteContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Contact name:");
		String name=sc.next();
		control.deleteDetails(name);
	}

	public static void updateContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Contact name:");
		String name=sc.next();
		System.out.println("\nEnter new contact number:");
		String contactNo=sc.next();
		control.updateDetails(name,contactNo);	
	}

	public static void searchContact(ContactControl control)
	{
		Contact contact;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Contact Name");
		String name=sc.next();
		control.searchDetails(name);
	}
}