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
		int loop=0;
		int repeat=0; 
		do
		{
			viewAllContacts();
			repeat=0;
			loop=0;
			System.out.println(" enter : 0 select contact 1 add  2 search 3 delete all");
			int select=sc.nextInt();
			switch(select)
			{
				case 0: selectContact(0);break;
				case 1: setNewContact();break;
				case 2: selectContact(2);break;
				case 3: clearAllContacts();break;
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
	public boolean viewAllContacts()
	{
		ArrayList<ViewListModel>listView=control.viewAllContacts();
		boolean contactsExist=false;
		if(listView.size()==0)
			System.out.println("no contacts to show");
		else
		{
			for(int i=0;i<listView.size();i++)
			{
				System.out.print("ID: "+listView.get(i).getId());
				System.out.println("\t  Name: "+listView.get(i).getName());
			}
			contactsExist=true;
		}return contactsExist;
	}
	public void selectContact(int selection)
	{
		Scanner sc=new Scanner(System.in);
		boolean contactsExist=viewAllContacts();
		if(contactsExist)
		{	int repeat=0,loop=0;
			do
			{
				repeat=0;
				loop=0;
				if (selection==2)System.out.println(" enter : 0 search by ID   \t 1 search by Name ");
				if (selection==0)System.out.println(" enter : 0 select by ID   \t 1 select by Name ");
				int select=sc.nextInt();
				switch(select)
				{
					case 0: selectById();break;
					case 1: selectByName();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				
			}while(loop==1|repeat==1);
		}
	}
	public void selectByName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
		String name=sc.next();
		Contact contact=new Contact(); 
		contact=control.searchContact(name);
		selectedContact(contact);
	}
	public void selectById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ID :");
		int id=sc.nextInt();
		Contact contact=new Contact(); 
		contact=control.searchContact(id);
		selectedContact(contact);
	}	
	public void selectedContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		if((contact.getName())==null)
		{
			System.out.println("no contact found..!");
		}
		else
		{
			System.out.println("ID : "+contact.getId()+"\tNAME: "+contact.getName()+"\tNUMBER: "+contact.getNo()+"\n");
			int repeat=0,loop=0;
			do
			{
				repeat=0;
				System.out.println(" enter : 0 edit  1 delete  2 back to main menu");
				int select=sc.nextInt();
				switch(select)
				{
					case 0: editContact(contact);break;
					case 1: deleteContact(contact);break;
					case 2: printAll();break;
					// case 4: clearAllContacts();break;
					default:System.out.println("enter the correct option");
							repeat=1;
				}
				
			}while(repeat==1);


		}	

	}
	public void editContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		System.out.println("enter new name"+index);
		String name=sc.next();
		System.out.println("enter number");
		String number=sc.next();
		control.editContact(name,number,index);
		System.out.println("contact modified succesfully \n");			
	}
	public void deleteContact(Contact contact)
	{
		Scanner sc=new Scanner(System.in);
		int index=control.getIndex(contact);
		control.deleteContact(index);
		System.out.println("contact deleted succesfully \n");	
	}
	public void clearAllContacts()
	{
		control.clearAllContacts();
		System.out.println(" All contacts deleted succesfully \n");
	}
}
