package com.lxisoft.test;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TDD
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		ContactController control=new ContactController();
		List <Contact> contactsList=new ArrayList<Contact>();
		int a=0;
		System.out.println("\t <-----CONTACT APP----->\n");
		contactsList=control.getContacts();
		do
		{
			System.out.println("Enter your choice-->");
			System.out.println("\n 1-Add Contact \n 2-Delete Contact \n 3-Update Contact \n 4-Exit");
			a=s.nextInt();
			switch(a)
			{
				case 1: addContact(control); break;
				case 2: deleteContact(control); break;
				case 3: updateContact(control); break;
			}
		}while(a!=4);
		System.out.println("\t <-------CONTACT LIST------>\n");
		System.out.println("\t ID \t NAME \t\t NUMBER \n\t-----\t------\t\t--------");
		int i = 1;
		for(Contact c: contactsList)
		{
			System.out.println("\t "+i+"\t"+c.getContactName()+"\t\t"+ c.getContactNumber());
			i++;
		}
		
	} 
	public static void addContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		System.out.println("Enter contact number");
		long num=s.nextInt();
		control.addContact(name,num);
	}

	public static void deleteContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		control.deleteContact(name);
	}
	public static void updateContact(ContactController control)
	{
		System.out.println("Enter contact name");
		String name=s.next();
		System.out.println("Enter new contact number");
		long num=s.nextInt();
		control.updateContact(name,num);
	}
}