package com.lxisoft.view;
import java.io.*;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.domain.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class View
{
	static Scanner s=new Scanner(System.in);
	public void getAllContacts(List<ContactModel> listModel)
	{
		if((listModel.size()!=0))
		{
			System.out.println("\t <-------CONTACT LIST------>\n");
			System.out.println("\t ID \t NAME \n\t-----\t------");
			for(int j=0;j<listModel.size();j++)
			{
				System.out.println("\t"+listModel.get(j).getId()+"\t"+listModel.get(j).getName());
			}
		}		
	}
	public int display()
	{
		System.out.println("<---Enter your choice--->");
		System.out.println("1-select \t 2-Add\t 3-Search\t 4-DeleteAll \t5-Exit");
		return s.nextInt();
	}
	public String getContactId()
	{
		System.out.println("Enter contact id to search");
		String n=s.next();
		return n;
	}
	public void getContactById(Contact c)
	{
		int a=0;
		if((c.getContactName())!=null)
		{
			System.out.println("contact name--->"+c.getContactName());
			System.out.println("contact no  --->"+c.getContactNumber());
		}
		else	
		{
			System.out.println(" contact is not present");
		}		
	}
	public int getContactOperation()
	{
		System.out.println("\n\n 1-Update\t 2-Delete \t 3-Exit");
		int a=s.nextInt();
		return a;
	}
	public Contact addContact()
	{
		Contact cont=new Contact();
		System.out.println("Enter contact name");
		String name=s.next();
		cont.setContactName(name);
		System.out.println("Enter contact number");
		String num=s.next();
		cont.setContactNumber(num);
		return cont;
	}
	public void searchContact(Contact c)
	{
		if((c.getContactName()==null)&(c.getContactNumber()==null))
		{
			System.out.println(" contact is not present");
		}
		else
		{
			System.out.println("contact name--->"+c.getContactName());
			System.out.println("contact no  --->"+c.getContactNumber());
		}
	}
	public void deleteContact()
	{
		System.out.println(" deleted successfully");
	}
	public String updateContact()
	{
		System.out.println("Enter new contact number");
		String num=s.next();
		return num;
	}
	public void deleteAllContact()
	{
		System.out.println(" contact list cleared");
	}
}