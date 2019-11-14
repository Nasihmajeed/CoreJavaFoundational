package com.lxisoft.View;

import com.lxisoft.Models.*;
import com.lxisoft.Controllers.*;
import com.lxisoft.Domain.*;
import java.util.*;

public class View
{
	public ContactControl control =new ContactControl();
	public void printAll() 
	{
		Scanner sc=new Scanner(System.in);
		viewAllContacts();
		
		int loop=0;
		int repeat=0; 
		do
		{
			repeat=0;
			loop=0;
			System.out.println(" enter : 0 select  1 add  2 search 3 delete all");
			int select=sc.nextInt();
			switch(select)
			{
				case 0: selectContact();break;
				case 1: setNewContact();break;
				// case 2: searchContact();break;
				// case 4: clearAllContacts();break;
				default:System.out.println("enter the correct option");
						repeat=1;
			}
			System.out.println("do u want to continue: 1 y or 0 no");
			loop=sc.nextInt();
		}while(loop==1|repeat==1);
	}
	public void setNewContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name: ");
		String name=sc.next();
		System.out.println("enter the number: ");
		String number=sc.next();
		control.createNewContact(name,number);
	}
	public void viewAllContacts()
	{
		ArrayList<ViewListModel>listView=control.viewAllContacts();
		if(listView.size()==0)
			System.out.println("no contacts to show");
		else
		{
			for(int i=0;i<listView.size();i++)
			{
				System.out.print("ID: "+listView.get(i).getId());
				System.out.println("\t  Name: "+listView.get(i).getName());
			}
		}
	}
	public void selectContact()
	{
		viewAllContacts();
		System.out.println("select a contact by name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		Contact contact=new Contact(); 
		contact=control.searchContact(name);	
		if((contact.getName())==null)
		{
			System.out.println("no contact found..!");
		}
		else
		{
			System.out.println(contact.getId()+"\t"+contact.getName()+"\t"+contact.getNo()+"\n");
			int repeat=0,loop=0;
			do
			{
				repeat=0;
				loop=0;
				System.out.println(" enter : 0 edit  1 delete  2 back to main");
				int select=sc.nextInt();
				switch(select)
				{
					case 0: editContact(contact);break;
					// case 1: deleteContact();break;
					// case 2: main(args);break;
					// case 4: clearAllContacts();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				System.out.println("do u want to continue: 1 y or 0 no");
				loop=sc.nextInt();
			}while(loop==1|repeat==1);


		}	

	}
	public void editContact(Contact contact)
	{
		int index=control.getIndex(contact);
		System.out.println(index+ " idex");
	}
	
}
