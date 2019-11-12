package com.lxisoft.contactapp.view;

import com.lxisoft.contactapp.controller.ContactController;
import com.lxisoft.contactapp.model.*;
import java.util.*;
public class ContactView1
{
	public void showAllContacts(ArrayList<ContactModel> contacts,ContactModel contact)
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
	}

}