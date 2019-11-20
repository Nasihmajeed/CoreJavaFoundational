package com.lxisoft.view;
import java.io.*;
import com.lxisoft.contactcontroller.*;
import com.lxisoft.domain.*;
import com.lxisoft.contactmodel.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *class view for user interface
 */
public class View
{
	static Scanner s=new Scanner(System.in);
	/**
	 *to get all contact in arraylist.
	 *
	 *@param listModel arraylist with id and name
	 */
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
		else
		{
			System.out.println(" \n CONTACT APP IS EMPTY !!!");
		}		
	}
	/**
	 *to select user choices.
	 *
	 *@return integer
	 */
	public int getChoice()
	{
		System.out.println("<---Enter your choice--->");
		System.out.println("1-select\t2-Add\t3-Search\t4-DeleteAll\t5-Back to Home\t6-Exit");
		return s.nextInt();
	}
	/**
	 *to get contact id.
	 *
	 *@return contact id
	 */
	public String getContactId()
	{
		System.out.println("Enter contact id to search");
		String n=s.next();
		return n;
	}
	/**
	 *to get contact details using contact id
	 *
	 *@param c contact with id,nam and number
	 */
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
	/**
	 *to get contact operation
	 *
	 *@return integer value 
	 */
	public int getContactOperation()
	{
		System.out.println("\n\n 1-Update\t 2-Delete \t 3-Exit");
		int a=s.nextInt();
		return a;
	}
	/**
	 *to add contact.
	 *
	 *@return contact
	 */
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
	/**
	 *to serach contact.
	 *
	 *@param c contact with id, name and number.
	 */
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
	/**
	 *to get confirmation after deleting contact.
	 */
	public void deleteContact()
	{
		System.out.println(" deleted successfully");
	}
	/**
	 *to update contact.
	 *
	 *@return contact
	 */
	public Contact updateContact()
	{
		Contact cont=new Contact();
		System.out.println("Enter new contact name");
		cont.setContactName(s.next());
		System.out.println("Enter new contact number");
		cont.setContactNumber(s.next());			
		return cont;
	}
	/**
	 *to get confirmation after deleting all contact
	 */
	public void deleteAllContact()
	{
		System.out.println(" contact list cleared");
	}
}