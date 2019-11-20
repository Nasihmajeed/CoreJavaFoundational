package com.lxisoft.view;
import com.lxisoft.controllers.*;
import com.lxisoft.models.*;
import com.lxisoft.domain.*;
import com.lxisoft.view.*;
import java.util.*;
public class ContactView
{
	/**
 * class view
 */

	/**
 * contacts print from ArrayList
 */
	public void getAllContacts(List<ContactModel> contactsList)
	{
		if((contactsList.size()!=0))
		{
			System.out.println("         Contact List \n        --------------------");
			System.out.println("\t ID \t NAME ");
			for(int i=0;i<contactsList.size();i++)
			{
				System.out.println("\t"+contactsList.get(i).getId()+"\t"+contactsList.get(i).getName());
			}
		}
	}
	/**
 * operations
 */
	
	public int display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1-select\n2-Add\n3-Search\n4-Home page\n5-Exit");
		int ch=sc.nextInt();
		return ch;
	}
	/**
 * operations
 */
	public int getOperations()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Update\n2-Delete");
		int ch=sc.nextInt();
		return ch;
	}
	/**
 * Select id
 */
	public String getContactId()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a ID");
		String d=sc.next();
		return d;
	}
	/**
 * Select a contact by id
 */
	public void getContactById(Contact c)
	{
		if((c.getName())!=null)
		{
			System.out.println("Name= "+c.getName());
			System.out.println("Number= "+c.getContactNo());
		}
		else
		{
			System.out.println("No Search Result");
		}
	}
    /**
 * Add new contact
 */
	public Contact addContact()
	{
		Scanner sc=new Scanner(System.in);
		Contact c=new Contact();
		System.out.println("\nEnter Contact name:");
		String name=sc.next();
		c.setName(name);
		System.out.println("\nEnter contact number:");
		String contactNo=sc.next();
		c.setContactNo(contactNo);
	    return c;
	}
	/**
 * delete contact
 */
	public void deleteContact()
	{
		System.out.println("Deleted");
	}
	/**
 * Edit contact number
 */
	public String updateContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter new contact number:");
		String contactNo=sc.next();
		return contactNo;	
	}
	/**
 * Search a contact using id
 */
	public void searchContact(Contact c)
	{
		if((c.getName()==null)&(c.getContactNo()==null))
		{
			System.out.println("Not Found Search Result");
		}
		else
		{
			System.out.println("\n Name="+c.getName());
			System.out.println(" Number="+c.getContactNo());
		}			
	}
 
} 
