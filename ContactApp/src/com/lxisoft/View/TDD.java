package com.lxisoft.View;

import java.util.*;


import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;


public class TDD
{
	public static void main(String[] args) 
	{
		ContactControl control=new ContactControl();
		Scanner sc=new Scanner(System.in);
		
		int loop=0;
		int repeat=0; 
		do
		{
			repeat=0;
			loop=0;
			System.out.println("enter 1 add  2 search 3 modify  4 view all 5 delete ");
			int select=sc.nextInt();
			switch(select)
			{
				case 1: setNewContact(control);break;
				case 2: searchContact(control);break;
				case 3: modifyContact(control);break;
				case 4: getAllContacts(control);break;
				case 5: deleteContact(control);break;
				default:System.out.println("enter the correct option");
						repeat=1;
			}
			System.out.println("do u want to continue: 1 y or 0 no");
			loop=sc.nextInt();
		}while(loop==1|repeat==1);
	}
	public static void setNewContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the contact name: ");
		String name=sc.next();
		System.out.println("Enter the phone nmbr: ");
		long no=sc.nextLong();
		control.setNewContact(name,no);
						
	}
	public static void getAllContacts(ContactControl control)
	{
		int length=control.getContactsLength();
		for(int i=0;i<length;i++)
		{
			control.getContactDetail(i);
		}
	}
	public static void searchContact(ContactControl control)
	{
		Scanner sc=new Scanner(System.in);
		int length=control.getContactsLength();
		System.out.println("enter name to search");
		String search=sc.next();
		for(int i=0;i<length;i++)
		{
			int value=control.getContactDetail(i,search);
		}
	}
	public static void modifyContact(ContactControl control)
	{
		getAllContacts(control);
		Scanner sc=new Scanner(System.in);
		int length=control.getContactsLength();
		System.out.println("enter name to modify");
		String search=sc.next();
		int value=0,location=0;
		for(int i=0;i<length;i++)
		{
			value=control.getContactDetail(i,search);
			if(value==1)
			{
				location=i;
			}
		}
		if(value!=0)
		{
			System.out.println("Enter new contact name: ");
			String name=sc.next();
			System.out.println("Enter new phone nmbr: ");
			long no=sc.nextLong();
			control.updateContact(location,name,no);
		}
		System.out.println("contact modified Succesfully....!");

	}
	public static void deleteContact(ContactControl control)
	{
		getAllContacts(control);
		Scanner sc=new Scanner(System.in);
		int length=control.getContactsLength();
		System.out.println("enter name to delete");
		String search=sc.next();
		int value=0,location=0;
		for(int i=0;i<length;i++)
		{
			value=control.getContactDetail(i,search);
			if(value==1)
			{
				location=i;
			}
		}
		if(value!=0)
		{
			control.deleteContact(location);
		}
		System.out.println("contact deleted Succesfully....!");


	}
	

}