package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.Domain.*;
import java.util.*;
public class ContactView1
{
	//ArrayList<Contact> contacts=new ArrayList<Contact>();
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
				System.out.print((i+1)+"\t");
				System.out.println(contact.get(i).getName());
			}
		
		}
		System.out.println("select a contact by Id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		//getContactById(contact,id);
	}
	public void getContactById(ArrayList<Contact> contact,int id)
	{
		int value=0,val=0;
		for(int i=0;i<contact.size();i++)
		{
			if(id==contact.indexOf(contact.get(i)))
				{
					value=1;val=1;
					System.out.println(" Contact found..!");
					System.out.println(contact.get(i).getName());
					System.out.println(contact.get(i).getNo());	
				}
		}
		if(val==0)
			System.out.println("contact not found");
	
	}

}