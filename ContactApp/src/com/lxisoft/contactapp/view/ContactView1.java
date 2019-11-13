package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import java.util.*;
public class ContactView1
{
	//ArrayList<Contact> contacts=new ArrayList<Contact>();
	public void showAllContacts(ContactListView contact)
	{
		if(contacts.size()==0)
		{
			System.out.println("Your Contact List empty ");
		}
		else
		{
			System.out.println(" \n<----Contact List---->");
			System.out.println("ID\tNAME\n");
			for(int i=0;i<contacts.size();i++)
			{
				System.out.print((i+1)+"\t");
				System.out.println(contacts.get(i).getName());
			}
		
		}
		System.out.println("select a contact by Id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		getContactById(id);
	}
	public void getContactById(int id)
	{
		int value=0,val=0;
		for(int i=0;i<contacts.size();i++)
		{
			if(id==contacts.indexOf(contacts.get(i)))
				{
					value=1;val=1;
					System.out.println(" Contact found..!");
					System.out.println(contacts.get(i).getName());
					System.out.println(contacts.get(i).getNo());	
				}
		}
		if(val==0)
			System.out.println("contact not found");
	
	}

}