package com.lxisoft.view;
import com.lxisoft.controller.ContactController;
import com.lxisoft.model.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.contactrepository.*;

public class View
{
	static Scanner sc=new Scanner(System.in);

	public void displayAll(ArrayList<Contact> array)
	{
		int i=1;
		System.out.print("\n THE CONTACT LIST IS \n");
		for(Contact contact: array)
		{
			System.out.print("S.No:-"+(i++)+"\t\tName- " +contact.getName());
			System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
		}
	}

	public int inputContact()
	{
		System.out.print("enter the max range of contacts");
		int n=sc.nextInt();
		return n;		
	}

	public String[] scan()
	{
		System.out.print("enter the name and number of new contact");
		String[] temp=new String[2];
		temp[0]=sc.next();
		temp[1]=sc.next();
		return temp;
	}

	public void displayContact(Contact contact)
	{
		System.out.print("Name- " +contact.getName()+"\t\tNumber- " +contact.getNumber);
	}

	public void contactOptions(ArrayList<Contact> array)
	{
		ContactController controller=new ContactController();
		while(true)
		{
			System.out.println("\ndo you wish to continue y/n");
			char ch=sc.next().charAt(0);
			if(ch!='y')
				break;
			processing();
			System.out.println("\n press for features-->  1-Addition  2-searching  3-deletion  4-update  5-display  6-displayFile  7-duplicates");
			int option=sc.nextInt();
			controller.features(array,option);
			System.out.println("\n");
		}
		System.out.println("\t\t\t\t THANK YOU");	
	}

	public void processing()
	{
		System.out.print("\t\t Processing");
		for(int z=0;z<6;z++)
		{
			System.out.print("!");
			try
			{
				TimeUnit.MILLISECONDS.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception occured:"+e);
			}
		}
	}

	public String scanElement(int s)
	{
		if(s==0)
			System.out.println("enter the name to search/delete/update");
		else if(s==1)
			System.out.println("enter the update value");
		String element=sc.next();
		return element;
	}

	public void elementFound(Contact contact,int i)
	{
		System.out.print("Contact present at S.No:-"+(i)+"\t\tName- " +contact.getName());
		System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
	}

	public void noContact()
	{
		System.out.println("Contact not present");
	}

	public int updateScan()
	{
		System.out.println("for updating name-0  number-1");
		int u=sc.nextInt();
		return u;
	}

}