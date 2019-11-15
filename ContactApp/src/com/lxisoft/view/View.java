package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;

public class View
{
	static Scanner sc=new Scanner(System.in);
	
	public void findAllContacts(ViewAllModel viewAllModel)
	{
		controller=new ContactController();
		int i=0;
		System.out.print("\n THE CONTACT LIST IS \nID\t\t  NAME\n");
		for(Contact contact: viewAllModel.getList())
		{
			System.out.println("S.No:-"+(++i)+"\t\tName- " +contact.getName());
		}
		byName();
	}

	public void byName()
	{
		System.out.println("enter the name  to check ");
		String name=sc.next();
		controller.contactByName(name);
	}
	
	public void printByName(Contact contact,int i)
	{
		System.out.print("Id:-"+(i)+"\t\tName- " +contact.getName());
		System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
		contactOptions();
	}

	public void contactOptions()
	{
		//controller=new ContactController();
		while(true)
		{
			System.out.println("\n press for features-->  1-save  2-search  3-delete  4-editContact  5-homepage  6-exit");
			int option=sc.nextInt();
			//processing();
			if(option==6)
				break;
			else
			{
				System.out.println("kbdjsbs "+ option );
				controller.features(option);
				System.out.println("\n");
			}
		}
		System.out.println("\t\t\t\t THANK YOU");	
	}

	public String[] scan()
	{
		System.out.print("enter the name and number of new contact");
		String[] temp=new String[3];
		temp[0]=sc.next();
		temp[1]=sc.next();
		System.out.print(" press y for save n for cancel");
		temp[2]=sc.next();
		return temp;
	}

	// public void byId()
	// {
	// 	System.out.println("enter the id to check ");
	// 	int id=sc.nextInt();
	// 	controller.contactById(id);
	// }

}
















// public void displayAll(ArrayList<Contact> contactList)
// 	{
// 		int i=1;
// 		System.out.print("\n THE CONTACT LIST IS \n");
// 		for(Contact contact: contactList)
// 		{
// 			System.out.print("S.No:-"+(i++)+"\t\tName- " +contact.getName());
// 			System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
// 		}
// 	}



// 	public void displayContact(Contact contact)
// 	{
// 		System.out.print("Name- " +contact.getName()+"\t\tNumber- " +contact.getNumber());
// 	}

	
// 	public void processing()
// 	{
// 		System.out.print("\t\t\t Processing");
// 		for(int z=0;z<6;z++)
// 		{
// 			System.out.print("!");
// 			try
// 			{
// 				TimeUnit.MILLISECONDS.sleep(100);
// 			}
// 			catch(InterruptedException e)
// 			{
// 				System.out.println("Exception occured:"+e);
// 			}
// 		}
// 		System.out.print("\n");
// 	}

// 	public String scanElement(int s)
// 	{
// 		if(s==0)
// 			System.out.println("enter the name to search/delete/update");
// 		else if(s==1)
// 			System.out.println("enter the update value");
// 		String element=sc.next();
// 		return element;
// 	}

// 	public int whatToUpdate()
// 	{
// 		System.out.println("for updating name-0  number-1");
// 		int u=sc.nextInt();
// 		return u;
// 	}

// 	public void noContact()
// 	{
// 		System.out.println("Contact not present");
// 	}