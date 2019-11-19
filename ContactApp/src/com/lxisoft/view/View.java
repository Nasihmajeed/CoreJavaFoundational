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
		System.out.print("\n THE CONTACT LIST IS \nID\t\t  NAME\n");
		for(Contact contact: viewAllModel.getList())
		{
			System.out.println(contact.getId()+"\t\tName- " +contact.getName());
		}
	}

	public String[] byName()
	{
		System.out.println("enter the NAME  to search ");
		String[] temp=new String[2];
		temp[0]=sc.next();
		System.out.print(" press--> y-search  n-cancel");
		temp[1]=sc.next();
		return temp;
	}

	public String[] byId()
	{
		System.out.println("enter the ID  to search ");
		String[] temp=new String[2];
		temp[0]=sc.next();
		System.out.print(" press--> y-search  n-cancel");
		temp[1]=sc.next();
		return temp;
	}
	
	public void printByName(Contact contact)
	{
		System.out.print("Id:-"+contact.getId()+"\t\tName- " +contact.getName());
		System.out.print("\t\tNumber- " + contact.getNumber()+"\n");
	}

	public int optionsScaning()
	{
		System.out.println("\n press-->  1-save  2-search  3-searchById  4-select  5-backtohome  6-exit");
		int option=sc.nextInt();
		return option;	
	}

	public String[] save()
	{
		System.out.print("enter the name and number of new contact");
		String[] temp=new String[3];
		temp[0]=sc.next();
		temp[1]=sc.next();
		System.out.print(" press--> y-save  n-cancel");
		temp[2]=sc.next();
		return temp;
	}

	public String select()
	{
		System.out.print("enter the name to select");
		String name=sc.next();
		return name;
	}

	public String choose()
	{
		String ch;
		System.out.println(" press-->  e-edit  d-delete  c-cancel");
		ch=sc.next();
		return ch;
	}

	public String delete()
	{
		System.out.print(" press--> y-delete  n-cancel");
		String del=sc.next();
		return del;
	}

	public String[] edit()
	{
		String[] temp=new String[3];
		System.out.println(" enter modified name and number");
		temp[0]=sc.next();
		temp[1]=sc.next();
		System.out.print("press--> y-confirmEdit  n-cancel");
		temp[2]=sc.next();
		if(temp[2].equals("y"))
		{
			return temp;
		}
		else
			return null;
	}

	public void noContact()
	{
		System.out.println("Contact not present");
	}

}











	
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
